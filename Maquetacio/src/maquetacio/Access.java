package maquetacio;

import java.awt.*;
import javax.swing.*;

public class Access extends Ventana {

    public Access() {
        super("Access");

        crearButtonsLayout();
        crearTextLayout();
        this.getPanelStandard().add(new JLabel("Ve a la pestaña direct .bat access"));
        
        this.getPanelSimple().add(new JLabel("Ve a la pestaña direct .bat access"));

    }

    private void crearButtonsLayout() {

        GridBagConstraints constraints = new GridBagConstraints();

        //1
        JPanel panelgbl = new JPanel();
        GridBagLayout gbl = new GridBagLayout();
        panelgbl.setLayout(gbl);

        constraints = crearConstraint(0, 0, 2, 1);
        constraints.weightx = 1.0;
        constraints.weighty = 1.0;
        constraints.fill = GridBagConstraints.BOTH;
        constraints.insets = new Insets(0, 0, 2, 0);

        panelgbl.add(new JButton("Add File"), constraints);

        constraints = crearConstraint(2, 0, 1, 1);
        constraints.weightx = 1.0;
        constraints.weighty = 1.0;
        constraints.fill = GridBagConstraints.BOTH;
        constraints.insets = new Insets(0, 25, 2, 30);

        panelgbl.add(new JButton("Empty Textbox"), constraints);

        constraints = crearConstraint(3, 0, 2, 1);
        constraints.weightx = 1.0;
        constraints.weighty = 1.0;
        constraints.fill = GridBagConstraints.BOTH;
        constraints.insets = new Insets(0,0,2,20);  

        panelgbl.add(new JButton("wgetStart.bat = textbox"), constraints);

        constraints = crearConstraint(0, 1, 2, 1);
        constraints.weightx = 1.0;
        constraints.weighty = 1.0;
        constraints.fill = GridBagConstraints.BOTH;  
        constraints.insets = new Insets(2, 0, 0, 0);
        
        panelgbl.add(new JButton("Add wGetStart.bat"), constraints);

        constraints = crearConstraint(2, 1, 1, 1);
        constraints.weightx = 1.0;
        constraints.weighty = 1.0;
        constraints.fill = GridBagConstraints.BOTH;
        constraints.insets = new Insets(2, 25, 0, 30);  

        panelgbl.add(new JButton("Empty wGetStart.bat"), constraints);
        constraints = crearConstraint(3, 1, 2, 1);
        constraints.weightx = 1.0;
        constraints.weighty = 1.0;
        constraints.fill = GridBagConstraints.BOTH;
        constraints.insets = new Insets(2, 0, 0, 20);  

        panelgbl.add(new JButton("wGetStart.bat = wGetStart.bat + textbox"), constraints);

        constraints = crearConstraint(0, 1, 20, 2);
        constraints.insets = new Insets(10,20, 4, 20);
        constraints.weightx = 1.0;
        constraints.weighty = 0.1;
        constraints.fill = GridBagConstraints.BOTH;
        panelgbl.setBackground(Color.LIGHT_GRAY);

        this.getPanelAccess().add(panelgbl, constraints);

    }

    private void crearTextLayout() {

        GridBagConstraints constraints = new GridBagConstraints();

        constraints = crearConstraint(0, 3, 19, 6);
        constraints.weightx = 1.0;
        constraints.weighty = 1.0;
        constraints.fill = GridBagConstraints.BOTH;
        constraints.insets = new Insets(0,5, 0, 0);
        this.getPanelAccess().add(new JTextField(), constraints);

        //Scroll Horizontal
        constraints = crearConstraint(0, 9, 19, 1);
        constraints.weightx = 1.0;
        constraints.weighty = 0.0;
        constraints.fill = GridBagConstraints.BOTH;
        constraints.insets = new Insets(0,5, 5, 0);
        this.getPanelAccess().add(new JScrollBar(JScrollBar.HORIZONTAL), constraints);

        //Scroll Vertical
        constraints = crearConstraint(19, 3, 1, 7);
        constraints.weightx = 0.0;
        constraints.weighty = 1.0;
        constraints.fill = GridBagConstraints.BOTH;
        constraints.insets = new Insets(0,0, 5, 5);
        this.getPanelAccess().add(new JScrollBar(JScrollBar.VERTICAL), constraints);
    }

}
