package Map;

import java.util.Random;

public class Map {
    public int[][] terkep;
    private int lepesszam;
    private boolean idoszak;

    public int getLepesszam() {
        return lepesszam;
    }

    public void setLepesszam(int lepesszam) {
        this.lepesszam = lepesszam;
    }

    public boolean isIdoszak() {
        return idoszak;
    }

    public Map() {
        terkep = new int[100][100];
        lepesszam = 75;
        idoszak = true; // true = nappal, false = ejszaka
        Random r1 = new Random();
        Random r2 = new Random();
        int tick = 0;
        for (int i = 0; i < terkep.length; i++) {
            for (int j = 0; j < terkep.length; j++) {
                tick = r2.nextInt(2);
                if (i == 0 || i == 99 || j == 0 || j == 99) {
                    this.terkep[i][j] = 9;
                } else if (tick == 1) {
                    this.terkep[i][j] = r1.nextInt(8) + 1;
                } else {
                    this.terkep[i][j] = 0;
                }
            }
        }
    }
}
