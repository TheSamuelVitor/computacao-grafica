package com.mycompany.projetocg;

import javax.swing.JFrame;
import javax.media.opengl.GL2;
import java.awt.event.WindowAdapter;
import javax.media.opengl.GLProfile;

import javax.media.opengl.awt.GLCanvas;
import javax.media.opengl.GLCapabilities;
import com.jogamp.newt.event.WindowEvent;

import javax.media.opengl.GLAutoDrawable;
import javax.media.opengl.GLEventListener;

public class Cubo implements GLEventListener {
  private GLCanvas canvas;

  public static void main(String[] args) {
    JFrame frame = new JFrame("Penrose Triangle");
    GLProfile glProfile = GLProfile.get(GLProfile.GL2);
    GLCapabilities glCapabilities = new GLCapabilities(glProfile);
    GLCanvas canvas = new GLCanvas(glCapabilities);
    Cubo penrose = new Cubo();
    canvas.addGLEventListener(penrose);
    frame.add(canvas);
    frame.setSize(400, 400);
    frame.setVisible(true);
    frame.addWindowListener(new WindowAdapter() {
      public void windowClosing(WindowEvent e) {
        System.exit(0);
      }
    });
  }

  public void PenroseTriangle(GLCanvas canvas) {
    this.canvas = canvas;
  }

  @Override
  public void init(GLAutoDrawable drawable) {
    GL2 gl = drawable.getGL().getGL2();
    gl.glClearColor(1.0f, 1.0f, 1.0f, 0.0f);
  }

  @Override
  public void display(GLAutoDrawable drawable) {
    GL2 gl = drawable.getGL().getGL2();
    gl.glClear(GL2.GL_COLOR_BUFFER_BIT);

    // Desenha o primeiro triângulo
    gl.glBegin(GL2.GL_TRIANGLES);
    gl.glVertex2f(-0.7f, -0.7f);
    gl.glVertex2f(0.7f, -0.7f);
    gl.glVertex2f(0.0f, 0.7f);
    gl.glEnd();

    // Desenha o segundo triângulo
    gl.glColor3f(0.0f, 0.0f, 1.0f);
    gl.glBegin(GL2.GL_TRIANGLES);
    gl.glVertex2f(-0.7f, 0.7f);
    gl.glVertex2f(0.7f, 0.7f);
    gl.glVertex2f(0.0f, -0.7f);
    gl.glEnd();
  }

  @Override
  public void reshape(GLAutoDrawable drawable, int x, int y, int width, int height) {
    GL2 gl = drawable.getGL().getGL2();
    gl.glViewport(0, 0, width, height);
    gl.glMatrixMode(GL2.GL_PROJECTION);
    gl.glLoadIdentity();
    gl.glOrtho(-1.0, 1.0, -1.0, 1.0, -1.0, 1.0);
    gl.glMatrixMode(GL2.GL_MODELVIEW);
    gl.glLoadIdentity();
  }

  @Override
  public void dispose(GLAutoDrawable drawable) {
  }
}
