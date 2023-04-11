package com.mycompany.projetocg;

import javax.media.opengl.GL2;
import javax.media.opengl.GLAutoDrawable;
import javax.media.opengl.GLEventListener;

public class Cubo implements GLEventListener {

  @Override
  public void init(GLAutoDrawable glad) {
  }

  @Override
  public void dispose(GLAutoDrawable glad) {
  }

  @Override
  public void display(GLAutoDrawable drawable) {

    final GL2 gl = drawable.getGL().getGL2();
    gl.glBegin(GL2.GL_LINES);

    // QUADRADO 1

    // linha vertical esquerda
    gl.glVertex2d(0, 0);
    gl.glVertex2d(0, 0.4);

    // linha vertical direita
    gl.glVertex2d(0.4, 0);
    gl.glVertex2d(0.4, 0.4);

    // linha horizontal superior
    gl.glVertex2d(0, 0.4);
    gl.glVertex2d(0.4, 0.4);

    // linha horizontal inferior
    gl.glVertex2d(0, 0);
    gl.glVertex2d(0.4, 0);

    // QUADRADO 2

    // linha vertical esquerda
    gl.glVertex2d(0.2, 0.2);
    gl.glVertex2d(0.2, 0.6);

    // linha vertical direita
    gl.glVertex2d(0.6, 0.2);
    gl.glVertex2d(0.6, 0.6);

    // linha horizontal superior
    gl.glVertex2d(0.2, 0.6);
    gl.glVertex2d(0.6, 0.6);

    // linha horizontal inferior
    gl.glVertex2d(0.2, 0.2);
    gl.glVertex2d(0.6, 0.2);

    // DIAGONAIS
    
    // linha vertical esquerda
    gl.glVertex2d(0.4, 0.4);
    gl.glVertex2d(0.6, 0.6);

    // linha vertical direita
    gl.glVertex2d(0.6, 0.2);
    gl.glVertex2d(0.4, 0);

    // linha horizontal superior
    gl.glVertex2d(0.2, 0.2);
    gl.glVertex2d(0, 0);

    // linha horizontal inferior
    gl.glVertex2d(0, 0.4);
    gl.glVertex2d(0.2, 0.6);

    gl.glEnd();

  }

  @Override
  public void reshape(GLAutoDrawable glad, int i, int i1, int i2, int i3) {
  }

}
