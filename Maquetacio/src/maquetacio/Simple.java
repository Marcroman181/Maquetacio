package maquetacio;

import java.awt.*;
import javax.swing.*;

public class Simple extends Ventana {


    public Simple() {
        super("Simple");
        
        crearButton1Layout();
        crearTextLayout();
        crearBehaviorLayout();
        crearAmountLayout();
        crearSavingLayout();
        crearWhatLayout();
        crearAfterwardsLayout();
        crearButtonsLayout();
        this.getPanelStandard().add(new JLabel("Ve a la pestaña Simple"));
        
        this.getPanelAccess().add(new JLabel("Ve a la pestaña Simple"));
    }
    
    private void crearTextLayout(){
        GridBagConstraints constraints = new GridBagConstraints();

        
        constraints = crearConstraint(0, 1, 6, 1);
        constraints.weightx = 1.0;
        constraints.weighty = 1.0;
        constraints.fill = GridBagConstraints.BOTH;
        this.getPanelSimple().add(new JLabel("<html>You can change the options for each URL you add to the top textbox. If you have added all<br>that you want to the job list, start the grabbing.</html>"), constraints);
        
    }

    private void crearButton1Layout(){
        GridBagConstraints constraints = new GridBagConstraints();

        constraints = crearConstraint(0, 2, 2, 1);
        constraints.weightx = 0;
        constraints.weighty = 0.001;
        constraints.anchor = GridBagConstraints.WEST;
        constraints.insets = new Insets(5,20,5,0); 
        JButton b = new JButton("<html>Empty the job list before adding new<br>URLs</html>");
        this.getPanelSimple().add(b, constraints);

    }
    
