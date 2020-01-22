/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cambiarlook;

import com.jtattoo.plaf.bernstein.BernsteinLookAndFeel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author PCMATIXA
 */
public class CambiarLook {
 
    public static void main(String[] args) throws UnsupportedLookAndFeelException {
        UIManager.setLookAndFeel(new BernsteinLookAndFeel());
        new Index().setVisible(true);
    }        
}
