package maquetacio;

public class Maquetacio {

    private Standard vst;
    private Simple vsi;
    private Access va;

    public Maquetacio(){

    }

    public static void main(String[] args) {
        Maquetacio m = new Maquetacio();
        m.crearSimple();
        m.crearStandard();
        m.crearAccess();
        
    }

    public void crearStandard(){
       
        this.vst = new Standard();
        vst.setVisible(true);
    }
    
    public void crearSimple(){
       
        this.vsi = new Simple();
        vsi.setVisible(true);
    }
    
    public void crearAccess(){
       
        this.va = new Access();
        va.setVisible(true);
    }
    
}
