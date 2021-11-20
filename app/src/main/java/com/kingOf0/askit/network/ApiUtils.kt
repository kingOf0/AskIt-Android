package com.kingOf0.askit.network

import com.kingOf0.askit.dataaccess.IMessageDAO

class ApiUtils {

    companion object {
        private const val BASE_URL = "http://192.168.0.14:8080"

        fun getMessageDAO() : IMessageDAO {
            return RetrofitClient
                .getClient(BASE_URL)
                .create(IMessageDAO::class.java)
        }
    }

}