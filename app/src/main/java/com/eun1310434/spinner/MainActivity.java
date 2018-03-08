/*=====================================================================
□ Infomation
  ○ Data : 08.03.2018
  ○ Mail : eun1310434@naver.com
  ○ Blog : https://blog.naver.com/eun1310434
  ○ Reference : Do it android app Programming

□ Function
  ○ Spinner
  ○ ArrayAdapter를 활용 데이터 관리

□ Study
  ○
=====================================================================*/
package com.eun1310434.spinner;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //선택된 값을 표시할 텍스트뷰
    TextView textView;

    //스피너를 위한 아이템 정의
    String[] items = { "a", "b", "c", "d", "e", "f", "g", "h" };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView) findViewById(R.id.textView);
        Spinner spinnerA = (Spinner) findViewById(R.id.spinnerA);
        Spinner spinnerB = (Spinner) findViewById(R.id.spinnerB);

        // 어댑터 객체 생성
        // 안드로이드에서 제공하는 form 사용 : android.R.layout.simple_spinner_item
        ArrayAdapter<String> adapterA = new ArrayAdapter<String>(
                this, android.R.layout.simple_spinner_item, items);
        adapterA.setDropDownViewResource(android.R.layout.simple_spinner_item);

        // 안드로이드에서 제공하는 form 사용 : android.R.layout.simple_spinner_item
        ArrayAdapter<String> adapterB = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, items);
        adapterB.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // 어댑터 설정
        spinnerA.setAdapter(adapterA);
        spinnerB.setAdapter(adapterB);

        // 아이템 선택 이벤트 처리
        spinnerA.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            // 아이템이 선택되었을 때 호출됨
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id) {
                textView.setText(items[position]);
            }

            // 아무것도 선택되지 않았을 때 호출됨
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                textView.setText("");
            }
        });


        // 아이템 선택 이벤트 처리
        spinnerB.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            // 아이템이 선택되었을 때 호출됨
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id) {
                textView.setText(items[position]);
            }

            // 아무것도 선택되지 않았을 때 호출됨
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                textView.setText("");
            }
        });
    }

}
