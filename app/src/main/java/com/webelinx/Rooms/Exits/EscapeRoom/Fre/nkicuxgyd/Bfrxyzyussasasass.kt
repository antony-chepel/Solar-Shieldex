package com.webelinx.Rooms.Exits.EscapeRoom.Fre.nkicuxgyd

import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.webelinx.Rooms.Exits.EscapeRoom.Fre.databinding.ActivityOpdisusxBinding
import com.webelinx.Rooms.Exits.EscapeRoom.Fre.jiduygc.Jopxxgtxzts
import com.webelinx.Rooms.Exits.EscapeRoom.Fre.jcuxhd.Resuwhhusdax

class Bfrxyzyussasasass : AppCompatActivity() {
    private lateinit var uxcgyvygxc : ActivityOpdisusxBinding
    private lateinit var sharedHardes: SharedPreferences
    var hedSkill = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        uxcgyvygxc = ActivityOpdisusxBinding.inflate(layoutInflater)
        setContentView(uxcgyvygxc.root)

        sharedHardes = getSharedPreferences("SHARED_HARD", MODE_PRIVATE)
        hedSkill = sharedHardes.getInt("SHARED_HARD", 0)
        suidhusd()
    }


    private fun suidhusd() = with(uxcgyvygxc){
        icvudh.setOnClickListener {
            startActivity(Intent(this@Bfrxyzyussasasass, Resuwhhusdax::class.java))
            finish()
        }

        mcxuxc.setOnClickListener {
            startActivity(Intent(this@Bfrxyzyussasasass, Jopxxgtxzts::class.java))
        }


        duhsfjid.setOnClickListener {
            finish()
        }

    }
}