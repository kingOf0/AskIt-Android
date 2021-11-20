package com.kingOf0.askit.dataaccess

import com.kingOf0.askit.core.utilities.results.DataResult
import retrofit2.Call
import retrofit2.http.GET

interface IMessageDAO {

    @GET("/api/messages/getVerified")
    fun getMessages() : Call<DataResult<List<com.kingOf0.askit.model.Message>>>

}