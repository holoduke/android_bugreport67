package com.example.gillis.myapplication;

import android.content.Context;
import android.support.v7.widget.SearchView;
import android.util.AttributeSet;

/**
 * Created by gillis on 05/10/2017.
 */

public class SearchViewCustom extends SearchView {

    private MainActivity ac;

    public SearchViewCustom(Context context){
        super(context);
    }

    public SearchViewCustom(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public void setActivity(MainActivity ac){
        this.ac = ac;
    }
}
