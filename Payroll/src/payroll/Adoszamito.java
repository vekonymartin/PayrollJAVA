package payroll;

public class Adoszamito {
    
    private static float adokulcs = 0.1f;
    
    public void adoValtozas(float ujAdoKulcs){
        adokulcs = ujAdoKulcs;
    }
    
    public static double adoSzamitas(IAdoalany adoalany){
        return Math.max(0, (adoalany.getEvesBevetel() - adoalany.getEvesKoltseg()) * adokulcs);
    }
}
