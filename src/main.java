import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int year;
        String zodiak = " ";

        System.out.print("Lutfen dogum yılınızı girin: ");
        year = scanner.nextInt();

        switch (year % 12) {
            case 0:
                zodiak = "Maymun";
                System.out.println("Çin zodyağı burcunuz: " + zodiak);
                break;
            case 1:
                zodiak = "Horoz";
                System.out.println("Çin zodyağı burcunuz: " + zodiak);
                break;
            case 2:
                zodiak = "Köpek";
                System.out.println("Çin zodyağı burcunuz: " + zodiak);
                break;
            case 3:
                zodiak = "Domuz";
                System.out.println("Çin zodyağı burcunuz: " + zodiak);
                break;
            case 4:
                zodiak = "Fare";
                System.out.println("Çin zodyağı burcunuz: " + zodiak);
                break;
            case 5:
                zodiak = "Öküz";
                System.out.println("Çin zodyağı burcunuz: " + zodiak);
                break;
            case 6:
                zodiak = "Kaplan";
                System.out.println("Çin zodyağı burcunuz: " + zodiak);
                break;
            case 7:
                zodiak = "Tavşan";
                System.out.println("Çin zodyağı burcunuz: " + zodiak);
                break;
            case 8:
                zodiak = "Ejderha";
                System.out.println("Çin zodyağı burcunuz: " + zodiak);
                break;
            case 9:
                zodiak = "Yılan";
                System.out.println("Çin zodyağı burcunuz: " + zodiak);
                break;
            case 10:
                zodiak = "At";
                System.out.println("Çin zodyağı burcunuz: " + zodiak);
                break;
            case 11:
                zodiak = "Koyun";
                System.out.println("Çin zodyağı burcunuz: " + zodiak);
                break;
            default:
                System.out.println("Yanlış bir yıl değeri girdiniz.");
        }
    }
}
