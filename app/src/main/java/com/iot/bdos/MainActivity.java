package com.iot.bdos;

import androidx.appcompat.app.AppCompatActivity;
import android.util.Log;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /*/
        final String st1="풀의 광명석:미지 / 항해경험치+3%";
        final String st2="풀의 광명석:수완 / 교역경험치+3%";
        final String st3="풀의 광명석:파랑 / 항해숙련도+5";
        final String st4="오색빛 광명석";
        final String st5="바람의 광명석:머리/";/*/
        final String[] stone1 = {"-광명석 선택-","풀의 광명석:미지 / 항해경험치+3%", "풀의 광명석:수완 / 교역경험치+3%", "풀의 광명석:파랑 / 항해숙련도+5","오색빛 광명석","바람의 광명석:머리 / 최대정신력,신성력,투지+50"};
        final String[] stone2 = {"-광명석 선택-","풀의 광명석:미지 / 항해경험치+3%", "풀의 광명석:수완 / 교역경험치+3%", "풀의 광명석:파랑 / 항해숙련도+5","오색빛 광명석","바람의 광명석:머리 / 최대정신력,신성력,투지+50"};
        final String[] stone3 = {"-광명석 선택-","풀의 광명석:미지 / 항해경험치+3%", "풀의 광명석:수완 / 교역경험치+3%", "풀의 광명석:파랑 / 항해숙련도+5","오색빛 광명석","바람의 광명석:머리 / 최대정신력,신성력,투지+50"};
        final String[] stone4 = {"-광명석 선택-","풀의 광명석:미지 / 항해경험치+3%", "풀의 광명석:수완 / 교역경험치+3%", "풀의 광명석:파랑 / 항해숙련도+5","오색빛 광명석","바람의 광명석:머리 / 최대정신력,신성력,투지+50"};
        Spinner spiner1 = (Spinner) findViewById(R.id.spinner1);

        ArrayAdapter adapter1 = new ArrayAdapter(this, android.R.layout.simple_spinner_item, stone1);
        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spiner1.setAdapter(adapter1);

        spiner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
        Spinner spiner2 = (Spinner) findViewById(R.id.spinner2);

        ArrayAdapter adapter2 = new ArrayAdapter(this, android.R.layout.simple_spinner_item, stone2);
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spiner2.setAdapter(adapter2);

        spiner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
        Spinner spiner3 = (Spinner) findViewById(R.id.spinner3);

        ArrayAdapter adapter3 = new ArrayAdapter(this, android.R.layout.simple_spinner_item, stone3);
        adapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spiner3.setAdapter(adapter3);

        spiner3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
        Spinner spiner4 = (Spinner) findViewById(R.id.spinner4);

        ArrayAdapter adapter4 = new ArrayAdapter(this, android.R.layout.simple_spinner_item, stone4);
        adapter4.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spiner4.setAdapter(adapter4);

        spiner4.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        if(spiner1.equals("풀의 광명석:미지 / 항해경험치+3%")){
            Log.i("test","true/false");
            if(spiner2.equals("풀의 광명석:미지 / 항해경험치+3%")){
                Log.i("test","true/false");
                if (spiner3.equals("풀의 광명석:미지 / 항해경험치+3%")){
                    Log.i("test","true/false");
                    if (spiner4.equals("풀의 광명석:미지 / 항해경험치+3%")){
                        Log.i("test","true/false");
                        TextView text1=(TextView) findViewById(R.id.text1);
                        text1.setText("<하늘과 바다의 경계로> / 항해경험치+8%");

                    }
                }
            }
        }
    }
}