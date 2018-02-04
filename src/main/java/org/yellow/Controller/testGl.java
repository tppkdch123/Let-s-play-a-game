package org.yellow.Controller;

import com.jogamp.opengl.*;
import com.jogamp.opengl.awt.GLCanvas;
import com.jogamp.opengl.math.Matrix4;

import javax.swing.*;

public class testGl extends JFrame implements GLEventListener {
  private Matrix4 Model;
  private Matrix4 View;

    @Override
    public void init(GLAutoDrawable glAutoDrawable) {
        GL4ES3 gl =  glAutoDrawable.getGL().getGL4ES3();
        gl.glEnable(GL.GL_TEXTURE_CUBE_MAP);
        gl.glClearColor(0, 1f, 1f, 0.5f);
        gl.glEnable(GL4.GL_CULL_FACE);
        gl.glCullFace(GL4.GL_BACK);
        gl.glFrontFace(GL4.GL_CCW);
        System.out.println("renderer:" + gl.glGetString(GL.GL_RENDERER));
        System.out.println("vendor:" + gl.glGetString(GL.GL_VENDOR));
        System.out.println("version:" + gl.glGetString(GL.GL_VERSION));
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

    public static void main(String[] args) {
        GLProfile glProfile = GLProfile.get(GLProfile.GL4ES3);
        GLCapabilities capabilities = new GLCapabilities(glProfile);
        GLCanvas glCanvas = new GLCanvas(capabilities);
        glCanvas.setSize(800, 400);
        glCanvas.addGLEventListener(new testGl());
        JFrame jFrame = new JFrame("黄世哲");
        jFrame.getContentPane().add(glCanvas);
        jFrame.setSize(jFrame.getContentPane().getPreferredSize());
        jFrame.setVisible(true);
    }
}
