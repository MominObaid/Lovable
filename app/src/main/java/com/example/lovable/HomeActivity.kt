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
