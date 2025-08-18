package oblige1Dap1400;

import javax.swing.JOptionPane;

public class Oblige1Dap1400 {
    public static void main(String [] args) {
        String fornavn, etternavn;
        fornavn = JOptionPane.showInputDialog("Hva er ditt Fornavn: ");
        etternavn = JOptionPane.showInputDialog("Hva er ditt Etternavn: ");

        String fulltNavn = ("Tenk at jeg, " + fornavn + etternavn + ", har naila Oblig 1 allerede");
        String messagebox = fulltNavn;

        JOptionPane.showMessageDialog(null, messagebox);

        //System.out.println("Tenk at jeg, " + fulltNavn + " har naila Oblig 1 allerede");
        // denne linjen funker istedenfor showmessagedialog, men syntes det ser bedre ut å få en dialog box oppe enn bare på debuggeren.
        // Har tatt hjelp fra kompendium Variabler


    }
}
