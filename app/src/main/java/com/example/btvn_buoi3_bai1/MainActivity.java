package com.example.btvn_buoi3_bai1;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setCustomView(R.layout.actionbar_layout);
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#FFFFFF")));

        recyclerView = findViewById(R.id.recycleview);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        ArrayList<Group> groupArrayList = new ArrayList<>();
        groupArrayList.add(new Group(R.mipmap.pdf, "Mua bán có tâm", "8K Fan", "+10 bài viết mới nhất", 1));
        groupArrayList.add(new Group(R.mipmap.one, "Ăn để lăn", "8K Fan", "+10 bài viết mới nhất", 3));
        groupArrayList.add(new Group(R.mipmap.two, "Chia sẻ kiến thức tài liệu Montessori", "1,7K Fan", "+10 bài viết mới nhất", 2));
        groupArrayList.add(new Group(R.mipmap.three, "Thực đơn Eat-Clean giảm cân khỏe đẹp", "11K Fan", "20 bài viết mới nhất", 2));
        groupArrayList.add(new Group(R.mipmap.four, "Easy Kento for busy People", "8K Fan", "+10 bài viết mới nhất", 3));
        groupArrayList.add(new Group(R.mipmap.five, "OFFB", "8K Fan", "+10 bài viết mới nhất", 2));
        groupArrayList.add(new Group(R.mipmap.six, "Thực đơn Eat-Clean giảm cân khỏe đẹp", "11K Fan", "20 bài viết mới nhất", 2));
        groupArrayList.add(new Group(R.mipmap.seven, "Easy Kento for busy People", "8K Fan", "+10 bài viết mới nhất", 3));

        GroupAdapter adapter = new GroupAdapter(groupArrayList, this);
        recyclerView.setAdapter(adapter);

    }
}