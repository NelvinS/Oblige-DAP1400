package oppgave1Dap1400;

import javax.swing.JOptionPane;

public class Oppgave1Dap1400 {
    public static void main(String [] args) {
        String fornavn, etternavn, alder, addresse, postnummer, by;
        fornavn = JOptionPane.showInputDialog("Hva er  ditt fornavn: ");
        etternavn = JOptionPane.showInputDialog("Hva er ditt etternavn: ");
        alder = JOptionPane.showInputDialog("Hva er din alder: ");
        addresse = JOptionPane.showInputDialog("Hva er din addresse: ");
        postnummer = JOptionPane.showInputDialog("Hva er ditt postnummer: ");
        by = JOptionPane.showInputDialog("Hvilken by: ");

        System.out.println("Navn: " + fornavn + etternavn+ "\n" + "addresse: " + addresse + "\n" + "Postnummer: " + postnummer + "\n" + "Bor i byen: " + by + "\n" + fornavn + "'s alder er: " + alder + " år ");

        //String fulltNavn = ("Navn: " + fornavn + etternavn + "\n" + "addresse: " + addresse + "\n" + "Postnummer: " + postnummer + "\n" + "Bor i byen: " + by + "\n" + fornavn; + "'s alder er " + alder; + " år ");
        //JOptionPane.showMessageDialog(null, "Navn: " + fornavn + etternavn+ "\n" + "addresse: " + addresse + "\n" + "Postnummer: " + postnummer + "\n" + "Bor i byen: " + by + "\n" + fornavn + "'s alder er: " + alder + " år ");
        //Alle oppgavene i 1, kan bytte disse her for å få ut forskjellige bokser osv.

    }
}
