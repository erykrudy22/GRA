import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Witaj! Zagrajmy dzis w kółko krzyżyk");

        System.out.println("Podaj nazwe pierwszego gracza");
        Scanner input1 = new Scanner(System.in);
        String nazwa1 = input1.next();

        System.out.println("Podaj symbol pierwszego gracza");
        Scanner sym1 = new Scanner(System.in);
        String symbol1 = sym1.nextLine();

        System.out.println("Podaj nazwe drugiego gracza");
        Scanner input2 = new Scanner(System.in);
        String nazwa2 = input2.next();

        System.out.println("Podaj symbol drugiego gracza");
        Scanner sym2 = new Scanner(System.in);
        String symbol2 = sym2.nextLine();

        System.out.println("Podaj rozmiar planszy");
        Scanner roz = new Scanner(System.in);
        int rozmiar = roz.nextInt();

    Gracz gracz1 = new Gracz(nazwa1, symbol1);
    Gracz gracz2 = new Gracz(nazwa2, symbol2);

    Plansza plansza = new Plansza(rozmiar);
        Scanner scanner = new Scanner(System.in);
        Gracz aktualnygracz = gracz2;
        while (true){
            if(aktualnygracz.equals(gracz1)){
                aktualnygracz=gracz2;
            }
            else
            {
                aktualnygracz=gracz1;
            }
            System.out.println("Czas na ruch gracza: " + aktualnygracz.nazwa);
            System.out.println("Podaj współrzędne miejsca gdzie chcesz postawic: " + aktualnygracz.symbol);
            System.out.println("Podaj wspolrzedna Y");
            int x = scanner.nextInt();
            System.out.println("Podaj wspolrzedna X");
            int y = scanner.nextInt();
            plansza.zmiana(x,y, aktualnygracz.symbol);
            plansza.wyswietlPlansze();
            System.out.println();
        }

        }
    }

