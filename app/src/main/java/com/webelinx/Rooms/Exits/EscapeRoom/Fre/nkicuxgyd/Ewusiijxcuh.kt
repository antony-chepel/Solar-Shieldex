package com.webelinx.Rooms.Exits.EscapeRoom.Fre.nkicuxgyd

import android.content.Context
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Environment
import android.os.Handler
import android.os.Looper
import android.provider.MediaStore
import android.util.Log
import android.webkit.*
import android.widget.Toast
import com.webelinx.Rooms.Exits.EscapeRoom.Fre.Kiosuxygcgys.Companion.oakaskoa
import com.webelinx.Rooms.Exits.EscapeRoom.Fre.Kiosuxygcgys.Companion.ovkvcok
import com.webelinx.Rooms.Exits.EscapeRoom.Fre.databinding.KiocvugcyBinding
import com.webelinx.Rooms.Exits.EscapeRoom.Fre.jiduygc.Nhyctxtidjse
import org.koin.androidx.viewmodel.ext.android.viewModel
import org.koin.core.qualifier.named
import java.io.File
import java.io.IOException
import java.text.SimpleDateFormat
import java.util.*

class Ewusiijxcuh : AppCompatActivity() {

    private val giiuhhucv by viewModel<Nhyctxtidjse>(
        named("BeamModel")
    )
    private lateinit var xiozxcjiji: KiocvugcyBinding
    var ifjuhefhud = ""

    lateinit var cjnvnjxcvj: WebView
    private var woskodkos = false

    private var kcoxivxchudhfh: String? = null

    private val tiifodkokovc = 1
    private var frjidf: ValueCallback<Array<Uri>>? = null










    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        xiozxcjiji = KiocvugcyBinding.inflate(layoutInflater)
        setContentView(xiozxcjiji.root)
        cjnvnjxcvj = xiozxcjiji.ewtysyud
        CookieManager.getInstance().setAcceptCookie(true)
        CookieManager.getInstance().setAcceptThirdPartyCookies(cjnvnjxcvj, true)
        giiuhhucv.rokekod(cjnvnjxcvj)


        cjnvnjxcvj.webViewClient = object : WebViewClient() {
            override fun shouldOverrideUrlLoading(view: WebView?, url: String): Boolean {
                try {
                    if (URLUtil.isNetworkUrl(url)) {
                        return false
                    }
                    if (giiuhhucv.vicjicvjiuhsda(url)) {

                        val obvjivbji = Intent(Intent.ACTION_VIEW)
                        obvjivbji.data = Uri.parse(url)
                        startActivity(obvjivbji)
                    } else {

                        Toast.makeText(
                            applicationContext,
                            "Application is not installed",
                            Toast.LENGTH_LONG
                        ).show()
                        startActivity(
                            Intent(
                                Intent.ACTION_VIEW,
                                Uri.parse("https://play.google.com/store/apps/details?id=org.telegram.messenger")
                            )
                        )
                    }
                    return true
                } catch (e: Exception) {
                    return false
                }
            }

            override fun onPageFinished(view: WebView?, url: String?) {
                super.onPageFinished(view, url)
                eooksdjisdaji(url)
            }


            override fun onReceivedError(
                view: WebView?,
                errorCode: Int,
                description: String?,
                failingUrl: String?
            ) {
                Toast.makeText(this@Ewusiijxcuh, description, Toast.LENGTH_SHORT).show()
            }
        }

