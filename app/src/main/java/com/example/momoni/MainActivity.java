package com.example.momoni;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.momoni.frag.Dingdanfragment;
import com.example.momoni.frag.GouWuChefragment;
import com.example.momoni.frag.Homefragment;
import com.example.momoni.frag.MyDefragment;
import com.example.momoni.frag.QuanZifragment;
import com.hjm.bottomtabbar.BottomTabBar;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {
    @BindView(R.id.buttombar)
    BottomTabBar buttombar;

    /*@BindView(R.id.add)
    Button add;
    @BindView(R.id.delete)
    Button delete;
    @BindView(R.id.update)
    Button update;
    @BindView(R.id.query)
    Button query;*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ButterKnife.bind(this);
        buttombar.init(getSupportFragmentManager())
                .isShowDivider(true)
                .setFontSize(12)
                .setTabPadding(5,5,5)
                .setChangeColor(Color.GREEN,Color.RED)
                .setImgSize(50,50)
                .addTabItem("首页",R.mipmap.homes,Homefragment.class)
                .addTabItem("圈子",R.mipmap.shops,QuanZifragment.class)
                .addTabItem("购物车",R.mipmap.gouwus,GouWuChefragment.class)
                .addTabItem("订单",R.mipmap.xiangqins,Dingdanfragment.class)
                .addTabItem("我的",R.mipmap.mys,MyDefragment.class)
                .setOnTabChangeListener(new BottomTabBar.OnTabChangeListener() {
                    @Override
                    public void onTabChange(int position, String name) {

                    }
                });

    }

    /*@OnClick({R.id.add, R.id.delete, R.id.update, R.id.query})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.add:
                UserEnvity userEnvity = new UserEnvity();
                userEnvity.setName("你赢了");
                DaoSession daoSession = DaoUtils.getIntent().getDaoSession();
                daoSession.insert(userEnvity);
                break;
            case R.id.delete:
                UserEnvityDao userEnvityDao = DaoUtils.getIntent().getDaoSession().getUserEnvityDao();
                *//*
     * 删除全部
     * *//*
               // userEnvityDao.deleteAll();
                List<UserEnvity> userEnvities = userEnvityDao.loadAll();
                for (UserEnvity userEnvity1 : userEnvities) {

                    if (2==userEnvity1.getId()) {
                        userEnvityDao.delete(userEnvity1);
                    }
                }

                    break;
            case R.id.update:
                UserEnvityDao userEnvityDao1 = DaoUtils.getIntent().getDaoSession().getUserEnvityDao();
                List<UserEnvity> userEnvities1 = userEnvityDao1.loadAll();
                for (UserEnvity envity : userEnvities1) {

                    if (1==envity.getId()) {
                        envity.setName("你厉害");
                        userEnvityDao1.update(envity);
                    }

                }
                    break;
            case R.id.query:

                UserEnvityDao query = DaoUtils.getIntent().getDaoSession().getUserEnvityDao();
                List<UserEnvity> userEnvities2 = query.loadAll();
                *//*
     * 查询全部
     * *//*
                Toast.makeText(MainActivity.this,userEnvities2+"",Toast.LENGTH_LONG).show();
                for (UserEnvity envity : userEnvities2) {

                }


                    break;
        }
    }*/
}
