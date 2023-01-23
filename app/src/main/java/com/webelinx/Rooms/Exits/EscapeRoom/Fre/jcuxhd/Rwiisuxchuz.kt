package com.webelinx.Rooms.Exits.EscapeRoom.Fre.jcuxhd
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController


import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.webelinx.Rooms.Exits.EscapeRoom.Fre.R
import com.webelinx.Rooms.Exits.EscapeRoom.Fre.jcuxhd.Oissodwhushuda


import org.koin.android.ext.android.inject
import org.koin.androidx.viewmodel.ext.android.activityViewModel
import org.koin.core.qualifier.named


class Rwiisuxchuz : Fragment() {
    lateinit var mcivjxdhu: String
    val gijivhubu by activityViewModel<Oissodwhushuda>(named("MainModel"))
    private lateinit var nijbnuh: Context

    val ytdijv: SharedPreferences by inject(named("SharedPreferences"))



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.bsgvsdgvw, container, false)
    }




    override fun onAttach(context: Context) {
        super.onAttach(context)
        nijbnuh = context
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val gcxyvhuxcij = ytdijv.getString("apps", null)
        val apsokdjixjic = ytdijv.getString("appCamp", null)

        if (gcxyvhuxcij=="1" &&apsokdjixjic == null) {
            gijivhubu.ivicuhvcyggygysdf(nijbnuh)
            gijivhubu.apasodkodks.observe(viewLifecycleOwner) {

                if (it != null) {
                    mcivjxdhu = it.toString()
                    ytdijv.edit().putString("appCamp", mcivjxdhu).apply()
                    findNavController().navigate(R.id.ifuijvcods)
                }
            }
        } else {
            findNavController().navigate(R.id.ifuijvcods)
        }
    }

}