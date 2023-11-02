import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

import ecosistems.*;
import animals.*;

//
public class Main extends JFrame implements ActionListener{

    // Declaración VARIABLES

    // Declaración de los botones de ecosistema
    // En función del botón que seleccione el usuario, se mostrarán unos animales u otros
    private JButton desertButton = new JButton("Desierto");
    private JButton forestButton = new JButton("Bosque");
    private JButton jungleButton = new JButton("Selva");
    private JButton mountainButton = new JButton("Montaña");
    private JButton savannaButton = new JButton("Savana");
    private JButton tundraButton = new JButton("Tundra");

    //Declaracion de los botones Animales
    private ArrayList<JButton> btnAnimals = new ArrayList<>();

    // Declaración de fábrica de ecosistemas y del animal a mostrar
    private EcosystemFactory factory = null;
    private Animal[] animal = null;

    private JLabel labelImagen;


    public Main() {
        // Configurar la ventana principal
        super("Ventana Principal");
        setSize(300, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        setLocationRelativeTo(null);
        Image iconImage = Toolkit.getDefaultToolkit().getImage("DAP-Pr4-master/src/images/icono.jpeg");
        setIconImage(iconImage);


        // Configuración del panel de los botones de ecosistema
        desertButton.addActionListener(this);
        forestButton.addActionListener(this);
        jungleButton.addActionListener(this);
        mountainButton.addActionListener(this);
        savannaButton.addActionListener(this);
        tundraButton.addActionListener(this);


        // Configurar el panel de botones en dos columnas
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new BorderLayout());

        // Agregar margen (espacio) encima de los botones
        int topMargin = 20; // Puedes ajustar este valor según tus necesidades
        buttonPanel.setBorder(new EmptyBorder(topMargin, 0, 0, 0));

        // Configurar un panel para los botones en el centro
        JPanel buttonCenterPanel = new JPanel();
        buttonCenterPanel.setLayout(new GridLayout(0, 2, 20,20)); // 0 filas y 2 columnas

        // Agregar los botones al panel central
        buttonCenterPanel.add(desertButton);
        buttonCenterPanel.add(forestButton);
        buttonCenterPanel.add(jungleButton);
        buttonCenterPanel.add(mountainButton);
        buttonCenterPanel.add(savannaButton);
        buttonCenterPanel.add(tundraButton);

        // Agregar el panel central de botones al panel principal
        buttonPanel.add(buttonCenterPanel, BorderLayout.CENTER);

        // Agregar el panel de botones a la ventana principal
        add(buttonPanel);



    };

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton source = (JButton) e.getSource();


        //Comprueba si se ha pulsado en algun btnAnimal
        for(int i = 0; i<btnAnimals.size();i++){
            System.out.println("Btn Esperado: " + btnAnimals.get(i));

            if(source == btnAnimals.get(i)){
                ImageIcon imagenIcon = new ImageIcon(animal[i].showPicture()); // Reemplaza con la ruta de tu imagen
                Image imagenOriginal = imagenIcon.getImage();
                Image imagenEscalada = imagenOriginal.getScaledInstance(250, 250, Image.SCALE_SMOOTH);
                ImageIcon imagenEscaladaIcon = new ImageIcon(imagenEscalada);

                labelImagen.setIcon(imagenEscaladaIcon);
                return;
            }
        }
        //Limpia el Array de Botones cuando se cambia de Ecosistema
        btnAnimals.clear();

        //Comprueba si se ha elegido algun Ecosistema
        if (source == desertButton) {
            factory = new DesertFactory();
            mostrarVentanaConBotones(factory.createEcosystem());
        }else if(source == forestButton){
            factory = new ForestFactory();
            mostrarVentanaConBotones(factory.createEcosystem());
        } else if(source == jungleButton){
            factory = new JungleFactory();
            mostrarVentanaConBotones(factory.createEcosystem());
        }else if(source == mountainButton){
            factory = new MountainFactory();
            mostrarVentanaConBotones(factory.createEcosystem());
        }else if(source == savannaButton){
            factory = new SavannaFactory();
            mostrarVentanaConBotones(factory.createEcosystem());
        }else if(source == tundraButton){
            factory = new TundraFactory();
            mostrarVentanaConBotones(factory.createEcosystem());
        }
    }

    public void mostrarVentanaConBotones(Animal[] animales) {
        JFrame ventanaNueva = new JFrame("Elija un animal");
        Image iconImage = Toolkit.getDefaultToolkit().getImage("DAP-Pr4-master/src/images/icono.jpeg");
        ventanaNueva.setIconImage(iconImage);
        ventanaNueva.setSize(500, 300);
        // Crear botones en la ventana nueva
        for(int i = 0; i< animales.length; i++){
            animal = animales;
            btnAnimals.add(new JButton(animales[i].getName()));
            btnAnimals.get(i).addActionListener(this);
            ventanaNueva.add(btnAnimals.get(i));
        }
        ventanaNueva.setLayout(new FlowLayout());
        // Crear una etiqueta para mostrar la imagen
        labelImagen = new JLabel();
        ventanaNueva.add(labelImagen);
        ventanaNueva.setLocationRelativeTo(null);


        ventanaNueva.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // Cierra solo la ventana secundaria

        ventanaNueva.setVisible(true);
    }



    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Main ventanaPrincipal = new Main();
            ventanaPrincipal.setVisible(true);
        });

    }
}
