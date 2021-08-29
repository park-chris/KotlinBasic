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


        // 본인의 이름을 변수 (my name) 에 담고, 로그로 출력.
        var myName = "박수정"  // 자료형? String 세팅
        myName = "정수박"
        Log.d("이름출력-변수활용", myName)


//         한 사용자의 나이를 17살 이라고 저장
        val userAge = 10

        // 이 사람이 성인인가 ?     나이가 20살 이상인가?
        if (userAge >= 20) {
//             if () 내부의 질문 결과가 true일때만 실행됨
            Log.d("if문 예시", "성인이 맞습니다.")
        }
        else if (userAge >= 17) {
//            20살 미만 + 17살 이상인 경우
            Log.d("if문 예시", "고등학생입니다.")
        }
        else if (userAge >= 14) {
            Log.d("if문 예시", "중학생입니다.")
        }
        else {
            Log.d("if문 예시", "초등학생 or 미취학아동입니다.")
        }



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

        // 자기소개 버튼이 눌리면 => "저는 ???입니다" 토스트로 출력
        introduceToastBtn.setOnClickListener {
            Toast.makeText(this, "나는 박수정입니다.", Toast.LENGTH_SHORT).show()
        }


    }
}