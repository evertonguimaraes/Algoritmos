package br.unifor.provas.np2.p1;

/**
 * Created by evertonguimaraes on 07/04/17.
 */
public class Transcritor {

    public static String fromDNAToRNA(String dnaSequence){

        String dna = dnaSequence.toUpperCase();
        String rna = new String();

        for (int i = 0; i < dna.length(); i++) {
            if (dna.charAt(i) =='A'){
                rna = rna + "U";
            }else{
                if (dna.charAt(i) == 'G'){
                    rna = rna + "C";
                }else{
                    if (dna.charAt(i) == 'T'){
                        rna = rna + "A";
                    }else{
                        rna = rna + "G";
                    }
                }
            }
        }
        return rna;

    }

    public static void showTranscription(String rna){
        for (int i = 0; i < rna.length(); i++){
            System.out.printf("%c", rna.charAt(i));
        }
        System.out.println("");
    }

    public static void countAminoacids(String rna){

        int triptofano = 0, fenilananina = 0, glicina = 0, serina = 0;

        String rnaT = rna.toString();
        for (int i = 0; i < rna.length(); i = i + 3){

            String sub = rnaT.substring(i, i+2);

            if (rnaT.charAt(i) == 'U' &&
                    rnaT.charAt(i+1) == 'G' &&
                        rnaT.charAt(i+2) == 'G' ){
                triptofano++;
            }

            if (rnaT.charAt(i) == 'U' &&
                    rnaT.charAt(i+1) == 'U' &&
                    rnaT.charAt(i+2) == 'U' ){
                fenilananina++;
            }

            if (rnaT.charAt(i) == 'G' &&
                    rnaT.charAt(i+1) == 'G' &&
                    rnaT.charAt(i+2) == 'C' ){
                glicina++;
            }
            if (rnaT.charAt(i) == 'U' &&
                    rnaT.charAt(i+1) == 'C' &&
                    rnaT.charAt(i+2) == 'A' ){
                serina++;
            }

        }

        System.out.printf("Triptofano: %d %n",triptofano);
        System.out.printf("Fenilananina: %d %n",fenilananina);
        System.out.printf("Glicina: %d %n", glicina);
        System.out.printf("Serina: %d %n", serina);
    }
}


