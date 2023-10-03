package com.example.understandinglifecycle

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import com.example.understandinglifecycle.databinding.ActivityMain2Binding

// MainActivity2 - 반투명 액티비티
class MainActivity2 : Activity(), View.OnClickListener{

    private val binding by lazy { ActivityMain2Binding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        Log.e("Activity 2", "onCreate1")
        super.onCreate(savedInstanceState)
        Log.e("Activity 2", "onCreate2")
        setContentView(R.layout.activity_main2)

        with(binding) {
            activity1Btn.setOnClickListener(this@MainActivity2)
        }

        Log.e("Activity 2", "onCreate3")
    }

    override fun onStart() {
        Log.e("Activity 2", "onStart1")
        super.onStart()
        Log.e("Activity 2", "onStart2")
    }

    override fun onRestart() {
        Log.e("Activity 2", "onRestart1")
        super.onRestart()
        Log.e("Activity 2", "onRestart2")
    }

    // 중지 되어있던 액티비티가 다시 재개 되는 시점에서 이곳 내부 구문들을 실행
    override fun onResume() {
        Log.e("Activity 2", "onResume1")
        super.onResume()
        Log.e("Activity 2", "onResume2")
    }

    // 중지 상태가 될 때 이곳 내부 구문을 실행
    // 예 : 홈버튼을 눌러서 바깥으로 잠깐 빠져나갔을 때 (앱이 종료된 상태가 아닌)
    // 예 : 다른 액티비티가 활성화 되어있을 때
    override fun onPause() {
        Log.e("Activity 2", "onPause1")
        super.onPause()
        Log.e("Activity 2", "onPause2")
    }

    override fun onStop() {
        Log.e("Activity 2", "onStop1")
        super.onStop()
        Log.e("Activity 2", "onStop2")
    }

    // 화면이 파괴되어서 소멸 했을 때의 시점에 내부 구문들을 실행
    override fun onDestroy() {
        Log.e("Activity 2", "onDestroy1")
        super.onDestroy()
        Log.e("Activity 2", "onDestroy2")
    }

    override fun onClick(v: View?) {
        when(v) {
            binding.activity1Btn -> {
                print("액티비티 1 으로 이동 버튼 누름")
                val intent = Intent(this@MainActivity2, MainActivity::class.java)
                startActivity(intent)
                finish() // 현재 액티비티를 종료하여 MainActivity로 돌아갑니다.
            }
        }
    }
}