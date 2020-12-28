package com.dao.demo_greendao;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.dao.demo_greendao.application.MyApplication;
import com.dao.demo_greendao.dao.DemoBean;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ArrayList<DemoBean> list=new ArrayList<DemoBean>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        Button btn_inster = findViewById(R.id.btn_inster);
        Button btn_inster_list = findViewById(R.id.btn_inster_list);
        Button btn_query = findViewById(R.id.btn_query);
        Button btn_delet = findViewById(R.id.btn_delet);
        btn_query.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DemoBean demoBean = new DemoBean();
                List<DemoBean> query = MyApplication.getDaoUtilsManager().query(MainActivity.this,"朱q9");
                for (int i = 0; i < query.size(); i++) {
                    query.get(i).getName();
                    Toast.makeText(MainActivity.this,"query.get(i).getName()"+query.get(i).getName(),Toast.LENGTH_SHORT).show();
                }

            }
        });
        btn_inster_list.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DemoBean demoBean = new DemoBean();
                for (int i = 0; i < 10; i++) {
                    demoBean.setName("朱q"+i);
                    demoBean.setAccunout("zhuq"+i);
                    demoBean.setPassword("0q"+i);
                    demoBean.setAge("1q"+i);

            }
                list.add(demoBean);
                MyApplication.getDaoUtilsManager().insertList(MainActivity.this,list);
                }
        });
        btn_inster.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DemoBean demoBean = new DemoBean();
                for (int i = 0; i < 1; i++) {
                    demoBean.setName("朱"+i);
                    demoBean.setAccunout("zhu"+i);
                    demoBean.setPassword("0"+i);
                    demoBean.setAge("1"+i);

                }
                MyApplication.getDaoUtilsManager().insert(MainActivity.this,demoBean);
            }
        });
        btn_delet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DemoBean demoBean = new DemoBean();
                Boolean type = MyApplication.getDaoUtilsManager().delete(MainActivity.this,"朱q9");
                if (type){
                    Toast.makeText(MainActivity.this,"delet成功",Toast.LENGTH_SHORT).show();
                }else {

                    Toast.makeText(MainActivity.this,"delet失败",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
