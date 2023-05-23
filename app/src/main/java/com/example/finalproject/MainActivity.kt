package com.example.finalproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.FragmentTransaction
import com.example.finalproject.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        supportActionBar?.hide()

        val bottombar = binding.bottomNavigation
        val homeFragment = HomeFragment()
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.fragment_container, homeFragment)
            commit()
        }

        bottombar.setOnNavigationItemSelectedListener { item ->
            val selectedFragment = when (item. itemId) {
                R.id.home -> HomeFragment()
                R.id.recipe -> RecipeFragment()
                R.id.mypage -> MypageFragment()
                else -> throw IllegalArgumentException("Unexpected itemId")
            }

            // Switch to the selected Fragment
            supportFragmentManager.beginTransaction().apply {
                setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                replace(R.id.fragment_container, selectedFragment)
                commit()
            }

            true
        }
    }
}