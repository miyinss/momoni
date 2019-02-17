package com.example.momoni.Home.model;

public interface ISouModel {

    void getSouModel(String url,String keyword,String page,String count,SuccessOrError successOrError);
   public interface SuccessOrError{
       void Success(Object o);
       void Error();
   }

}
