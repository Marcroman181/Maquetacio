package maquetacio;

import java.awt.*;
import javax.swing.*;

public class Standard extends Ventana {
    
   
    public Standard() {
        super("Standard");
        
        crearHostsLayout();
        crearRetrievalLayout();
        crearAcceptLayout();
        crearBehaviourLayout();
        crearRunningLayout();
        crearButtonsLayout();
        
        this.getPanelSimple().add(new JLabel("Ve a la pestaña Standard"));
        
        this.getPanelAccess().add(new JLabel("Ve a la pestaña Standard"));
    }

    private void crearHostsLayout() {

        GridBagConstraints constraints = new GridBagConstraints();

        JPanel panelHosts = new JPanel();
        GridBagLayout gblHosts = new GridBagLayout();
        panelHosts.setLayout(gblHosts);

        constraints = crearConstraint(0, 0, 1, 1);
        constraints.weightx = 1.0;
        constraints.weighty = 1.0;
        constraints.anchor = GridBagConstraints.WEST;
        panelHosts.add(crearCheckbox("Span all"), constraints);

        constraints = crearConstraint(0, 1, 1, 1);
        constraints.weightx = 1.0;
        constraints.weighty = 1.0;
        panelHosts.add(crearCheckbox("Allow list ->"), constraints);

        constraints = crearConstraint(0, 3, 1, 1);
        constraints.weightx = 1.0;
        constraints.weighty = 1.0;
        panelHosts.add(crearCheckbox("Reject list ->"), constraints);

        constraints = crearConstraint(1, 1, 1, 1);
        constraints.weightx = 1.0;
        constraints.weighty = 1.0;
        constraints.fill = GridBagConstraints.BOTH;
        panelHosts.add(new JTextField(20), constraints);
        
        //Scroll Horizontal
        constraints = crearConstraint(1, 2, 1, 1);
        constraints.weightx = 1.0;
        constraints.weighty = 0.0;
        constraints.fill = GridBagConstraints.BOTH;
        panelHosts.add(new JScrollBar(JScrollBar.HORIZONTAL), constraints);
    
        //Scroll Vertical
        constraints = crearConstraint(2, 1, 1, 1);
        constraints.weightx = 0.0;
        constraints.weighty = 1.0;
        constraints.fill = GridBagConstraints.BOTH;
        panelHosts.add(new JScrollBar(JScrollBar.VERTICAL), constraints); 

        constraints = crearConstraint(3, 1, 1, 1);
        constraints.weightx = 1.0;
        constraints.weighty = 1.0;
        panelHosts.add(new JButton("Clear"), constraints);

        constraints = crearConstraint(1, 3, 1, 1);
        constraints.weightx = 1.0;
        constraints.weighty = 1.0;
        constraints.fill = GridBagConstraints.BOTH;
        constraints.insets = new Insets(10,0,0,0); 
        panelHosts.add(new JTextField(20), constraints);

        //Scroll Horizontal
        constraints = crearConstraint(1, 4, 1, 1);
        constraints.weightx = 1.0;
        constraints.weighty = 0.0;
        constraints.fill = GridBagConstraints.BOTH;
        panelHosts.add(new JScrollBar(JScrollBar.HORIZONTAL), constraints);
    
        //Scroll Vertical
        constraints = crearConstraint(2, 3, 1, 1);
        constraints.weightx = 0.0;
        constraints.weighty = 1.0;
        constraints.fill = GridBagConstraints.BOTH;
        
        constraints.insets = new Insets(10,0,5,0); 
        panelHosts.add(new JScrollBar(JScrollBar.VERTICAL), constraints); 
        
        constraints = crearConstraint(3, 3, 1, 1);
        constraints.weightx = 1.0;
        constraints.weighty = 1.0;
        constraints.insets = new Insets(10,0,0,0); 
        panelHosts.add(new JButton("Clear"), constraints);

        constraints = crearConstraint(0, 1, 3, 1);
        constraints.weightx = 1.0;
        constraints.weighty = 1.0;
        constraints.fill = GridBagConstraints.BOTH;
        
        panelHosts.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(),"Hosts"));
   
        panelHosts.setBackground(Color.LIGHT_GRAY);
        this.getPanelStandard().add(panelHosts, constraints);
    }

    private void crearRetrievalLayout() {

        GridBagConstraints constraints = new GridBagConstraints();

        //1
        JPanel panel = new JPanel();
        GridLayout gl = new GridLayout(16, 1);
        panel.setLayout(gl);

        panel.add(crearCheckbox("Only go deeper(-np)"));
        panel.add(crearCheckbox("No clobber(-nc)"));
        panel.add(crearCheckbox("Timestamping(-N)"));

        JPanel panelFL = new JPanel();
        FlowLayout fl = new FlowLayout();
        panelFL.setLayout(fl);
        panelFL.add(new JLabel("Quota(-Q):"));
        panelFL.add(new JTextField(5));
        panelFL.add(new JLabel("(kB)"));
        panelFL.setBackground(Color.LIGHT_GRAY);
        panel.add(panelFL);

        panel.add(crearCheckbox("Continue file download (-c)"));
        panel.add(crearCheckbox("Add HTML suffix (-E)"));
        panel.add(crearCheckbox("No directories(-nd)"));
        panel.add(crearCheckbox("Force directories (-x)"));
        panel.add(crearCheckbox("Save to custom dir (-P)"));
        panel.add(new JTextField(15));

        JPanel panelFL2 = new JPanel();
        FlowLayout fl2 = new FlowLayout(FlowLayout.LEFT);
        panelFL2.setLayout(fl2);
        panelFL2.add(crearCheckbox("Recursive with depth"));
        panelFL2.add(new JTextField(5));
        panelFL2.setBackground(Color.LIGHT_GRAY);
        panel.add(panelFL2);

        panel.add(crearCheckbox("Download with inline objects (-p)"));
        panel.add(crearCheckbox("Convert links (-k)"));
        panel.add(crearCheckbox("Mirror site(-m)"));
        panel.add(crearCheckbox("Clear Server Cache"));
        panel.add(crearCheckbox("Check for files"));

        constraints = crearConstraint(3, 1, 1, 3);
        constraints.weightx = 1.0;
        constraints.weighty = 1.0;
        constraints.fill = GridBagConstraints.BOTH;  
        constraints.insets = new Insets(0,10,0,10); 
        
        panel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(),"Retrieval options"));
        panel.setBackground(Color.LIGHT_GRAY);
        this.getPanelStandard().add(panel, constraints);
    }

    private void crearAcceptLayout() {

        GridBagConstraints constraints = new GridBagConstraints();

        JPanel panelAccept = new JPanel();
        GridBagLayout gblAccept = new GridBagLayout();
        panelAccept.setLayout(gblAccept);

        // checkboxes
        JPanel panel = new JPanel();
        GridLayout gl = new GridLayout(5, 2);
        panel.setLayout(gl);

        panel.add(crearRadio("Accept:"));
        panel.add(crearRadio("Reject:"));
        panel.add(crearCheckbox("html"));
        panel.add(crearCheckbox("gif"));
        panel.add(crearCheckbox("jpg"));
        panel.add(crearCheckbox("txt"));
        panel.add(crearCheckbox("zip"));
        panel.add(crearCheckbox("exe"));
        panel.add(crearCheckbox("doc"));
        panel.add(crearCheckbox("All"));

        constraints = crearConstraint(0, 0, 6, 3);
        constraints.weightx = 1.0;
        constraints.weighty = 1.0;
        constraints.fill = GridBagConstraints.BOTH;
        panelAccept.add(panel, constraints);

        //textfield
        constraints = crearConstraint(0, 3, 4, 3);
        constraints.weightx = 1.0;
        constraints.weighty = 1.0;
        constraints.fill = GridBagConstraints.BOTH;
        panelAccept.add(new JTextField(), constraints);

        //Scroll Vertical
        constraints = crearConstraint(4, 3, 1, 3);
        constraints.weightx = 0.0;
        constraints.weighty = 1.0;
        constraints.fill = GridBagConstraints.BOTH;
        panelAccept.add(new JScrollBar(JScrollBar.VERTICAL), constraints); 

        
        //custom list
        constraints = crearConstraint(5, 3, 1, 1);
        constraints.weightx = 0.01;
        constraints.weighty = 1.0;
        panelAccept.add(new JLabel("<html>Custom<br>list</html>"), constraints);

        //clear
        constraints = crearConstraint(5, 5, 1, 1);
        constraints.weightx = 0.01;
        constraints.weighty = 1.0;
        constraints.insets = new Insets(0,4,0,0); 
        panelAccept.add(new JButton("Clear"), constraints);

        constraints = crearConstraint(0, 2, 1, 2);
        constraints.weightx = 1.0;
        constraints.weighty = 1.0;
        constraints.fill = GridBagConstraints.BOTH;
        
        panelAccept.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(),"Accept/Reject"));
        panelAccept.setBackground(Color.LIGHT_GRAY);
        this.getPanelStandard().add(panelAccept, constraints);
    }

    private void crearBehaviourLayout() {

        GridBagConstraints constraints = new GridBagConstraints();

        //1
        JPanel panel = new JPanel();
        GridLayout gl = new GridLayout(6, 1);
        
        panel.setLayout(gl);

        panel.add(new JLabel("Additional Parameters"));
        panel.add(new JTextField(14));
        panel.add(crearCheckbox("Act like a browser"));
        panel.add(crearCheckbox("Ignore robots.txt"));

        JPanel panelFL = new JPanel();
        FlowLayout fl = new FlowLayout(FlowLayout.LEFT);
        panelFL.setLayout(fl);
        panelFL.add(new JLabel("Retries:"));
        panelFL.add(new JTextField(4));
        panelFL.setBackground(Color.LIGHT_GRAY);
        panel.add(panelFL);

        panel.add(new JButton("Configure Proxy"));

        constraints = crearConstraint(1, 2, 1, 1);
        constraints.weightx = 1.0;
        constraints.weighty = 1.0;
        constraints.fill = GridBagConstraints.BOTH;  
        constraints.insets = new Insets(0,10,0,10); 
        
        panel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(),"Behaviour of wget"));
        panel.setBackground(Color.LIGHT_GRAY);
        this.getPanelStandard().add(panel, constraints);
    }

    private void crearRunningLayout() {

        GridBagConstraints constraints = new GridBagConstraints();

        //1
        JPanel panel = new JPanel();
        GridLayout gl = new GridLayout(7, 1);
        panel.setLayout(gl);

        panel.add(crearCheckbox("Go to backgrounf(-b)"));
        panel.add(crearCheckbox("No info(-q)"));
        panel.add(crearCheckbox("All info (-v)"));
        panel.add(crearCheckbox("Some info (-nv)"));
        panel.add(crearCheckbox("Append to logfile(-a)"));
        panel.add(crearCheckbox("Overwrite Loggile(-o)"));

        JPanel panelFL = new JPanel();
        FlowLayout fl = new FlowLayout(FlowLayout.LEFT);
        panelFL.setLayout(fl);
        panelFL.add(new JLabel("Logfile:"));
        panelFL.add(new JTextField(8));
        panelFL.setBackground(Color.LIGHT_GRAY);
        panel.add(panelFL);

        constraints = crearConstraint(2, 2, 1, 1);
        constraints.weightx = 1.0;
        constraints.weighty = 1.0;
        constraints.fill = GridBagConstraints.BOTH;
        
        
        panel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(),"Running & Logging"));
        panel.setBackground(Color.LIGHT_GRAY);
        this.getPanelStandard().add(panel, constraints);
    }

    private void crearButtonsLayout() {

        GridBagConstraints constraints = new GridBagConstraints();

        //1
        JPanel panel = new JPanel();
        GridLayout gl = new GridLayout(2, 2);
        gl.setHgap(22);
        gl.setVgap(10);
        panel.setLayout(gl);

        panel.add(new JButton("Add to wGetStart.bat"));
        panel.add(new JButton("Empty wGetStart.bat"));
        panel.add(new JButton("Save settings"));
        panel.add(new JButton("Load settings"));

        constraints = crearConstraint(1, 3, 2, 1);
        constraints.weightx = 1.0;
        constraints.weighty = 1.0;
        constraints.fill = GridBagConstraints.BOTH;
        constraints.insets = new Insets(10,20,10,10); 
        panel.setBackground(Color.LIGHT_GRAY);
        
        this.getPanelStandard().add(panel, constraints);

    }
}
