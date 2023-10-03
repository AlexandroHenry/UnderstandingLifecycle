package com.example.understandinglifecycle.view

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.understandinglifecycle.MainActivity
import com.example.understandinglifecycle.MainActivity2
import com.example.understandinglifecycle.R
import com.example.understandinglifecycle.databinding.FragmentHomeBinding

class HomeFragment : Fragment(), View.OnClickListener {

    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!

    override fun onAttach(context: Context) {
        Log.e("Home", "onAttach1")
        super.onAttach(context)
        Log.e("Home", "onAttach2")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        Log.e("Home", "onCreate1")
        super.onCreate(savedInstanceState)
        Log.e("Home", "onCreate2")
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.e("Home", "onCreateView1")
        super.onCreateView(inflater, container, savedInstanceState)
        Log.e("Home", "onCreateView2")
        _binding = FragmentHomeBinding.inflate(inflater, container, false)


        with(binding) {
            activity2Btn.setOnClickListener(this@HomeFragment)
            fragment2Btn.setOnClickListener(this@HomeFragment)
        }

        Log.e("Home", "onCreateView3")
        return binding.root
        println("------------------- Home Fragment: onCreateView 4 -------------------")
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        Log.e("Home", "onActivityCreated1")
        super.onActivityCreated(savedInstanceState)
        Log.e("Home", "onActivityCreated2")
    }

    override fun onStart() {
        Log.e("Home", "onStart1")
        super.onStart()
        Log.e("Home", "onStart2")
    }

    override fun onResume() {
        Log.e("Home", "onResume1")
        super.onResume()
        Log.e("Home", "onResume2")
    }

    override fun onPause() {
        Log.e("Home", "onPause1")
        super.onPause()
        Log.e("Home", "onPause2")
    }

    override fun onStop() {
        Log.e("Home", "onStop1")
        super.onStop()
        Log.e("Home", "onStop2")
    }

    override fun onDestroyView() {
        Log.e("Home", "onDestroyView1")
        super.onDestroyView()
        Log.e("Home", "onDestroyView2")
    }

    override fun onDestroy() {
        Log.e("Home", "onDestroy1")
        super.onDestroy()
        Log.e("Home", "onDestroy2")
    }

    override fun onDetach() {
        Log.e("Home", "onDetach1")
        super.onDetach()
        Log.e("Home", "onDetach2")
    }

    override fun onClick(v : View?) {
        when(v) {
            binding.activity2Btn -> {
                Log.e("Activity 이동", "MainActivity2 로 이동 1")
                val intent = Intent(activity, MainActivity2::class.java)
                startActivity(intent)
                Log.e("Activity 이동", "MainActivity2 로 이동 2")

                Log.e("Activity 이동", "MainActivity2 로 이동 3")
            }

            binding.fragment2Btn -> {
                Log.e("Fragment 이동", "Another Fragment 로 이동1")
                findNavController().navigate(R.id.action_homeFragment_to_anotherFragment)
                Log.e("Fragment 이동", "Another Fragment 로 이동2")
            }
        }
    }
}