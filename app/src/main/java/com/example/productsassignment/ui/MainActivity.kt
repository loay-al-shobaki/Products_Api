package com.example.productsassignment.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.productsassignment.databinding.ActivityMainBinding
import com.example.productsassignment.ui.all_Products.AllProductsFragment
import com.example.productsassignment.ui.fragrances.FragrancesFragment

import com.example.productsassignment.ui.groceries.GroceriesFragment
import com.example.productsassignment.ui.smart_phone.SmartPhonesFragment
import com.google.android.material.tabs.TabLayoutMediator


class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    val fragments = listOf<Fragment>(
        AllProductsFragment(),
        SmartPhonesFragment(),
        FragrancesFragment(),
        GroceriesFragment()
    )
    val tabTitles = listOf("All", "SmartPhones", "Fragrances", "Groceries")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initViewPager()
        initTabLayout()
    }

    fun initViewPager() {
        val pagerAdpter = MyPagerAdpter(this, fragments)
        binding.viewPager.adapter = pagerAdpter
    }

    fun initTabLayout() {
        TabLayoutMediator(binding.tabLayout, binding.viewPager) { tab, position ->
            tab.text = tabTitles[position]
        }.attach()
    }

}
