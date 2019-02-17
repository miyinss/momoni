package com.example.momoni.Home.model;

import com.example.momoni.utils.RegHttpurls;

public class SouModel implements ISouModel {
    @Override
    public void getSouModel(String url, String keyword, String page, String count, final SuccessOrError successOrError) {

        RegHttpurls.doGet(url, keyword, page, count, new RegHttpurls.SuccessOrError() {
            @Override
            public void Success(Object o) {
                successOrError.Success(o);
            }

            @Override
            public void Error() {

            }
        });

    }
}
