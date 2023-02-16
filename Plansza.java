import java.util.ArrayList;

public class Plansza {
    int rozmiar;
    String[][] planszatak;

    public Plansza(int rozmiar) {
        this.rozmiar = rozmiar;
        planszatak = new String[rozmiar][rozmiar];
        for (int i = 0; i < rozmiar; i++) {
            for (int j = 0; j < rozmiar; j++) {
                planszatak[i][j] = " ";
            }
        }
    }

    public void wyswietlPlansze() {
        System.out.println("Aktualna sytuacja:");
        System.out.print("  ");
        for (int k = 0; k < rozmiar; k++) {
            System.out.print(k);
        }
        System.out.println();
        System.out.print("  ");
        for (int d = 0; d < rozmiar; d++) {
            System.out.print("-");
        }
        for (int i = 0; i < rozmiar; i++) {
            System.out.println();
            for (int j = 0; j < rozmiar; j++) {
                if (j==0){
                    System.out.print(i + "|");
                    System.out.print(planszatak[i][j]);
                }
                else {
                    System.out.print(planszatak[i][j]);
                }
            }
        }
    }

    public void zmiana(int x, int y, String symbol)
    {
        planszatak[x][y] = symbol;
    }

    public boolean sprawdzCzyPelna() {
        int sprawdzacz = 0;
        for (int i = 0; i < rozmiar; i++) {
            for (int j = 0; j < rozmiar; j++) {
                if (planszatak[i][j] != " ") {
                    sprawdzacz++;
                }

            }

        }
        return sprawdzacz == rozmiar * rozmiar;
    }



}

