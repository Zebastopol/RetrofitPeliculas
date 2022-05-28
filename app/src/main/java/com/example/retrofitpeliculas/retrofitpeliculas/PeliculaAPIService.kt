package com.example.retrofitpeliculas.retrofitpeliculas

import android.telecom.Call
import retrofit2.http.Body
import retrofit2.http.POST

interface PeliculaAPIService {

    @POST("bd.json")
    fun agregarPelicula(@Body pelicula: Pelicula): Call<PeliculaRespuestaAPI>

}