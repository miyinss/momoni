package com.example.momoni.frag;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;

import com.example.momoni.Home.persenter.SouPersenter;
import com.example.momoni.Home.view.ISouView;
import com.example.momoni.HomeSouActivity;
import com.example.momoni.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;

public class Homefragment extends Fragment {

    @BindView(R.id.img1)
    ImageView img1;
    @BindView(R.id.sou)
    EditText sou;
    @BindView(R.id.img2)
    ImageView img2;
    Unbinder unbinder;
    private View view;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.homefrag, container, false);
        unbinder = ButterKnife.bind(this, view);
        return view;

    }
    @OnClick({R.id.img1, R.id.img2})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.img1:
                break;
            case R.id.img2:
                String s = sou.getText().toString();
                if (!s.equals("")) {
                    Intent intent = new Intent(getActivity(), HomeSouActivity.class);
                    intent.putExtra("souname",s);
                    startActivity(intent);
                }

                break;
        }
    }
    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }
}
