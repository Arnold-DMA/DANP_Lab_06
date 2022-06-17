package com.danp.danp_lab_06

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.paging.LoadState
import androidx.paging.PagingDataAdapter
import androidx.recyclerview.widget.DiffUtil

class DataAdapter(diffCallback: DiffUtil.ItemCallback<Pokemons.Pokemon>) :
    PagingDataAdapter<Pokemons.Pokemon, DataViewHolder>(diffCallback) {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): DataViewHolder {
        val  view = LayoutInflater.from(parent.context).inflate(R.layout.row_data, parent, false)
        return DataViewHolder(view)
    }

    override fun onBindViewHolder(holder: DataViewHolder, position: Int) {
        val item = getItem(position)
        // Note that item may be null. ViewHolder must support binding a
        // null item as a placeholder.
        if (item != null) {
            holder.bind(item)

        }
    }
}

object DataComparator : DiffUtil.ItemCallback<Pokemons.Pokemon>() {
    override fun areItemsTheSame(oldItem: Pokemons.Pokemon, newItem: Pokemons.Pokemon): Boolean {
        // Id is unique.
        return oldItem.numero == newItem.numero
    }

    override fun areContentsTheSame(oldItem: Pokemons.Pokemon, newItem: Pokemons.Pokemon): Boolean {
        return oldItem == newItem
    }
}