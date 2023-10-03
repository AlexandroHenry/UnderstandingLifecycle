package com.example.understandinglifecycle

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.navigation.findNavController
import com.example.understandinglifecycle.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    private val naviController by lazy { findNavController(R.id.mainNavHostFragment) }

    // 액티비티 또는 프래그먼트가 생성이 되었을 때 이곳 내부 구문들을 실행
    override fun onCreate(savedInstanceState: Bundle?) {
        Log.e("Activity", "onCreate1")
        super.onCreate(savedInstanceState)
        Log.e("Activity", "onCreate2")
        setContentView(R.layout.activity_main)
        Log.e("Activity", "onCreate3")
    }

    override fun onStart() {
        Log.e("Activity", "onStart1")
        super.onStart()
        Log.e("Activity", "onStart2")
    }

    override fun onRestart() {
        Log.e("Activity", "onRestart1")
        super.onRestart()
        Log.e("Activity", "onRestart2")
    }

    // 중지 되어있던 액티비티가 다시 재개 되는 시점에서 이곳 내부 구문들을 실행
    override fun onResume() {
        Log.e("Activity", "onResume1")
        super.onResume()
        Log.e("Activity", "onResume2")
    }

    // 중지 상태가 될 때 이곳 내부 구문을 실행
    // 예 : 홈버튼을 눌러서 바깥으로 잠깐 빠져나갔을 때 (앱이 종료된 상태가 아닌)
    // 예 : 다른 액티비티가 활성화 되어있을 때
    override fun onPause() {
        Log.e("Activity", "onPause1")
        super.onPause()
        Log.e("Activity", "onPause2")
    }

    override fun onStop() {
        Log.e("Activity", "onStop1")
        super.onStop()
        Log.e("Activity", "onStop2")
    }

    // 화면이 파괴되어서 소멸 했을 때의 시점에 내부 구문들을 실행
    override fun onDestroy() {
        Log.e("Activity", "onDestroy1")
        super.onDestroy()
        Log.e("Activity", "onDestroy2")
    }
}