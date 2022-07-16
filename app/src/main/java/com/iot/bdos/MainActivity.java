package com.iot.bdos;


import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
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
        protected void onCreate (Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final String[] artifact1 = {"-유물 선택-", "마쉬의 유물-몬스터 추가 공격력 / 몬스터 추가 공격력+6", "세스라의 유물-탑승물 경험치 / 탑승물 경험치+3%",
                "레샤의 유물-근거리 회피력 / 근거리 회피력+12", "케헬의 유물-최대지구력 / 최대지구력+50"};
        final String[] stone1 = {"-광명석 선택-", "풀의 광명석:미지 / 항해경험치+3%", "풀의 광명석:수완 / 교역경험치+3%", "풀의 광명석:파랑 / 항해숙련도+5",
                "오색빛 광명석", "바람의 광명석:머리 / 최대정신력,신성력,투지+50", "불의 광명석:천적 / 몬스터 추가 공격력+3", "불의 광명석:비수 / 치명타 확률+2%",
                "바람의 광명석:심장 / 최대생명력+50","땅의 광명석:장막 / 몬스터에게 받는 피해량-1%","불의 광명석:격노 / 모든 공격력+2","불의 광명석:명중 / 모든 적중력+4",
        "바람의 광명석:허파 / 최대지구력+25","불의 광명석:일격 / 치명타 피해량+1%","불의 광명석:서리 / 기절,경직,빙결 저항무시+2%",
                "불의 광명석:창공 / 에어어택 피해량+1%"};
        final String[] stone2 = {"-광명석 선택-", "풀의 광명석:미지 / 항해경험치+3%", "풀의 광명석:수완 / 교역경험치+3%", "풀의 광명석:파랑 / 항해숙련도+5",
                "오색빛 광명석", "바람의 광명석:머리 / 최대정신력,신성력,투지+50", "불의 광명석:천적 / 몬스터 추가 공격력+3", "불의 광명석:비수 / 치명타 확률+2%",
                "바람의 광명석:심장 / 최대생명력+50","땅의 광명석:장막 / 몬스터에게 받는 피해량-1%","불의 광명석:격노 / 모든 공격력+2","불의 광명석:명중 / 모든 적중력+4",
                "바람의 광명석:허파 / 최대지구력+25","불의 광명석:일격 / 치명타 피해량+1%","불의 광명석:서리 / 기절,경직,빙결 저항무시+2%",
                "불의 광명석:창공 / 에어어택 피해량+1%"};
        final String[] artifact2 = {"-유물 선택-", "마쉬의 유물-몬스터 추가 공격력 / 몬스터 추가 공격력+6", "세스라의 유물-탑승물 경험치 / 탑승물 경험치+3%",
                "레샤의 유물-근거리 회피력 / 근거리 회피력+12", "케헬의 유물-최대지구력 / 최대지구력+50"};
        final String[] stone3 = {"-광명석 선택-", "풀의 광명석:미지 / 항해경험치+3%", "풀의 광명석:수완 / 교역경험치+3%", "풀의 광명석:파랑 / 항해숙련도+5",
                "오색빛 광명석", "바람의 광명석:머리 / 최대정신력,신성력,투지+50", "불의 광명석:천적 / 몬스터 추가 공격력+3", "불의 광명석:비수 / 치명타 확률+2%",
                "바람의 광명석:심장 / 최대생명력+50","땅의 광명석:장막 / 몬스터에게 받는 피해량-1%","불의 광명석:격노 / 모든 공격력+2","불의 광명석:명중 / 모든 적중력+4",
                "바람의 광명석:허파 / 최대지구력+25","불의 광명석:일격 / 치명타 피해량+1%","불의 광명석:서리 / 기절,경직,빙결 저항무시+2%",
                "불의 광명석:창공 / 에어어택 피해량+1%"};
        final String[] stone4 = {"-광명석 선택-", "풀의 광명석:미지 / 항해경험치+3%", "풀의 광명석:수완 / 교역경험치+3%", "풀의 광명석:파랑 / 항해숙련도+5",
                "오색빛 광명석", "바람의 광명석:머리 / 최대정신력,신성력,투지+50", "불의 광명석:천적 / 몬스터 추가 공격력+3", "불의 광명석:비수 / 치명타 확률+2%",
                "바람의 광명석:심장 / 최대생명력+50","땅의 광명석:장막 / 몬스터에게 받는 피해량-1%","불의 광명석:격노 / 모든 공격력+2","불의 광명석:명중 / 모든 적중력+4",
                "바람의 광명석:허파 / 최대지구력+25","불의 광명석:일격 / 치명타 피해량+1%","불의 광명석:서리 / 기절,경직,빙결 저항무시+2%",
                "불의 광명석:창공 / 에어어택 피해량+1%"};
        int[] sp = {0, 0, 0, 0};
        Spinner spiner5 = (Spinner) findViewById(R.id.spinner5);
        ArrayAdapter adapter5 = new ArrayAdapter(this, android.R.layout.simple_spinner_item, artifact1);
        adapter5.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spiner5.setAdapter(adapter5);
        spiner5.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
        Spinner spiner1 = (Spinner) findViewById(R.id.spinner1);

        ArrayAdapter adapter1 = new ArrayAdapter(this, android.R.layout.simple_spinner_item, stone1);
        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spiner1.setAdapter(adapter1);

        spiner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id) {
                String str = (String) spiner1.getSelectedItem();
                if (str.equals(stone1[1])) {
                    Log.i("test", "true/false");
                    sp[0] = 1;
                    if (sp[0] == 1 && sp[1] == 1 && sp[2] == 1 && sp[3] == 1) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<하늘과 바다의 경계로>\n항해경험치+8%");
                    } else if (sp[0] == 1 && sp[1] == 2 && sp[2] == 3 && sp[3] == 4) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<바다의 포옹>\n인어의 소망3\n항해경험치+10%\n교역경험치+10%\n항해숙련도+45");
                    } else if (sp[0] == 1 && sp[1] == 1 && sp[2] == 5 && sp[3] == 4) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<선택과 집중:항해>\n항해숙련도-500\n항해경험치+35%");
                    } else if (sp[0] == 6 && sp[1] == 6 && sp[2] == 7 && sp[3] == 7) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<일격필살>\n몬스터 추가 공격력+10\n치명타 확률 증가+10%");
                    }else if (sp[0] == 8 && sp[1] == 8 && sp[2] == 9 && sp[3] == 9) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<전선 강화>\n최대생명력 +100\n몬스터 피해감소+15\n몬스터에게 받는 피해량-2%");
                    }else if (sp[0] == 9 && sp[1] == 9 && sp[2] == 9 && sp[3] == 4) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<철옹성>\n몬스터 피해감소+20\n몬스터에게 받는 피해량-3%");
                    }else if (sp[0] == 10 && sp[1] == 10 && sp[2] == 10 && sp[3] == 10) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<맹공>\n모든 공격력+9");
                    }else if (sp[0] == 10 && sp[1] == 11 && sp[2] == 12 && sp[3] == 13) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<약점 공략>\n모든 공격력+8\n모든 적중력+12\n최대지구력+75\n치명타 피해량+5%");
                    }else if (sp[0] == 10 && sp[1] == 11 && sp[2] == 12 && sp[3] == 14) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<불곰>\n몬스터 피해감소+20\n몬스터에게 받는 피해량-3%\n기절,경직,빙결 저항무시+8%");
                    }else if (sp[0] == 10 && sp[1] == 10 && sp[2] == 15 && sp[3] == 15) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<초상비격>\n모든 피해감소-15\n모든 회피력-25\n모든 공격력+20\n에어어택 피해량+3%");
                    }else{
                        TextView text1=(TextView) findViewById(R.id.text1);
                        text1.setText("");
                    }
                } else if (str.equals(stone1[2])) {
                    Log.i("test", "true/false");
                    sp[0] = 2;
                    if (sp[0] == 1 && sp[1] == 1 && sp[2] == 1 && sp[3] == 1) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<하늘과 바다의 경계로>\n항해경험치+8%");
                    } else if (sp[0] == 1 && sp[1] == 2 && sp[2] == 3 && sp[3] == 4) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<바다의 포옹>\n인어의 소망3\n항해경험치+10%\n교역경험치+10%\n항해숙련도+45");
                    } else if (sp[0] == 1 && sp[1] == 1 && sp[2] == 5 && sp[3] == 4) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<선택과 집중:항해>\n항해숙련도-500\n항해경험치+35%");
                    } else if (sp[0] == 6 && sp[1] == 6 && sp[2] == 7 && sp[3] == 7) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<일격필살>\n몬스터 추가 공격력+10\n치명타 확률 증가+10%");
                    }else if (sp[0] == 8 && sp[1] == 8 && sp[2] == 9 && sp[3] == 9) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<전선 강화>\n최대생명력 +100\n몬스터 피해감소+15\n몬스터에게 받는 피해량-2%");
                    }else if (sp[0] == 9 && sp[1] == 9 && sp[2] == 9 && sp[3] == 4) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<철옹성>\n몬스터 피해감소+20\n몬스터에게 받는 피해량-3%");
                    }else if (sp[0] == 10 && sp[1] == 10 && sp[2] == 10 && sp[3] == 10) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<맹공>\n모든 공격력+9");
                    }else if (sp[0] == 10 && sp[1] == 11 && sp[2] == 12 && sp[3] == 13) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<약점 공략>\n모든 공격력+8\n모든 적중력+12\n최대지구력+75\n치명타 피해량+5%");
                    }else if (sp[0] == 10 && sp[1] == 11 && sp[2] == 12 && sp[3] == 14) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<불곰>\n몬스터 피해감소+20\n몬스터에게 받는 피해량-3%\n기절,경직,빙결 저항무시+8%");
                    }else if (sp[0] == 10 && sp[1] == 10 && sp[2] == 15 && sp[3] == 15) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<초상비격>\n모든 피해감소-15\n모든 회피력-25\n모든 공격력+20\n에어어택 피해량+3%");
                    }else{
                        TextView text1=(TextView) findViewById(R.id.text1);
                        text1.setText("");
                    }
                } else if (str.equals(stone1[3])) {
                    Log.i("test", "true/false");
                    sp[0] = 3;
                    if (sp[0] == 1 && sp[1] == 1 && sp[2] == 1 && sp[3] == 1) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<하늘과 바다의 경계로>\n항해경험치+8%");
                    } else if (sp[0] == 1 && sp[1] == 2 && sp[2] == 3 && sp[3] == 4) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<바다의 포옹>\n인어의 소망3\n항해경험치+10%\n교역경험치+10%\n항해숙련도+45");
                    } else if (sp[0] == 1 && sp[1] == 1 && sp[2] == 5 && sp[3] == 4) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<선택과 집중:항해>\n항해숙련도-500\n항해경험치+35%");
                    } else if (sp[0] == 6 && sp[1] == 6 && sp[2] == 7 && sp[3] == 7) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<일격필살>\n몬스터 추가 공격력+10\n치명타 확률 증가+10%");
                    }else if (sp[0] == 8 && sp[1] == 8 && sp[2] == 9 && sp[3] == 9) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<전선 강화>\n최대생명력 +100\n몬스터 피해감소+15\n몬스터에게 받는 피해량-2%");
                    }else if (sp[0] == 9 && sp[1] == 9 && sp[2] == 9 && sp[3] == 4) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<철옹성>\n몬스터 피해감소+20\n몬스터에게 받는 피해량-3%");
                    }else if (sp[0] == 10 && sp[1] == 10 && sp[2] == 10 && sp[3] == 10) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<맹공>\n모든 공격력+9");
                    }else if (sp[0] == 10 && sp[1] == 11 && sp[2] == 12 && sp[3] == 13) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<약점 공략>\n모든 공격력+8\n모든 적중력+12\n최대지구력+75\n치명타 피해량+5%");
                    }else if (sp[0] == 10 && sp[1] == 11 && sp[2] == 12 && sp[3] == 14) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<불곰>\n몬스터 피해감소+20\n몬스터에게 받는 피해량-3%\n기절,경직,빙결 저항무시+8%");
                    }else if (sp[0] == 10 && sp[1] == 10 && sp[2] == 15 && sp[3] == 15) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<초상비격>\n모든 피해감소-15\n모든 회피력-25\n모든 공격력+20\n에어어택 피해량+3%");
                    }else{
                        TextView text1=(TextView) findViewById(R.id.text1);
                        text1.setText("");
                    }
                } else if (str.equals(stone1[4])) {
                    Log.i("test", "true/false");
                    sp[0] = 4;
                    if (sp[0] == 1 && sp[1] == 1 && sp[2] == 1 && sp[3] == 1) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<하늘과 바다의 경계로>\n항해경험치+8%");
                    } else if (sp[0] == 1 && sp[1] == 2 && sp[2] == 3 && sp[3] == 4) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<바다의 포옹>\n인어의 소망3\n항해경험치+10%\n교역경험치+10%\n항해숙련도+45");
                    } else if (sp[0] == 1 && sp[1] == 1 && sp[2] == 5 && sp[3] == 4) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<선택과 집중:항해>\n항해숙련도-500\n항해경험치+35%");
                    } else if (sp[0] == 6 && sp[1] == 6 && sp[2] == 7 && sp[3] == 7) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<일격필살>\n몬스터 추가 공격력+10\n치명타 확률 증가+10%");
                    }else if (sp[0] == 8 && sp[1] == 8 && sp[2] == 9 && sp[3] == 9) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<전선 강화>\n최대생명력 +100\n몬스터 피해감소+15\n몬스터에게 받는 피해량-2%");
                    }else if (sp[0] == 9 && sp[1] == 9 && sp[2] == 9 && sp[3] == 4) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<철옹성>\n몬스터 피해감소+20\n몬스터에게 받는 피해량-3%");
                    }else if (sp[0] == 10 && sp[1] == 10 && sp[2] == 10 && sp[3] == 10) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<맹공>\n모든 공격력+9");
                    }else if (sp[0] == 10 && sp[1] == 11 && sp[2] == 12 && sp[3] == 13) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<약점 공략>\n모든 공격력+8\n모든 적중력+12\n최대지구력+75\n치명타 피해량+5%");
                    }else if (sp[0] == 10 && sp[1] == 11 && sp[2] == 12 && sp[3] == 14) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<불곰>\n몬스터 피해감소+20\n몬스터에게 받는 피해량-3%\n기절,경직,빙결 저항무시+8%");
                    }else if (sp[0] == 10 && sp[1] == 10 && sp[2] == 15 && sp[3] == 15) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<초상비격>\n모든 피해감소-15\n모든 회피력-25\n모든 공격력+20\n에어어택 피해량+3%");
                    }else{
                        TextView text1=(TextView) findViewById(R.id.text1);
                        text1.setText("");
                    }
                } else if (str.equals(stone1[5])) {
                    Log.i("test", "true/false");
                    sp[0] = 5;
                    if (sp[0] == 1 && sp[1] == 1 && sp[2] == 1 && sp[3] == 1) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<하늘과 바다의 경계로>\n항해경험치+8%");
                    } else if (sp[0] == 1 && sp[1] == 2 && sp[2] == 3 && sp[3] == 4) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<바다의 포옹>\n인어의 소망3\n항해경험치+10%\n교역경험치+10%\n항해숙련도+45");
                    } else if (sp[0] == 1 && sp[1] == 1 && sp[2] == 5 && sp[3] == 4) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<선택과 집중:항해>\n항해숙련도-500\n항해경험치+35%");
                    } else if (sp[0] == 6 && sp[1] == 6 && sp[2] == 7 && sp[3] == 7) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<일격필살>\n몬스터 추가 공격력+10\n치명타 확률 증가+10%");
                    }else if (sp[0] == 8 && sp[1] == 8 && sp[2] == 9 && sp[3] == 9) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<전선 강화>\n최대생명력 +100\n몬스터 피해감소+15\n몬스터에게 받는 피해량-2%");
                    }else if (sp[0] == 9 && sp[1] == 9 && sp[2] == 9 && sp[3] == 4) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<철옹성>\n몬스터 피해감소+20\n몬스터에게 받는 피해량-3%");
                    }else if (sp[0] == 10 && sp[1] == 10 && sp[2] == 10 && sp[3] == 10) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<맹공>\n모든 공격력+9");
                    }else if (sp[0] == 10 && sp[1] == 11 && sp[2] == 12 && sp[3] == 13) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<약점 공략>\n모든 공격력+8\n모든 적중력+12\n최대지구력+75\n치명타 피해량+5%");
                    }else if (sp[0] == 10 && sp[1] == 11 && sp[2] == 12 && sp[3] == 14) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<불곰>\n몬스터 피해감소+20\n몬스터에게 받는 피해량-3%\n기절,경직,빙결 저항무시+8%");
                    }else if (sp[0] == 10 && sp[1] == 10 && sp[2] == 15 && sp[3] == 15) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<초상비격>\n모든 피해감소-15\n모든 회피력-25\n모든 공격력+20\n에어어택 피해량+3%");
                    }else{
                        TextView text1=(TextView) findViewById(R.id.text1);
                        text1.setText("");
                    }
                } else if (str.equals(stone1[6])) {
                    Log.i("test", "true/false");
                    sp[0] = 6;
                    if (sp[0] == 1 && sp[1] == 1 && sp[2] == 1 && sp[3] == 1) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<하늘과 바다의 경계로>\n항해경험치+8%");
                    } else if (sp[0] == 1 && sp[1] == 2 && sp[2] == 3 && sp[3] == 4) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<바다의 포옹>\n인어의 소망3\n항해경험치+10%\n교역경험치+10%\n항해숙련도+45");
                    } else if (sp[0] == 1 && sp[1] == 1 && sp[2] == 5 && sp[3] == 4) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<선택과 집중:항해>\n항해숙련도-500\n항해경험치+35%");
                    } else if (sp[0] == 6 && sp[1] == 6 && sp[2] == 7 && sp[3] == 7) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<일격필살>\n몬스터 추가 공격력+10\n치명타 확률 증가+10%");
                    }else if (sp[0] == 8 && sp[1] == 8 && sp[2] == 9 && sp[3] == 9) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<전선 강화>\n최대생명력 +100\n몬스터 피해감소+15\n몬스터에게 받는 피해량-2%");
                    }else if (sp[0] == 9 && sp[1] == 9 && sp[2] == 9 && sp[3] == 4) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<철옹성>\n몬스터 피해감소+20\n몬스터에게 받는 피해량-3%");
                    }else if (sp[0] == 10 && sp[1] == 10 && sp[2] == 10 && sp[3] == 10) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<맹공>\n모든 공격력+9");
                    }else if (sp[0] == 10 && sp[1] == 11 && sp[2] == 12 && sp[3] == 13) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<약점 공략>\n모든 공격력+8\n모든 적중력+12\n최대지구력+75\n치명타 피해량+5%");
                    }else if (sp[0] == 10 && sp[1] == 11 && sp[2] == 12 && sp[3] == 14) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<불곰>\n몬스터 피해감소+20\n몬스터에게 받는 피해량-3%\n기절,경직,빙결 저항무시+8%");
                    }else if (sp[0] == 10 && sp[1] == 10 && sp[2] == 15 && sp[3] == 15) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<초상비격>\n모든 피해감소-15\n모든 회피력-25\n모든 공격력+20\n에어어택 피해량+3%");
                    }else{
                        TextView text1=(TextView) findViewById(R.id.text1);
                        text1.setText("");
                    }
                } else if (str.equals(stone1[7])) {
                    Log.i("test", "true/false");
                    sp[0] = 7;
                    if (sp[0] == 1 && sp[1] == 1 && sp[2] == 1 && sp[3] == 1) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<하늘과 바다의 경계로>\n항해경험치+8%");
                    } else if (sp[0] == 1 && sp[1] == 2 && sp[2] == 3 && sp[3] == 4) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<바다의 포옹>\n인어의 소망3\n항해경험치+10%\n교역경험치+10%\n항해숙련도+45");
                    } else if (sp[0] == 1 && sp[1] == 1 && sp[2] == 5 && sp[3] == 4) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<선택과 집중:항해>\n항해숙련도-500\n항해경험치+35%");
                    } else if (sp[0] == 6 && sp[1] == 6 && sp[2] == 7 && sp[3] == 7) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<일격필살>\n몬스터 추가 공격력+10\n치명타 확률 증가+10%");
                    }else if (sp[0] == 8 && sp[1] == 8 && sp[2] == 9 && sp[3] == 9) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<전선 강화>\n최대생명력 +100\n몬스터 피해감소+15\n몬스터에게 받는 피해량-2%");
                    }else if (sp[0] == 9 && sp[1] == 9 && sp[2] == 9 && sp[3] == 4) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<철옹성>\n몬스터 피해감소+20\n몬스터에게 받는 피해량-3%");
                    }else if (sp[0] == 10 && sp[1] == 10 && sp[2] == 10 && sp[3] == 10) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<맹공>\n모든 공격력+9");
                    }else if (sp[0] == 10 && sp[1] == 11 && sp[2] == 12 && sp[3] == 13) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<약점 공략>\n모든 공격력+8\n모든 적중력+12\n최대지구력+75\n치명타 피해량+5%");
                    }else if (sp[0] == 10 && sp[1] == 11 && sp[2] == 12 && sp[3] == 14) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<불곰>\n몬스터 피해감소+20\n몬스터에게 받는 피해량-3%\n기절,경직,빙결 저항무시+8%");
                    }else if (sp[0] == 10 && sp[1] == 10 && sp[2] == 15 && sp[3] == 15) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<초상비격>\n모든 피해감소-15\n모든 회피력-25\n모든 공격력+20\n에어어택 피해량+3%");
                    }else{
                        TextView text1=(TextView) findViewById(R.id.text1);
                        text1.setText("");
                    }
                }else if (str.equals(stone1[8])) {
                    Log.i("test", "true/false");
                    sp[0] = 8;
                    if (sp[0] == 1 && sp[1] == 1 && sp[2] == 1 && sp[3] == 1) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<하늘과 바다의 경계로>\n항해경험치+8%");
                    } else if (sp[0] == 1 && sp[1] == 2 && sp[2] == 3 && sp[3] == 4) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<바다의 포옹>\n인어의 소망3\n항해경험치+10%\n교역경험치+10%\n항해숙련도+45");
                    } else if (sp[0] == 1 && sp[1] == 1 && sp[2] == 5 && sp[3] == 4) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<선택과 집중:항해>\n항해숙련도-500\n항해경험치+35%");
                    } else if (sp[0] == 6 && sp[1] == 6 && sp[2] == 7 && sp[3] == 7) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<일격필살>\n몬스터 추가 공격력+10\n치명타 확률 증가+10%");
                    }else if (sp[0] == 8 && sp[1] == 8 && sp[2] == 9 && sp[3] == 9) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<전선 강화>\n최대생명력 +100\n몬스터 피해감소+15\n몬스터에게 받는 피해량-2%");
                    }else if (sp[0] == 9 && sp[1] == 9 && sp[2] == 9 && sp[3] == 4) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<철옹성>\n몬스터 피해감소+20\n몬스터에게 받는 피해량-3%");
                    }else if (sp[0] == 10 && sp[1] == 10 && sp[2] == 10 && sp[3] == 10) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<맹공>\n모든 공격력+9");
                    }else if (sp[0] == 10 && sp[1] == 11 && sp[2] == 12 && sp[3] == 13) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<약점 공략>\n모든 공격력+8\n모든 적중력+12\n최대지구력+75\n치명타 피해량+5%");
                    }else if (sp[0] == 10 && sp[1] == 11 && sp[2] == 12 && sp[3] == 14) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<불곰>\n몬스터 피해감소+20\n몬스터에게 받는 피해량-3%\n기절,경직,빙결 저항무시+8%");
                    }else if (sp[0] == 10 && sp[1] == 10 && sp[2] == 15 && sp[3] == 15) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<초상비격>\n모든 피해감소-15\n모든 회피력-25\n모든 공격력+20\n에어어택 피해량+3%");
                    }else{
                        TextView text1=(TextView) findViewById(R.id.text1);
                        text1.setText("");
                    }
                }else if (str.equals(stone1[9])) {
                    Log.i("test", "true/false");
                    sp[0] = 9;
                    if (sp[0] == 1 && sp[1] == 1 && sp[2] == 1 && sp[3] == 1) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<하늘과 바다의 경계로>\n항해경험치+8%");
                    } else if (sp[0] == 1 && sp[1] == 2 && sp[2] == 3 && sp[3] == 4) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<바다의 포옹>\n인어의 소망3\n항해경험치+10%\n교역경험치+10%\n항해숙련도+45");
                    } else if (sp[0] == 1 && sp[1] == 1 && sp[2] == 5 && sp[3] == 4) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<선택과 집중:항해>\n항해숙련도-500\n항해경험치+35%");
                    } else if (sp[0] == 6 && sp[1] == 6 && sp[2] == 7 && sp[3] == 7) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<일격필살>\n몬스터 추가 공격력+10\n치명타 확률 증가+10%");
                    }else if (sp[0] == 8 && sp[1] == 8 && sp[2] == 9 && sp[3] == 9) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<전선 강화>\n최대생명력 +100\n몬스터 피해감소+15\n몬스터에게 받는 피해량-2%");
                    }else if (sp[0] == 9 && sp[1] == 9 && sp[2] == 9 && sp[3] == 4) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<철옹성>\n몬스터 피해감소+20\n몬스터에게 받는 피해량-3%");
                    }else if (sp[0] == 10 && sp[1] == 10 && sp[2] == 10 && sp[3] == 10) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<맹공>\n모든 공격력+9");
                    }else if (sp[0] == 10 && sp[1] == 11 && sp[2] == 12 && sp[3] == 13) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<약점 공략>\n모든 공격력+8\n모든 적중력+12\n최대지구력+75\n치명타 피해량+5%");
                    }else if (sp[0] == 10 && sp[1] == 11 && sp[2] == 12 && sp[3] == 14) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<불곰>\n몬스터 피해감소+20\n몬스터에게 받는 피해량-3%\n기절,경직,빙결 저항무시+8%");
                    }else if (sp[0] == 10 && sp[1] == 10 && sp[2] == 15 && sp[3] == 15) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<초상비격>\n모든 피해감소-15\n모든 회피력-25\n모든 공격력+20\n에어어택 피해량+3%");
                    }else{
                        TextView text1=(TextView) findViewById(R.id.text1);
                        text1.setText("");
                    }
                }else if (str.equals(stone1[10])) {
                    Log.i("test", "true/false");
                    sp[0] = 10;
                    if (sp[0] == 1 && sp[1] == 1 && sp[2] == 1 && sp[3] == 1) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<하늘과 바다의 경계로>\n항해경험치+8%");
                    } else if (sp[0] == 1 && sp[1] == 2 && sp[2] == 3 && sp[3] == 4) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<바다의 포옹>\n인어의 소망3\n항해경험치+10%\n교역경험치+10%\n항해숙련도+45");
                    } else if (sp[0] == 1 && sp[1] == 1 && sp[2] == 5 && sp[3] == 4) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<선택과 집중:항해>\n항해숙련도-500\n항해경험치+35%");
                    } else if (sp[0] == 6 && sp[1] == 6 && sp[2] == 7 && sp[3] == 7) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<일격필살>\n몬스터 추가 공격력+10\n치명타 확률 증가+10%");
                    }else if (sp[0] == 8 && sp[1] == 8 && sp[2] == 9 && sp[3] == 9) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<전선 강화>\n최대생명력 +100\n몬스터 피해감소+15\n몬스터에게 받는 피해량-2%");
                    }else if (sp[0] == 9 && sp[1] == 9 && sp[2] == 9 && sp[3] == 4) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<철옹성>\n몬스터 피해감소+20\n몬스터에게 받는 피해량-3%");
                    }else if (sp[0] == 10 && sp[1] == 10 && sp[2] == 10 && sp[3] == 10) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<맹공>\n모든 공격력+9");
                    }else if (sp[0] == 10 && sp[1] == 11 && sp[2] == 12 && sp[3] == 13) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<약점 공략>\n모든 공격력+8\n모든 적중력+12\n최대지구력+75\n치명타 피해량+5%");
                    }else if (sp[0] == 10 && sp[1] == 11 && sp[2] == 12 && sp[3] == 14) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<불곰>\n몬스터 피해감소+20\n몬스터에게 받는 피해량-3%\n기절,경직,빙결 저항무시+8%");
                    }else if (sp[0] == 10 && sp[1] == 10 && sp[2] == 15 && sp[3] == 15) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<초상비격>\n모든 피해감소-15\n모든 회피력-25\n모든 공격력+20\n에어어택 피해량+3%");
                    }else{
                        TextView text1=(TextView) findViewById(R.id.text1);
                        text1.setText("");
                    }
                }else if (str.equals(stone1[11])) {
                    Log.i("test", "true/false");
                    sp[0] = 11;
                    if (sp[0] == 1 && sp[1] == 1 && sp[2] == 1 && sp[3] == 1) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<하늘과 바다의 경계로>\n항해경험치+8%");
                    } else if (sp[0] == 1 && sp[1] == 2 && sp[2] == 3 && sp[3] == 4) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<바다의 포옹>\n인어의 소망3\n항해경험치+10%\n교역경험치+10%\n항해숙련도+45");
                    } else if (sp[0] == 1 && sp[1] == 1 && sp[2] == 5 && sp[3] == 4) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<선택과 집중:항해>\n항해숙련도-500\n항해경험치+35%");
                    } else if (sp[0] == 6 && sp[1] == 6 && sp[2] == 7 && sp[3] == 7) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<일격필살>\n몬스터 추가 공격력+10\n치명타 확률 증가+10%");
                    }else if (sp[0] == 8 && sp[1] == 8 && sp[2] == 9 && sp[3] == 9) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<전선 강화>\n최대생명력 +100\n몬스터 피해감소+15\n몬스터에게 받는 피해량-2%");
                    }else if (sp[0] == 9 && sp[1] == 9 && sp[2] == 9 && sp[3] == 4) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<철옹성>\n몬스터 피해감소+20\n몬스터에게 받는 피해량-3%");
                    }else if (sp[0] == 10 && sp[1] == 10 && sp[2] == 10 && sp[3] == 10) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<맹공>\n모든 공격력+9");
                    }else if (sp[0] == 10 && sp[1] == 11 && sp[2] == 12 && sp[3] == 13) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<약점 공략>\n모든 공격력+8\n모든 적중력+12\n최대지구력+75\n치명타 피해량+5%");
                    }else if (sp[0] == 10 && sp[1] == 11 && sp[2] == 12 && sp[3] == 14) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<불곰>\n몬스터 피해감소+20\n몬스터에게 받는 피해량-3%\n기절,경직,빙결 저항무시+8%");
                    }else if (sp[0] == 10 && sp[1] == 10 && sp[2] == 15 && sp[3] == 15) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<초상비격>\n모든 피해감소-15\n모든 회피력-25\n모든 공격력+20\n에어어택 피해량+3%");
                    }else{
                        TextView text1=(TextView) findViewById(R.id.text1);
                        text1.setText("");
                    }
                }else if (str.equals(stone1[12])) {
                    Log.i("test", "true/false");
                    sp[0] = 12;
                    if (sp[0] == 1 && sp[1] == 1 && sp[2] == 1 && sp[3] == 1) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<하늘과 바다의 경계로>\n항해경험치+8%");
                    } else if (sp[0] == 1 && sp[1] == 2 && sp[2] == 3 && sp[3] == 4) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<바다의 포옹>\n인어의 소망3\n항해경험치+10%\n교역경험치+10%\n항해숙련도+45");
                    } else if (sp[0] == 1 && sp[1] == 1 && sp[2] == 5 && sp[3] == 4) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<선택과 집중:항해>\n항해숙련도-500\n항해경험치+35%");
                    } else if (sp[0] == 6 && sp[1] == 6 && sp[2] == 7 && sp[3] == 7) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<일격필살>\n몬스터 추가 공격력+10\n치명타 확률 증가+10%");
                    }else if (sp[0] == 8 && sp[1] == 8 && sp[2] == 9 && sp[3] == 9) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<전선 강화>\n최대생명력 +100\n몬스터 피해감소+15\n몬스터에게 받는 피해량-2%");
                    }else if (sp[0] == 9 && sp[1] == 9 && sp[2] == 9 && sp[3] == 4) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<철옹성>\n몬스터 피해감소+20\n몬스터에게 받는 피해량-3%");
                    }else if (sp[0] == 10 && sp[1] == 10 && sp[2] == 10 && sp[3] == 10) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<맹공>\n모든 공격력+9");
                    }else if (sp[0] == 10 && sp[1] == 11 && sp[2] == 12 && sp[3] == 13) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<약점 공략>\n모든 공격력+8\n모든 적중력+12\n최대지구력+75\n치명타 피해량+5%");
                    }else if (sp[0] == 10 && sp[1] == 11 && sp[2] == 12 && sp[3] == 14) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<불곰>\n몬스터 피해감소+20\n몬스터에게 받는 피해량-3%\n기절,경직,빙결 저항무시+8%");
                    }else if (sp[0] == 10 && sp[1] == 10 && sp[2] == 15 && sp[3] == 15) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<초상비격>\n모든 피해감소-15\n모든 회피력-25\n모든 공격력+20\n에어어택 피해량+3%");
                    }else{
                        TextView text1=(TextView) findViewById(R.id.text1);
                        text1.setText("");
                    }
                }else if (str.equals(stone1[13])) {
                    Log.i("test", "true/false");
                    sp[0] = 13;
                    if (sp[0] == 1 && sp[1] == 1 && sp[2] == 1 && sp[3] == 1) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<하늘과 바다의 경계로>\n항해경험치+8%");
                    } else if (sp[0] == 1 && sp[1] == 2 && sp[2] == 3 && sp[3] == 4) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<바다의 포옹>\n인어의 소망3\n항해경험치+10%\n교역경험치+10%\n항해숙련도+45");
                    } else if (sp[0] == 1 && sp[1] == 1 && sp[2] == 5 && sp[3] == 4) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<선택과 집중:항해>\n항해숙련도-500\n항해경험치+35%");
                    } else if (sp[0] == 6 && sp[1] == 6 && sp[2] == 7 && sp[3] == 7) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<일격필살>\n몬스터 추가 공격력+10\n치명타 확률 증가+10%");
                    }else if (sp[0] == 8 && sp[1] == 8 && sp[2] == 9 && sp[3] == 9) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<전선 강화>\n최대생명력 +100\n몬스터 피해감소+15\n몬스터에게 받는 피해량-2%");
                    }else if (sp[0] == 9 && sp[1] == 9 && sp[2] == 9 && sp[3] == 4) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<철옹성>\n몬스터 피해감소+20\n몬스터에게 받는 피해량-3%");
                    }else if (sp[0] == 10 && sp[1] == 10 && sp[2] == 10 && sp[3] == 10) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<맹공>\n모든 공격력+9");
                    }else if (sp[0] == 10 && sp[1] == 11 && sp[2] == 12 && sp[3] == 13) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<약점 공략>\n모든 공격력+8\n모든 적중력+12\n최대지구력+75\n치명타 피해량+5%");
                    }else if (sp[0] == 10 && sp[1] == 11 && sp[2] == 12 && sp[3] == 14) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<불곰>\n몬스터 피해감소+20\n몬스터에게 받는 피해량-3%\n기절,경직,빙결 저항무시+8%");
                    }else if (sp[0] == 10 && sp[1] == 10 && sp[2] == 15 && sp[3] == 15) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<초상비격>\n모든 피해감소-15\n모든 회피력-25\n모든 공격력+20\n에어어택 피해량+3%");
                    }else{
                        TextView text1=(TextView) findViewById(R.id.text1);
                        text1.setText("");
                    }
                }else if (str.equals(stone1[14])) {
                    Log.i("test", "true/false");
                    sp[0] = 14;
                    if (sp[0] == 1 && sp[1] == 1 && sp[2] == 1 && sp[3] == 1) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<하늘과 바다의 경계로>\n항해경험치+8%");
                    } else if (sp[0] == 1 && sp[1] == 2 && sp[2] == 3 && sp[3] == 4) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<바다의 포옹>\n인어의 소망3\n항해경험치+10%\n교역경험치+10%\n항해숙련도+45");
                    } else if (sp[0] == 1 && sp[1] == 1 && sp[2] == 5 && sp[3] == 4) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<선택과 집중:항해>\n항해숙련도-500\n항해경험치+35%");
                    } else if (sp[0] == 6 && sp[1] == 6 && sp[2] == 7 && sp[3] == 7) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<일격필살>\n몬스터 추가 공격력+10\n치명타 확률 증가+10%");
                    }else if (sp[0] == 8 && sp[1] == 8 && sp[2] == 9 && sp[3] == 9) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<전선 강화>\n최대생명력 +100\n몬스터 피해감소+15\n몬스터에게 받는 피해량-2%");
                    }else if (sp[0] == 9 && sp[1] == 9 && sp[2] == 9 && sp[3] == 4) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<철옹성>\n몬스터 피해감소+20\n몬스터에게 받는 피해량-3%");
                    }else if (sp[0] == 10 && sp[1] == 10 && sp[2] == 10 && sp[3] == 10) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<맹공>\n모든 공격력+9");
                    }else if (sp[0] == 10 && sp[1] == 11 && sp[2] == 12 && sp[3] == 13) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<약점 공략>\n모든 공격력+8\n모든 적중력+12\n최대지구력+75\n치명타 피해량+5%");
                    }else if (sp[0] == 10 && sp[1] == 11 && sp[2] == 12 && sp[3] == 14) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<불곰>\n몬스터 피해감소+20\n몬스터에게 받는 피해량-3%\n기절,경직,빙결 저항무시+8%");
                    }else if (sp[0] == 10 && sp[1] == 10 && sp[2] == 15 && sp[3] == 15) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<초상비격>\n모든 피해감소-15\n모든 회피력-25\n모든 공격력+20\n에어어택 피해량+3%");
                    }else{
                        TextView text1=(TextView) findViewById(R.id.text1);
                        text1.setText("");
                    }
                }else if (str.equals(stone1[15])) {
                    Log.i("test", "true/false");
                    sp[0] = 15;
                    if (sp[0] == 1 && sp[1] == 1 && sp[2] == 1 && sp[3] == 1) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<하늘과 바다의 경계로>\n항해경험치+8%");
                    } else if (sp[0] == 1 && sp[1] == 2 && sp[2] == 3 && sp[3] == 4) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<바다의 포옹>\n인어의 소망3\n항해경험치+10%\n교역경험치+10%\n항해숙련도+45");
                    } else if (sp[0] == 1 && sp[1] == 1 && sp[2] == 5 && sp[3] == 4) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<선택과 집중:항해>\n항해숙련도-500\n항해경험치+35%");
                    } else if (sp[0] == 6 && sp[1] == 6 && sp[2] == 7 && sp[3] == 7) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<일격필살>\n몬스터 추가 공격력+10\n치명타 확률 증가+10%");
                    }else if (sp[0] == 8 && sp[1] == 8 && sp[2] == 9 && sp[3] == 9) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<전선 강화>\n최대생명력 +100\n몬스터 피해감소+15\n몬스터에게 받는 피해량-2%");
                    }else if (sp[0] == 9 && sp[1] == 9 && sp[2] == 9 && sp[3] == 4) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<철옹성>\n몬스터 피해감소+20\n몬스터에게 받는 피해량-3%");
                    }else if (sp[0] == 10 && sp[1] == 10 && sp[2] == 10 && sp[3] == 10) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<맹공>\n모든 공격력+9");
                    }else if (sp[0] == 10 && sp[1] == 11 && sp[2] == 12 && sp[3] == 13) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<약점 공략>\n모든 공격력+8\n모든 적중력+12\n최대지구력+75\n치명타 피해량+5%");
                    }else if (sp[0] == 10 && sp[1] == 11 && sp[2] == 12 && sp[3] == 14) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<불곰>\n몬스터 피해감소+20\n몬스터에게 받는 피해량-3%\n기절,경직,빙결 저항무시+8%");
                    }else if (sp[0] == 10 && sp[1] == 10 && sp[2] == 15 && sp[3] == 15) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<초상비격>\n모든 피해감소-15\n모든 회피력-25\n모든 공격력+20\n에어어택 피해량+3%");
                    }else{
                        TextView text1=(TextView) findViewById(R.id.text1);
                        text1.setText("");
                    }
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                sp[0] = 0;
            }
        });
        Spinner spiner2 = (Spinner) findViewById(R.id.spinner2);

        ArrayAdapter adapter2 = new ArrayAdapter(this, android.R.layout.simple_spinner_item, stone2);
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spiner2.setAdapter(adapter2);

        spiner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id) {
                String str = (String) spiner2.getSelectedItem();
                if (str.equals(stone2[1])) {
                    Log.i("test", "true/false");
                    sp[1] = 1;
                    if (sp[0] == 1 && sp[1] == 1 && sp[2] == 1 && sp[3] == 1) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<하늘과 바다의 경계로>\n항해경험치+8%");
                    } else if (sp[0] == 1 && sp[1] == 2 && sp[2] == 3 && sp[3] == 4) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<바다의 포옹>\n인어의 소망3\n항해경험치+10%\n교역경험치+10%\n항해숙련도+45");
                    } else if (sp[0] == 1 && sp[1] == 1 && sp[2] == 5 && sp[3] == 4) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<선택과 집중:항해>\n항해숙련도-500\n항해경험치+35%");
                    } else if (sp[0] == 6 && sp[1] == 6 && sp[2] == 7 && sp[3] == 7) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<일격필살>\n몬스터 추가 공격력+10\n치명타 확률 증가+10%");
                    }else if (sp[0] == 8 && sp[1] == 8 && sp[2] == 9 && sp[3] == 9) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<전선 강화>\n최대생명력 +100\n몬스터 피해감소+15\n몬스터에게 받는 피해량-2%");
                    }else if (sp[0] == 9 && sp[1] == 9 && sp[2] == 9 && sp[3] == 4) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<철옹성>\n몬스터 피해감소+20\n몬스터에게 받는 피해량-3%");
                    }else if (sp[0] == 10 && sp[1] == 10 && sp[2] == 10 && sp[3] == 10) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<맹공>\n모든 공격력+9");
                    }else if (sp[0] == 10 && sp[1] == 11 && sp[2] == 12 && sp[3] == 13) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<약점 공략>\n모든 공격력+8\n모든 적중력+12\n최대지구력+75\n치명타 피해량+5%");
                    }else if (sp[0] == 10 && sp[1] == 11 && sp[2] == 12 && sp[3] == 14) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<불곰>\n몬스터 피해감소+20\n몬스터에게 받는 피해량-3%\n기절,경직,빙결 저항무시+8%");
                    }else if (sp[0] == 10 && sp[1] == 10 && sp[2] == 15 && sp[3] == 15) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<초상비격>\n모든 피해감소-15\n모든 회피력-25\n모든 공격력+20\n에어어택 피해량+3%");
                    }else{
                        TextView text1=(TextView) findViewById(R.id.text1);
                        text1.setText("");
                    }
                } else if (str.equals(stone2[2])) {
                    Log.i("test", "true/false");
                    sp[1] = 2;
                    if (sp[0] == 1 && sp[1] == 1 && sp[2] == 1 && sp[3] == 1) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<하늘과 바다의 경계로>\n항해경험치+8%");
                    } else if (sp[0] == 1 && sp[1] == 2 && sp[2] == 3 && sp[3] == 4) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<바다의 포옹>\n인어의 소망3\n항해경험치+10%\n교역경험치+10%\n항해숙련도+45");
                    } else if (sp[0] == 1 && sp[1] == 1 && sp[2] == 5 && sp[3] == 4) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<선택과 집중:항해>\n항해숙련도-500\n항해경험치+35%");
                    } else if (sp[0] == 6 && sp[1] == 6 && sp[2] == 7 && sp[3] == 7) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<일격필살>\n몬스터 추가 공격력+10\n치명타 확률 증가+10%");
                    }else if (sp[0] == 8 && sp[1] == 8 && sp[2] == 9 && sp[3] == 9) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<전선 강화>\n최대생명력 +100\n몬스터 피해감소+15\n몬스터에게 받는 피해량-2%");
                    }else if (sp[0] == 9 && sp[1] == 9 && sp[2] == 9 && sp[3] == 4) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<철옹성>\n몬스터 피해감소+20\n몬스터에게 받는 피해량-3%");
                    }else if (sp[0] == 10 && sp[1] == 10 && sp[2] == 10 && sp[3] == 10) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<맹공>\n모든 공격력+9");
                    }else if (sp[0] == 10 && sp[1] == 11 && sp[2] == 12 && sp[3] == 13) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<약점 공략>\n모든 공격력+8\n모든 적중력+12\n최대지구력+75\n치명타 피해량+5%");
                    }else if (sp[0] == 10 && sp[1] == 11 && sp[2] == 12 && sp[3] == 14) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<불곰>\n몬스터 피해감소+20\n몬스터에게 받는 피해량-3%\n기절,경직,빙결 저항무시+8%");
                    }else if (sp[0] == 10 && sp[1] == 10 && sp[2] == 15 && sp[3] == 15) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<초상비격>\n모든 피해감소-15\n모든 회피력-25\n모든 공격력+20\n에어어택 피해량+3%");
                    }else{
                        TextView text1=(TextView) findViewById(R.id.text1);
                        text1.setText("");
                    }
                } else if (str.equals(stone2[3])) {
                    Log.i("test", "true/false");
                    sp[1] = 3;
                    if (sp[0] == 1 && sp[1] == 1 && sp[2] == 1 && sp[3] == 1) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<하늘과 바다의 경계로>\n항해경험치+8%");
                    } else if (sp[0] == 1 && sp[1] == 2 && sp[2] == 3 && sp[3] == 4) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<바다의 포옹>\n인어의 소망3\n항해경험치+10%\n교역경험치+10%\n항해숙련도+45");
                    } else if (sp[0] == 1 && sp[1] == 1 && sp[2] == 5 && sp[3] == 4) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<선택과 집중:항해>\n항해숙련도-500\n항해경험치+35%");
                    } else if (sp[0] == 6 && sp[1] == 6 && sp[2] == 7 && sp[3] == 7) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<일격필살>\n몬스터 추가 공격력+10\n치명타 확률 증가+10%");
                    }else if (sp[0] == 8 && sp[1] == 8 && sp[2] == 9 && sp[3] == 9) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<전선 강화>\n최대생명력 +100\n몬스터 피해감소+15\n몬스터에게 받는 피해량-2%");
                    }else if (sp[0] == 9 && sp[1] == 9 && sp[2] == 9 && sp[3] == 4) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<철옹성>\n몬스터 피해감소+20\n몬스터에게 받는 피해량-3%");
                    }else if (sp[0] == 10 && sp[1] == 10 && sp[2] == 10 && sp[3] == 10) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<맹공>\n모든 공격력+9");
                    }else if (sp[0] == 10 && sp[1] == 11 && sp[2] == 12 && sp[3] == 13) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<약점 공략>\n모든 공격력+8\n모든 적중력+12\n최대지구력+75\n치명타 피해량+5%");
                    }else if (sp[0] == 10 && sp[1] == 11 && sp[2] == 12 && sp[3] == 14) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<불곰>\n몬스터 피해감소+20\n몬스터에게 받는 피해량-3%\n기절,경직,빙결 저항무시+8%");
                    }else if (sp[0] == 10 && sp[1] == 10 && sp[2] == 15 && sp[3] == 15) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<초상비격>\n모든 피해감소-15\n모든 회피력-25\n모든 공격력+20\n에어어택 피해량+3%");
                    }else{
                        TextView text1=(TextView) findViewById(R.id.text1);
                        text1.setText("");
                    }
                } else if (str.equals(stone2[4])) {
                    Log.i("test", "true/false");
                    sp[1] = 4;
                    if (sp[0] == 1 && sp[1] == 1 && sp[2] == 1 && sp[3] == 1) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<하늘과 바다의 경계로>\n항해경험치+8%");
                    } else if (sp[0] == 1 && sp[1] == 2 && sp[2] == 3 && sp[3] == 4) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<바다의 포옹>\n인어의 소망3\n항해경험치+10%\n교역경험치+10%\n항해숙련도+45");
                    } else if (sp[0] == 1 && sp[1] == 1 && sp[2] == 5 && sp[3] == 4) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<선택과 집중:항해>\n항해숙련도-500\n항해경험치+35%");
                    } else if (sp[0] == 6 && sp[1] == 6 && sp[2] == 7 && sp[3] == 7) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<일격필살>\n몬스터 추가 공격력+10\n치명타 확률 증가+10%");
                    }else if (sp[0] == 8 && sp[1] == 8 && sp[2] == 9 && sp[3] == 9) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<전선 강화>\n최대생명력 +100\n몬스터 피해감소+15\n몬스터에게 받는 피해량-2%");
                    }else if (sp[0] == 9 && sp[1] == 9 && sp[2] == 9 && sp[3] == 4) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<철옹성>\n몬스터 피해감소+20\n몬스터에게 받는 피해량-3%");
                    }else if (sp[0] == 10 && sp[1] == 10 && sp[2] == 10 && sp[3] == 10) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<맹공>\n모든 공격력+9");
                    }else if (sp[0] == 10 && sp[1] == 11 && sp[2] == 12 && sp[3] == 13) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<약점 공략>\n모든 공격력+8\n모든 적중력+12\n최대지구력+75\n치명타 피해량+5%");
                    }else if (sp[0] == 10 && sp[1] == 11 && sp[2] == 12 && sp[3] == 14) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<불곰>\n몬스터 피해감소+20\n몬스터에게 받는 피해량-3%\n기절,경직,빙결 저항무시+8%");
                    }else if (sp[0] == 10 && sp[1] == 10 && sp[2] == 15 && sp[3] == 15) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<초상비격>\n모든 피해감소-15\n모든 회피력-25\n모든 공격력+20\n에어어택 피해량+3%");
                    }else{
                        TextView text1=(TextView) findViewById(R.id.text1);
                        text1.setText("");
                    }
                } else if (str.equals(stone2[5])) {
                    Log.i("test", "true/false");
                    sp[1] = 5;
                    if (sp[0] == 1 && sp[1] == 1 && sp[2] == 1 && sp[3] == 1) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<하늘과 바다의 경계로>\n항해경험치+8%");
                    } else if (sp[0] == 1 && sp[1] == 2 && sp[2] == 3 && sp[3] == 4) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<바다의 포옹>\n인어의 소망3\n항해경험치+10%\n교역경험치+10%\n항해숙련도+45");
                    } else if (sp[0] == 1 && sp[1] == 1 && sp[2] == 5 && sp[3] == 4) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<선택과 집중:항해>\n항해숙련도-500\n항해경험치+35%");
                    } else if (sp[0] == 6 && sp[1] == 6 && sp[2] == 7 && sp[3] == 7) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<일격필살>\n몬스터 추가 공격력+10\n치명타 확률 증가+10%");
                    }else if (sp[0] == 8 && sp[1] == 8 && sp[2] == 9 && sp[3] == 9) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<전선 강화>\n최대생명력 +100\n몬스터 피해감소+15\n몬스터에게 받는 피해량-2%");
                    }else if (sp[0] == 9 && sp[1] == 9 && sp[2] == 9 && sp[3] == 4) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<철옹성>\n몬스터 피해감소+20\n몬스터에게 받는 피해량-3%");
                    }else if (sp[0] == 10 && sp[1] == 10 && sp[2] == 10 && sp[3] == 10) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<맹공>\n모든 공격력+9");
                    }else if (sp[0] == 10 && sp[1] == 11 && sp[2] == 12 && sp[3] == 13) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<약점 공략>\n모든 공격력+8\n모든 적중력+12\n최대지구력+75\n치명타 피해량+5%");
                    }else if (sp[0] == 10 && sp[1] == 11 && sp[2] == 12 && sp[3] == 14) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<불곰>\n몬스터 피해감소+20\n몬스터에게 받는 피해량-3%\n기절,경직,빙결 저항무시+8%");
                    }else if (sp[0] == 10 && sp[1] == 10 && sp[2] == 15 && sp[3] == 15) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<초상비격>\n모든 피해감소-15\n모든 회피력-25\n모든 공격력+20\n에어어택 피해량+3%");
                    }else{
                        TextView text1=(TextView) findViewById(R.id.text1);
                        text1.setText("");
                    }
                } else if (str.equals(stone2[6])) {
                    Log.i("test", "true/false");
                    sp[1] = 6;
                    if (sp[0] == 1 && sp[1] == 1 && sp[2] == 1 && sp[3] == 1) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<하늘과 바다의 경계로>\n항해경험치+8%");
                    } else if (sp[0] == 1 && sp[1] == 2 && sp[2] == 3 && sp[3] == 4) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<바다의 포옹>\n인어의 소망3\n항해경험치+10%\n교역경험치+10%\n항해숙련도+45");
                    } else if (sp[0] == 1 && sp[1] == 1 && sp[2] == 5 && sp[3] == 4) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<선택과 집중:항해>\n항해숙련도-500\n항해경험치+35%");
                    } else if (sp[0] == 6 && sp[1] == 6 && sp[2] == 7 && sp[3] == 7) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<일격필살>\n몬스터 추가 공격력+10\n치명타 확률 증가+10%");
                    }else if (sp[0] == 8 && sp[1] == 8 && sp[2] == 9 && sp[3] == 9) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<전선 강화>\n최대생명력 +100\n몬스터 피해감소+15\n몬스터에게 받는 피해량-2%");
                    }else if (sp[0] == 9 && sp[1] == 9 && sp[2] == 9 && sp[3] == 4) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<철옹성>\n몬스터 피해감소+20\n몬스터에게 받는 피해량-3%");
                    }else if (sp[0] == 10 && sp[1] == 10 && sp[2] == 10 && sp[3] == 10) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<맹공>\n모든 공격력+9");
                    }else if (sp[0] == 10 && sp[1] == 11 && sp[2] == 12 && sp[3] == 13) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<약점 공략>\n모든 공격력+8\n모든 적중력+12\n최대지구력+75\n치명타 피해량+5%");
                    }else if (sp[0] == 10 && sp[1] == 11 && sp[2] == 12 && sp[3] == 14) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<불곰>\n몬스터 피해감소+20\n몬스터에게 받는 피해량-3%\n기절,경직,빙결 저항무시+8%");
                    }else if (sp[0] == 10 && sp[1] == 10 && sp[2] == 15 && sp[3] == 15) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<초상비격>\n모든 피해감소-15\n모든 회피력-25\n모든 공격력+20\n에어어택 피해량+3%");
                    }else{
                        TextView text1=(TextView) findViewById(R.id.text1);
                        text1.setText("");
                    }
                } else if (str.equals(stone2[7])) {
                    Log.i("test", "true/false");
                    sp[1] = 7;
                    if (sp[0] == 1 && sp[1] == 1 && sp[2] == 1 && sp[3] == 1) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<하늘과 바다의 경계로>\n항해경험치+8%");
                    } else if (sp[0] == 1 && sp[1] == 2 && sp[2] == 3 && sp[3] == 4) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<바다의 포옹>\n인어의 소망3\n항해경험치+10%\n교역경험치+10%\n항해숙련도+45");
                    } else if (sp[0] == 1 && sp[1] == 1 && sp[2] == 5 && sp[3] == 4) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<선택과 집중:항해>\n항해숙련도-500\n항해경험치+35%");
                    } else if (sp[0] == 6 && sp[1] == 6 && sp[2] == 7 && sp[3] == 7) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<일격필살>\n몬스터 추가 공격력+10\n치명타 확률 증가+10%");
                    }else if (sp[0] == 8 && sp[1] == 8 && sp[2] == 9 && sp[3] == 9) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<전선 강화>\n최대생명력 +100\n몬스터 피해감소+15\n몬스터에게 받는 피해량-2%");
                    }else if (sp[0] == 9 && sp[1] == 9 && sp[2] == 9 && sp[3] == 4) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<철옹성>\n몬스터 피해감소+20\n몬스터에게 받는 피해량-3%");
                    }else if (sp[0] == 10 && sp[1] == 10 && sp[2] == 10 && sp[3] == 10) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<맹공>\n모든 공격력+9");
                    }else if (sp[0] == 10 && sp[1] == 11 && sp[2] == 12 && sp[3] == 13) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<약점 공략>\n모든 공격력+8\n모든 적중력+12\n최대지구력+75\n치명타 피해량+5%");
                    }else if (sp[0] == 10 && sp[1] == 11 && sp[2] == 12 && sp[3] == 14) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<불곰>\n몬스터 피해감소+20\n몬스터에게 받는 피해량-3%\n기절,경직,빙결 저항무시+8%");
                    }else if (sp[0] == 10 && sp[1] == 10 && sp[2] == 15 && sp[3] == 15) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<초상비격>\n모든 피해감소-15\n모든 회피력-25\n모든 공격력+20\n에어어택 피해량+3%");
                    }else{
                        TextView text1=(TextView) findViewById(R.id.text1);
                        text1.setText("");
                    }
                }else if (str.equals(stone2[8])) {
                    Log.i("test", "true/false");
                    sp[1] = 8;
                    if (sp[0] == 1 && sp[1] == 1 && sp[2] == 1 && sp[3] == 1) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<하늘과 바다의 경계로>\n항해경험치+8%");
                    } else if (sp[0] == 1 && sp[1] == 2 && sp[2] == 3 && sp[3] == 4) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<바다의 포옹>\n인어의 소망3\n항해경험치+10%\n교역경험치+10%\n항해숙련도+45");
                    } else if (sp[0] == 1 && sp[1] == 1 && sp[2] == 5 && sp[3] == 4) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<선택과 집중:항해>\n항해숙련도-500\n항해경험치+35%");
                    } else if (sp[0] == 6 && sp[1] == 6 && sp[2] == 7 && sp[3] == 7) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<일격필살>\n몬스터 추가 공격력+10\n치명타 확률 증가+10%");
                    }else if (sp[0] == 8 && sp[1] == 8 && sp[2] == 9 && sp[3] == 9) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<전선 강화>\n최대생명력 +100\n몬스터 피해감소+15\n몬스터에게 받는 피해량-2%");
                    }else if (sp[0] == 9 && sp[1] == 9 && sp[2] == 9 && sp[3] == 4) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<철옹성>\n몬스터 피해감소+20\n몬스터에게 받는 피해량-3%");
                    }else if (sp[0] == 10 && sp[1] == 10 && sp[2] == 10 && sp[3] == 10) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<맹공>\n모든 공격력+9");
                    }else if (sp[0] == 10 && sp[1] == 11 && sp[2] == 12 && sp[3] == 13) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<약점 공략>\n모든 공격력+8\n모든 적중력+12\n최대지구력+75\n치명타 피해량+5%");
                    }else if (sp[0] == 10 && sp[1] == 11 && sp[2] == 12 && sp[3] == 14) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<불곰>\n몬스터 피해감소+20\n몬스터에게 받는 피해량-3%\n기절,경직,빙결 저항무시+8%");
                    }else if (sp[0] == 10 && sp[1] == 10 && sp[2] == 15 && sp[3] == 15) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<초상비격>\n모든 피해감소-15\n모든 회피력-25\n모든 공격력+20\n에어어택 피해량+3%");
                    }else{
                        TextView text1=(TextView) findViewById(R.id.text1);
                        text1.setText("");
                    }
                }else if (str.equals(stone2[9])) {
                    Log.i("test", "true/false");
                    sp[1] = 9;
                    if (sp[0] == 1 && sp[1] == 1 && sp[2] == 1 && sp[3] == 1) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<하늘과 바다의 경계로>\n항해경험치+8%");
                    } else if (sp[0] == 1 && sp[1] == 2 && sp[2] == 3 && sp[3] == 4) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<바다의 포옹>\n인어의 소망3\n항해경험치+10%\n교역경험치+10%\n항해숙련도+45");
                    } else if (sp[0] == 1 && sp[1] == 1 && sp[2] == 5 && sp[3] == 4) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<선택과 집중:항해>\n항해숙련도-500\n항해경험치+35%");
                    } else if (sp[0] == 6 && sp[1] == 6 && sp[2] == 7 && sp[3] == 7) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<일격필살>\n몬스터 추가 공격력+10\n치명타 확률 증가+10%");
                    }else if (sp[0] == 8 && sp[1] == 8 && sp[2] == 9 && sp[3] == 9) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<전선 강화>\n최대생명력 +100\n몬스터 피해감소+15\n몬스터에게 받는 피해량-2%");
                    }else if (sp[0] == 9 && sp[1] == 9 && sp[2] == 9 && sp[3] == 4) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<철옹성>\n몬스터 피해감소+20\n몬스터에게 받는 피해량-3%");
                    }else if (sp[0] == 10 && sp[1] == 10 && sp[2] == 10 && sp[3] == 10) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<맹공>\n모든 공격력+9");
                    }else if (sp[0] == 10 && sp[1] == 11 && sp[2] == 12 && sp[3] == 13) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<약점 공략>\n모든 공격력+8\n모든 적중력+12\n최대지구력+75\n치명타 피해량+5%");
                    }else if (sp[0] == 10 && sp[1] == 11 && sp[2] == 12 && sp[3] == 14) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<불곰>\n몬스터 피해감소+20\n몬스터에게 받는 피해량-3%\n기절,경직,빙결 저항무시+8%");
                    }else if (sp[0] == 10 && sp[1] == 10 && sp[2] == 15 && sp[3] == 15) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<초상비격>\n모든 피해감소-15\n모든 회피력-25\n모든 공격력+20\n에어어택 피해량+3%");
                    }else{
                        TextView text1=(TextView) findViewById(R.id.text1);
                        text1.setText("");
                    }
                }else if (str.equals(stone2[10])) {
                    Log.i("test", "true/false");
                    sp[1] = 10;
                    if (sp[0] == 1 && sp[1] == 1 && sp[2] == 1 && sp[3] == 1) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<하늘과 바다의 경계로>\n항해경험치+8%");
                    } else if (sp[0] == 1 && sp[1] == 2 && sp[2] == 3 && sp[3] == 4) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<바다의 포옹>\n인어의 소망3\n항해경험치+10%\n교역경험치+10%\n항해숙련도+45");
                    } else if (sp[0] == 1 && sp[1] == 1 && sp[2] == 5 && sp[3] == 4) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<선택과 집중:항해>\n항해숙련도-500\n항해경험치+35%");
                    } else if (sp[0] == 6 && sp[1] == 6 && sp[2] == 7 && sp[3] == 7) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<일격필살>\n몬스터 추가 공격력+10\n치명타 확률 증가+10%");
                    }else if (sp[0] == 8 && sp[1] == 8 && sp[2] == 9 && sp[3] == 9) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<전선 강화>\n최대생명력 +100\n몬스터 피해감소+15\n몬스터에게 받는 피해량-2%");
                    }else if (sp[0] == 9 && sp[1] == 9 && sp[2] == 9 && sp[3] == 4) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<철옹성>\n몬스터 피해감소+20\n몬스터에게 받는 피해량-3%");
                    }else if (sp[0] == 10 && sp[1] == 10 && sp[2] == 10 && sp[3] == 10) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<맹공>\n모든 공격력+9");
                    }else if (sp[0] == 10 && sp[1] == 11 && sp[2] == 12 && sp[3] == 13) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<약점 공략>\n모든 공격력+8\n모든 적중력+12\n최대지구력+75\n치명타 피해량+5%");
                    }else if (sp[0] == 10 && sp[1] == 11 && sp[2] == 12 && sp[3] == 14) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<불곰>\n몬스터 피해감소+20\n몬스터에게 받는 피해량-3%\n기절,경직,빙결 저항무시+8%");
                    }else if (sp[0] == 10 && sp[1] == 10 && sp[2] == 15 && sp[3] == 15) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<초상비격>\n모든 피해감소-15\n모든 회피력-25\n모든 공격력+20\n에어어택 피해량+3%");
                    }else{
                        TextView text1=(TextView) findViewById(R.id.text1);
                        text1.setText("");
                    }
                }else if (str.equals(stone2[11])) {
                    Log.i("test", "true/false");
                    sp[1] = 11;
                    if (sp[0] == 1 && sp[1] == 1 && sp[2] == 1 && sp[3] == 1) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<하늘과 바다의 경계로>\n항해경험치+8%");
                    } else if (sp[0] == 1 && sp[1] == 2 && sp[2] == 3 && sp[3] == 4) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<바다의 포옹>\n인어의 소망3\n항해경험치+10%\n교역경험치+10%\n항해숙련도+45");
                    } else if (sp[0] == 1 && sp[1] == 1 && sp[2] == 5 && sp[3] == 4) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<선택과 집중:항해>\n항해숙련도-500\n항해경험치+35%");
                    } else if (sp[0] == 6 && sp[1] == 6 && sp[2] == 7 && sp[3] == 7) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<일격필살>\n몬스터 추가 공격력+10\n치명타 확률 증가+10%");
                    }else if (sp[0] == 8 && sp[1] == 8 && sp[2] == 9 && sp[3] == 9) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<전선 강화>\n최대생명력 +100\n몬스터 피해감소+15\n몬스터에게 받는 피해량-2%");
                    }else if (sp[0] == 9 && sp[1] == 9 && sp[2] == 9 && sp[3] == 4) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<철옹성>\n몬스터 피해감소+20\n몬스터에게 받는 피해량-3%");
                    }else if (sp[0] == 10 && sp[1] == 10 && sp[2] == 10 && sp[3] == 10) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<맹공>\n모든 공격력+9");
                    }else if (sp[0] == 10 && sp[1] == 11 && sp[2] == 12 && sp[3] == 13) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<약점 공략>\n모든 공격력+8\n모든 적중력+12\n최대지구력+75\n치명타 피해량+5%");
                    }else if (sp[0] == 10 && sp[1] == 11 && sp[2] == 12 && sp[3] == 14) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<불곰>\n몬스터 피해감소+20\n몬스터에게 받는 피해량-3%\n기절,경직,빙결 저항무시+8%");
                    }else if (sp[0] == 10 && sp[1] == 10 && sp[2] == 15 && sp[3] == 15) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<초상비격>\n모든 피해감소-15\n모든 회피력-25\n모든 공격력+20\n에어어택 피해량+3%");
                    }else{
                        TextView text1=(TextView) findViewById(R.id.text1);
                        text1.setText("");
                    }
                }else if (str.equals(stone2[12])) {
                    Log.i("test", "true/false");
                    sp[1] = 12;
                    if (sp[0] == 1 && sp[1] == 1 && sp[2] == 1 && sp[3] == 1) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<하늘과 바다의 경계로>\n항해경험치+8%");
                    } else if (sp[0] == 1 && sp[1] == 2 && sp[2] == 3 && sp[3] == 4) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<바다의 포옹>\n인어의 소망3\n항해경험치+10%\n교역경험치+10%\n항해숙련도+45");
                    } else if (sp[0] == 1 && sp[1] == 1 && sp[2] == 5 && sp[3] == 4) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<선택과 집중:항해>\n항해숙련도-500\n항해경험치+35%");
                    } else if (sp[0] == 6 && sp[1] == 6 && sp[2] == 7 && sp[3] == 7) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<일격필살>\n몬스터 추가 공격력+10\n치명타 확률 증가+10%");
                    }else if (sp[0] == 8 && sp[1] == 8 && sp[2] == 9 && sp[3] == 9) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<전선 강화>\n최대생명력 +100\n몬스터 피해감소+15\n몬스터에게 받는 피해량-2%");
                    }else if (sp[0] == 9 && sp[1] == 9 && sp[2] == 9 && sp[3] == 4) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<철옹성>\n몬스터 피해감소+20\n몬스터에게 받는 피해량-3%");
                    }else if (sp[0] == 10 && sp[1] == 10 && sp[2] == 10 && sp[3] == 10) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<맹공>\n모든 공격력+9");
                    }else if (sp[0] == 10 && sp[1] == 11 && sp[2] == 12 && sp[3] == 13) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<약점 공략>\n모든 공격력+8\n모든 적중력+12\n최대지구력+75\n치명타 피해량+5%");
                    }else if (sp[0] == 10 && sp[1] == 11 && sp[2] == 12 && sp[3] == 14) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<불곰>\n몬스터 피해감소+20\n몬스터에게 받는 피해량-3%\n기절,경직,빙결 저항무시+8%");
                    }else if (sp[0] == 10 && sp[1] == 10 && sp[2] == 15 && sp[3] == 15) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<초상비격>\n모든 피해감소-15\n모든 회피력-25\n모든 공격력+20\n에어어택 피해량+3%");
                    }else{
                        TextView text1=(TextView) findViewById(R.id.text1);
                        text1.setText("");
                    }
                }else if (str.equals(stone2[13])) {
                    Log.i("test", "true/false");
                    sp[1] = 13;
                    if (sp[0] == 1 && sp[1] == 1 && sp[2] == 1 && sp[3] == 1) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<하늘과 바다의 경계로>\n항해경험치+8%");
                    } else if (sp[0] == 1 && sp[1] == 2 && sp[2] == 3 && sp[3] == 4) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<바다의 포옹>\n인어의 소망3\n항해경험치+10%\n교역경험치+10%\n항해숙련도+45");
                    } else if (sp[0] == 1 && sp[1] == 1 && sp[2] == 5 && sp[3] == 4) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<선택과 집중:항해>\n항해숙련도-500\n항해경험치+35%");
                    } else if (sp[0] == 6 && sp[1] == 6 && sp[2] == 7 && sp[3] == 7) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<일격필살>\n몬스터 추가 공격력+10\n치명타 확률 증가+10%");
                    }else if (sp[0] == 8 && sp[1] == 8 && sp[2] == 9 && sp[3] == 9) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<전선 강화>\n최대생명력 +100\n몬스터 피해감소+15\n몬스터에게 받는 피해량-2%");
                    }else if (sp[0] == 9 && sp[1] == 9 && sp[2] == 9 && sp[3] == 4) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<철옹성>\n몬스터 피해감소+20\n몬스터에게 받는 피해량-3%");
                    }else if (sp[0] == 10 && sp[1] == 10 && sp[2] == 10 && sp[3] == 10) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<맹공>\n모든 공격력+9");
                    }else if (sp[0] == 10 && sp[1] == 11 && sp[2] == 12 && sp[3] == 13) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<약점 공략>\n모든 공격력+8\n모든 적중력+12\n최대지구력+75\n치명타 피해량+5%");
                    }else if (sp[0] == 10 && sp[1] == 11 && sp[2] == 12 && sp[3] == 14) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<불곰>\n몬스터 피해감소+20\n몬스터에게 받는 피해량-3%\n기절,경직,빙결 저항무시+8%");
                    }else if (sp[0] == 10 && sp[1] == 10 && sp[2] == 15 && sp[3] == 15) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<초상비격>\n모든 피해감소-15\n모든 회피력-25\n모든 공격력+20\n에어어택 피해량+3%");
                    }else{
                        TextView text1=(TextView) findViewById(R.id.text1);
                        text1.setText("");
                    }
                }else if (str.equals(stone2[14])) {
                    Log.i("test", "true/false");
                    sp[1] = 14;
                    if (sp[0] == 1 && sp[1] == 1 && sp[2] == 1 && sp[3] == 1) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<하늘과 바다의 경계로>\n항해경험치+8%");
                    } else if (sp[0] == 1 && sp[1] == 2 && sp[2] == 3 && sp[3] == 4) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<바다의 포옹>\n인어의 소망3\n항해경험치+10%\n교역경험치+10%\n항해숙련도+45");
                    } else if (sp[0] == 1 && sp[1] == 1 && sp[2] == 5 && sp[3] == 4) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<선택과 집중:항해>\n항해숙련도-500\n항해경험치+35%");
                    } else if (sp[0] == 6 && sp[1] == 6 && sp[2] == 7 && sp[3] == 7) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<일격필살>\n몬스터 추가 공격력+10\n치명타 확률 증가+10%");
                    }else if (sp[0] == 8 && sp[1] == 8 && sp[2] == 9 && sp[3] == 9) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<전선 강화>\n최대생명력 +100\n몬스터 피해감소+15\n몬스터에게 받는 피해량-2%");
                    }else if (sp[0] == 9 && sp[1] == 9 && sp[2] == 9 && sp[3] == 4) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<철옹성>\n몬스터 피해감소+20\n몬스터에게 받는 피해량-3%");
                    }else if (sp[0] == 10 && sp[1] == 10 && sp[2] == 10 && sp[3] == 10) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<맹공>\n모든 공격력+9");
                    }else if (sp[0] == 10 && sp[1] == 11 && sp[2] == 12 && sp[3] == 13) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<약점 공략>\n모든 공격력+8\n모든 적중력+12\n최대지구력+75\n치명타 피해량+5%");
                    }else if (sp[0] == 10 && sp[1] == 11 && sp[2] == 12 && sp[3] == 14) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<불곰>\n몬스터 피해감소+20\n몬스터에게 받는 피해량-3%\n기절,경직,빙결 저항무시+8%");
                    }else if (sp[0] == 10 && sp[1] == 10 && sp[2] == 15 && sp[3] == 15) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<초상비격>\n모든 피해감소-15\n모든 회피력-25\n모든 공격력+20\n에어어택 피해량+3%");
                    }else{
                        TextView text1=(TextView) findViewById(R.id.text1);
                        text1.setText("");
                    }
                }else if (str.equals(stone2[15])) {
                    Log.i("test", "true/false");
                    sp[1] = 15;
                    if (sp[0] == 1 && sp[1] == 1 && sp[2] == 1 && sp[3] == 1) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<하늘과 바다의 경계로>\n항해경험치+8%");
                    } else if (sp[0] == 1 && sp[1] == 2 && sp[2] == 3 && sp[3] == 4) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<바다의 포옹>\n인어의 소망3\n항해경험치+10%\n교역경험치+10%\n항해숙련도+45");
                    } else if (sp[0] == 1 && sp[1] == 1 && sp[2] == 5 && sp[3] == 4) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<선택과 집중:항해>\n항해숙련도-500\n항해경험치+35%");
                    } else if (sp[0] == 6 && sp[1] == 6 && sp[2] == 7 && sp[3] == 7) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<일격필살>\n몬스터 추가 공격력+10\n치명타 확률 증가+10%");
                    }else if (sp[0] == 8 && sp[1] == 8 && sp[2] == 9 && sp[3] == 9) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<전선 강화>\n최대생명력 +100\n몬스터 피해감소+15\n몬스터에게 받는 피해량-2%");
                    }else if (sp[0] == 9 && sp[1] == 9 && sp[2] == 9 && sp[3] == 4) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<철옹성>\n몬스터 피해감소+20\n몬스터에게 받는 피해량-3%");
                    }else if (sp[0] == 10 && sp[1] == 10 && sp[2] == 10 && sp[3] == 10) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<맹공>\n모든 공격력+9");
                    }else if (sp[0] == 10 && sp[1] == 11 && sp[2] == 12 && sp[3] == 13) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<약점 공략>\n모든 공격력+8\n모든 적중력+12\n최대지구력+75\n치명타 피해량+5%");
                    }else if (sp[0] == 10 && sp[1] == 11 && sp[2] == 12 && sp[3] == 14) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<불곰>\n몬스터 피해감소+20\n몬스터에게 받는 피해량-3%\n기절,경직,빙결 저항무시+8%");
                    }else if (sp[0] == 10 && sp[1] == 10 && sp[2] == 15 && sp[3] == 15) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<초상비격>\n모든 피해감소-15\n모든 회피력-25\n모든 공격력+20\n에어어택 피해량+3%");
                    }else{
                        TextView text1=(TextView) findViewById(R.id.text1);
                        text1.setText("");
                    }
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                sp[1] = 0;
            }
        });
        Spinner spiner6 = (Spinner) findViewById(R.id.spinner6);

        ArrayAdapter adapter6 = new ArrayAdapter(this, android.R.layout.simple_spinner_item, artifact2);
        adapter6.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spiner6.setAdapter(adapter6);

        spiner6.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
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
                String str = (String) spiner3.getSelectedItem();
                if (str.equals(stone3[1])) {
                    Log.i("test", "true/false");
                    sp[2] = 1;
                    if (sp[0] == 1 && sp[1] == 1 && sp[2] == 1 && sp[3] == 1) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<하늘과 바다의 경계로>\n항해경험치+8%");
                    } else if (sp[0] == 1 && sp[1] == 2 && sp[2] == 3 && sp[3] == 4) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<바다의 포옹>\n인어의 소망3\n항해경험치+10%\n교역경험치+10%\n항해숙련도+45");
                    } else if (sp[0] == 1 && sp[1] == 1 && sp[2] == 5 && sp[3] == 4) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<선택과 집중:항해>\n항해숙련도-500\n항해경험치+35%");
                    } else if (sp[0] == 6 && sp[1] == 6 && sp[2] == 7 && sp[3] == 7) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<일격필살>\n몬스터 추가 공격력+10\n치명타 확률 증가+10%");
                    }else if (sp[0] == 8 && sp[1] == 8 && sp[2] == 9 && sp[3] == 9) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<전선 강화>\n최대생명력 +100\n몬스터 피해감소+15\n몬스터에게 받는 피해량-2%");
                    }else if (sp[0] == 9 && sp[1] == 9 && sp[2] == 9 && sp[3] == 4) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<철옹성>\n몬스터 피해감소+20\n몬스터에게 받는 피해량-3%");
                    }else if (sp[0] == 10 && sp[1] == 10 && sp[2] == 10 && sp[3] == 10) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<맹공>\n모든 공격력+9");
                    }else if (sp[0] == 10 && sp[1] == 11 && sp[2] == 12 && sp[3] == 13) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<약점 공략>\n모든 공격력+8\n모든 적중력+12\n최대지구력+75\n치명타 피해량+5%");
                    }else if (sp[0] == 10 && sp[1] == 11 && sp[2] == 12 && sp[3] == 14) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<불곰>\n몬스터 피해감소+20\n몬스터에게 받는 피해량-3%\n기절,경직,빙결 저항무시+8%");
                    }else if (sp[0] == 10 && sp[1] == 10 && sp[2] == 15 && sp[3] == 15) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<초상비격>\n모든 피해감소-15\n모든 회피력-25\n모든 공격력+20\n에어어택 피해량+3%");
                    }else{
                        TextView text1=(TextView) findViewById(R.id.text1);
                        text1.setText("");
                    }
                } else if (str.equals(stone3[2])) {
                    Log.i("test", "true/false");
                    sp[2] = 2;
                    if (sp[0] == 1 && sp[1] == 1 && sp[2] == 1 && sp[3] == 1) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<하늘과 바다의 경계로>\n항해경험치+8%");
                    } else if (sp[0] == 1 && sp[1] == 2 && sp[2] == 3 && sp[3] == 4) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<바다의 포옹>\n인어의 소망3\n항해경험치+10%\n교역경험치+10%\n항해숙련도+45");
                    } else if (sp[0] == 1 && sp[1] == 1 && sp[2] == 5 && sp[3] == 4) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<선택과 집중:항해>\n항해숙련도-500\n항해경험치+35%");
                    } else if (sp[0] == 6 && sp[1] == 6 && sp[2] == 7 && sp[3] == 7) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<일격필살>\n몬스터 추가 공격력+10\n치명타 확률 증가+10%");
                    }else if (sp[0] == 8 && sp[1] == 8 && sp[2] == 9 && sp[3] == 9) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<전선 강화>\n최대생명력 +100\n몬스터 피해감소+15\n몬스터에게 받는 피해량-2%");
                    }else if (sp[0] == 9 && sp[1] == 9 && sp[2] == 9 && sp[3] == 4) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<철옹성>\n몬스터 피해감소+20\n몬스터에게 받는 피해량-3%");
                    }else if (sp[0] == 10 && sp[1] == 10 && sp[2] == 10 && sp[3] == 10) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<맹공>\n모든 공격력+9");
                    }else if (sp[0] == 10 && sp[1] == 11 && sp[2] == 12 && sp[3] == 13) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<약점 공략>\n모든 공격력+8\n모든 적중력+12\n최대지구력+75\n치명타 피해량+5%");
                    }else if (sp[0] == 10 && sp[1] == 11 && sp[2] == 12 && sp[3] == 14) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<불곰>\n몬스터 피해감소+20\n몬스터에게 받는 피해량-3%\n기절,경직,빙결 저항무시+8%");
                    }else if (sp[0] == 10 && sp[1] == 10 && sp[2] == 15 && sp[3] == 15) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<초상비격>\n모든 피해감소-15\n모든 회피력-25\n모든 공격력+20\n에어어택 피해량+3%");
                    }else{
                        TextView text1=(TextView) findViewById(R.id.text1);
                        text1.setText("");
                    }
                } else if (str.equals(stone3[3])) {
                    Log.i("test", "true/false");
                    sp[2] = 3;
                    if (sp[0] == 1 && sp[1] == 1 && sp[2] == 1 && sp[3] == 1) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<하늘과 바다의 경계로>\n항해경험치+8%");
                    } else if (sp[0] == 1 && sp[1] == 2 && sp[2] == 3 && sp[3] == 4) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<바다의 포옹>\n인어의 소망3\n항해경험치+10%\n교역경험치+10%\n항해숙련도+45");
                    } else if (sp[0] == 1 && sp[1] == 1 && sp[2] == 5 && sp[3] == 4) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<선택과 집중:항해>\n항해숙련도-500\n항해경험치+35%");
                    } else if (sp[0] == 6 && sp[1] == 6 && sp[2] == 7 && sp[3] == 7) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<일격필살>\n몬스터 추가 공격력+10\n치명타 확률 증가+10%");
                    }else if (sp[0] == 8 && sp[1] == 8 && sp[2] == 9 && sp[3] == 9) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<전선 강화>\n최대생명력 +100\n몬스터 피해감소+15\n몬스터에게 받는 피해량-2%");
                    }else if (sp[0] == 9 && sp[1] == 9 && sp[2] == 9 && sp[3] == 4) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<철옹성>\n몬스터 피해감소+20\n몬스터에게 받는 피해량-3%");
                    }else if (sp[0] == 10 && sp[1] == 10 && sp[2] == 10 && sp[3] == 10) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<맹공>\n모든 공격력+9");
                    }else if (sp[0] == 10 && sp[1] == 11 && sp[2] == 12 && sp[3] == 13) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<약점 공략>\n모든 공격력+8\n모든 적중력+12\n최대지구력+75\n치명타 피해량+5%");
                    }else if (sp[0] == 10 && sp[1] == 11 && sp[2] == 12 && sp[3] == 14) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<불곰>\n몬스터 피해감소+20\n몬스터에게 받는 피해량-3%\n기절,경직,빙결 저항무시+8%");
                    }else if (sp[0] == 10 && sp[1] == 10 && sp[2] == 15 && sp[3] == 15) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<초상비격>\n모든 피해감소-15\n모든 회피력-25\n모든 공격력+20\n에어어택 피해량+3%");
                    }else{
                        TextView text1=(TextView) findViewById(R.id.text1);
                        text1.setText("");
                    }
                } else if (str.equals(stone3[4])) {
                    Log.i("test", "true/false");
                    sp[2] = 4;
                    if (sp[0] == 1 && sp[1] == 1 && sp[2] == 1 && sp[3] == 1) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<하늘과 바다의 경계로>\n항해경험치+8%");
                    } else if (sp[0] == 1 && sp[1] == 2 && sp[2] == 3 && sp[3] == 4) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<바다의 포옹>\n인어의 소망3\n항해경험치+10%\n교역경험치+10%\n항해숙련도+45");
                    } else if (sp[0] == 1 && sp[1] == 1 && sp[2] == 5 && sp[3] == 4) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<선택과 집중:항해>\n항해숙련도-500\n항해경험치+35%");
                    } else if (sp[0] == 6 && sp[1] == 6 && sp[2] == 7 && sp[3] == 7) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<일격필살>\n몬스터 추가 공격력+10\n치명타 확률 증가+10%");
                    }else if (sp[0] == 8 && sp[1] == 8 && sp[2] == 9 && sp[3] == 9) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<전선 강화>\n최대생명력 +100\n몬스터 피해감소+15\n몬스터에게 받는 피해량-2%");
                    }else if (sp[0] == 9 && sp[1] == 9 && sp[2] == 9 && sp[3] == 4) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<철옹성>\n몬스터 피해감소+20\n몬스터에게 받는 피해량-3%");
                    }else if (sp[0] == 10 && sp[1] == 10 && sp[2] == 10 && sp[3] == 10) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<맹공>\n모든 공격력+9");
                    }else if (sp[0] == 10 && sp[1] == 11 && sp[2] == 12 && sp[3] == 13) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<약점 공략>\n모든 공격력+8\n모든 적중력+12\n최대지구력+75\n치명타 피해량+5%");
                    }else if (sp[0] == 10 && sp[1] == 11 && sp[2] == 12 && sp[3] == 14) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<불곰>\n몬스터 피해감소+20\n몬스터에게 받는 피해량-3%\n기절,경직,빙결 저항무시+8%");
                    }else if (sp[0] == 10 && sp[1] == 10 && sp[2] == 15 && sp[3] == 15) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<초상비격>\n모든 피해감소-15\n모든 회피력-25\n모든 공격력+20\n에어어택 피해량+3%");
                    }else{
                        TextView text1=(TextView) findViewById(R.id.text1);
                        text1.setText("");
                    }
                } else if (str.equals(stone3[5])) {
                    Log.i("test", "true/false");
                    sp[2] = 5;
                    if (sp[0] == 1 && sp[1] == 1 && sp[2] == 1 && sp[3] == 1) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<하늘과 바다의 경계로>\n항해경험치+8%");
                    } else if (sp[0] == 1 && sp[1] == 2 && sp[2] == 3 && sp[3] == 4) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<바다의 포옹>\n인어의 소망3\n항해경험치+10%\n교역경험치+10%\n항해숙련도+45");
                    } else if (sp[0] == 1 && sp[1] == 1 && sp[2] == 5 && sp[3] == 4) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<선택과 집중:항해>\n항해숙련도-500\n항해경험치+35%");
                    } else if (sp[0] == 6 && sp[1] == 6 && sp[2] == 7 && sp[3] == 7) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<일격필살>\n몬스터 추가 공격력+10\n치명타 확률 증가+10%");
                    }else if (sp[0] == 8 && sp[1] == 8 && sp[2] == 9 && sp[3] == 9) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<전선 강화>\n최대생명력 +100\n몬스터 피해감소+15\n몬스터에게 받는 피해량-2%");
                    }else if (sp[0] == 9 && sp[1] == 9 && sp[2] == 9 && sp[3] == 4) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<철옹성>\n몬스터 피해감소+20\n몬스터에게 받는 피해량-3%");
                    }else if (sp[0] == 10 && sp[1] == 10 && sp[2] == 10 && sp[3] == 10) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<맹공>\n모든 공격력+9");
                    }else if (sp[0] == 10 && sp[1] == 11 && sp[2] == 12 && sp[3] == 13) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<약점 공략>\n모든 공격력+8\n모든 적중력+12\n최대지구력+75\n치명타 피해량+5%");
                    }else if (sp[0] == 10 && sp[1] == 11 && sp[2] == 12 && sp[3] == 14) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<불곰>\n몬스터 피해감소+20\n몬스터에게 받는 피해량-3%\n기절,경직,빙결 저항무시+8%");
                    }else if (sp[0] == 10 && sp[1] == 10 && sp[2] == 15 && sp[3] == 15) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<초상비격>\n모든 피해감소-15\n모든 회피력-25\n모든 공격력+20\n에어어택 피해량+3%");
                    }else{
                        TextView text1=(TextView) findViewById(R.id.text1);
                        text1.setText("");
                    }
                } else if (str.equals(stone3[6])) {
                    Log.i("test", "true/false");
                    sp[2] = 6;
                    if (sp[0] == 1 && sp[1] == 1 && sp[2] == 1 && sp[3] == 1) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<하늘과 바다의 경계로>\n항해경험치+8%");
                    } else if (sp[0] == 1 && sp[1] == 2 && sp[2] == 3 && sp[3] == 4) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<바다의 포옹>\n인어의 소망3\n항해경험치+10%\n교역경험치+10%\n항해숙련도+45");
                    } else if (sp[0] == 1 && sp[1] == 1 && sp[2] == 5 && sp[3] == 4) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<선택과 집중:항해>\n항해숙련도-500\n항해경험치+35%");
                    } else if (sp[0] == 6 && sp[1] == 6 && sp[2] == 7 && sp[3] == 7) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<일격필살>\n몬스터 추가 공격력+10\n치명타 확률 증가+10%");
                    }else if (sp[0] == 8 && sp[1] == 8 && sp[2] == 9 && sp[3] == 9) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<전선 강화>\n최대생명력 +100\n몬스터 피해감소+15\n몬스터에게 받는 피해량-2%");
                    }else if (sp[0] == 9 && sp[1] == 9 && sp[2] == 9 && sp[3] == 4) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<철옹성>\n몬스터 피해감소+20\n몬스터에게 받는 피해량-3%");
                    }else if (sp[0] == 10 && sp[1] == 10 && sp[2] == 10 && sp[3] == 10) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<맹공>\n모든 공격력+9");
                    }else if (sp[0] == 10 && sp[1] == 11 && sp[2] == 12 && sp[3] == 13) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<약점 공략>\n모든 공격력+8\n모든 적중력+12\n최대지구력+75\n치명타 피해량+5%");
                    }else if (sp[0] == 10 && sp[1] == 11 && sp[2] == 12 && sp[3] == 14) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<불곰>\n몬스터 피해감소+20\n몬스터에게 받는 피해량-3%\n기절,경직,빙결 저항무시+8%");
                    }else if (sp[0] == 10 && sp[1] == 10 && sp[2] == 15 && sp[3] == 15) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<초상비격>\n모든 피해감소-15\n모든 회피력-25\n모든 공격력+20\n에어어택 피해량+3%");
                    }else{
                        TextView text1=(TextView) findViewById(R.id.text1);
                        text1.setText("");
                    }
                } else if (str.equals(stone3[7])) {
                    Log.i("test", "true/false");
                    sp[2] = 7;
                    if (sp[0] == 1 && sp[1] == 1 && sp[2] == 1 && sp[3] == 1) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<하늘과 바다의 경계로>\n항해경험치+8%");
                    } else if (sp[0] == 1 && sp[1] == 2 && sp[2] == 3 && sp[3] == 4) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<바다의 포옹>\n인어의 소망3\n항해경험치+10%\n교역경험치+10%\n항해숙련도+45");
                    } else if (sp[0] == 1 && sp[1] == 1 && sp[2] == 5 && sp[3] == 4) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<선택과 집중:항해>\n항해숙련도-500\n항해경험치+35%");
                    } else if (sp[0] == 6 && sp[1] == 6 && sp[2] == 7 && sp[3] == 7) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<일격필살>\n몬스터 추가 공격력+10\n치명타 확률 증가+10%");
                    }else if (sp[0] == 8 && sp[1] == 8 && sp[2] == 9 && sp[3] == 9) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<전선 강화>\n최대생명력 +100\n몬스터 피해감소+15\n몬스터에게 받는 피해량-2%");
                    }else if (sp[0] == 9 && sp[1] == 9 && sp[2] == 9 && sp[3] == 4) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<철옹성>\n몬스터 피해감소+20\n몬스터에게 받는 피해량-3%");
                    }else if (sp[0] == 10 && sp[1] == 10 && sp[2] == 10 && sp[3] == 10) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<맹공>\n모든 공격력+9");
                    }else if (sp[0] == 10 && sp[1] == 11 && sp[2] == 12 && sp[3] == 13) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<약점 공략>\n모든 공격력+8\n모든 적중력+12\n최대지구력+75\n치명타 피해량+5%");
                    }else if (sp[0] == 10 && sp[1] == 11 && sp[2] == 12 && sp[3] == 14) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<불곰>\n몬스터 피해감소+20\n몬스터에게 받는 피해량-3%\n기절,경직,빙결 저항무시+8%");
                    }else if (sp[0] == 10 && sp[1] == 10 && sp[2] == 15 && sp[3] == 15) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<초상비격>\n모든 피해감소-15\n모든 회피력-25\n모든 공격력+20\n에어어택 피해량+3%");
                    }else{
                        TextView text1=(TextView) findViewById(R.id.text1);
                        text1.setText("");
                    }
                }else if (str.equals(stone3[8])) {
                    Log.i("test", "true/false");
                    sp[2] = 8;
                    if (sp[0] == 1 && sp[1] == 1 && sp[2] == 1 && sp[3] == 1) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<하늘과 바다의 경계로>\n항해경험치+8%");
                    } else if (sp[0] == 1 && sp[1] == 2 && sp[2] == 3 && sp[3] == 4) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<바다의 포옹>\n인어의 소망3\n항해경험치+10%\n교역경험치+10%\n항해숙련도+45");
                    } else if (sp[0] == 1 && sp[1] == 1 && sp[2] == 5 && sp[3] == 4) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<선택과 집중:항해>\n항해숙련도-500\n항해경험치+35%");
                    } else if (sp[0] == 6 && sp[1] == 6 && sp[2] == 7 && sp[3] == 7) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<일격필살>\n몬스터 추가 공격력+10\n치명타 확률 증가+10%");
                    }else if (sp[0] == 8 && sp[1] == 8 && sp[2] == 9 && sp[3] == 9) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<전선 강화>\n최대생명력 +100\n몬스터 피해감소+15\n몬스터에게 받는 피해량-2%");
                    }else if (sp[0] == 9 && sp[1] == 9 && sp[2] == 9 && sp[3] == 4) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<철옹성>\n몬스터 피해감소+20\n몬스터에게 받는 피해량-3%");
                    }else if (sp[0] == 10 && sp[1] == 10 && sp[2] == 10 && sp[3] == 10) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<맹공>\n모든 공격력+9");
                    }else if (sp[0] == 10 && sp[1] == 11 && sp[2] == 12 && sp[3] == 13) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<약점 공략>\n모든 공격력+8\n모든 적중력+12\n최대지구력+75\n치명타 피해량+5%");
                    }else if (sp[0] == 10 && sp[1] == 11 && sp[2] == 12 && sp[3] == 14) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<불곰>\n몬스터 피해감소+20\n몬스터에게 받는 피해량-3%\n기절,경직,빙결 저항무시+8%");
                    }else if (sp[0] == 10 && sp[1] == 10 && sp[2] == 15 && sp[3] == 15) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<초상비격>\n모든 피해감소-15\n모든 회피력-25\n모든 공격력+20\n에어어택 피해량+3%");
                    }else{
                        TextView text1=(TextView) findViewById(R.id.text1);
                        text1.setText("");
                    }
                }else if (str.equals(stone3[9])) {
                    Log.i("test", "true/false");
                    sp[2] = 9;
                    if (sp[0] == 1 && sp[1] == 1 && sp[2] == 1 && sp[3] == 1) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<하늘과 바다의 경계로>\n항해경험치+8%");
                    } else if (sp[0] == 1 && sp[1] == 2 && sp[2] == 3 && sp[3] == 4) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<바다의 포옹>\n인어의 소망3\n항해경험치+10%\n교역경험치+10%\n항해숙련도+45");
                    } else if (sp[0] == 1 && sp[1] == 1 && sp[2] == 5 && sp[3] == 4) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<선택과 집중:항해>\n항해숙련도-500\n항해경험치+35%");
                    } else if (sp[0] == 6 && sp[1] == 6 && sp[2] == 7 && sp[3] == 7) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<일격필살>\n몬스터 추가 공격력+10\n치명타 확률 증가+10%");
                    }else if (sp[0] == 8 && sp[1] == 8 && sp[2] == 9 && sp[3] == 9) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<전선 강화>\n최대생명력 +100\n몬스터 피해감소+15\n몬스터에게 받는 피해량-2%");
                    }else if (sp[0] == 9 && sp[1] == 9 && sp[2] == 9 && sp[3] == 4) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<철옹성>\n몬스터 피해감소+20\n몬스터에게 받는 피해량-3%");
                    }else if (sp[0] == 10 && sp[1] == 10 && sp[2] == 10 && sp[3] == 10) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<맹공>\n모든 공격력+9");
                    }else if (sp[0] == 10 && sp[1] == 11 && sp[2] == 12 && sp[3] == 13) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<약점 공략>\n모든 공격력+8\n모든 적중력+12\n최대지구력+75\n치명타 피해량+5%");
                    }else if (sp[0] == 10 && sp[1] == 11 && sp[2] == 12 && sp[3] == 14) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<불곰>\n몬스터 피해감소+20\n몬스터에게 받는 피해량-3%\n기절,경직,빙결 저항무시+8%");
                    }else if (sp[0] == 10 && sp[1] == 10 && sp[2] == 15 && sp[3] == 15) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<초상비격>\n모든 피해감소-15\n모든 회피력-25\n모든 공격력+20\n에어어택 피해량+3%");
                    }else{
                        TextView text1=(TextView) findViewById(R.id.text1);
                        text1.setText("");
                    }
                }else if (str.equals(stone3[10])) {
                    Log.i("test", "true/false");
                    sp[2] = 10;
                    if (sp[0] == 1 && sp[1] == 1 && sp[2] == 1 && sp[3] == 1) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<하늘과 바다의 경계로>\n항해경험치+8%");
                    } else if (sp[0] == 1 && sp[1] == 2 && sp[2] == 3 && sp[3] == 4) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<바다의 포옹>\n인어의 소망3\n항해경험치+10%\n교역경험치+10%\n항해숙련도+45");
                    } else if (sp[0] == 1 && sp[1] == 1 && sp[2] == 5 && sp[3] == 4) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<선택과 집중:항해>\n항해숙련도-500\n항해경험치+35%");
                    } else if (sp[0] == 6 && sp[1] == 6 && sp[2] == 7 && sp[3] == 7) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<일격필살>\n몬스터 추가 공격력+10\n치명타 확률 증가+10%");
                    }else if (sp[0] == 8 && sp[1] == 8 && sp[2] == 9 && sp[3] == 9) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<전선 강화>\n최대생명력 +100\n몬스터 피해감소+15\n몬스터에게 받는 피해량-2%");
                    }else if (sp[0] == 9 && sp[1] == 9 && sp[2] == 9 && sp[3] == 4) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<철옹성>\n몬스터 피해감소+20\n몬스터에게 받는 피해량-3%");
                    }else if (sp[0] == 10 && sp[1] == 10 && sp[2] == 10 && sp[3] == 10) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<맹공>\n모든 공격력+9");
                    }else if (sp[0] == 10 && sp[1] == 11 && sp[2] == 12 && sp[3] == 13) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<약점 공략>\n모든 공격력+8\n모든 적중력+12\n최대지구력+75\n치명타 피해량+5%");
                    }else if (sp[0] == 10 && sp[1] == 11 && sp[2] == 12 && sp[3] == 14) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<불곰>\n몬스터 피해감소+20\n몬스터에게 받는 피해량-3%\n기절,경직,빙결 저항무시+8%");
                    }else if (sp[0] == 10 && sp[1] == 10 && sp[2] == 15 && sp[3] == 15) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<초상비격>\n모든 피해감소-15\n모든 회피력-25\n모든 공격력+20\n에어어택 피해량+3%");
                    }else{
                        TextView text1=(TextView) findViewById(R.id.text1);
                        text1.setText("");
                    }
                }else if (str.equals(stone3[11])) {
                    Log.i("test", "true/false");
                    sp[2] = 11;
                    if (sp[0] == 1 && sp[1] == 1 && sp[2] == 1 && sp[3] == 1) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<하늘과 바다의 경계로>\n항해경험치+8%");
                    } else if (sp[0] == 1 && sp[1] == 2 && sp[2] == 3 && sp[3] == 4) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<바다의 포옹>\n인어의 소망3\n항해경험치+10%\n교역경험치+10%\n항해숙련도+45");
                    } else if (sp[0] == 1 && sp[1] == 1 && sp[2] == 5 && sp[3] == 4) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<선택과 집중:항해>\n항해숙련도-500\n항해경험치+35%");
                    } else if (sp[0] == 6 && sp[1] == 6 && sp[2] == 7 && sp[3] == 7) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<일격필살>\n몬스터 추가 공격력+10\n치명타 확률 증가+10%");
                    }else if (sp[0] == 8 && sp[1] == 8 && sp[2] == 9 && sp[3] == 9) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<전선 강화>\n최대생명력 +100\n몬스터 피해감소+15\n몬스터에게 받는 피해량-2%");
                    }else if (sp[0] == 9 && sp[1] == 9 && sp[2] == 9 && sp[3] == 4) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<철옹성>\n몬스터 피해감소+20\n몬스터에게 받는 피해량-3%");
                    }else if (sp[0] == 10 && sp[1] == 10 && sp[2] == 10 && sp[3] == 10) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<맹공>\n모든 공격력+9");
                    }else if (sp[0] == 10 && sp[1] == 11 && sp[2] == 12 && sp[3] == 13) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<약점 공략>\n모든 공격력+8\n모든 적중력+12\n최대지구력+75\n치명타 피해량+5%");
                    }else if (sp[0] == 10 && sp[1] == 11 && sp[2] == 12 && sp[3] == 14) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<불곰>\n몬스터 피해감소+20\n몬스터에게 받는 피해량-3%\n기절,경직,빙결 저항무시+8%");
                    }else if (sp[0] == 10 && sp[1] == 10 && sp[2] == 15 && sp[3] == 15) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<초상비격>\n모든 피해감소-15\n모든 회피력-25\n모든 공격력+20\n에어어택 피해량+3%");
                    }else{
                        TextView text1=(TextView) findViewById(R.id.text1);
                        text1.setText("");
                    }
                }else if (str.equals(stone3[12])) {
                    Log.i("test", "true/false");
                    sp[2] = 12;
                    if (sp[0] == 1 && sp[1] == 1 && sp[2] == 1 && sp[3] == 1) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<하늘과 바다의 경계로>\n항해경험치+8%");
                    } else if (sp[0] == 1 && sp[1] == 2 && sp[2] == 3 && sp[3] == 4) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<바다의 포옹>\n인어의 소망3\n항해경험치+10%\n교역경험치+10%\n항해숙련도+45");
                    } else if (sp[0] == 1 && sp[1] == 1 && sp[2] == 5 && sp[3] == 4) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<선택과 집중:항해>\n항해숙련도-500\n항해경험치+35%");
                    } else if (sp[0] == 6 && sp[1] == 6 && sp[2] == 7 && sp[3] == 7) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<일격필살>\n몬스터 추가 공격력+10\n치명타 확률 증가+10%");
                    }else if (sp[0] == 8 && sp[1] == 8 && sp[2] == 9 && sp[3] == 9) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<전선 강화>\n최대생명력 +100\n몬스터 피해감소+15\n몬스터에게 받는 피해량-2%");
                    }else if (sp[0] == 9 && sp[1] == 9 && sp[2] == 9 && sp[3] == 4) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<철옹성>\n몬스터 피해감소+20\n몬스터에게 받는 피해량-3%");
                    }else if (sp[0] == 10 && sp[1] == 10 && sp[2] == 10 && sp[3] == 10) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<맹공>\n모든 공격력+9");
                    }else if (sp[0] == 10 && sp[1] == 11 && sp[2] == 12 && sp[3] == 13) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<약점 공략>\n모든 공격력+8\n모든 적중력+12\n최대지구력+75\n치명타 피해량+5%");
                    }else if (sp[0] == 10 && sp[1] == 11 && sp[2] == 12 && sp[3] == 14) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<불곰>\n몬스터 피해감소+20\n몬스터에게 받는 피해량-3%\n기절,경직,빙결 저항무시+8%");
                    }else if (sp[0] == 10 && sp[1] == 10 && sp[2] == 15 && sp[3] == 15) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<초상비격>\n모든 피해감소-15\n모든 회피력-25\n모든 공격력+20\n에어어택 피해량+3%");
                    }else{
                        TextView text1=(TextView) findViewById(R.id.text1);
                        text1.setText("");
                    }
                }else if (str.equals(stone3[13])) {
                    Log.i("test", "true/false");
                    sp[2] = 13;
                    if (sp[0] == 1 && sp[1] == 1 && sp[2] == 1 && sp[3] == 1) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<하늘과 바다의 경계로>\n항해경험치+8%");
                    } else if (sp[0] == 1 && sp[1] == 2 && sp[2] == 3 && sp[3] == 4) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<바다의 포옹>\n인어의 소망3\n항해경험치+10%\n교역경험치+10%\n항해숙련도+45");
                    } else if (sp[0] == 1 && sp[1] == 1 && sp[2] == 5 && sp[3] == 4) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<선택과 집중:항해>\n항해숙련도-500\n항해경험치+35%");
                    } else if (sp[0] == 6 && sp[1] == 6 && sp[2] == 7 && sp[3] == 7) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<일격필살>\n몬스터 추가 공격력+10\n치명타 확률 증가+10%");
                    }else if (sp[0] == 8 && sp[1] == 8 && sp[2] == 9 && sp[3] == 9) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<전선 강화>\n최대생명력 +100\n몬스터 피해감소+15\n몬스터에게 받는 피해량-2%");
                    }else if (sp[0] == 9 && sp[1] == 9 && sp[2] == 9 && sp[3] == 4) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<철옹성>\n몬스터 피해감소+20\n몬스터에게 받는 피해량-3%");
                    }else if (sp[0] == 10 && sp[1] == 10 && sp[2] == 10 && sp[3] == 10) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<맹공>\n모든 공격력+9");
                    }else if (sp[0] == 10 && sp[1] == 11 && sp[2] == 12 && sp[3] == 13) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<약점 공략>\n모든 공격력+8\n모든 적중력+12\n최대지구력+75\n치명타 피해량+5%");
                    }else if (sp[0] == 10 && sp[1] == 11 && sp[2] == 12 && sp[3] == 14) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<불곰>\n몬스터 피해감소+20\n몬스터에게 받는 피해량-3%\n기절,경직,빙결 저항무시+8%");
                    }else if (sp[0] == 10 && sp[1] == 10 && sp[2] == 15 && sp[3] == 15) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<초상비격>\n모든 피해감소-15\n모든 회피력-25\n모든 공격력+20\n에어어택 피해량+3%");
                    }else{
                        TextView text1=(TextView) findViewById(R.id.text1);
                        text1.setText("");
                    }
                }else if (str.equals(stone3[14])) {
                    Log.i("test", "true/false");
                    sp[2] = 14;
                    if (sp[0] == 1 && sp[1] == 1 && sp[2] == 1 && sp[3] == 1) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<하늘과 바다의 경계로>\n항해경험치+8%");
                    } else if (sp[0] == 1 && sp[1] == 2 && sp[2] == 3 && sp[3] == 4) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<바다의 포옹>\n인어의 소망3\n항해경험치+10%\n교역경험치+10%\n항해숙련도+45");
                    } else if (sp[0] == 1 && sp[1] == 1 && sp[2] == 5 && sp[3] == 4) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<선택과 집중:항해>\n항해숙련도-500\n항해경험치+35%");
                    } else if (sp[0] == 6 && sp[1] == 6 && sp[2] == 7 && sp[3] == 7) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<일격필살>\n몬스터 추가 공격력+10\n치명타 확률 증가+10%");
                    }else if (sp[0] == 8 && sp[1] == 8 && sp[2] == 9 && sp[3] == 9) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<전선 강화>\n최대생명력 +100\n몬스터 피해감소+15\n몬스터에게 받는 피해량-2%");
                    }else if (sp[0] == 9 && sp[1] == 9 && sp[2] == 9 && sp[3] == 4) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<철옹성>\n몬스터 피해감소+20\n몬스터에게 받는 피해량-3%");
                    }else if (sp[0] == 10 && sp[1] == 10 && sp[2] == 10 && sp[3] == 10) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<맹공>\n모든 공격력+9");
                    }else if (sp[0] == 10 && sp[1] == 11 && sp[2] == 12 && sp[3] == 13) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<약점 공략>\n모든 공격력+8\n모든 적중력+12\n최대지구력+75\n치명타 피해량+5%");
                    }else if (sp[0] == 10 && sp[1] == 11 && sp[2] == 12 && sp[3] == 14) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<불곰>\n몬스터 피해감소+20\n몬스터에게 받는 피해량-3%\n기절,경직,빙결 저항무시+8%");
                    }else if (sp[0] == 10 && sp[1] == 10 && sp[2] == 15 && sp[3] == 15) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<초상비격>\n모든 피해감소-15\n모든 회피력-25\n모든 공격력+20\n에어어택 피해량+3%");
                    }else{
                        TextView text1=(TextView) findViewById(R.id.text1);
                        text1.setText("");
                    }
                }else if (str.equals(stone3[15])) {
                    Log.i("test", "true/false");
                    sp[2] = 15;
                    if (sp[0] == 1 && sp[1] == 1 && sp[2] == 1 && sp[3] == 1) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<하늘과 바다의 경계로>\n항해경험치+8%");
                    } else if (sp[0] == 1 && sp[1] == 2 && sp[2] == 3 && sp[3] == 4) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<바다의 포옹>\n인어의 소망3\n항해경험치+10%\n교역경험치+10%\n항해숙련도+45");
                    } else if (sp[0] == 1 && sp[1] == 1 && sp[2] == 5 && sp[3] == 4) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<선택과 집중:항해>\n항해숙련도-500\n항해경험치+35%");
                    } else if (sp[0] == 6 && sp[1] == 6 && sp[2] == 7 && sp[3] == 7) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<일격필살>\n몬스터 추가 공격력+10\n치명타 확률 증가+10%");
                    }else if (sp[0] == 8 && sp[1] == 8 && sp[2] == 9 && sp[3] == 9) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<전선 강화>\n최대생명력 +100\n몬스터 피해감소+15\n몬스터에게 받는 피해량-2%");
                    }else if (sp[0] == 9 && sp[1] == 9 && sp[2] == 9 && sp[3] == 4) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<철옹성>\n몬스터 피해감소+20\n몬스터에게 받는 피해량-3%");
                    }else if (sp[0] == 10 && sp[1] == 10 && sp[2] == 10 && sp[3] == 10) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<맹공>\n모든 공격력+9");
                    }else if (sp[0] == 10 && sp[1] == 11 && sp[2] == 12 && sp[3] == 13) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<약점 공략>\n모든 공격력+8\n모든 적중력+12\n최대지구력+75\n치명타 피해량+5%");
                    }else if (sp[0] == 10 && sp[1] == 11 && sp[2] == 12 && sp[3] == 14) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<불곰>\n몬스터 피해감소+20\n몬스터에게 받는 피해량-3%\n기절,경직,빙결 저항무시+8%");
                    }else if (sp[0] == 10 && sp[1] == 10 && sp[2] == 15 && sp[3] == 15) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<초상비격>\n모든 피해감소-15\n모든 회피력-25\n모든 공격력+20\n에어어택 피해량+3%");
                    }else{
                        TextView text1=(TextView) findViewById(R.id.text1);
                        text1.setText("");
                    }
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                sp[2] = 0;
            }
        });
        Spinner spiner4 = (Spinner) findViewById(R.id.spinner4);

        ArrayAdapter adapter4 = new ArrayAdapter(this, android.R.layout.simple_spinner_item, stone4);
        adapter4.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spiner4.setAdapter(adapter4);

        spiner4.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id) {
                String str = (String) spiner4.getSelectedItem();
                if (str.equals(stone4[1])) {
                    Log.i("test", "true/false");
                    sp[3] = 1;
                    if (sp[0] == 1 && sp[1] == 1 && sp[2] == 1 && sp[3] == 1) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<하늘과 바다의 경계로>\n항해경험치+8%");
                    } else if (sp[0] == 1 && sp[1] == 2 && sp[2] == 3 && sp[3] == 4) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<바다의 포옹>\n인어의 소망3\n항해경험치+10%\n교역경험치+10%\n항해숙련도+45");
                    } else if (sp[0] == 1 && sp[1] == 1 && sp[2] == 5 && sp[3] == 4) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<선택과 집중:항해>\n항해숙련도-500\n항해경험치+35%");
                    } else if (sp[0] == 6 && sp[1] == 6 && sp[2] == 7 && sp[3] == 7) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<일격필살>\n몬스터 추가 공격력+10\n치명타 확률 증가+10%");
                    }else if (sp[0] == 8 && sp[1] == 8 && sp[2] == 9 && sp[3] == 9) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<전선 강화>\n최대생명력 +100\n몬스터 피해감소+15\n몬스터에게 받는 피해량-2%");
                    }else if (sp[0] == 9 && sp[1] == 9 && sp[2] == 9 && sp[3] == 4) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<철옹성>\n몬스터 피해감소+20\n몬스터에게 받는 피해량-3%");
                    }else if (sp[0] == 10 && sp[1] == 10 && sp[2] == 10 && sp[3] == 10) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<맹공>\n모든 공격력+9");
                    }else if (sp[0] == 10 && sp[1] == 11 && sp[2] == 12 && sp[3] == 13) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<약점 공략>\n모든 공격력+8\n모든 적중력+12\n최대지구력+75\n치명타 피해량+5%");
                    }else if (sp[0] == 10 && sp[1] == 11 && sp[2] == 12 && sp[3] == 14) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<불곰>\n몬스터 피해감소+20\n몬스터에게 받는 피해량-3%\n기절,경직,빙결 저항무시+8%");
                    }else if (sp[0] == 10 && sp[1] == 10 && sp[2] == 15 && sp[3] == 15) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<초상비격>\n모든 피해감소-15\n모든 회피력-25\n모든 공격력+20\n에어어택 피해량+3%");
                    }else{
                        TextView text1=(TextView) findViewById(R.id.text1);
                        text1.setText("");
                    }
                } else if (str.equals(stone4[2])) {
                    Log.i("test", "true/false");
                    sp[3] = 2;
                    if (sp[0] == 1 && sp[1] == 1 && sp[2] == 1 && sp[3] == 1) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<하늘과 바다의 경계로>\n항해경험치+8%");
                    } else if (sp[0] == 1 && sp[1] == 2 && sp[2] == 3 && sp[3] == 4) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<바다의 포옹>\n인어의 소망3\n항해경험치+10%\n교역경험치+10%\n항해숙련도+45");
                    } else if (sp[0] == 1 && sp[1] == 1 && sp[2] == 5 && sp[3] == 4) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<선택과 집중:항해>\n항해숙련도-500\n항해경험치+35%");
                    } else if (sp[0] == 6 && sp[1] == 6 && sp[2] == 7 && sp[3] == 7) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<일격필살>\n몬스터 추가 공격력+10\n치명타 확률 증가+10%");
                    }else if (sp[0] == 8 && sp[1] == 8 && sp[2] == 9 && sp[3] == 9) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<전선 강화>\n최대생명력 +100\n몬스터 피해감소+15\n몬스터에게 받는 피해량-2%");
                    }else if (sp[0] == 9 && sp[1] == 9 && sp[2] == 9 && sp[3] == 4) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<철옹성>\n몬스터 피해감소+20\n몬스터에게 받는 피해량-3%");
                    }else if (sp[0] == 10 && sp[1] == 10 && sp[2] == 10 && sp[3] == 10) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<맹공>\n모든 공격력+9");
                    }else if (sp[0] == 10 && sp[1] == 11 && sp[2] == 12 && sp[3] == 13) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<약점 공략>\n모든 공격력+8\n모든 적중력+12\n최대지구력+75\n치명타 피해량+5%");
                    }else if (sp[0] == 10 && sp[1] == 11 && sp[2] == 12 && sp[3] == 14) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<불곰>\n몬스터 피해감소+20\n몬스터에게 받는 피해량-3%\n기절,경직,빙결 저항무시+8%");
                    }else if (sp[0] == 10 && sp[1] == 10 && sp[2] == 15 && sp[3] == 15) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<초상비격>\n모든 피해감소-15\n모든 회피력-25\n모든 공격력+20\n에어어택 피해량+3%");
                    }else{
                        TextView text1=(TextView) findViewById(R.id.text1);
                        text1.setText("");
                    }
                } else if (str.equals(stone4[3])) {
                    Log.i("test", "true/false");
                    sp[3] = 3;
                    if (sp[0] == 1 && sp[1] == 1 && sp[2] == 1 && sp[3] == 1) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<하늘과 바다의 경계로>\n항해경험치+8%");
                    } else if (sp[0] == 1 && sp[1] == 2 && sp[2] == 3 && sp[3] == 4) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<바다의 포옹>\n인어의 소망3\n항해경험치+10%\n교역경험치+10%\n항해숙련도+45");
                    } else if (sp[0] == 1 && sp[1] == 1 && sp[2] == 5 && sp[3] == 4) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<선택과 집중:항해>\n항해숙련도-500\n항해경험치+35%");
                    } else if (sp[0] == 6 && sp[1] == 6 && sp[2] == 7 && sp[3] == 7) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<일격필살>\n몬스터 추가 공격력+10\n치명타 확률 증가+10%");
                    }else if (sp[0] == 8 && sp[1] == 8 && sp[2] == 9 && sp[3] == 9) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<전선 강화>\n최대생명력 +100\n몬스터 피해감소+15\n몬스터에게 받는 피해량-2%");
                    }else if (sp[0] == 9 && sp[1] == 9 && sp[2] == 9 && sp[3] == 4) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<철옹성>\n몬스터 피해감소+20\n몬스터에게 받는 피해량-3%");
                    }else if (sp[0] == 10 && sp[1] == 10 && sp[2] == 10 && sp[3] == 10) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<맹공>\n모든 공격력+9");
                    }else if (sp[0] == 10 && sp[1] == 11 && sp[2] == 12 && sp[3] == 13) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<약점 공략>\n모든 공격력+8\n모든 적중력+12\n최대지구력+75\n치명타 피해량+5%");
                    }else if (sp[0] == 10 && sp[1] == 11 && sp[2] == 12 && sp[3] == 14) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<불곰>\n몬스터 피해감소+20\n몬스터에게 받는 피해량-3%\n기절,경직,빙결 저항무시+8%");
                    }else if (sp[0] == 10 && sp[1] == 10 && sp[2] == 15 && sp[3] == 15) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<초상비격>\n모든 피해감소-15\n모든 회피력-25\n모든 공격력+20\n에어어택 피해량+3%");
                    }else{
                        TextView text1=(TextView) findViewById(R.id.text1);
                        text1.setText("");
                    }
                } else if (str.equals(stone4[4])) {
                    Log.i("test", "true/false");
                    sp[3] = 4;
                    if (sp[0] == 1 && sp[1] == 1 && sp[2] == 1 && sp[3] == 1) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<하늘과 바다의 경계로>\n항해경험치+8%");
                    } else if (sp[0] == 1 && sp[1] == 2 && sp[2] == 3 && sp[3] == 4) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<바다의 포옹>\n인어의 소망3\n항해경험치+10%\n교역경험치+10%\n항해숙련도+45");
                    } else if (sp[0] == 1 && sp[1] == 1 && sp[2] == 5 && sp[3] == 4) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<선택과 집중:항해>\n항해숙련도-500\n항해경험치+35%");
                    } else if (sp[0] == 6 && sp[1] == 6 && sp[2] == 7 && sp[3] == 7) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<일격필살>\n몬스터 추가 공격력+10\n치명타 확률 증가+10%");
                    }else if (sp[0] == 8 && sp[1] == 8 && sp[2] == 9 && sp[3] == 9) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<전선 강화>\n최대생명력 +100\n몬스터 피해감소+15\n몬스터에게 받는 피해량-2%");
                    }else if (sp[0] == 9 && sp[1] == 9 && sp[2] == 9 && sp[3] == 4) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<철옹성>\n몬스터 피해감소+20\n몬스터에게 받는 피해량-3%");
                    }else if (sp[0] == 10 && sp[1] == 10 && sp[2] == 10 && sp[3] == 10) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<맹공>\n모든 공격력+9");
                    }else if (sp[0] == 10 && sp[1] == 11 && sp[2] == 12 && sp[3] == 13) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<약점 공략>\n모든 공격력+8\n모든 적중력+12\n최대지구력+75\n치명타 피해량+5%");
                    }else if (sp[0] == 10 && sp[1] == 11 && sp[2] == 12 && sp[3] == 14) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<불곰>\n몬스터 피해감소+20\n몬스터에게 받는 피해량-3%\n기절,경직,빙결 저항무시+8%");
                    }else if (sp[0] == 10 && sp[1] == 10 && sp[2] == 15 && sp[3] == 15) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<초상비격>\n모든 피해감소-15\n모든 회피력-25\n모든 공격력+20\n에어어택 피해량+3%");
                    }else{
                        TextView text1=(TextView) findViewById(R.id.text1);
                        text1.setText("");
                    }
                } else if (str.equals(stone4[5])) {
                    Log.i("test", "true/false");
                    sp[3] = 5;
                    if (sp[0] == 1 && sp[1] == 1 && sp[2] == 1 && sp[3] == 1) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<하늘과 바다의 경계로>\n항해경험치+8%");
                    } else if (sp[0] == 1 && sp[1] == 2 && sp[2] == 3 && sp[3] == 4) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<바다의 포옹>\n인어의 소망3\n항해경험치+10%\n교역경험치+10%\n항해숙련도+45");
                    } else if (sp[0] == 1 && sp[1] == 1 && sp[2] == 5 && sp[3] == 4) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<선택과 집중:항해>\n항해숙련도-500\n항해경험치+35%");
                    } else if (sp[0] == 6 && sp[1] == 6 && sp[2] == 7 && sp[3] == 7) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<일격필살>\n몬스터 추가 공격력+10\n치명타 확률 증가+10%");
                    }else if (sp[0] == 8 && sp[1] == 8 && sp[2] == 9 && sp[3] == 9) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<전선 강화>\n최대생명력 +100\n몬스터 피해감소+15\n몬스터에게 받는 피해량-2%");
                    }else if (sp[0] == 9 && sp[1] == 9 && sp[2] == 9 && sp[3] == 4) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<철옹성>\n몬스터 피해감소+20\n몬스터에게 받는 피해량-3%");
                    }else if (sp[0] == 10 && sp[1] == 10 && sp[2] == 10 && sp[3] == 10) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<맹공>\n모든 공격력+9");
                    }else if (sp[0] == 10 && sp[1] == 11 && sp[2] == 12 && sp[3] == 13) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<약점 공략>\n모든 공격력+8\n모든 적중력+12\n최대지구력+75\n치명타 피해량+5%");
                    }else if (sp[0] == 10 && sp[1] == 11 && sp[2] == 12 && sp[3] == 14) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<불곰>\n몬스터 피해감소+20\n몬스터에게 받는 피해량-3%\n기절,경직,빙결 저항무시+8%");
                    }else if (sp[0] == 10 && sp[1] == 10 && sp[2] == 15 && sp[3] == 15) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<초상비격>\n모든 피해감소-15\n모든 회피력-25\n모든 공격력+20\n에어어택 피해량+3%");
                    }else{
                        TextView text1=(TextView) findViewById(R.id.text1);
                        text1.setText("");
                    }
                } else if (str.equals(stone4[6])) {
                    Log.i("test", "true/false");
                    sp[3] = 6;
                    if (sp[0] == 1 && sp[1] == 1 && sp[2] == 1 && sp[3] == 1) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<하늘과 바다의 경계로>\n항해경험치+8%");
                    } else if (sp[0] == 1 && sp[1] == 2 && sp[2] == 3 && sp[3] == 4) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<바다의 포옹>\n인어의 소망3\n항해경험치+10%\n교역경험치+10%\n항해숙련도+45");
                    } else if (sp[0] == 1 && sp[1] == 1 && sp[2] == 5 && sp[3] == 4) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<선택과 집중:항해>\n항해숙련도-500\n항해경험치+35%");
                    } else if (sp[0] == 6 && sp[1] == 6 && sp[2] == 7 && sp[3] == 7) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<일격필살>\n몬스터 추가 공격력+10\n치명타 확률 증가+10%");
                    }else if (sp[0] == 8 && sp[1] == 8 && sp[2] == 9 && sp[3] == 9) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<전선 강화>\n최대생명력 +100\n몬스터 피해감소+15\n몬스터에게 받는 피해량-2%");
                    }else if (sp[0] == 9 && sp[1] == 9 && sp[2] == 9 && sp[3] == 4) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<철옹성>\n몬스터 피해감소+20\n몬스터에게 받는 피해량-3%");
                    }else if (sp[0] == 10 && sp[1] == 10 && sp[2] == 10 && sp[3] == 10) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<맹공>\n모든 공격력+9");
                    }else if (sp[0] == 10 && sp[1] == 11 && sp[2] == 12 && sp[3] == 13) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<약점 공략>\n모든 공격력+8\n모든 적중력+12\n최대지구력+75\n치명타 피해량+5%");
                    }else if (sp[0] == 10 && sp[1] == 11 && sp[2] == 12 && sp[3] == 14) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<불곰>\n몬스터 피해감소+20\n몬스터에게 받는 피해량-3%\n기절,경직,빙결 저항무시+8%");
                    }else if (sp[0] == 10 && sp[1] == 10 && sp[2] == 15 && sp[3] == 15) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<초상비격>\n모든 피해감소-15\n모든 회피력-25\n모든 공격력+20\n에어어택 피해량+3%");
                    }else{
                        TextView text1=(TextView) findViewById(R.id.text1);
                        text1.setText("");
                    }
                } else if (str.equals(stone4[7])) {
                    Log.i("test", "true/false");
                    sp[3] = 7;
                    if (sp[0] == 1 && sp[1] == 1 && sp[2] == 1 && sp[3] == 1) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<하늘과 바다의 경계로>\n항해경험치+8%");
                    } else if (sp[0] == 1 && sp[1] == 2 && sp[2] == 3 && sp[3] == 4) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<바다의 포옹>\n인어의 소망3\n항해경험치+10%\n교역경험치+10%\n항해숙련도+45");
                    } else if (sp[0] == 1 && sp[1] == 1 && sp[2] == 5 && sp[3] == 4) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<선택과 집중:항해>\n항해숙련도-500\n항해경험치+35%");
                    } else if (sp[0] == 6 && sp[1] == 6 && sp[2] == 7 && sp[3] == 7) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<일격필살>\n몬스터 추가 공격력+10\n치명타 확률 증가+10%");
                    }else if (sp[0] == 8 && sp[1] == 8 && sp[2] == 9 && sp[3] == 9) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<전선 강화>\n최대생명력 +100\n몬스터 피해감소+15\n몬스터에게 받는 피해량-2%");
                    }else if (sp[0] == 9 && sp[1] == 9 && sp[2] == 9 && sp[3] == 4) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<철옹성>\n몬스터 피해감소+20\n몬스터에게 받는 피해량-3%");
                    }else if (sp[0] == 10 && sp[1] == 10 && sp[2] == 10 && sp[3] == 10) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<맹공>\n모든 공격력+9");
                    }else if (sp[0] == 10 && sp[1] == 11 && sp[2] == 12 && sp[3] == 13) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<약점 공략>\n모든 공격력+8\n모든 적중력+12\n최대지구력+75\n치명타 피해량+5%");
                    }else if (sp[0] == 10 && sp[1] == 11 && sp[2] == 12 && sp[3] == 14) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<불곰>\n몬스터 피해감소+20\n몬스터에게 받는 피해량-3%\n기절,경직,빙결 저항무시+8%");
                    }else if (sp[0] == 10 && sp[1] == 10 && sp[2] == 15 && sp[3] == 15) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<초상비격>\n모든 피해감소-15\n모든 회피력-25\n모든 공격력+20\n에어어택 피해량+3%");
                    }else{
                        TextView text1=(TextView) findViewById(R.id.text1);
                        text1.setText("");
                    }
                }else if (str.equals(stone4[8])) {
                    Log.i("test", "true/false");
                    sp[3] = 8;
                    if (sp[0] == 1 && sp[1] == 1 && sp[2] == 1 && sp[3] == 1) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<하늘과 바다의 경계로>\n항해경험치+8%");
                    } else if (sp[0] == 1 && sp[1] == 2 && sp[2] == 3 && sp[3] == 4) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<바다의 포옹>\n인어의 소망3\n항해경험치+10%\n교역경험치+10%\n항해숙련도+45");
                    } else if (sp[0] == 1 && sp[1] == 1 && sp[2] == 5 && sp[3] == 4) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<선택과 집중:항해>\n항해숙련도-500\n항해경험치+35%");
                    } else if (sp[0] == 6 && sp[1] == 6 && sp[2] == 7 && sp[3] == 7) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<일격필살>\n몬스터 추가 공격력+10\n치명타 확률 증가+10%");
                    }else if (sp[0] == 8 && sp[1] == 8 && sp[2] == 9 && sp[3] == 9) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<전선 강화>\n최대생명력 +100\n몬스터 피해감소+15\n몬스터에게 받는 피해량-2%");
                    }else if (sp[0] == 9 && sp[1] == 9 && sp[2] == 9 && sp[3] == 4) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<철옹성>\n몬스터 피해감소+20\n몬스터에게 받는 피해량-3%");
                    }else if (sp[0] == 10 && sp[1] == 10 && sp[2] == 10 && sp[3] == 10) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<맹공>\n모든 공격력+9");
                    }else if (sp[0] == 10 && sp[1] == 11 && sp[2] == 12 && sp[3] == 13) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<약점 공략>\n모든 공격력+8\n모든 적중력+12\n최대지구력+75\n치명타 피해량+5%");
                    }else if (sp[0] == 10 && sp[1] == 11 && sp[2] == 12 && sp[3] == 14) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<불곰>\n몬스터 피해감소+20\n몬스터에게 받는 피해량-3%\n기절,경직,빙결 저항무시+8%");
                    }else if (sp[0] == 10 && sp[1] == 10 && sp[2] == 15 && sp[3] == 15) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<초상비격>\n모든 피해감소-15\n모든 회피력-25\n모든 공격력+20\n에어어택 피해량+3%");
                    }else{
                        TextView text1=(TextView) findViewById(R.id.text1);
                        text1.setText("");
                    }
                }else if (str.equals(stone4[9])) {
                    Log.i("test", "true/false");
                    sp[3] = 9;
                    if (sp[0] == 1 && sp[1] == 1 && sp[2] == 1 && sp[3] == 1) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<하늘과 바다의 경계로>\n항해경험치+8%");
                    } else if (sp[0] == 1 && sp[1] == 2 && sp[2] == 3 && sp[3] == 4) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<바다의 포옹>\n인어의 소망3\n항해경험치+10%\n교역경험치+10%\n항해숙련도+45");
                    } else if (sp[0] == 1 && sp[1] == 1 && sp[2] == 5 && sp[3] == 4) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<선택과 집중:항해>\n항해숙련도-500\n항해경험치+35%");
                    } else if (sp[0] == 6 && sp[1] == 6 && sp[2] == 7 && sp[3] == 7) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<일격필살>\n몬스터 추가 공격력+10\n치명타 확률 증가+10%");
                    }else if (sp[0] == 8 && sp[1] == 8 && sp[2] == 9 && sp[3] == 9) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<전선 강화>\n최대생명력 +100\n몬스터 피해감소+15\n몬스터에게 받는 피해량-2%");
                    }else if (sp[0] == 9 && sp[1] == 9 && sp[2] == 9 && sp[3] == 4) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<철옹성>\n몬스터 피해감소+20\n몬스터에게 받는 피해량-3%");
                    }else if (sp[0] == 10 && sp[1] == 10 && sp[2] == 10 && sp[3] == 10) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<맹공>\n모든 공격력+9");
                    }else if (sp[0] == 10 && sp[1] == 11 && sp[2] == 12 && sp[3] == 13) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<약점 공략>\n모든 공격력+8\n모든 적중력+12\n최대지구력+75\n치명타 피해량+5%");
                    }else if (sp[0] == 10 && sp[1] == 11 && sp[2] == 12 && sp[3] == 14) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<불곰>\n몬스터 피해감소+20\n몬스터에게 받는 피해량-3%\n기절,경직,빙결 저항무시+8%");
                    }else if (sp[0] == 10 && sp[1] == 10 && sp[2] == 15 && sp[3] == 15) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<초상비격>\n모든 피해감소-15\n모든 회피력-25\n모든 공격력+20\n에어어택 피해량+3%");
                    }else{
                        TextView text1=(TextView) findViewById(R.id.text1);
                        text1.setText("");
                    }
                }else if (str.equals(stone4[10])) {
                    Log.i("test", "true/false");
                    sp[3] = 10;
                    if (sp[0] == 1 && sp[1] == 1 && sp[2] == 1 && sp[3] == 1) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<하늘과 바다의 경계로>\n항해경험치+8%");
                    } else if (sp[0] == 1 && sp[1] == 2 && sp[2] == 3 && sp[3] == 4) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<바다의 포옹>\n인어의 소망3\n항해경험치+10%\n교역경험치+10%\n항해숙련도+45");
                    } else if (sp[0] == 1 && sp[1] == 1 && sp[2] == 5 && sp[3] == 4) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<선택과 집중:항해>\n항해숙련도-500\n항해경험치+35%");
                    } else if (sp[0] == 6 && sp[1] == 6 && sp[2] == 7 && sp[3] == 7) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<일격필살>\n몬스터 추가 공격력+10\n치명타 확률 증가+10%");
                    }else if (sp[0] == 8 && sp[1] == 8 && sp[2] == 9 && sp[3] == 9) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<전선 강화>\n최대생명력 +100\n몬스터 피해감소+15\n몬스터에게 받는 피해량-2%");
                    }else if (sp[0] == 9 && sp[1] == 9 && sp[2] == 9 && sp[3] == 4) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<철옹성>\n몬스터 피해감소+20\n몬스터에게 받는 피해량-3%");
                    }else if (sp[0] == 10 && sp[1] == 10 && sp[2] == 10 && sp[3] == 10) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<맹공>\n모든 공격력+9");
                    }else if (sp[0] == 10 && sp[1] == 11 && sp[2] == 12 && sp[3] == 13) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<약점 공략>\n모든 공격력+8\n모든 적중력+12\n최대지구력+75\n치명타 피해량+5%");
                    }else if (sp[0] == 10 && sp[1] == 11 && sp[2] == 12 && sp[3] == 14) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<불곰>\n몬스터 피해감소+20\n몬스터에게 받는 피해량-3%\n기절,경직,빙결 저항무시+8%");
                    }else if (sp[0] == 10 && sp[1] == 10 && sp[2] == 15 && sp[3] == 15) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<초상비격>\n모든 피해감소-15\n모든 회피력-25\n모든 공격력+20\n에어어택 피해량+3%");
                    }else{
                        TextView text1=(TextView) findViewById(R.id.text1);
                        text1.setText("");
                    }
                }else if (str.equals(stone4[11])) {
                    Log.i("test", "true/false");
                    sp[3] = 11;
                    if (sp[0] == 1 && sp[1] == 1 && sp[2] == 1 && sp[3] == 1) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<하늘과 바다의 경계로>\n항해경험치+8%");
                    } else if (sp[0] == 1 && sp[1] == 2 && sp[2] == 3 && sp[3] == 4) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<바다의 포옹>\n인어의 소망3\n항해경험치+10%\n교역경험치+10%\n항해숙련도+45");
                    } else if (sp[0] == 1 && sp[1] == 1 && sp[2] == 5 && sp[3] == 4) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<선택과 집중:항해>\n항해숙련도-500\n항해경험치+35%");
                    } else if (sp[0] == 6 && sp[1] == 6 && sp[2] == 7 && sp[3] == 7) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<일격필살>\n몬스터 추가 공격력+10\n치명타 확률 증가+10%");
                    }else if (sp[0] == 8 && sp[1] == 8 && sp[2] == 9 && sp[3] == 9) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<전선 강화>\n최대생명력 +100\n몬스터 피해감소+15\n몬스터에게 받는 피해량-2%");
                    }else if (sp[0] == 9 && sp[1] == 9 && sp[2] == 9 && sp[3] == 4) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<철옹성>\n몬스터 피해감소+20\n몬스터에게 받는 피해량-3%");
                    }else if (sp[0] == 10 && sp[1] == 10 && sp[2] == 10 && sp[3] == 10) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<맹공>\n모든 공격력+9");
                    }else if (sp[0] == 10 && sp[1] == 11 && sp[2] == 12 && sp[3] == 13) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<약점 공략>\n모든 공격력+8\n모든 적중력+12\n최대지구력+75\n치명타 피해량+5%");
                    }else if (sp[0] == 10 && sp[1] == 11 && sp[2] == 12 && sp[3] == 14) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<불곰>\n몬스터 피해감소+20\n몬스터에게 받는 피해량-3%\n기절,경직,빙결 저항무시+8%");
                    }else if (sp[0] == 10 && sp[1] == 10 && sp[2] == 15 && sp[3] == 15) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<초상비격>\n모든 피해감소-15\n모든 회피력-25\n모든 공격력+20\n에어어택 피해량+3%");
                    }else{
                        TextView text1=(TextView) findViewById(R.id.text1);
                        text1.setText("");
                    }
                }else if (str.equals(stone4[12])) {
                    Log.i("test", "true/false");
                    sp[3] = 12;
                    if (sp[0] == 1 && sp[1] == 1 && sp[2] == 1 && sp[3] == 1) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<하늘과 바다의 경계로>\n항해경험치+8%");
                    } else if (sp[0] == 1 && sp[1] == 2 && sp[2] == 3 && sp[3] == 4) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<바다의 포옹>\n인어의 소망3\n항해경험치+10%\n교역경험치+10%\n항해숙련도+45");
                    } else if (sp[0] == 1 && sp[1] == 1 && sp[2] == 5 && sp[3] == 4) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<선택과 집중:항해>\n항해숙련도-500\n항해경험치+35%");
                    } else if (sp[0] == 6 && sp[1] == 6 && sp[2] == 7 && sp[3] == 7) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<일격필살>\n몬스터 추가 공격력+10\n치명타 확률 증가+10%");
                    }else if (sp[0] == 8 && sp[1] == 8 && sp[2] == 9 && sp[3] == 9) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<전선 강화>\n최대생명력 +100\n몬스터 피해감소+15\n몬스터에게 받는 피해량-2%");
                    }else if (sp[0] == 9 && sp[1] == 9 && sp[2] == 9 && sp[3] == 4) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<철옹성>\n몬스터 피해감소+20\n몬스터에게 받는 피해량-3%");
                    }else if (sp[0] == 10 && sp[1] == 10 && sp[2] == 10 && sp[3] == 10) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<맹공>\n모든 공격력+9");
                    }else if (sp[0] == 10 && sp[1] == 11 && sp[2] == 12 && sp[3] == 13) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<약점 공략>\n모든 공격력+8\n모든 적중력+12\n최대지구력+75\n치명타 피해량+5%");
                    }else if (sp[0] == 10 && sp[1] == 11 && sp[2] == 12 && sp[3] == 14) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<불곰>\n몬스터 피해감소+20\n몬스터에게 받는 피해량-3%\n기절,경직,빙결 저항무시+8%");
                    }else if (sp[0] == 10 && sp[1] == 10 && sp[2] == 15 && sp[3] == 15) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<초상비격>\n모든 피해감소-15\n모든 회피력-25\n모든 공격력+20\n에어어택 피해량+3%");
                    }else{
                        TextView text1=(TextView) findViewById(R.id.text1);
                        text1.setText("");
                    }
                }else if (str.equals(stone4[13])) {
                    Log.i("test", "true/false");
                    sp[3] = 13;
                    if (sp[0] == 1 && sp[1] == 1 && sp[2] == 1 && sp[3] == 1) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<하늘과 바다의 경계로>\n항해경험치+8%");
                    } else if (sp[0] == 1 && sp[1] == 2 && sp[2] == 3 && sp[3] == 4) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<바다의 포옹>\n인어의 소망3\n항해경험치+10%\n교역경험치+10%\n항해숙련도+45");
                    } else if (sp[0] == 1 && sp[1] == 1 && sp[2] == 5 && sp[3] == 4) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<선택과 집중:항해>\n항해숙련도-500\n항해경험치+35%");
                    } else if (sp[0] == 6 && sp[1] == 6 && sp[2] == 7 && sp[3] == 7) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<일격필살>\n몬스터 추가 공격력+10\n치명타 확률 증가+10%");
                    }else if (sp[0] == 8 && sp[1] == 8 && sp[2] == 9 && sp[3] == 9) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<전선 강화>\n최대생명력 +100\n몬스터 피해감소+15\n몬스터에게 받는 피해량-2%");
                    }else if (sp[0] == 9 && sp[1] == 9 && sp[2] == 9 && sp[3] == 4) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<철옹성>\n몬스터 피해감소+20\n몬스터에게 받는 피해량-3%");
                    }else if (sp[0] == 10 && sp[1] == 10 && sp[2] == 10 && sp[3] == 10) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<맹공>\n모든 공격력+9");
                    }else if (sp[0] == 10 && sp[1] == 11 && sp[2] == 12 && sp[3] == 13) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<약점 공략>\n모든 공격력+8\n모든 적중력+12\n최대지구력+75\n치명타 피해량+5%");
                    }else if (sp[0] == 10 && sp[1] == 11 && sp[2] == 12 && sp[3] == 14) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<불곰>\n몬스터 피해감소+20\n몬스터에게 받는 피해량-3%\n기절,경직,빙결 저항무시+8%");
                    }else if (sp[0] == 10 && sp[1] == 10 && sp[2] == 15 && sp[3] == 15) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<초상비격>\n모든 피해감소-15\n모든 회피력-25\n모든 공격력+20\n에어어택 피해량+3%");
                    }else{
                        TextView text1=(TextView) findViewById(R.id.text1);
                        text1.setText("");
                    }
                }else if (str.equals(stone4[14])) {
                    Log.i("test", "true/false");
                    sp[3] = 14;
                    if (sp[0] == 1 && sp[1] == 1 && sp[2] == 1 && sp[3] == 1) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<하늘과 바다의 경계로>\n항해경험치+8%");
                    } else if (sp[0] == 1 && sp[1] == 2 && sp[2] == 3 && sp[3] == 4) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<바다의 포옹>\n인어의 소망3\n항해경험치+10%\n교역경험치+10%\n항해숙련도+45");
                    } else if (sp[0] == 1 && sp[1] == 1 && sp[2] == 5 && sp[3] == 4) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<선택과 집중:항해>\n항해숙련도-500\n항해경험치+35%");
                    } else if (sp[0] == 6 && sp[1] == 6 && sp[2] == 7 && sp[3] == 7) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<일격필살>\n몬스터 추가 공격력+10\n치명타 확률 증가+10%");
                    }else if (sp[0] == 8 && sp[1] == 8 && sp[2] == 9 && sp[3] == 9) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<전선 강화>\n최대생명력 +100\n몬스터 피해감소+15\n몬스터에게 받는 피해량-2%");
                    }else if (sp[0] == 9 && sp[1] == 9 && sp[2] == 9 && sp[3] == 4) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<철옹성>\n몬스터 피해감소+20\n몬스터에게 받는 피해량-3%");
                    }else if (sp[0] == 10 && sp[1] == 10 && sp[2] == 10 && sp[3] == 10) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<맹공>\n모든 공격력+9");
                    }else if (sp[0] == 10 && sp[1] == 11 && sp[2] == 12 && sp[3] == 13) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<약점 공략>\n모든 공격력+8\n모든 적중력+12\n최대지구력+75\n치명타 피해량+5%");
                    }else if (sp[0] == 10 && sp[1] == 11 && sp[2] == 12 && sp[3] == 14) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<불곰>\n몬스터 피해감소+20\n몬스터에게 받는 피해량-3%\n기절,경직,빙결 저항무시+8%");
                    }else if (sp[0] == 10 && sp[1] == 10 && sp[2] == 15 && sp[3] == 15) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<초상비격>\n모든 피해감소-15\n모든 회피력-25\n모든 공격력+20\n에어어택 피해량+3%");
                    }else{
                        TextView text1=(TextView) findViewById(R.id.text1);
                        text1.setText("");
                    }
                }else if (str.equals(stone4[15])) {
                    Log.i("test", "true/false");
                    sp[3] = 15;
                    if (sp[0] == 1 && sp[1] == 1 && sp[2] == 1 && sp[3] == 1) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<하늘과 바다의 경계로>\n항해경험치+8%");
                    } else if (sp[0] == 1 && sp[1] == 2 && sp[2] == 3 && sp[3] == 4) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<바다의 포옹>\n인어의 소망3\n항해경험치+10%\n교역경험치+10%\n항해숙련도+45");
                    } else if (sp[0] == 1 && sp[1] == 1 && sp[2] == 5 && sp[3] == 4) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<선택과 집중:항해>\n항해숙련도-500\n항해경험치+35%");
                    } else if (sp[0] == 6 && sp[1] == 6 && sp[2] == 7 && sp[3] == 7) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<일격필살>\n몬스터 추가 공격력+10\n치명타 확률 증가+10%");
                    }else if (sp[0] == 8 && sp[1] == 8 && sp[2] == 9 && sp[3] == 9) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<전선 강화>\n최대생명력 +100\n몬스터 피해감소+15\n몬스터에게 받는 피해량-2%");
                    }else if (sp[0] == 9 && sp[1] == 9 && sp[2] == 9 && sp[3] == 4) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<철옹성>\n몬스터 피해감소+20\n몬스터에게 받는 피해량-3%");
                    }else if (sp[0] == 10 && sp[1] == 10 && sp[2] == 10 && sp[3] == 10) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<맹공>\n모든 공격력+9");
                    }else if (sp[0] == 10 && sp[1] == 11 && sp[2] == 12 && sp[3] == 13) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<약점 공략>\n모든 공격력+8\n모든 적중력+12\n최대지구력+75\n치명타 피해량+5%");
                    }else if (sp[0] == 10 && sp[1] == 11 && sp[2] == 12 && sp[3] == 14) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<불곰>\n몬스터 피해감소+20\n몬스터에게 받는 피해량-3%\n기절,경직,빙결 저항무시+8%");
                    }else if (sp[0] == 10 && sp[1] == 10 && sp[2] == 15 && sp[3] == 15) {
                        TextView text1 = (TextView) findViewById(R.id.text1);
                        text1.setText("<초상비격>\n모든 피해감소-15\n모든 회피력-25\n모든 공격력+20\n에어어택 피해량+3%");
                    }else{
                        TextView text1=(TextView) findViewById(R.id.text1);
                        text1.setText("");
                    }
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                sp[3] = 0;
            }
        });
            Button bu1=findViewById(R.id.bu1);
            bu1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    finish();
                    Intent intent = new Intent(MainActivity.this,
                            MainActivity.class);
                    startActivity(intent);

                }
            });
    }
}