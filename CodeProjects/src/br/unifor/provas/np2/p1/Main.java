package br.unifor.provas.np2.p1;

/**
 * Created by evertonguimaraes on 07/04/17.
 */
public class Main {

    public static void main(String[] args) {

        String dna = "ACCAAACCGAGTAAAAGTACCAAACCGAGTAAAAGTACCAAACCGAGTAAAAGTAGTACC";
        String rna = Transcritor.fromDNAToRNA(dna);
        Transcritor.showTranscription(rna);
        Transcritor.countAminoacids(rna);
    }
}
