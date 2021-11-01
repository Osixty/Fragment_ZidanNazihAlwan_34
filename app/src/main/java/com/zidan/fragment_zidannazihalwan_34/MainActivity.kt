package com.zidan.fragment_zidannazihalwan_34

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.zidan.fragment_zidannazihalwan_34.fragment.AddFragment
import com.zidan.fragment_zidannazihalwan_34.fragment.HomeFragment
import com.zidan.fragment_zidannazihalwan_34.fragment.SettingFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fragmenthome = HomeFragment()
        val fragmentadd = AddFragment()
        val fragmentsetting = SettingFragment()

        awalfragment(fragmenthome)

        val bottom = findViewById<BottomNavigationView>(R.id.navigation_bar)

        bottom.setOnNavigationItemSelectedListener {
            when (it.itemId){
                R.id.menu_home -> awalfragment(fragmenthome)
                R.id.menu_add -> awalfragment(fragmentadd)
                R.id.menu_setting -> awalfragment(fragmentsetting)
            }
            true
        }
    }

    private fun awalfragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.activity_nav,fragment)
            commit()
        }

    }


}


