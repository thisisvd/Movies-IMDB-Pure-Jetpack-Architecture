package com.vdcodeassociate.moviesimdb.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.NavigationUI
import com.vdcodeassociate.moviesimdb.R
import com.vdcodeassociate.moviesimdb.databinding.FragmentDetailBinding
import com.vdcodeassociate.moviesimdb.databinding.FragmentListBinding

class DetailFragment : Fragment(R.layout.fragment_detail) {

    // viewBinding
    private lateinit var binding: FragmentDetailBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentDetailBinding.bind(view)

        binding.apply {



        }
    }

}