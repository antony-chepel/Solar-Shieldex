package com.webelinx.Rooms.Exits.EscapeRoom.Fre.jcuxhd

import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.webelinx.Rooms.Exits.EscapeRoom.Fre.R
import org.koin.android.ext.android.inject
import org.koin.androidx.viewmodel.ext.android.activityViewModel
import org.koin.core.qualifier.named

class Hncjcxyggdse : Fragment() {
    lateinit var wokospsd: String
    val diojcjiovjix: SharedPreferences by inject(named("SharedPreferences"))
    val tuidjsi by activityViewModel<Oissodwhushuda>(named("MainModel"))
    private lateinit var sidjsi: Context



    override fun onAttach(context: Context) {
        super.onAttach(context)
        sidjsi = context
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.niugfif, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        tuidjsi.qpowkoe.observe(viewLifecycleOwner) {
            if (it!=null) {
                wokospsd = it.coxijc
                diojcjiovjix.edit().putString("country", wokospsd).apply()
                findNavController().navigate(R.id.imuby)
            }
        }
    }



}