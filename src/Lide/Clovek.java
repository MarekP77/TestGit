package Lide;

public class Clovek {
    public String jmeno = "Karel Nový";
    private int vek = 25;
    private int unava = 0;

    public int beh(int km){
        if (unava >= 0 && unava < 20){
            unava = unava + km;
        } else System.out.println("Jsem příliš unavený");
        return unava;
    }

    public int spat(int spanek){
        if (unava >= 10 && unava <= 20){
            unava = unava - spanek;
        }
        return unava;
    }

    @Override
    public String toString(){
        return String.format("%s (%d)", jmeno, vek);
    }

}
