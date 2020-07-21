package com.lee.kioskour

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import okhttp3.OkHttpClient
import retrofit2.*
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val textId = findViewById<TextView>(R.id.text_id)
//        val textAge = findViewById<TextView>(R.id.text_age)
//
//        var okHttpClient = OkHttpClient.Builder()
//                .connectTimeout(10, TimeUnit.SECONDS)
//                .writeTimeout(10, TimeUnit.SECONDS)
//                .readTimeout(30, TimeUnit.SECONDS)
//                .build()
//
//        val retrofit = Retrofit.Builder()
//                .baseUrl("http://192.168.0.85:3000")
//                .addConverterFactory(GsonConverterFactory.create())
//                .client(okHttpClient)
//                .build()
//
//        val api = retrofit.create(CustomerApi::class.java)
////        var callGetCustomer = api.getCustomer()
////        var callSetCustomer = api.setCustomer()
//
//        val buttonDeterCustomer: Button = findViewById(R.id.btn_deter_customer)
//        buttonDeterCustomer.setOnClickListener(View.OnClickListener {
//            val callGetCustomer = api.getCustomer()
//            callGetCustomer.enqueue(object : Callback<Customer>{
//                override fun onFailure(call: Call<Customer>, t: Throwable) {
//                    Log.d("test", "실패 : $t")
//                }
//
//                override fun onResponse(call: Call<Customer>, response: Response<Customer>) {
//                    Log.d("test", "성공 : ${response.raw()}")
//                    textId.text = response.body()?.id.toString()
//                    textAge.text = response.body()?.age.toString()
//                }
//            })
//        })
//
//        val buttonSignInCustomer: Button = findViewById(R.id.btn_signup_customer)
//        buttonSignInCustomer.setOnClickListener(View.OnClickListener {
//            val callSetCustomer = api.setCustomer()
//            callSetCustomer.enqueue(object : Callback<Customer>{
//                override fun onFailure(call: Call<Customer>, t: Throwable) {
//                    Log.d("test", "실패 : $t")
//                }
//
//                override fun onResponse(call: Call<Customer>, response: Response<Customer>) {
//                    Log.d("test", "성공 : ${response.raw()}")
//                    textId.text = response.body()?.id.toString()
//                    textAge.text = response.body()?.age.toString()
//                }
//            })
//        })

    }

}
