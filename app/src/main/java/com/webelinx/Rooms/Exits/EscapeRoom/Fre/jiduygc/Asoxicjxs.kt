package com.webelinx.Rooms.Exits.EscapeRoom.Fre.jiduygc

import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.view.View
import com.webelinx.Rooms.Exits.EscapeRoom.Fre.databinding.ActivityExxzzxjsBinding
import com.webelinx.Rooms.Exits.EscapeRoom.Fre.nkicuxgyd.Bfrxyzyussasasass
import kotlin.random.Random

class Asoxicjxs : AppCompatActivity() {
    private lateinit var mcixhud : ActivityExxzzxjsBinding
    private lateinit var sharedWin : SharedPreferences

    var hedSkill = 0
    var bestScore = 0

    private var cuixhvuxcuvh: CountDownTimer? = null

    val sudhahu = listOf(
        2,
        3,
        4,
        5,
        7,
        10,
        20,
        50,
        100
    )

    val totalScoresEasy  = listOf(
        50,
        100,
        200,
        300
    )
    val totalScoresMed  = listOf(
        500,
        800,
        1000,
        1500,
    )
    val totalScoresHard  = listOf(
        2000,
        2500,
        3000,
        5000
    )
    private lateinit var sharedLevel : SharedPreferences
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mcixhud = ActivityExxzzxjsBinding.inflate(layoutInflater)
        setContentView(mcixhud.root)
        sharedWin = getSharedPreferences("SLR_WIN", MODE_PRIVATE)
        sharedLevel = getSharedPreferences("SHARED_HARD", MODE_PRIVATE)
        hedSkill = sharedLevel.getInt("SHARED_HARD", 0)
        bestScore = sharedWin.getInt("SLR_WIN", 0)
        xuhzhuxc()
        mcixhud.bSlrPlAg.setOnClickListener {
            startActivity(Intent(this, Bfrxyzyussasasass::class.java))
        }

    }


    private fun xuhzhuxc() = with(mcixhud){
        val sodasdji = intent.getIntExtra("count",0)
        if(sodasdji >=4){
           imResClr.visibility = View.GONE
           crdRes.visibility = View.GONE
           bestScr.visibility = View.GONE
           bSlrPlAg.visibility = View.GONE
            bSlrSh.visibility = View.VISIBLE
            crdBns.visibility = View.VISIBLE
            cltsSlrText.visibility = View.VISIBLE
            gftSlrImg.visibility = View.VISIBLE
            bSlrSh.setOnClickListener {
                ridjsfji()
            }

        } else {

            imResClr.visibility = View.VISIBLE
            crdRes.visibility = View.VISIBLE
            bestScr.visibility = View.VISIBLE
            bSlrPlAg.visibility = View.VISIBLE
            bSlrSh.visibility = View.GONE
            crdBns.visibility = View.GONE
            cltsSlrText.visibility = View.GONE
            gftSlrImg.visibility = View.GONE


            when(hedSkill){
                0->{
                    val scr = totalScoresEasy[Random.nextInt(4)]
                    tvTotalWon.text = "You won $scr points"
                        bestScr.text = "Your record $bestScore points"
                }

                1->{
                    val scr = totalScoresMed[Random.nextInt(4)]
                    tvTotalWon.text = "You won $scr points"
                    bestScr.text = "Your record $bestScore points"
                }

                2->{
                    val scr = totalScoresHard[Random.nextInt(4)]
                    tvTotalWon.text = "You won $scr points"
                    bestScr.text = "Your record $bestScore points"
                }
            }

        }
    }


    private fun ridjsfji() = with(mcixhud){
        var siudsdahi = 0
        cuixhvuxcuvh?.cancel()
        cuixhvuxcuvh = object : CountDownTimer(3000,100){
            override fun onTick(millisUntilFinished: Long) {
                siudsdahi++
                bSlrSh.isClickable = false
                if(siudsdahi>8)siudsdahi = 0
                val scr = sudhahu[siudsdahi]
                tvBnsTxt.text = "Bonus : x$scr "
            }

            override fun onFinish() {
                imResClr.visibility = View.VISIBLE
                crdRes.visibility = View.VISIBLE
                bestScr.visibility = View.VISIBLE
                bSlrPlAg.visibility = View.VISIBLE
                bSlrSh.visibility = View.GONE
                crdBns.visibility = View.GONE
                cltsSlrText.visibility = View.GONE
                gftSlrImg.visibility = View.GONE


                when(hedSkill){
                    0->{
                       val scr = totalScoresEasy[Random.nextInt(4)]
                        val bonus = sudhahu[Random.nextInt(9)]
                        val totalWin = scr * bonus
                        tvTotalWon.text = "You won $totalWin points"
                        if(totalWin>bestScore){
                            sharedWin.edit().putInt("SLR_WIN",totalWin).apply()
                            bestScr.text = "Your new record $totalWin points"
                        } else {
                            bestScr.text = "Your record $bestScore points"
                        }

                    }
                    1->{

                        val scr = totalScoresMed[Random.nextInt(4)]
                        val bonus = sudhahu[Random.nextInt(9)]
                        val totalWin = scr * bonus
                        tvTotalWon.text = "You won $totalWin points"
                        if(totalWin>bestScore){
                            sharedWin.edit().putInt("SLR_WIN",totalWin).apply()
                            bestScr.text = "Your new record $totalWin points"
                        } else {
                            bestScr.text = "Your record $bestScore points"
                        }

                    }
                    2->{
                        val scr = totalScoresHard[Random.nextInt(4)]
                        val bonus = sudhahu[Random.nextInt(9)]
                        val totalWin = scr * bonus
                        tvTotalWon.text = "You won $totalWin points"
                        if(totalWin>bestScore){
                            sharedWin.edit().putInt("SLR_WIN",totalWin).apply()
                            bestScr.text = "Your new record $totalWin points"
                        } else {
                            bestScr.text = "Your record $bestScore points"
                        }

                    }
                }


            }

        }.start()

    }

    override fun onDestroy() {
        super.onDestroy()
        cuixhvuxcuvh?.cancel()
    }
}