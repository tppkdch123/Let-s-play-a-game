package org.yellow.Controller;

import com.jogamp.opengl.GLAutoDrawable;
import com.jogamp.opengl.GLCapabilities;
import com.jogamp.opengl.GLEventListener;
import com.jogamp.opengl.GLProfile;
import com.jogamp.opengl.awt.GLCanvas;

import javax.swing.*;

public class testGl extends JFrame implements GLEventListener {

    @Override
    public void init(GLAutoDrawable glAutoDrawable) {

    }
    @Override
    public void dispose(GLAutoDrawable glAutoDrawable) {

    }

    @Override
    public void display(GLAutoDrawable glAutoDrawable) {

    }

    @Override
    public void reshape(GLAutoDrawable glAutoDrawable, int i, int i1, int i2, int i3) {

    }
    public static void main(String[] args){
        GLProfile glProfile=GLProfile.get(GLProfile.GL4ES3);
        GLCapabilities capabilities=new GLCapabilities(glProfile);
        GLCanvas glCanvas=new GLCanvas(capabilities);
        glCanvas.setSize(800,400);
        glCanvas.addGLEventListener(new testGl());
        JFrame jFrame=new JFrame("黄世哲");
        jFrame.getContentPane().add(glCanvas);
        jFrame.setSize(jFrame.getContentPane().getPreferredSize());
        jFrame.setVisible(true);
    }
}
