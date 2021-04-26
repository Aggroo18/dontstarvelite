import Map.Map;
import Player.Jatekos;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Map map = new Map();
        Jatekos player = new Jatekos();
        Scanner sc = new Scanner(System.in);
        String command = "";
        while (player.getHp() != 0 && player.getHunger() != 0) {
            System.out.println("Lepes: "+map.getLepesszam()+"; Napszak: "+map.isIdoszak());
            for (int i = player.getMapX() - 5; i < player.getMapX() + 5; i++) {
                for (int j = player.getMapY() - 10; j < player.getMapY() + 10; j++) {
                    if (i == player.getMapX() && j == player.getMapY()) {
                        System.out.print("A");
                    }
                    switch(map.terkep[i][j]){
                        case 0:
                            System.out.print(0);
                            break;
                        case 1:
                            System.out.print(1);
                            break;
                        case 2:
                            System.out.print(2);
                            break;
                        case 3:
                            System.out.print(3);
                            break;
                        case 4:
                            System.out.print(4);
                            break;
                        case 5:
                            System.out.print(5);
                            break;
                        case 6:
                            System.out.print(6);
                            break;
                        case 7:
                            System.out.print(7);
                            break;
                        case 8:
                            System.out.print(8);
                            break;
                        case 9:
                            System.out.print(9);
                            break;
                    }
                }
                System.out.println();
            }

            while (!sc.hasNextLine()) {
                sc.next();
            }
            command = sc.nextLine();
            konzolTorles();
            switch (command) {
                case "w":
                    player.setMapX(player.getMapX() - 1);
                    break;
                case "s":
                    player.setMapX(player.getMapX() + 1);
                    break;
                case "a":
                    player.setMapY(player.getMapY() - 1);
                    break;
                case "d":
                    player.setMapY(player.getMapY() + 1);
                    break;
            }
            switch (command) {
                case "pickup grass":
                    break;
                //case "pickup "
            }
        }
    }

    public static void konzolTorles() {
        try {
            if (System.getProperty("os.name").contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                System.out.print("\033\143");
            }
        } catch (IOException | InterruptedException ex) {
        }
    }
}
