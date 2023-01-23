package com.webelinx.Rooms.Exits.EscapeRoom.Fre.jiduygc

import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.webelinx.Rooms.Exits.EscapeRoom.Fre.R
import com.webelinx.Rooms.Exits.EscapeRoom.Fre.jcuxhd.Oissodwhushuda
import org.koin.android.ext.android.inject
import org.koin.androidx.viewmodel.ext.android.activityViewModel
import org.koin.core.qualifier.named


class Fersusuidaushd : Fragment() {
    val mmcxivjxchu by activityViewModel<Oissodwhushuda>(named("MainModel"))
    lateinit var icjvuhchucvx: String
    lateinit var ytuifijdkog: String

    private lateinit var hdicjivjix: Context
    val fokvcicji: SharedPreferences by inject(named("SharedPreferences"))
    lateinit var sooxcxizjhu: String







    override fun onAttach(context: Context) {
        super.onAttach(context)
        hdicjivjix = context
    }



    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        mmcxivjxchu.tirjijdff.observe(viewLifecycleOwner) {
            if (it != null) {
                val main = it.toString()
                fokvcicji.edit().putString("mainId", main).apply()
            }
        }

        mmcxivjxchu.mkcxoivjxc.observe(viewLifecycleOwner) {
            if (it != null) {

                icjvuhchucvx = it.bicvudush
                sooxcxizjhu = it.lososapdasok
                ytuifijdkog = it.forokdijfji

                fokvcicji.edit().putString("countryDev", icjvuhchucvx).apply()
                fokvcicji.edit().putString("apps", sooxcxizjhu).apply()
                fokvcicji.edit().putString("wv", ytuifijdkog).apply()

                findNavController().navigate(R.id.xodijscijxvko)
            }
        }
    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.wsodijs, container, false)
    }

}