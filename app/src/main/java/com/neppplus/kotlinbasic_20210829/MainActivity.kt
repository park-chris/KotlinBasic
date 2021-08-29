package com.neppplus.kotlinbasic_20210829

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        toastBtn.setOnClickListener {
            // 토스트 - "반값습니다." 문장 띄우기
            Toast.makeText(this, "반갑습니다.", Toast.LENGTH_SHORT).show()
        }

        logBtn.setOnClickListener {
            // 이 중괄호 내부의 코드는, logBtn이 클릭될때마다 실행됨
            Log.d("메인화면", "로그 버튼 눌림")
        }

        secondLogBtn.setOnClickListener {
            Log.e("메인화면", "두번째 로그 버튼 눌림")
        }




    }
}