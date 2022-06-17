package com.danp.danp_lab_06

import android.util.Log

class ExampleBackendService {
    fun searchData(nextPageNumber: Int): Response {
        val pokes = Pokemons.pokeList
        Log.d("PageNumber", nextPageNumber.toString())
        return Response(pokes, nextPageNumber+1)
    }
}

data class Response(val data: List<Pokemons.Pokemon>, val nextPageNumber: Int)