/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projetocg;

import javax.media.opengl.GLCapabilities;
import javax.media.opengl.GLProfile;
import javax.media.opengl.awt.GLCanvas;
import javax.swing.JFrame;

/**
 *
 * @author samuel
 */
public class ProjetoCG {

    public static void main(String[] args) {
        GLProfile gp = GLProfile.get(GLProfile.GL2);
        GLCapabilities cap = new GLCapabilities(gp);
        GLCanvas gc = new GLCanvas(cap);

        Cubo cubo = new Cubo();
        gc.addGLEventListener(cubo);

        gc.setSize(350,350);
        JFrame frame = new JFrame("Trabalho Computacao Grafica");
        frame.add(gc);
        frame.setSize(500,400);
        frame.setVisible(true);
    }
}
