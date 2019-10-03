package payroll;

public class Vallalkozo implements IAdoalany{
    
    String nev;
    int bevetel;
    int koltseg;
    
    public Vallalkozo(String name){
        this.nev = nev;
    }
    
    public void elad(int osszeg){
        bevetel += osszeg;
    }
    
    public void vasarol(int osszeg){
        koltseg += osszeg;
    }

    @Override
    public String getNev() {
        return nev;
    }

    @Override
    public int getEvesBevetel() {
        return bevetel;
    }

    @Override
    public int getEvesKoltseg() {
        return koltseg;
    }
}