        cjnvnjxcvj.webChromeClient = Tueidijfokxc()
        cjnvnjxcvj.loadUrl(tokdjisfji())
    }




    fun eooksdjisdaji(mckijvxchu: String?) {
        if (!mckijvxchu!!.contains("t.me")) {

            if (ifjuhefhud == "") {
                ifjuhefhud = getSharedPreferences(
                    "SP_WEBVIEW_PREFS",
                    AppCompatActivity.MODE_PRIVATE
                ).getString(
                    "SAVED_URL",
                    mckijvxchu
                ).toString()

                val reudifj =
                    getSharedPreferences("SP_WEBVIEW_PREFS", AppCompatActivity.MODE_PRIVATE)
                val cjvxijxchuv = reudifj.edit()
                cjvxijxchuv.putString("SAVED_URL", mckijvxchu)
                cjvxijxchuv.apply()
            }
        }
    }

    private fun tokdjisfji(): String {

        val cijvijxcv = getSharedPreferences("SP_WEBVIEW_PREFS", AppCompatActivity.MODE_PRIVATE)


        val tijirjidjif = getSharedPreferences(
            "SHARED_PREF",
            Context.MODE_PRIVATE
        )
        val coxkvjic = tijirjidjif.getString(ovkvcok, null)
        val ksdoskaixjc = tijirjidjif.getString("WebInt", null)
        val civjuhdhus = tijirjidjif.getString(oakaskoa, null)
        val ytsduhsaij = tijirjidjif.getString("link", null)






        when (ksdoskaixjc) {
            "campaign" -> {
                giiuhhucv.rokdijfjidf(coxkvjic.toString())
            }
            "deepLink" -> {
                giiuhhucv.rokdijfjidf(coxkvjic.toString())
            }
            "deepLinkNOApps" -> {
                giiuhhucv.rokdijfjidf(civjuhdhus.toString())
            }
            "geo" -> {
                giiuhhucv.rokdijfjidf(civjuhdhus.toString())
            }

        }
        return cijvijxcv.getString("SAVED_URL", ytsduhsaij).toString()
    }

    override fun onActivityResult(oqsjid: Int, ncixvj: Int, orijjdif: Intent?) {

        if (oqsjid != tiifodkokovc || frjidf == null) {
            super.onActivityResult(oqsjid, ncixvj, orijjdif)
            return
        }
        var doxxijczjis: Array<Uri>? = null

        if (ncixvj == RESULT_OK) {
            if (orijjdif == null) {
                if (kcoxivxchudhfh != null) {
                    doxxijczjis = arrayOf(Uri.parse(kcoxivxchudhfh))
                }
            } else {
                val uduifj = orijjdif.dataString
                if (uduifj != null) {
                    doxxijczjis = arrayOf(Uri.parse(uduifj))
                }
            }
        }
        frjidf!!.onReceiveValue(doxxijczjis)
        frjidf = null
        return
    }

    inner class Tueidijfokxc : WebChromeClient() {

        override fun onShowFileChooser(
            gijfd: WebView?,
            xockkox: ValueCallback<Array<Uri>>?,
            ospxlckos: FileChooserParams?
        ): Boolean {
            frjidf?.onReceiveValue(null)
            frjidf = xockkox
            var nchvcuhxdij: Intent? = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            if (nchvcuhxdij!!.resolveActivity(packageManager) != null) {
                var yicokxvko: File? = null
                try {
                    yicokxvko = roioijdfc()
                    nchvcuhxdij.putExtra("PhotoPath", kcoxivxchudhfh)
                } catch (ex: IOException) {
                    Log.e("ErrorOccurred", "Unable to create Image File", ex)
                }

                if (yicokxvko != null) {
                    kcoxivxchudhfh = "file:" + yicokxvko.absolutePath
                    nchvcuhxdij.putExtra(
                        MediaStore.EXTRA_OUTPUT,
                        Uri.fromFile(yicokxvko)
                    )
                } else {
                    nchvcuhxdij = null
                }
            }
            val vijfijidfok = Intent(Intent.ACTION_GET_CONTENT)
            vijfijidfok.addCategory(Intent.CATEGORY_OPENABLE)
            vijfijidfok.type = "image/*"
            val wosdjijiwji: Array<Intent?> =
                nchvcuhxdij?.let { arrayOf(it) } ?: arrayOfNulls(0)
            val kxockzijshud = Intent(Intent.ACTION_CHOOSER)
            kxockzijshud.putExtra(Intent.EXTRA_INTENT, vijfijidfok)
            kxockzijshud.putExtra(Intent.EXTRA_TITLE, "Image Chooser")
            kxockzijshud.putExtra(Intent.EXTRA_INITIAL_INTENTS, wosdjijiwji)
            startActivityForResult(kxockzijshud, tiifodkokovc)
            return true
        }

        fun roioijdfc(): File? {
            val ncjvxiji = SimpleDateFormat("yyyyMMdd_HHmmss").format(Date())
            val yuydifok = "JPEG_" + ncjvxiji + "_"
            val icxjhudhus = Environment.getExternalStoragePublicDirectory(
                Environment.DIRECTORY_PICTURES
            )
            return File.createTempFile(
                yuydifok,
                ".jpg",
                icxjhudhus
            )
        }
    }

    override fun onBackPressed() {

        if (cjnvnjxcvj.canGoBack()) {
            if (woskodkos) {
                cjnvnjxcvj.stopLoading()
                cjnvnjxcvj.loadUrl(ifjuhefhud)
            }
            this.woskodkos = true
            cjnvnjxcvj.goBack()
            Handler(Looper.getMainLooper()).postDelayed(Runnable {
                woskodkos = false
            }, 2000)

        } else {
            super.onBackPressed()
        }
    }


}

