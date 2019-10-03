package payroll;

public class Dolgozo implements IAdoalany{
    String nev;
    int[] fizetesek = new int[12];
    
    public Dolgozo(String nev){
        this.nev = nev;
    }
    
    public void setFizetes(int index, int fizetes){
        fizetesek[index] = fizetes;
    }
    
    public int getFizetes(int index){
        return fizetesek[index];
    }

    @Override
    public String getNev() {
        return nev;
    }

    @Override
    public int getEvesBevetel() {
        int sum = 0;
        
        for (int i = 0; i < fizetesek.length; i++)
            sum += fizetesek[i];
        
        return sum;
    }

    @Override
    public int getEvesKoltseg() {
        return 0;
    }
}
