/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.joglstart;

import javax.media.opengl.GL2;
import javax.media.opengl.GLAutoDrawable;
import javax.media.opengl.GLEventListener;

/**
 *
 * @author samuel
 */
public class JoglFrames implements GLEventListener {

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

        // primeiro valor = posicao vertical
        // segundo valor = posicao horizontal

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

        gl.glEnd();
    }

    @Override
    public void reshape(GLAutoDrawable glad, int i, int i1, int i2, int i3) {
    }

}
