package com.example.kian.homework_2_cs193a;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ArrayList<String> list = new ArrayList<>();
    private ArrayAdapter<String> adapter = new ArrayAdapter<String>(
            this,
            android.R.layout.simple_list_item_1,
            list
    );
    private String userChoose;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // set the list View to store the different tasks
        ListView todolist = (ListView) findViewById(R.id.todolist);
        todolist.setAdapter(adapter);

    }

    public void buttonClick(View view) {
        // Track the number taped by the user in the EditText
        EditText text = (EditText)findViewById(R.id.the_note);
        userChoose = text.getText().toString();
        adapter.add(userChoose);
        list.add(userChoose);
        adapter.notifyDataSetChanged();
    }

   // public void taskClick(View view) {
        // removing the task we clicked on.
        // list.remove(1);
        // adapter.remove();
   // }
}
