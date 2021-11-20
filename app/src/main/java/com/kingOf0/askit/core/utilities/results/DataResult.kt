package com.kingOf0.askit.core.utilities.results

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

open class DataResult<T>(
    success: Boolean,
    message: String? = null,
    @Expose
    @SerializedName("data")
    val data: T,
) : Result(success, message)