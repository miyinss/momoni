package com.example.momoni.Home.persenter;

import com.example.momoni.Home.model.ISouModel;
import com.example.momoni.Home.model.SouModel;
import com.example.momoni.HomeSouActivity;
import com.example.momoni.api.Api;
import com.example.momoni.app.App;
import com.example.momoni.frag.Homefragment;

public class SouPersenter implements ISouPersenter {

    private final SouModel souModel;

    public SouPersenter(HomeSouActivity homeSouActivity) {
        this.homeSouActivity = homeSouActivity;
        souModel = new SouModel();
    }

    HomeSouActivity homeSouActivity;

    @Override
    public void getSouPersenter(String keyword, String page, String count) {

        souModel.getSouModel(Api.SOU, keyword, page, count, new ISouModel.SuccessOrError() {
            @Override
            public void Success(Object o) {
                homeSouActivity.getSouView(o);
            }
            @Override
            public void Error() {

            }
        });


    }
}
