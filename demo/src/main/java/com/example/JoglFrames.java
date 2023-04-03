package com.example;

import javax.media.opengl.GL2;
import javax.media.opengl.GLAutoDrawable;
import javax.media.opengl.GLEventListener;

public class JoglFrames implements GLEventListener {

  @Override
  public void init(GLAutoDrawable glad) {}

  @Override
  public void dispose(GLAutoDrawable glad) {}

  @Override
  public void display(GLAutoDrawable drawable) {
    final GL2 gl = drawable.getGL().getGL2();
    gl.glBegin(4);
    gl.glVertex2d(0, 0);
    gl.glVertex2d(0, 0.2);
    gl.glEnd();
  }

  @Override
  public void reshape(GLAutoDrawable glad, int i, int i1, int i2, int i3) {}

}