    private void crearBehaviorLayout(){
        GridBagConstraints constraints = new GridBagConstraints();

        JPanel panel = new JPanel();
        FlowLayout fl = new FlowLayout(FlowLayout.LEFT,20,10);
        panel.setLayout(fl);

        constraints = crearConstraint(0, 1, 1, 1);
        constraints.weightx = 0;
        constraints.weighty = 1.0;
        constraints.fill = GridBagConstraints.BOTH;
        panel.add(new JLabel("<html>Do you want wiget to be<br>polite or aggressive?</html>"), constraints);

        constraints = crearConstraint(1, 1, 1, 1);
        constraints.weightx = 1.0;
        constraints.weighty = 1.0;
        constraints.fill = GridBagConstraints.BOTH;
        panel.add(crearRadio("polite"), constraints);

        constraints = crearConstraint(2, 1, 1, 1);
        constraints.weightx = 1.0;
        constraints.weighty = 1.0;
        constraints.fill = GridBagConstraints.BOTH;
        panel.add(crearRadio("aggressive"), constraints);
       
        //Añadimos el panel a la ventana
        constraints = crearConstraint(2, 2, 4, 1);
        constraints.weightx = 1.0;
        constraints.weighty = 0.001;
        constraints.fill = GridBagConstraints.BOTH;
        constraints.anchor = GridBagConstraints.WEST;
        constraints.insets = new Insets(5,30,5,20); 
        panel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(),"Behaviour"));
        panel.setBackground(Color.LIGHT_GRAY);
        
        this.getPanelSimple().add(panel, constraints);
    }
    
    private void crearAmountLayout(){
        GridBagConstraints constraints = new GridBagConstraints();

        JPanel panel = new JPanel();
        GridBagLayout gbl = new GridBagLayout();
        panel.setLayout(gbl);

        //contenido
        JPanel panelFl = new JPanel();
        FlowLayout fl = new FlowLayout(FlowLayout.LEFT,10,0);
        panelFl.setLayout(fl);
        
        panelFl.add(new JLabel("<html>When you enter a page<br>as starting URL what do<br>you want to download?</html>"));
        panelFl.add(crearRadio("single page only"));
        panelFl.add(crearRadio("<html>single page with <br>images and stuff</html>"));
        panelFl.add(crearRadio("<html>All pages on that server, if <br> they are underneath <br>the start page</html>"));
        panelFl.add(crearRadio("<html>All pages on<br>that server</html>"));
        
        constraints = crearConstraint(0, 1, 1, 1);
        constraints.weightx = 1.0;
        constraints.weighty = 1.0;
        
        panelFl.setBackground(Color.LIGHT_GRAY);
        constraints.anchor = GridBagConstraints.WEST;
        panel.add(panelFl, constraints);
        //Añadimos el panel a la ventana
        constraints = crearConstraint(0, 3, 6, 1);
        constraints.weightx = 1.0;
        constraints.weighty = 1.0;
        constraints.insets = new Insets(10,20,10,20); 
        
        constraints.fill = GridBagConstraints.BOTH;
        panel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(),"Amount of the Download"));
        panel.setBackground(Color.LIGHT_GRAY);
        this.getPanelSimple().add(panel, constraints);
    }
    
    private void crearSavingLayout(){
        GridBagConstraints constraints = new GridBagConstraints();

        JPanel panel = new JPanel();
        GridBagLayout gbl = new GridBagLayout();
        panel.setLayout(gbl);

        //contenido
        JPanel panelFl = new JPanel();
        FlowLayout fl= new FlowLayout(FlowLayout.LEFT,10,0);
        panelFl.setLayout(fl);
        
        panelFl.add(crearRadio("This directory"));
        panelFl.add(crearRadio("Named like the server"));
        panelFl.add(crearRadio("Custom Directory"));
        panelFl.add(new JTextField(25));
        
        constraints = crearConstraint(0, 1, 1, 1);
        constraints.weightx = 1.0;
        constraints.weighty = 1.0;
        panelFl.setBackground(Color.LIGHT_GRAY);
        constraints.anchor = GridBagConstraints.WEST;
        
        panel.add(panelFl, constraints);
        //Añadimos el panel a la ventana
        constraints = crearConstraint(0, 4, 6, 1);
        constraints.weightx = 1.0;
        constraints.weighty = 1.0;
        constraints.insets = new Insets(0,20,0,20);
        constraints.fill = GridBagConstraints.BOTH;
        
        panel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(),"Saving Location"));
        panel.setBackground(Color.LIGHT_GRAY);
        this.getPanelSimple().add(panel, constraints);
    }
    
    private void crearWhatLayout(){
        GridBagConstraints constraints = new GridBagConstraints();

        JPanel panel = new JPanel();
        GridBagLayout gbl = new GridBagLayout();
        panel.setLayout(gbl);

        //contenido
        JPanel panelFl = new JPanel();
        FlowLayout fl= new FlowLayout(FlowLayout.LEFT,10,0);
        panelFl.setLayout(fl);
        
        panelFl.add(crearRadio("<html>only younger files <br>than on disk</html>"));
        panelFl.add(crearRadio("<html>only files whith names<br>not yet on disk</html>"));
        panelFl.add(crearRadio("<html>When downloading...<br>...a single file: rename earlier file<br>...many files: overwrite earlier files</html>"));
        
        constraints = crearConstraint(0, 1, 1, 1);
        constraints.weightx = 1.0;
        constraints.weighty = 1.0;
        constraints.anchor = GridBagConstraints.WEST;
        panelFl.setBackground(Color.LIGHT_GRAY);
        
        panel.add(panelFl, constraints);
        //Añadimos el panel a la ventana
        constraints = crearConstraint(0, 5, 6, 1);
        constraints.weightx = 1.0;
        constraints.weighty = 1.0;
        constraints.fill = GridBagConstraints.BOTH;
        constraints.insets = new Insets(0,20,0,20);
       
        panel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(),"What to download?"));
        panel.setBackground(Color.LIGHT_GRAY);
        this.getPanelSimple().add(panel, constraints);
    }
    
    private void crearAfterwardsLayout(){
        GridBagConstraints constraints = new GridBagConstraints();

        JPanel panel = new JPanel();
        GridBagLayout gbl = new GridBagLayout();
        panel.setLayout(gbl);

        //contenido
        JPanel panelFl = new JPanel();
        FlowLayout fl= new FlowLayout(FlowLayout.LEFT,10,0);
        panelFl.setLayout(fl);
        
        panelFl.add(new JLabel("<html>After the download, should wget<br>convert the links and filenames<br>to make offline browsing easier</html>"));
        panelFl.add(crearRadio("convert"));
        panelFl.add(crearRadio("<html>Convert but backup<br>the original files</html>"));
        panelFl.add(crearRadio("Don't convert"));
        
        constraints = crearConstraint(0, 1, 1, 1);
        constraints.weightx = 1.0;
        constraints.weighty = 1.0;
        constraints.anchor = GridBagConstraints.WEST;
        panelFl.setBackground(Color.LIGHT_GRAY);
        
        panel.add(panelFl, constraints);
        //Añadimos el panel a la ventana
        constraints = crearConstraint(0, 6, 6, 1);
        constraints.weightx = 1.0;
        constraints.weighty = 1.0;
        constraints.fill = GridBagConstraints.BOTH;
        constraints.insets = new Insets(0,20,0,20);
       
        panel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(),"Afterwards"));
        panel.setBackground(Color.LIGHT_GRAY);
        this.getPanelSimple().add(panel, constraints);
    }
   
    private void crearButtonsLayout(){
        
        GridBagConstraints constraints = new GridBagConstraints();

        constraints = crearConstraint(0, 7, 4, 1);
        constraints.weighty = 1.0;
        constraints.fill = GridBagConstraints.VERTICAL;
        constraints.insets = new Insets(5,50,13,0);
        this.getPanelSimple().add(new JButton("Add the URL with these options to the job list"), constraints);
    
        constraints = crearConstraint(4, 7, 2, 1);
        constraints.weighty = 1.0;
        constraints.fill = GridBagConstraints.VERTICAL;
        constraints.insets = new Insets(5,0,13,0);
        this.getPanelSimple().add(new JButton("Start the Grabbing!"), constraints);   
    }
    
}