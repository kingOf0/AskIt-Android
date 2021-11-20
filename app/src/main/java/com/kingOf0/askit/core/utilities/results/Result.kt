package com.kingOf0.askit.core.utilities.results

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.io.Serializable

open class Result(
    @SerializedName("success")
    @Expose
    val success: Boolean,

    @Expose
    @SerializedName("message")
    val message: String? = null,
) : Serializable