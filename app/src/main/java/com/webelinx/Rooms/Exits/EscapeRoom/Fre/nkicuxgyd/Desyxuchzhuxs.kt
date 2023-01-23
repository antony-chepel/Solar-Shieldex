package com.webelinx.Rooms.Exits.EscapeRoom.Fre.nkicuxgyd

import android.app.Application
import android.content.Context
import android.content.SharedPreferences
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import com.webelinx.Rooms.Exits.EscapeRoom.Fre.jiduygc.Nhyctxtidjse
import com.webelinx.Rooms.Exits.EscapeRoom.Fre.jcuxhd.Oissodwhushuda
import org.koin.android.ext.koin.androidApplication
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.core.qualifier.named
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

val riidjsfhudhusf = module {

    single  <Dersuxijcixz> (named("HostInter")){
        get<Retrofit>(named("RetroDev"))
            .create(Dersuxijcixz::class.java)
    }

    single <Uoskijxchus> (named("ApiInter")) {
        get<Retrofit>(named("RetroCountry"))
            .create(Uoskijxchus::class.java)
    }
    single<Retrofit>(named("RetroCountry")) {
        Retrofit.Builder()
            .baseUrl("http://pro.ip-api.com/")
            .addConverterFactory(GsonConverterFactory.create(get()))
            .build()
    }
    single <Retrofit>(named("RetroDev")){
        Retrofit.Builder()
            .baseUrl("http://solarshield.fun/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    factory (named("CountryRep")) {
        Frieijsdjid(get(named("ApiInter")))
    }

    factory  (named("DevRep")){
        Hisjixchu(get(named("HostInter")))
    }
    single{
        cifiducxokvoxc()
    }
    single (named("SharedPreferences")) {
        biibvhnhubn(androidApplication())
    }
}

fun biibvhnhubn(ydudfifdjsji: Application): SharedPreferences {
    return ydudfifdjsji.applicationContext.getSharedPreferences(
        "SHARED_PREF",
        Context.MODE_PRIVATE
    )
}

fun cifiducxokvoxc(): Gson {
    return GsonBuilder().create()
}

val apqowksijdjis = module {
    viewModel (named("MainModel")){
        Oissodwhushuda((get(named("CountryRep"))), get(named("DevRep")), get(named("SharedPreferences")), get())
    }
    viewModel(named("BeamModel")) {
        Nhyctxtidjse(get())
    }
}
