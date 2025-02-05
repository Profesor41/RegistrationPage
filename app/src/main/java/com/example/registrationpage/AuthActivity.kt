package com.example.registrationpage

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class AuthActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_auth)

        val userLogin: EditText = findViewById(R.id.user_login_auth)
        val userPass: EditText = findViewById(R.id.user_pass_auth)
        val button: Button = findViewById(R.id.button_auth)

        val linkToReg: TextView = findViewById(R.id.link_to_reg)

        linkToReg.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
        button.setOnClickListener {
            val login = userLogin.text.toString().trim()
            val pass = userPass.text.toString().trim()

            if(login == "" || pass == "")
                Toast.makeText(this, "Здається ти щось пропустив", Toast.LENGTH_LONG).show()
            else{

                val db = DbHelper(this, null)
                val isAuth = db.getUser(login, pass)

                if(isAuth) {
                    Toast.makeText(this, "Все $login, ти залогінився", Toast.LENGTH_LONG).show()
                    userLogin.text.clear()
                    userPass.text.clear()

                } else
                    Toast.makeText(this, " $login, ти хто такий]", Toast.LENGTH_LONG).show()



            }
        }


        }
    }
