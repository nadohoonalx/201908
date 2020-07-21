package com.lee.kioskour.mymain

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import com.lee.kioskour.R
import com.lee.kioskour.databinding.FragmentMyMainBinding
import com.lee.kioskour.model.MyOrder

class MyMainFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding: FragmentMyMainBinding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_my_main, container, false)

        val application = requireNotNull(this.activity).application

        val viewModelFactory = MyMainViewModelFactory(application)

        val myMainViewModel = ViewModelProviders.of(this, viewModelFactory).get(MyMainViewModel::class.java)

        binding.myMainViewModel = myMainViewModel


        val adapter = MyOrderAdapter(MyOrderListener { order ->
            Toast.makeText(context, order.price.toString(), Toast.LENGTH_SHORT).show()
        })
        binding.recentOrderList.adapter = adapter

        var items: MutableList<MyOrder> = mutableListOf()
        items.add(MyOrder("Pizza", 10000, ""))
        items.add(MyOrder("Burger", 3000, ""))
        items.add(MyOrder("Beef", 40000, ""))

        adapter.data = items


        return binding.root
    }
}