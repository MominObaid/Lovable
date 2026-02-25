package com.example.lovable

import android.content.Context

class SessionManager(context: Context) {

    private val sharedPref =
        context.getSharedPreferences("DummyAuth", Context.MODE_PRIVATE)

    fun registerUser(name: String, email: String, password: String) {
        val editor = sharedPref.edit()
        editor.putString("name_$email", name)
        editor.putString("password_$email", password)
        editor.apply()
    }

    fun loginUser(email: String, password: String): Boolean {
        val savedPassword = sharedPref.getString("password_$email", null)
        return savedPassword == password
    }

    fun setLoggedIn(email: String) {
        sharedPref.edit()
            .putBoolean("isLoggedIn", true)
            .putString("loggedInUser", email)
            .apply()
    }

    fun isLoggedIn(): Boolean {
        return sharedPref.getBoolean("isLoggedIn", false)
    }

    fun getLoggedInUser(): String? {
        return sharedPref.getString("loggedInUser", null)
    }

    fun logout() {
        sharedPref.edit()
            .putBoolean("isLoggedIn", false)
            .remove("loggedInUser")
            .apply()
    }
}