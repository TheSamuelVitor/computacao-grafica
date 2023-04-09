package com.mycompany.desenhos3d;

import javax.media.opengl.GL;
import javax.media.opengl.GL2;
import javax.media.opengl.GLAutoDrawable;
import javax.media.opengl.GLCapabilities;
import javax.media.opengl.GLEventListener;
import javax.media.opengl.GLProfile;
import javax.media.opengl.awt.GLCanvas;
import javax.swing.JFrame;


public class Predefinidos implements GLEventListener {
  
  public static void main(String[] args) {
    final GLProfile gp = GLProfile.get(GLProfile.GL2);
    GLCapabilities cap = new GLCapabilities(gp);

    final GLCanvas gc = new GLCanvas(cap);
    Predefinidos b1 = new Predefinidos();
    gc.addGLEventListener(b1);
    gc.setSize(400, 400);

    final JFrame frame = new JFrame("JOGL Line");
    frame.add(gc);
    frame.setSize(500,400);
    frame.setVisible(true);
  }

  @Override
  public void display(GLAutoDrawable drawable) {
    GL2 gl = drawable.getGL().getGL2();
    gl.glBegin(GL2.GL_LINE_LOOP);
    gl.glVertex3f(-0.50f, -0.75f, 0);
    gl.glVertex3f(0.7f, 0.5f, 0);
    gl.glVertex3f(0.70f, -0.70f, 0);
    gl.glVertex3f(0f, 0.5f, 0);
    gl.glEnd();
  }

  @Override
  public void dispose(GLAutoDrawable arg0) {
  }

  @Override
  public void init(GLAutoDrawable arg0) {
  }

  @Override
  public void reshape(GLAutoDrawable arg0, int arg1, int arg2, int arg3, int arg4) {
  }

}
