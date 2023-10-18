package com.example.projectbp2683

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        val btnLogin:Button =findViewById(R.id.buttonLogin)
        val txtUsername:EditText = findViewById(R.id.editTextUsername)
        val txtPassword:EditText = findViewById(R.id.editTextPassword)
        val LogModel = LoginModel()
        btnLogin.setOnClickListener{
//            LogModel.username = txtUsername.text.toString()
//            LogModel.password = txtPassword.text.toString()

//            if(LogModel.LoginCek() == true){
                val Home = Intent(this,HomeActivity::class.java)
                startActivity(Home)
//            }else{
//                Toast.makeText(this,"Login gagal, cek username dab password",
//                    Toast.LENGTH_SHORT).show()
//            }
        }
    }
}