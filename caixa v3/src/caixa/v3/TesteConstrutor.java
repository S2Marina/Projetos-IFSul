package caixa.v3;

import javax.swing.JOptionPane;

public class TesteConstrutor {
    public static void main(String[] args) {
        Conta c = new Conta();
        
        JOptionPane.showMessageDialog(null, " Agência:\n" + c.getAgencia());    
    } 
}
