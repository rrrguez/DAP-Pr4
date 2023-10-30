import java.awt.Component;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.imageio.plugins.jpeg.JPEGImageReadParam;
import javax.swing.*;

import ecosistems.*;
import animals.*;
import animals.fox.DesertFox;


public class Main {
    // Declaración de la ventana
    static JFrame frame = new JFrame("DAP - Práctica 4: Factorías");

    // Declaración de los paneles
    static JPanel ecoPanel = new JPanel();
    static JPanel animalPanel = new JPanel();
    static JPanel imagePanel = new JPanel();

    // Declaración de los botones de ecosistema
    static JButton desertButton = new JButton("Desierto");
    static JButton forestButton = new JButton("Bosque");
    static JButton jungleButton = new JButton("Selva");
    static JButton mountainButton = new JButton("Montaña");
    static JButton savannaButton = new JButton("Savana");
    static  JButton tundraButton = new JButton("Tundra");

    // Declaración de los botones de animales
    static JButton bearButton = new JButton("Oso");
    static JButton crocodileButton = new JButton("Cocodrilo");
    static JButton eagleButton = new JButton("Eagle");
    static JButton foxButton = new JButton("Zorro");
    static JButton lionButton = new JButton("León");

    // Declaración de fábrica de ecosistemas y del animal a mostrar
    static EcosystemFactory factory = null;
    static Animal animal = null;

    public Main() {
        // Frame configuration
        frame.setSize(900, 800);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame.setLayout((LayoutManager) new FlowLayout());

        // Eco panel configuration
        ecoPanel.add(desertButton);
        ecoPanel.add(forestButton);
        ecoPanel.add(jungleButton);
        ecoPanel.add(mountainButton);
        ecoPanel.add(savannaButton);
        ecoPanel.add(tundraButton);

        frame.add(ecoPanel);

        // Action listeners
        desertButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                factory = new DesertFactory();

                Animal[] desert_animals = factory.createEcosystem();

                BufferedImage bufferedImage = null;

                for (int i = 0; i < desert_animals.length; ++i) {
                  try {
                    bufferedImage = ImageIO.read(desert_animals[i].showPicture());
                  } catch (IOException e1) {
                    e1.printStackTrace();
                  }
                  ImageIcon imageIcon = new ImageIcon(bufferedImage);

                  JLabel jLabel = new JLabel();

                  jLabel.setIcon(imageIcon);
                  imagePanel.add(jLabel);
                }
            }
          });
        frame.setVisible(true);
    };

    public static void main(String[] args) {
      SwingUtilities.invokeLater(() -> new Main());
    }
}
