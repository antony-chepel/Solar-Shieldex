package com.webelinx.Rooms.Exits.EscapeRoom.Fre.jiduygc

import android.annotation.SuppressLint
import android.app.Application
import android.content.pm.PackageManager
import android.webkit.WebSettings
import android.webkit.WebView
import androidx.lifecycle.ViewModel
import com.onesignal.OneSignal
import org.json.JSONException
import org.json.JSONObject

class Nhyctxtidjse(dosdkodsf: Application): ViewModel() {


    fun vicjicvjiuhsda(oeidj: String): Boolean {
        try {
            tsyudh.getPackageInfo("org.telegram.messenger", PackageManager.GET_ACTIVITIES)
            return true
        } catch (_: PackageManager.NameNotFoundException) {

        }
        return false
    }

    val tsyudh = dosdkodsf.packageManager


    fun rokdijfjidf(giofgfok: String) {
        OneSignal.setExternalUserId(
            giofgfok,
            object : OneSignal.OSExternalUserIdUpdateCompletionHandler {
                override fun onSuccess(fiodjifjidf: JSONObject) {
                    try {
                        if (fiodjifjidf.has("push") && fiodjifjidf.getJSONObject("push").has("success")) {
                            val vicjbhufduh = fiodjifjidf.getJSONObject("push").getBoolean("success")
                            OneSignal.onesignalLog(
                                OneSignal.LOG_LEVEL.VERBOSE,
                                "Set external user id for push status: $vicjbhufduh"
                            )
                        }
                    } catch (e: JSONException) {
                        e.printStackTrace()
                    }
                    try {
                        if (fiodjifjidf.has("email") && fiodjifjidf.getJSONObject("email").has("success")) {
                            val nijbji =
                                fiodjifjidf.getJSONObject("email").getBoolean("success")
                            OneSignal.onesignalLog(
                                OneSignal.LOG_LEVEL.VERBOSE,
                                "Set external user id for email status: $nijbji"
                            )
                        }
                    } catch (e: JSONException) {
                        e.printStackTrace()
                    }
                    try {
                        if (fiodjifjidf.has("sms") && fiodjifjidf.getJSONObject("sms").has("success")) {
                            val eirhudhufji = fiodjifjidf.getJSONObject("sms").getBoolean("success")
                            OneSignal.onesignalLog(
                                OneSignal.LOG_LEVEL.VERBOSE,
                                "Set external user id for sms status: $eirhudhufji"
                            )
                        }
                    } catch (e: JSONException) {
                        e.printStackTrace()
                    }
                }

                override fun onFailure(error: OneSignal.ExternalIdError) {
                    OneSignal.onesignalLog(
                        OneSignal.LOG_LEVEL.VERBOSE,
                        "Set external user id done with error: $error"
                    )
                }
            })
    }



    @SuppressLint("SetJavaScriptEnabled")
    fun rokekod(ivjbcjivb: WebView): WebSettings{
        val diojiejifr = ivjbcjivb.settings
        diojiejifr.useWideViewPort = true
        diojiejifr.javaScriptCanOpenWindowsAutomatically = true
        diojiejifr.setSupportZoom(true)
        diojiejifr.mixedContentMode = WebSettings.MIXED_CONTENT_ALWAYS_ALLOW
        diojiejifr.displayZoomControls = false
        diojiejifr.builtInZoomControls = true
        diojiejifr.javaScriptEnabled = true
        diojiejifr.setAppCacheEnabled(true)
        diojiejifr.allowContentAccess = true
        diojiejifr.mediaPlaybackRequiresUserGesture = false
        diojiejifr.loadWithOverviewMode = true
        diojiejifr.allowFileAccess = true
        diojiejifr.setSupportMultipleWindows(false)
        diojiejifr.userAgentString = diojiejifr.userAgentString.replace("; wv", "")
        diojiejifr.domStorageEnabled = true
        diojiejifr.allowFileAccess = true
        diojiejifr.pluginState = WebSettings.PluginState.ON

        diojiejifr.allowContentAccess = true


        return diojiejifr
    }



}