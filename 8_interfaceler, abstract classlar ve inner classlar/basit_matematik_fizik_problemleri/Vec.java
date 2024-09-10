
import java.util.Scanner;

public class Vec {
    private String isim;
    private int i;
    private int j;
    private int k;

    public Vec(String isim,Scanner sc){
        this.isim = isim;
        System.out.println(isim+" isimli vektorun i, j ve k degerlerini giriniz..");
        System.out.print("i: ");
        this.i = sc.nextInt();
        System.out.print("j: ");
        this.j = sc.nextInt();
        System.out.print("k: ");
        this.k = sc.nextInt();
        sc.nextLine();
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public int getJ() {
        return j;
    }

    public void setJ(int j) {
        this.j = j;
    }

    public int getK() {
        return k;
    }

    public void setK(int k) {
        this.k = k;
    }
}
