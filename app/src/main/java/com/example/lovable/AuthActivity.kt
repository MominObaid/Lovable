package com.example.lovable

import android.content.Intent
import android.os.Bundle
import android.util.Patterns
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.lovable.databinding.AuthActivityBinding

class AuthActivity : AppCompatActivity() {

    private lateinit var binding: AuthActivityBinding
    private lateinit var sessionManager: SessionManager
    private var isLoginMode = true

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = AuthActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)

        sessionManager = SessionManager(this)

        if (sessionManager.isLoggedIn()) {
            goToHome()
        }

        setupToggle()
        setupClick()
    }

    private fun setupToggle() {
        binding.btnToggle.setOnClickListener {
            isLoginMode = !isLoginMode

            if (isLoginMode) {
                binding.tvTitle.text = "Login"
                binding.btnMain.text = "Login"
                binding.etName.visibility = android.view.View.GONE
                binding.btnToggle.text = "Don't have account? Sign Up"
            } else {
                binding.tvTitle.text = "Sign Up"
                binding.btnMain.text = "Sign Up"
                binding.etName.visibility = android.view.View.VISIBLE
                binding.btnToggle.text = "Already have account? Login"
            }
        }
    }

    private fun setupClick() {
        binding.btnMain.setOnClickListener {
            if (validate()) {
                if (isLoginMode) login()
                else register()
            }
        }
    }

    private fun validate(): Boolean {

        val email = binding.etEmail.text.toString().trim()
        val password = binding.etPassword.text.toString().trim()

        if (!isLoginMode) {
            val name = binding.etName.text.toString().trim()
            if (name.isEmpty()) {
                binding.etName.error = "Name required"
                return false
            }
        }

        if (email.isEmpty() || !Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
            binding.etEmail.error = "Valid email required"
            return false
        }

        if (password.length < 4) {
            binding.etPassword.error = "Minimum 4 characters"
            return false
        }

        return true
    }

    private fun register() {

        val name = binding.etName.text.toString()
        val email = binding.etEmail.text.toString()
        val password = binding.etPassword.text.toString()

        sessionManager.registerUser(name, email, password)
        sessionManager.setLoggedIn(email)

        Toast.makeText(this, "Account Created!", Toast.LENGTH_SHORT).show()
        goToHome()
    }

    private fun login() {

        val email = binding.etEmail.text.toString()
        val password = binding.etPassword.text.toString()

        if (sessionManager.loginUser(email, password)) {
            sessionManager.setLoggedIn(email)
            Toast.makeText(this, "Login Successful!", Toast.LENGTH_SHORT).show()
            goToHome()
        } else {
            Toast.makeText(this, "Invalid Credentials", Toast.LENGTH_SHORT).show()
        }
    }

    private fun goToHome() {
        startActivity(Intent(this, HomeActivity::class.java))
        finish()
    }
}