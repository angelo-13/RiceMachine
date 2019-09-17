package com.example.ricemachine.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.ricemachine.Goods;
import com.example.ricemachine.R;

import java.util.List;

public class GoodsAdapter extends RecyclerView.Adapter<GoodsAdapter.ViewHolder> {

    private Context mContext;
    private List<Goods> mGoodsList;

    static class ViewHolder extends RecyclerView.ViewHolder{
        CardView cardView;
        ImageView goodsImage;
        TextView goodsName;

        public ViewHolder(View view){
            super(view);
            cardView = (CardView) view;
            goodsImage = view.findViewById(R.id.goods_image);
            goodsName = view.findViewById(R.id.goods_name);
        }
    }

    public GoodsAdapter(List<Goods> goodsList){
        mGoodsList = goodsList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent,int viewType){
        if (mContext == null){
            mContext = parent.getContext();
        }
        View view = LayoutInflater.from(mContext).inflate(R.layout.goods_item , parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position){
        Goods goods = mGoodsList.get(position);
        holder.goodsName.setText(goods.getName());
        Glide.with(mContext).load(goods.getImageId()).into(holder.goodsImage);
    }

    @Override
    public int getItemCount(){
        return mGoodsList.size();
    }
}
