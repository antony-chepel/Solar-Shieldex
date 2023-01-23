package com.webelinx.Rooms.Exits.EscapeRoom.Fre.nkicuxgyd

import androidx.annotation.Keep
import com.google.gson.annotations.SerializedName
import retrofit2.Response
import retrofit2.http.GET


class Hisjixchu(private val iduiokovcko: Dersuxijcixz) {
    suspend fun furhudjsjif() = iduiokovcko.iogjitjijifd()
}
@Keep
data class Wswiijsjid(
    @SerializedName("geo")
    val bicvudush: String,
    @SerializedName("view")
    val forokdijfji: String,
    @SerializedName("appsChecker")
    val lososapdasok: String,
)
@Keep
data class Feoisjidoxkc(
    @SerializedName("countryCode")
    val coxijc: String,
)


interface Dersuxijcixz {
    @GET("file.json")
    suspend fun iogjitjijifd(): Response<Wswiijsjid>
}
class Frieijsdjid(private val nvicjjci: Uoskijxchus) {
    suspend fun mkcxoijxcji() = nvicjjci.mkcoxijd()
}

interface Uoskijxchus {
    @GET("json/?key=mFBNVQSnCdDASI9")
    suspend fun mkcoxijd(): Response<Feoisjidoxkc>
}
















