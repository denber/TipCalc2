package com.example.dennis.tipcalc;

import android.app.Application;

/**
 * Created by denber on 12/06/2016.
 */
public class TipCalcApp extends Application{
    private final static String ABOUT_URL ="https://about.me/adriancatalan";

    public static String getAboutUrl(){
        return ABOUT_URL;
    }
}
