package com.userandroid.retrofitpractise.network

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class ActivityModel(
    @SerializedName("activity"      )  var activity      : String? = null,
    @SerializedName("type"          )  var type          : String? = null,
    @SerializedName("participants"  )  var participants  : Int?    = null,
    @SerializedName("price"         )  var price         : Double?    = null,
    @SerializedName("link"          )  var link          : String? = null,
    @SerializedName("key"           )  var key           : String? = null,
    @SerializedName("accessibility" )  var accessibility : Double? = null

):Serializable
