package resources;

import javax.swing.*;
import java.awt.*;

/**
 * This class is used for ...
 * @autor Esteban Andres Espinosa Aragon (espinosa.esteban@correounivalle.edu.co
 * @version v.1.0.0 date:21/03/2023
 */
public class MainMenu extends JFrame {

    private Header headerProject;

    public MainMenu(){
        initGUI();
        setIconImage(new ImageIcon(getClass().getResource("/resources/GuiFiles/Imagen1.jpg")).getImage());
        //Default JFrame configuration
        this.setTitle("I Know That Word");
        this.setSize(200,100);
        //this.pack();
        this.setResizable(true);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void initGUI() {


    }

    public static void main(String[] args){
        EventQueue.invokeLater(() -> {
            MainMenu miProjectGUI = new MainMenu();
        });
    }


    private class Escucha {

    }
}
