package com.example.helpik2;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        List<Item> data = new ArrayList<>();
        data.add(new Item("Котик 1", R.drawable.f1, "Просто котик мемный"));
        data.add(new Item("Котик 2", R.drawable.f2, "Я со спорным баллом, когда препод просит заткнуться"));


        MyAdapter adapter = new MyAdapter(data, this);
        recyclerView.setAdapter(adapter);
    }
}