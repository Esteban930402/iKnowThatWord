package resources;

import javax.swing.*;

public class inGame extends JFrame {

    public inGame(){
        initInGame();
        setIconImage(new ImageIcon(getClass().getResource("/resources/GuiFiles/Imagen1.jpg")).getImage());
        //Default JFrame configuration
        this.setTitle("I Know That Word");
        this.setSize(200, 100);
        //this.pack();
        this.setResizable(true);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void initInGame() {

    }
}
