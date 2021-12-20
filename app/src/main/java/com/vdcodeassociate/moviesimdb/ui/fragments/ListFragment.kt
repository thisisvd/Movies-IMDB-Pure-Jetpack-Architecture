package com.vdcodeassociate.moviesimdb.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import com.vdcodeassociate.moviesimdb.R
import com.vdcodeassociate.moviesimdb.databinding.FragmentListBinding

class ListFragment : Fragment(R.layout.fragment_list) {

    // viewBinding
    private lateinit var binding: FragmentListBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentListBinding.bind(view)

        binding.apply {

            button.setOnClickListener {

                val action = ListFragmentDirections.actionListFragmentToDetailFragment()
                findNavController().navigate(action)

            }
        }

    }

}