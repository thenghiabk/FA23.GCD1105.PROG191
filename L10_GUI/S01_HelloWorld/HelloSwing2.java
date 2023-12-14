/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package L10_GUI.S01_HelloWorld;

import java.awt.HeadlessException;
import javax.swing.JFrame;

/**
 *
 * @author NGHIA NGUYEN
 */
public class HelloSwing2 extends JFrame {
    public HelloSwing2() throws HeadlessException{
        setTitle("Hello Swing 2");
        setSize(500,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}

