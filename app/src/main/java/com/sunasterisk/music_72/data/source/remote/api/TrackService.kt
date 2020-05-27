package com.sunasterisk.music_72.data.source.remote.api

import com.sunasterisk.music_72.data.model.Track
import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface TrackService {
    @GET("/tracks?")
    fun getAllTrack(@Query("limit") limit: Int): Observable<MutableList<Track>>

    @GET("/tracks?")
    fun getTrackByGenre(
        @Query("genres") genres: String,
        @Query("limit") limit: Int
    ): Observable<MutableList<Track>>

    @GET("tracks/{id}")
    fun getTrackById(@Path("id") id: Int) : Observable<Track>
}
