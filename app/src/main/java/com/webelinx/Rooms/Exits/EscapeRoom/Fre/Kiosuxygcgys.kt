package com.webelinx.Rooms.Exits.EscapeRoom.Fre

import android.app.Application
import android.content.Context
import com.my.tracker.MyTracker
import com.onesignal.OneSignal
import com.webelinx.Rooms.Exits.EscapeRoom.Fre.nkicuxgyd.apqowksijdjis
import com.webelinx.Rooms.Exits.EscapeRoom.Fre.nkicuxgyd.riidjsfhudhusf
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.GlobalContext
import org.koin.core.logger.Level
import java.util.*

class Kiosuxygcgys: Application() {

    companion object {
        var ovkvcok: String? = "main_id"
        val noinbjbnjibnjin: String = "myID"
        var oakaskoa: String? = "instID"
        const val nbibnj = "1bed7a94-2b01-4d16-94e6-b644a816bd5a"








    }

    override fun onCreate() {
        super.onCreate()
        OneSignal.initWithContext(this)
        OneSignal.setAppId(nbibnj)




        val isjddashu = getSharedPreferences("SHARED_PREF", Context.MODE_PRIVATE)
        val gxchvcxhu = getSharedPreferences("PREFS_NAME", 0)

        val lxzokczxij = MyTracker.getTrackerParams()
        val urhijjifd = MyTracker.getTrackerConfig()
        val xijzchucshu = MyTracker.getInstanceId(this)
        urhijjifd.isTrackingLaunchEnabled = true
        val nxzjcizx = UUID.randomUUID().toString()

        if (gxchvcxhu.getBoolean("my_first_time", true)) {
            lxzokczxij.setCustomUserId(nxzjcizx)
            isjddashu.edit().putString(noinbjbnjibnjin, nxzjcizx).apply()
            isjddashu.edit().putString(oakaskoa, xijzchucshu).apply()
            gxchvcxhu.edit().putBoolean("my_first_time", false).apply()
        } else {
            val zopaosjia = isjddashu.getString(noinbjbnjibnjin, nxzjcizx)
            lxzokczxij.setCustomUserId(zopaosjia)
        }
        MyTracker.initTracker("20275482191717084925", this)

        GlobalContext.startKoin {
            androidLogger(Level.DEBUG)
            androidContext(this@Kiosuxygcgys)
            modules(
                listOf(
                    apqowksijdjis, riidjsfhudhusf
                )
            )
        }
    }
}