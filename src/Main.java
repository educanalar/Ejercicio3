import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Media c = new Media();

        c.numero = Float.parseFloat(JOptionPane.showInputDialog("INGRESE EL PRIMER NUMERO A EVALUAR;    "));
        c.numero2 = Float.parseFloat(JOptionPane.showInputDialog("INGRESE EL SEGUNDO NUMERO A EVALUAR:    "));
        c.numero3 = Float.parseFloat(JOptionPane.showInputDialog("INGRESE EL TERCER NUMERO A EVALUAR:    "));

        JOptionPane.showMessageDialog(null,c.toString());

    }
}