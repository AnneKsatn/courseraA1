package com.example.anna.mytask;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class InputActivity extends AppCompatActivity {

    private EditText mInputText;
    private Button mShowText;

    private View.OnClickListener mOnShowTextClickListner = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            if (!TextUtils.isEmpty(mInputText.getText())) {
                showMessage(mInputText.getText().toString());
                Intent startSecindIntent =
                        new Intent(InputActivity.this, FindActivity.class);
                startSecindIntent.putExtra(FindActivity.NEW_TEXT, mInputText.getText().toString());
                startActivity(startSecindIntent);
            } else{

            }
        }

    };

    private void showMessage(String massage){
        Toast.makeText(this,massage,Toast.LENGTH_LONG).show();
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ac_input);

        mInputText =findViewById(R.id.etInputText);
        mShowText =findViewById(R.id.mShowText);
        mShowText.setOnClickListener(mOnShowTextClickListner);

    }
}
