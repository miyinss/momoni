package com.example.momoni.Home.adapter;

import android.content.Context;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.momoni.R;
import com.example.momoni.bean.SouBean;
import com.facebook.drawee.view.SimpleDraweeView;

public class SouAdapter extends RecyclerView.Adapter<SouAdapter.SouViewHolder> {
    public Context context;
    public SouBean souBean;
    public SouAdapter(Context context, SouBean souBean) {
        this.context = context;
        this.souBean = souBean;
    }



    @NonNull
    @Override
    public SouViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View inflate = View.inflate(context, R.layout.soutext, null);
        SouViewHolder souViewHolder = new SouViewHolder(inflate);
        return souViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull SouViewHolder souViewHolder, int i) {

        souViewHolder.tex1.setText(souBean.result.get(i).commodityName);
        souViewHolder.tex2.setText(souBean.result.get(i).price);
       /* Uri uri = Uri.parse("图片地址");
        SimpleDraweeView draweeView = (SimpleDraweeView) findViewById(R.id.my_image_view);
        draweeView.setImageURI(uri);*/
        Uri parse = Uri.parse(souBean.result.get(i).masterPic);
        souViewHolder.imageView.setImageURI(parse);
    }

    @Override
    public int getItemCount() {
        return souBean.result.size();
    }

    public class SouViewHolder extends RecyclerView.ViewHolder {

        SimpleDraweeView imageView;
        TextView tex1;
        TextView tex2;

        public SouViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView=itemView.findViewById(R.id.ims);
            tex1 = itemView.findViewById(R.id.tex1);
            tex2 = itemView.findViewById(R.id.tex2);

        }
    }
}
