/*
 * Kalenderwoche.java
 */

public class Kalenderwoche2 {
    public static void main(String []args){
        String datum = "07.02";
        String [] datumA = new String[2];

        datumA = datum.split("\\.");

        int tag = Integer.parseInt(datumA[0]);
        int monat = Integer.parseInt(datumA[1]);
        
        System.out.println("Der Tag liegt in der " + ((tag + monatTage(monat)) / 7 + 1) + ". Kalenderwoche.");
        //Tag im Jahr ganzzahlig dividiert durch 7 + 1 -> weil Kalenderwochen bei 1 anfangen
    }
    
    public static int monatTage(int monat){
        int[] arr = {31,28,31,30,31,30,31,31,30,31,30,31};
        int tage = 0;
        for (int i = 0; i < monat-1; i++){
            tage += arr[i];
        }
        return tage;
    }
}
