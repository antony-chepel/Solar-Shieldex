package com.webelinx.Rooms.Exits.EscapeRoom.Fre.jiduygc

import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.webelinx.Rooms.Exits.EscapeRoom.Fre.databinding.ActivityCdusysdtwBinding
import com.webelinx.Rooms.Exits.EscapeRoom.Fre.nkicuxgyd.Bfrxyzyussasasass

class Jopxxgtxzts : AppCompatActivity() {
    private lateinit var sharedHardes: SharedPreferences
    private lateinit var kzxcjn: ActivityCdusysdtwBinding
    var hedSkill = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        kzxcjn = ActivityCdusysdtwBinding.inflate(layoutInflater)
        setContentView(kzxcjn.root)

        sharedHardes = getSharedPreferences("SHARED_HARD", MODE_PRIVATE)
        hedSkill = sharedHardes.getInt("SHARED_HARD", 0)

        when(hedSkill){
            0->{
                kzxcjn.esB.isChecked = true
            }

            1->{
                kzxcjn.meB.isChecked = true
            }

            2->{
                kzxcjn.hB.isChecked = true
            }
        }

        ysgdgyas()

        kzxcjn.icBack.setOnClickListener {
            startActivity(Intent(this, Bfrxyzyussasasass::class.java))
        }

    }


    private fun ysgdgyas() = with(kzxcjn) {
        esB.setOnCheckedChangeListener { _, ischecked ->
            if (ischecked) {
               meB.isChecked = false
               hB.isChecked = false
                hedSkill = 0
                sharedHardes.edit().putInt("SHARED_HARD",hedSkill).apply()

            }
        }

        meB.setOnCheckedChangeListener { _, ischecked ->
            if (ischecked) {
                esB.isChecked = false
                hB.isChecked = false
                hedSkill = 1
                sharedHardes.edit().putInt("SHARED_HARD",hedSkill).apply()

            }
        }

        hB.setOnCheckedChangeListener { _, ischecked ->
            if (ischecked) {
                meB.isChecked = false
                esB.isChecked = false
                hedSkill = 2
                sharedHardes.edit().putInt("SHARED_HARD",hedSkill).apply()

            }
        }


    }
}