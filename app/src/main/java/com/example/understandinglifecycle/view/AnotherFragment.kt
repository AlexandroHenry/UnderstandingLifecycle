package com.example.understandinglifecycle.view

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.understandinglifecycle.R
import com.example.understandinglifecycle.databinding.FragmentAnotherBinding

class AnotherFragment : Fragment(), View.OnClickListener {

    private var _binding: FragmentAnotherBinding? = null
    private val binding get() = _binding!!

    override fun onAttach(context: Context) {
        println("------------------- Another Fragment: onAttach 1 -------------------")
        super.onAttach(context)
        println("------------------- Another Fragment: onAttach 2 -------------------")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        println("------------------- Another Fragment: onCreate 1 -------------------")
        super.onCreate(savedInstanceState)
        println("------------------- Another Fragment: onCreate 2 -------------------")
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        println("------------------- Another Fragment: onCreateView 1 -------------------")
        super.onCreateView(inflater, container, savedInstanceState)
        println("------------------- Another Fragment: onCreateView 2 -------------------")
        _binding = FragmentAnotherBinding.inflate(inflater, container, false)
        println("------------------- Another Fragment: onCreateView 3 -------------------")

        with(binding) {
           backBtn.setOnClickListener(this@AnotherFragment)
        }

        return binding.root
        println("------------------- Another Fragment: onCreateView 4 -------------------")
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        println("------------------- Another Fragment: onActivityCreated 1 -------------------")
        super.onActivityCreated(savedInstanceState)
        println("------------------- Another Fragment: onActivityCreated 2 -------------------")
    }

    override fun onStart() {
        println("------------------- Another Fragment: onStart 1 -------------------")
        super.onStart()
        println("------------------- Another Fragment: onStart 2 -------------------")
    }

    override fun onResume() {
        println("------------------- Another Fragment: onResume 1 -------------------")
        super.onResume()
        println("------------------- Another Fragment: onResume 2 -------------------")
    }

    override fun onPause() {
        println("------------------- Another Fragment: onPause 1 -------------------")
        super.onPause()
        println("------------------- Another Fragment: onPause 2 -------------------")
    }

    override fun onStop() {
        println("------------------- Another Fragment: onStop 1 -------------------")
        super.onStop()
        println("------------------- Another Fragment: onStop 2 -------------------")
    }

    override fun onDestroyView() {
        println("------------------- Another Fragment: onDestroyView 1 -------------------")
        super.onDestroyView()
        println("------------------- Another Fragment: onDestroyView 2 -------------------")
    }

    override fun onDestroy() {
        println("------------------- Another Fragment: onDestroy 1 -------------------")
        super.onDestroy()
        println("------------------- Another Fragment: onDestroy 2 -------------------")
    }

    override fun onDetach() {
        println("------------------- Another Fragment: onDetach 1 -------------------")
        super.onDetach()
        println("------------------- Another Fragment: onDetach 2 -------------------")
    }

    override fun onClick(v: View?) {
        when(v) {
            binding.backBtn -> {
                // NavController를 얻어와서 스택에서 현재 Fragment를 제거합니다.
                val navController = findNavController()
                navController.popBackStack()
            }
        }
    }
}