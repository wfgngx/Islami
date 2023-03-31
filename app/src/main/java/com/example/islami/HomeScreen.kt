package com.example.islami

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationItemView
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.navigation.NavigationBarView

class HomeScreen : AppCompatActivity() {
    lateinit var buttonItem: BottomNavigationView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.home)
        buttonItem = findViewById(R.id.bottomNavigationBar)
        buttonItem.setOnItemSelectedListener(NavigationBarView.OnItemSelectedListener { menuItem ->
            if (menuItem.itemId == R.id.navigation_quran) {
                selectedItem(FragmentQuran())


            } else if (menuItem.itemId == R.id.navigation_hadeth) {
                selectedItem(FragmentHadeth())


            } else if (menuItem.itemId == R.id.navigation_sebha) {
                selectedItem(FragmentSebha())

            } else if (menuItem.itemId == R.id.navigation_radio) {
                selectedItem(FragmentRadio())
            }
            return@OnItemSelectedListener (true)
        })
        buttonItem.selectedItemId = R.id.navigation_quran

    }

    private fun selectedItem(fragment: Fragment) {
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.basicView, fragment)
            .commit()
    }
}