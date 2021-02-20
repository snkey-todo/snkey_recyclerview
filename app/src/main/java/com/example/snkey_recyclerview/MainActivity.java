package com.example.snkey_recyclerview;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.snkey_recyclerview.adapter.FruitAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private List<Fruit> list;
    private FruitAdapter fruitAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initData();
        initView();
    }

    private void initView() {
        recyclerView = findViewById(R.id.recycler_view);
        fruitAdapter = new FruitAdapter();
        fruitAdapter.setList(list);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(fruitAdapter);
    }

    private void initData() {
        list = new ArrayList<>();
        Fruit fruit = null;
        for (int i = 0; i < 20; i++) {
            fruit = new Fruit(R.drawable.apple, "苹果");
            list.add(fruit);
            fruit = new Fruit(R.drawable.banana, "香蕉");
            list.add(fruit);
        }
    }
}
