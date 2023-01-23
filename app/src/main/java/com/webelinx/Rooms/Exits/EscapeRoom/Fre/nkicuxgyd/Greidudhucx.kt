package com.webelinx.Rooms.Exits.EscapeRoom.Fre.nkicuxgyd

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.webelinx.Rooms.Exits.EscapeRoom.Fre.R
import com.webelinx.Rooms.Exits.EscapeRoom.Fre.jcuxhd.Oissodwhushuda
import org.koin.androidx.viewmodel.ext.android.activityViewModel
import org.koin.core.qualifier.named

class Greidudhucx : Fragment() {
    override fun onAttach(context: Context) {
        super.onAttach(context)
        qpwokijdsji=context
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.cpsoaaos, container, false)
    }
    val fivicijcivj by activityViewModel<Oissodwhushuda>(named("MainModel"))

    private lateinit var qpwokijdsji: Context

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        fivicijcivj.rieijjidfhu(qpwokijdsji)

        findNavController().navigate(R.id.ibuygv)

    }



}