package com.kingOf0.askit.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.io.Serializable
import java.sql.Timestamp

data class Message(
    @SerializedName("id")
    @Expose
    val id: Long,

    @SerializedName("message")
    @Expose
    val message: String,

    @SerializedName("reply")
    @Expose
    val reply: String,

    @SerializedName("date")
    @Expose
    val date: Timestamp,

    @SerializedName("isVerified")
    @Expose
    val isVerified: Boolean
) : Serializable