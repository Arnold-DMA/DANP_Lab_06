package com.danp.danp_lab_06

import androidx.paging.PagingSource
import androidx.paging.PagingState
import java.io.IOException

typealias DataPageLoader = suspend (pageIndex: Int, pageSize: Int) ->List<Pokemons.Pokemon>

class ExamplePagingSource (
    //val backend: ExampleBackendService,
    val loader: DataPageLoader,
    val pageSize: Int
) : PagingSource<Int, Pokemons.Pokemon>() {

    override suspend fun load(params: LoadParams<Int>): LoadResult<Int, Pokemons.Pokemon> {
        // Start refresh at page 0 if undefined.
        val nextPageNumber = params.key ?: 0
        try {

            //val response = backend.searchData(nextPageNumber)
            //val response = backend.invoke(nextPageNumber, params.loadSize)
            val datos = loader.invoke(nextPageNumber, params.loadSize)
            return LoadResult.Page(
                data = datos,
                prevKey = if (nextPageNumber == 0) null  else  nextPageNumber -1, // Only paging forward.
                nextKey = if (datos.size == params.loadSize) nextPageNumber + (params.loadSize/pageSize) else null
            )
        } catch (e: IOException) {
            // IOException for network failures.
            return LoadResult.Error(e)
        }
    }

    override fun getRefreshKey(state: PagingState<Int, Pokemons.Pokemon>): Int? {
        // Try to find the page key of the closest page to anchorPosition, from
        // either the prevKey or the nextKey, but you need to handle nullability
        // here:
        //  * prevKey == null -> anchorPage is the first page.
        //  * nextKey == null -> anchorPage is the last page.
        //  * both prevKey and nextKey null -> anchorPage is the initial page, so
        //    just return null.
        val anchorPosition = state.anchorPosition ?: return null
        val page = state.closestPageToPosition(anchorPosition) ?: return null
        return page.prevKey?.plus(1) ?: page.nextKey?.minus(1)
        /*return state.anchorPosition?.let { anchorPosition ->
            val anchorPage = state.closestPageToPosition(anchorPosition)
            anchorPage?.prevKey?.plus(1) ?: anchorPage?.nextKey?.minus(1)
        }*/
    }
}