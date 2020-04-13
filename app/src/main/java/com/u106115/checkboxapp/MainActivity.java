package com.u106115.checkboxapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        }
    public void btnOK(View view){
        CheckBox chk;
        TextView txvShow;
        String msg = "";

        int[] id ={R.id.chkMina,R.id.chkMomo,R.id.chkSana,R.id.chkTzuyu};
        for (int i :id){
            chk = (CheckBox)findViewById(i);
            if (chk.isChecked())
                msg +="\n"+ chk.getText();
        }
        txvShow=findViewById(R.id.txvShow);
        txvShow.setText("我最喜歡的女歌手:\n"+msg);





    }
}
