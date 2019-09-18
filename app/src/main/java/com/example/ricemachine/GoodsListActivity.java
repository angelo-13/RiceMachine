package com.example.ricemachine;

import android.os.Bundle;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.ricemachine.Adapter.GoodsAdapter;
import com.example.ricemachine.Base.BaseActivity;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GoodsListActivity extends BaseActivity {

    //商品数据，待改
    private  Goods[] goods = {
            new Goods("矿泉水",R.drawable.u361),
            new Goods("加多宝",R.drawable.u361),
            new Goods("百事",R.drawable.u361),
            new Goods("健力宝",R.drawable.u361),
            new Goods("可口可乐",R.drawable.u361),
            new Goods("水水水水水",R.drawable.u361),
            new Goods("好饮",R.drawable.u361),
            new Goods("好好饮",R.drawable.u361),
            new Goods("超级好饮",R.drawable.u361)};

    private List<Goods> goodsList = new ArrayList<>();

    private GoodsAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_goods_list);
        initGoods();
        RecyclerView recyclerView = findViewById(R.id.recycler_view);

        //改动排列方式，一行多少个，竖排横排
        GridLayoutManager layoutManager = new GridLayoutManager(this,3);
        recyclerView.setLayoutManager(layoutManager);

        adapter = new GoodsAdapter(goodsList);
        recyclerView.setAdapter(adapter);
    }

    private void initGoods(){
        goodsList.clear();
        for (int i = 0; i<50 ; i++){
            Random random = new Random();
            int index = random.nextInt(goods.length);
            goodsList.add(goods[index]);
        }
    }
}
