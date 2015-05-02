package com.babat.graphicstest;

import android.content.Context;
import android.opengl.GLSurfaceView;

/**
 * Created by Azad on 30/04/2015.
 */
class MainGLSurfaceView extends GLSurfaceView {

    private final MainGLRenderer mRenderer;

    public MainGLSurfaceView(Context context){
        super(context);

        setEGLContextClientVersion(2);

        mRenderer = new MainGLRenderer(this.getContext());
        setRenderer(mRenderer);
    }
}