import java.util.Scanner;

public class Temperatur {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double temp;
        int tage = 7;
        double hoechst = -274;
        double avg = 0;
        for (int i = 0; i < tage; i++){
            System.out.println("Tageshöchsttemperatur an Tag " + (i+1) + ": ");
            temp = scanner.nextDouble();
            hoechst = temp > hoechst? temp : hoechst;
            avg += temp;
        }
        avg /= tage;
        System.out.println("Wochenhöchsttemperatur: " + hoechst + "°C");
        System.out.println("Durchschnittliche Tageshöchsttemperatur: " + avg + "°C");
        scanner.close();
    }
}
