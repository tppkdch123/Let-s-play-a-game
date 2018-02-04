package org.yellow.Object.interfaces;

import com.jogamp.opengl.GL4ES3;

public interface Drawable {
    void init(GL4ES3 gl);

    void drawSelf(GL4ES3 gl);

    void drawDepth(GL4ES3 gl);
}
