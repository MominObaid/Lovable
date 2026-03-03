package com.example.lovable

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.GravityCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.lovable.databinding.ActivityHomeBinding

class HomeActivity : AppCompatActivity() {
    private lateinit var binding: ActivityHomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val recyclerView = binding.recyclerViewUpcomingEvent

        val itemList = listOf(
            ItemRV("Sarah Chen ","posted in ", "\n #general ","5 min ago"),
            ItemRV("Marcus Rivera ", "completed task in "," \n Sprint Board","12 min ago"),
            ItemRV("Priya Patel ","scheduled a meeting:"," \n Design Review ","28 min ago"),
            ItemRV("James Kim ","uploaded file to ","\n #design","1 hr ago"),
            ItemRV("Luna Park ","joined "," \n Lounge voice room ","1.5 hrs ago")
        )
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = AdapterRv(itemList)


        val drawerLayout = binding.drawerLayout
        val menuBtn = binding.menuBtn

        // TO Logout click handling
//        binding.navigationView.setNavigationItemSelectedListener {
//            val logout = R.id.nav_logout
//            logout.apply { logout }
//            val intent = Intent(this, AuthActivity::class.java).apply {
//                flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
//            }
//            startActivity(intent)
//        }
        menuBtn.setOnClickListener {
            drawerLayout.openDrawer(GravityCompat.START)
        }
    }
}














//for Navigation

//
//import android.os.Bundle
//import android.widget.Toast
//import androidx.appcompat.app.AppCompatActivity
//import androidx.core.view.GravityCompat
//import com.example.lovable.databinding.ActivityHomeBinding
//
//class HomeActivity : AppCompatActivity() {
//
//    private lateinit var binding: ActivityHomeBinding
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        binding = ActivityHomeBinding.inflate(layoutInflater)
//        setContentView(binding.root)
//
//        setupDrawer()
//    }
//
//    private fun setupDrawer() {
//        // 1. Open drawer when menu icon is clicked
//        binding.menuBtn.setOnClickListener {
//            binding.drawerLayout.openDrawer(GravityCompat.START)
//        }
//
//        // 2. Handle clicks on navigation menu items
//        binding.navigationView.setNavigationItemSelectedListener { menuItem ->
//            // Close the drawer when an item is tapped
//            binding.drawerLayout.closeDrawer(GravityCompat.START)
//
//            // Handle navigation
//            when (menuItem.itemId) {
//                R.id.nav_home -> showToast("Home Clicked")
//                R.id.nav_messages -> showToast("Messages Clicked")
//                R.id.nav_meetings -> showToast("Meetings Clicked")
//                R.id.nav_tasks -> showToast("Tasks Clicked")
//                R.id.nav_calendar -> showToast("Calendar Clicked")
//                R.id.nav_logout -> {
//                    // Example: Navigate to Login screen and clear back stack
//                    // val intent = Intent(this, LoginActivity::class.java).apply {
//                    //     flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
//                    // }
//                    // startActivity(intent)
//                    showToast("Logout Clicked")
//                }
//            }
//            // Return true to mark the item as handled
//            true
//        }
//    }
//
//    // Helper function for showing messages
//    private fun showToast(message: String) {
//        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
//    }
//
//    // Optional: Handle the back button to close the drawer if it's open
////    override fun onBackPressed() {
////        if (binding.drawerLayout.isDrawerOpen(GravityCompat.START)) {
////            binding.drawerLayout.closeDrawer(GravityCompat.START)
////        } else {
////            super.onBackPressed()
////        }
////    }
//}
