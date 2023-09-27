package com.example.projectbp2683

class LoginModel {
    //variabel
    var username = " "
    var password = " "
    //method/func
    fun LoginCek():Boolean{
        if(username.equals("alfandi")&&password.equals("admin")){
            return true
    }else{
        return false
        }
    }
}