
package com.vdcodeassociate.moviesimdb.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI
import com.vdcodeassociate.moviesimdb.R
import com.vdcodeassociate.moviesimdb.databinding.ActivityMainBinding
import com.vdcodeassociate.moviesimdb.ui.fragments.ListFragmentDirections

class MainActivity : AppCompatActivity(R.layout.activity_main) {

    // viewBinding
    private lateinit var binding: ActivityMainBinding

    // nav controller
    private lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)

        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
        navController = navHostFragment.navController

    }

}