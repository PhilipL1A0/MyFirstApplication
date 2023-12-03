package com.jnu.student.myfirstapplication.views;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.jnu.student.myfirstapplication.R;

public class AddBookActivity extends AppCompatActivity {

    private EditText et_name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_book);

        et_name = findViewById(R.id.et_input);
        findViewById(R.id.btn_add).setOnClickListener(v -> {
            String name = et_name.getText().toString();
            if (name.equals("")) {
                Toast.makeText(this, "请输入书名！", Toast.LENGTH_SHORT).show();
                return;
            }
            Intent intent = new Intent();
            intent.putExtra("name", name);
            setResult(Activity.RESULT_OK, intent);
            finish();
        });
    }
}
