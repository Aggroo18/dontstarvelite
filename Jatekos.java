package Player;

public class Jatekos {
    private double hp;
    private double hunger;
    private double mentalhp;
    private int mapX;
    private int mapY;

    public double getHp() {
        return hp;
    }

    public void setHp(double hp) {
        if(hp < 0.0){
            this.hp = 0.0;
        }
        else{
            this.hp = hp;
        }
    }

    public double getHunger() {
        return hunger;
    }

    public void setHunger(double hunger) {
        if(hunger < 0.0){
            this.hunger = 0.0;
        }
        else{
            this.hunger = hunger;
        }
    }

    public double getMentalhp() {
        return mentalhp;
    }

    public void setMentalhp(double mentalhp) {
        this.mentalhp = mentalhp;
    }

    public int getMapX() {
        return mapX;
    }

    public int getMapY() {
        return mapY;
    }

    public void setMapX(int mapX) {
        this.mapX = mapX;
    }

    public void setMapY(int mapY) {
        this.mapY = mapY;
    }

    public Jatekos(){
        this.hp = 100;
        this.hunger = 100;
        this.mentalhp = 100;
        this.mapX = 50;
        this.mapY = 50;
    }

    public Jatekos(double hp, double hunger, double mentalhp) {
        this.hp = hp;
        this.hunger = hunger;
        this.mentalhp = mentalhp;
    }
}
