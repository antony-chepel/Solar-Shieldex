package com.webelinx.Rooms.Exits.EscapeRoom.Fre.jcuxhd

import android.annotation.SuppressLint
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.os.Handler
import android.os.Looper
import android.view.View
import android.widget.ImageView
import com.webelinx.Rooms.Exits.EscapeRoom.Fre.databinding.ActivityNeforasdBinding
import com.webelinx.Rooms.Exits.EscapeRoom.Fre.jiduygc.Asoxicjxs
import java.util.*
import kotlin.collections.ArrayList

class Resuwhhusdax : AppCompatActivity() {

    var cdsyasudasuhij: Int = 0


    var trdsusdijf: Handler = Handler(Looper.getMainLooper())


    var cuhvxchu = ArrayList<ImageView>()
    private lateinit var iisokkoxkoczxchuxc: SharedPreferences
    var osjidskooksd = 0
    var xcyugxvg: Runnable = Runnable { }


    private var siodkosjisdji : CountDownTimer? = null

    private lateinit var vuchhbv: ActivityNeforasdBinding





    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        vuchhbv = ActivityNeforasdBinding.inflate(layoutInflater)
        setContentView(vuchhbv.root)
        iisokkoxkoczxchuxc = getSharedPreferences("SHARED_HARD", MODE_PRIVATE)
        osjidskooksd = iisokkoxkoczxchuxc.getInt("SHARED_HARD", 0)
        cdsyasudasuhij = 0
        vuchhbv.okdidi.text = "0"






        vuchhbv.jcxvji.setOnClickListener {
            epold()
        }

        vuchhbv.bijvjb.setOnClickListener {
            epold()
        }
        vuchhbv.mcxijvxc.setOnClickListener {
            epold()
        }
        vuchhbv.ijxjchuhufd.setOnClickListener {
            epold()
        }
        vuchhbv.xozkjixchus.setOnClickListener {
            epold()
        }


        qposkdji()

        mcxvxcij()

        cuhvxchu = arrayListOf(
            vuchhbv.mcxijvxc,
            vuchhbv.ijxjchuhufd,
            vuchhbv.jcxvji,
            vuchhbv.bijvjb,
            vuchhbv.xozkjixchus,
            vuchhbv.udiwqdo,

            )
    }


    @SuppressLint("SetTextI18n")
    fun mcxvxcij() {
        cdsyasudasuhij = 0
        vuchhbv.okdidi.text = "Catched : $cdsyasudasuhij"
        qposkdji()
        vuchhbv.fifd.text = "Time : " + 15000 / 1000

        for (xuichu in cuhvxchu) {
            xuichu.visibility = View.INVISIBLE
        }

        siodkosjisdji = object : CountDownTimer(10000, 1000) {
            @SuppressLint("SetTextI18n")
            override fun onFinish() {
                vuchhbv.fifd.text = "Time is over!"
                trdsusdijf.removeCallbacks(xcyugxvg)

                Handler().postDelayed({
                    startActivity(Intent(this@Resuwhhusdax, Asoxicjxs::class.java)
                        .putExtra("count",cdsyasudasuhij)
                    )
                },1000)

            }

            @SuppressLint("SetTextI18n")
            override fun onTick(p0: Long) {
                vuchhbv.fifd.text = "Time : " + p0 / 1000
            }
        }.start()
    }





    private fun qposkdji() {
        xcyugxvg = Runnable {
            for (rasdfasdgasdgshad in cuhvxchu) {
                rasdfasdgasdgshad.visibility = View.INVISIBLE
            }
            val gudi = Random()
            val sdpf = gudi.nextInt(5 - 0)
            cuhvxchu[sdpf].visibility = View.VISIBLE

            when(osjidskooksd){
                0->{
                    trdsusdijf.postDelayed(xcyugxvg, 2000)
                }

                1->{
                    trdsusdijf.postDelayed(xcyugxvg, 1000)
                }

                2->{
                    trdsusdijf.postDelayed(xcyugxvg, 500)
                }
            }

        }
        trdsusdijf.post(xcyugxvg)
    }


    override fun onDestroy() {
        super.onDestroy()
        siodkosjisdji?.cancel()
    }
    @SuppressLint("SetTextI18n")
    fun epold() {
        cdsyasudasuhij++
        vuchhbv.okdidi.text = "Catched : $cdsyasudasuhij"
    }



}