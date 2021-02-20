package com.example.snkey_recyclerview.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.snkey_recyclerview.Fruit;
import com.example.snkey_recyclerview.R;

import java.util.List;

/**
 * <p>
 *
 * </p>
 *
 * @author ZhuSheng
 * @since 2/3/21 6:54 PM
 */
public class FruitAdapter extends RecyclerView.Adapter<FruitAdapter.MyViewHolder> {
    List<Fruit> list;

    public FruitAdapter() {
    }

    /**
     * 构造器给适配器传递数据
     *
     * @param list
     */


    public FruitAdapter(List<Fruit> list) {
        this.list = list;
    }

    public void setList(List<Fruit> list){
        this.list = list;
        notifyDataSetChanged();

    }

    /**
     * 初始化布局
     *
     * @param parent
     * @param viewType
     * @return
     */
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.fruit_item, parent, false);

        return new MyViewHolder(view);
    }

    /**
     * 绑定每个item的数据
     *
     * @param holder
     * @param position
     */
    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.fruit_img.setImageResource(list.get(position).getImageId());
        holder.fruit_name.setText(list.get(position).getName());
    }

    /**
     * 返回列表大小
     *
     * @return
     */
    @Override
    public int getItemCount() {
        return list == null ? 0 : list.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder {
        private ImageView fruit_img;
        private TextView fruit_name;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            fruit_img = itemView.findViewById(R.id.fruit_img);
            fruit_name = itemView.findViewById(R.id.fruit_name);
        }
    }
}
