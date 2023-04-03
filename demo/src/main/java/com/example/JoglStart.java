package com.example;

import javax.media.opengl.GLCapabilities;
import javax.media.opengl.GLProfile;
import javax.media.opengl.awt.GLCanvas;
import javax.swing.JFrame;

public class JoglStart {

  public static void main(String[] args) {
    GLProfile gp = GLProfile.get(GLProfile.GL2);
    GLCapabilities cap = new GLCapabilities(gp);
    GLCanvas gc = new GLCanvas(cap);
    JoglFrames jf = new JoglFrames();
    gc.addGLEventListener(jf);
    gc.setSize(350, 350);
    JFrame frame = new JFrame("JOGL Linha");
    frame.add(gc);
    frame.setSize(500, 400);
    frame.setVisible(true);
  }

}
