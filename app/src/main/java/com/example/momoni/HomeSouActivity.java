package com.example.momoni;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.OrientationHelper;
import android.util.Log;
import android.widget.Toast;

import com.example.momoni.Home.adapter.SouAdapter;
import com.example.momoni.Home.persenter.SouPersenter;
import com.example.momoni.Home.view.ISouView;
import com.example.momoni.bean.SouBean;
import com.jcodecraeer.xrecyclerview.XRecyclerView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class HomeSouActivity extends AppCompatActivity implements ISouView {

    @BindView(R.id.xrec)
    XRecyclerView xrec;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_sou);
        ButterKnife.bind(this);

        Intent intent = getIntent();
        String soumame = intent.getStringExtra("souname");
        Log.i("输入的", "sdasdas===" + soumame);
        SouPersenter souPersenter = new SouPersenter(this);
        souPersenter.getSouPersenter(soumame, "1", "10");

        GridLayoutManager gridLayoutManager = new GridLayoutManager(HomeSouActivity.this, 2);
        gridLayoutManager.setOrientation(OrientationHelper.VERTICAL);
        xrec.setLayoutManager(gridLayoutManager);

    }

    @Override
    public void getSouView(Object os) {
        SouBean os1 = (SouBean) os;
        if (os1.result.size()>1) {
            Toast.makeText(HomeSouActivity.this, "查询成功", Toast.LENGTH_LONG).show();
            SouAdapter souAdapter = new SouAdapter(HomeSouActivity.this, os1);
            xrec.setAdapter(souAdapter);
        } else {
            Toast.makeText(HomeSouActivity.this, "暂时没有此商品", Toast.LENGTH_LONG).show();
            return;
        }

    }
}
