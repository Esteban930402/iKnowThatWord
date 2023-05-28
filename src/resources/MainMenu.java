package resources;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;

/**
 * This class is used for ...
 * @autor Esteban Andres Espinosa Aragon (espinosa.esteban@correounivalle.edu.co
 * @version v.1.0.0 date:21/03/2023
 */
public class MainMenu extends JFrame {

    private Header headerProject;
    private JButton initGame,rules;

    private JPanel principalPanel;
    private JTextField playerUsername;

    private Escucha escucha;

    public MainMenu(){
        initGUI();
        setIconImage(new ImageIcon(getClass().getResource("/resources/GuiFiles/Imagen1.jpg")).getImage());
        //Default JFrame configuration
        this.setLayout(new BorderLayout());
        this.setTitle("I Know That Word");
        this.setSize(1020,720);
        this.setResizable(true);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void initGUI() {
        ImagePanel backgroundImage = new ImagePanel("/resources/GuiFiles/mainMenuBackground.jpg");
        backgroundImage.setLayout(new BorderLayout());

        escucha = new Escucha();

        playerUsername = new JTextField(null,20);
        playerUsername.setHorizontalAlignment(JTextField.CENTER);

        principalPanel = new JPanel();

        initGame = new JButton("Iniciar Juego");
        initGame.addActionListener(escucha);

        rules = new JButton("Reglas");
        rules.addActionListener(escucha);

        principalPanel.add(playerUsername);
        principalPanel.add(initGame);
        principalPanel.add(rules);

        backgroundImage.add(principalPanel,BorderLayout.CENTER);


        this.add(backgroundImage);
        pack();
        setLocationRelativeTo(null);



    }

    public static void main(String[] args){
        EventQueue.invokeLater(() -> {
            MainMenu miProjectGUI = new MainMenu();
        });
    }


    private class Escucha implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

        }
    }
}
