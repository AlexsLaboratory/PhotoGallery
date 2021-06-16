package com.bignerdranch.andriod.photogallery.api

import com.bignerdranch.andriod.photogallery.FlickrResponse
import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Url

interface FlickrApi {

  @GET(
    "services/rest/?method=flickr.interestingness.getList" +
            "&api_key=79e4ae5b759e290e678ca0cbd80220b4" +
            "&format=json" +
            "&nojsoncallback=1" +
            "&extras=url_s"
  )
  fun fetchPhotos(): Call<FlickrResponse>

  @GET
  fun fetchUrlBytes(@Url url: String): Call<ResponseBody>
}