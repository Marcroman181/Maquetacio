
package maquetacio;

import java.awt.*;
import javax.swing.*;

public class Ventana extends JFrame {

    private  JPanel standard;
    private  JPanel access;
    private  JPanel simple;
    
    
    public Ventana(String nombre) {
        super(nombre);
        setSize(800, 700);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        GridBagLayout layout = new GridBagLayout();
        this.getContentPane().setLayout(layout); // Le ponemos el GridBagLayout
        this.getContentPane().setBackground(Color.LIGHT_GRAY);
        
        standard = new JPanel();
        simple = new JPanel();
        access = new JPanel();
        
        GridBagLayout glsimple;
        glsimple = new GridBagLayout();
        this.simple.setLayout(glsimple);
        this.simple.setBackground(Color.LIGHT_GRAY);
        
        GridBagLayout glstandard;
        glstandard = new GridBagLayout();
        this.standard.setLayout(glstandard);
        this.standard.setBackground(Color.LIGHT_GRAY);
        
        GridBagLayout glaccess;
        glaccess = new GridBagLayout();
        this.access.setLayout(glaccess);
        this.access.setBackground(Color.LIGHT_GRAY);
        
        crearCabecera();
    }
    
    public GridBagConstraints crearConstraint(int x, int y, int width, int height) {

        GridBagConstraints constraints = new GridBagConstraints();
        constraints.gridx = x;
        constraints.gridy = y;
        constraints.gridwidth = width;
        constraints.gridheight = height;
        return constraints;
    }
    
    public JPanel getPanelStandard(){
        return this.standard;
    }
    
    public JPanel getPanelAccess(){
        return this.access;
    }
    
    public JPanel getPanelSimple(){
        return this.simple;
    }
    
    public void crearCabecera() {
        GridBagConstraints constraints = new GridBagConstraints();

        //Primer panel
        JTabbedPane pestañas=new JTabbedPane();
        pestañas.addTab("Simple", this.simple);
        
        //Segundo panel
        pestañas.addTab("Standard", this.standard);
 
        //Tercer panel
        pestañas.addTab("direct .bat Access", this.access);
        
        //Cabecera
        JPanel panelURL = new JPanel();
        FlowLayout flURL = new  FlowLayout(FlowLayout.LEFT,20,5);
        panelURL.setLayout(flURL);
        panelURL.add(new JLabel("URL to download"));
        panelURL.add(new JTextField(30));
        panelURL.add(new JButton("-"));
        panelURL.add(new JButton("Start the grabbing!"));
        panelURL.add(new JButton("?"));
        panelURL.setBackground(Color.LIGHT_GRAY);
        //añadimos cabecera y pestañas
        constraints = crearConstraint(0, 0, 4, 1);
        constraints.weightx = 1.0;
        constraints.fill = GridBagConstraints.BOTH;   
        this.getContentPane().add(panelURL, constraints);
        
        constraints = crearConstraint(0, 1, 4, 19);
        constraints.weightx = 1.0;
        constraints.weighty = 1.0;
        constraints.fill = GridBagConstraints.BOTH;        
        this.getContentPane().add(pestañas, constraints);
    }

    public JCheckBox crearCheckbox(String text){
        JCheckBox b = new JCheckBox(text);
        b.setBackground(Color.LIGHT_GRAY);
        return b;
    }
    
    public JRadioButton crearRadio(String text){
        JRadioButton b = new JRadioButton(text);
        b.setBackground(Color.LIGHT_GRAY);
        return b;
    }
}
