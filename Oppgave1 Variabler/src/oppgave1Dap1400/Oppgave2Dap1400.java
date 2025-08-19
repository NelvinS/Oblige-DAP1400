package oppgave1Dap1400;

import javax.swing.JOptionPane;

public class Oppgave2Dap1400 {
    public static void main (String [] args) {
        String alder, tall1, tall2, tall3 ;
        alder = JOptionPane.showInputDialog("Hva er din alder: ");
        System.out.println(alder);
        tall1 = JOptionPane.showInputDialog("Skriv inn første desimaltall: ");
        tall2 = JOptionPane.showInputDialog("Skriv inn andre desimaltall: ");
        tall3 = JOptionPane.showInputDialog("Skriv inn tredje desimaltall: ");
        double intTall1 = Double.parseDouble(tall1);
        double intTall2 = Double.parseDouble(tall2);
        double intTall3 = Double.parseDouble(tall3);
        double sum = intTall1 + intTall2 + intTall3;
        System.out.println(sum);
    }
}
