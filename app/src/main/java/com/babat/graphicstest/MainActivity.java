package com.babat.graphicstest;

import android.opengl.GLSurfaceView;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Window;


public class MainActivity extends ActionBarActivity {
    private GLSurfaceView mGLView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE);

        super.onCreate(savedInstanceState);

        mGLView = new MainGLSurfaceView(this);
        setContentView(mGLView);
    }

}
