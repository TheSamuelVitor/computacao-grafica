package com.mycompany.geometrics;

import javax.media.opengl.GL2;
import javax.media.opengl.GLAutoDrawable;
import javax.media.opengl.GLCapabilities;
import javax.media.opengl.GLEventListener;
import javax.media.opengl.GLProfile;
import javax.media.opengl.awt.GLCanvas;
import javax.swing.JFrame;

public class Quadrado implements GLEventListener {

  public static void main(String[] args) {
    final GLProfile gp = GLProfile.get(GLProfile.GL2);
    GLCapabilities cap = new GLCapabilities(gp);

    final GLCanvas gc = new GLCanvas(cap);
    Quadrado b1 = new Quadrado();
    gc.addGLEventListener(b1);
    gc.setSize(500, 400);

    final JFrame frame = new JFrame();
    frame.add(gc);
    frame.setSize(500, 400);
    frame.setVisible(true);
  }

  @Override
  public void init(GLAutoDrawable glad) {
  }

  @Override
  public void dispose(GLAutoDrawable glad) {
  }

  @Override
  public void display(GLAutoDrawable drawable) {

    GL2 gl = drawable.getGL().getGL2();
    gl.glBegin(GL2.GL_LINES);


    // -------------
    // QUADRADO CASA
    // -------------
    gl.glVertex2d(0, 0);
    gl.glVertex2d(0, 0.4);

    gl.glVertex2d(0, 0);
    gl.glVertex2d(0.4, 0);

    gl.glVertex2d(0, 0.4);
    gl.glVertex2d(0.4, 0.4);

    gl.glVertex2d(0.4, 0.4);
    gl.glVertex2d(0.4, 0);

    // -------------
    // QUADRADO PORTA
    // -------------
    gl.glVertex2d(0.15, 0);
    gl.glVertex2d(0.15, 0.2);

    gl.glVertex2d(0.15, 0.2);
    gl.glVertex2d(0.3, 0.2);

    gl.glVertex2d(0.3, 0.2);
    gl.glVertex2d(0.3, 0);

    gl.glVertex2d(0.3, 0);
    gl.glVertex2d(0.15, 0);

    // -------------
    //   TRIANGULO
    // -------------
    gl.glVertex2d(0, 0.4);
    gl.glVertex2d(0.2, 0.6);

    gl.glVertex2d(0.2, 0.6);
    gl.glVertex2d(0.4, 0.4);

    gl.glEnd();
  }

  @Override
  public void reshape(GLAutoDrawable glad, int i, int i1, int i2, int i3) {
  }

}
