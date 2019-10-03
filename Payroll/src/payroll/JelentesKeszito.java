package payroll;

public class JelentesKeszito {
    
    final IAdoalany[] ugyfelek;
    
    public JelentesKeszito(IAdoalany[] ugyfelek){
        this.ugyfelek = ugyfelek;
    }
    
    public String evesKimutatas(){
        int sumBevetel = 0;
        int sumKoltseg = 0;
        float sumAdo = 0;
        
        for (IAdoalany alany : ugyfelek) {
            sumBevetel += alany.getEvesBevetel();
            sumKoltseg += alany.getEvesKoltseg();
            sumAdo += Adoszamito.adoSzamitas(alany);
        }
        return String.format("Összes bevétel:\t%1$s\nÖsszes kiadás:\t%2$s\nÖsszes adó:\t%3$s\n",
                sumBevetel,sumKoltseg,Math.round(sumAdo * 100.0f));
    }
    
    private String fizetesJegyzek(Dolgozo dolgozo){
        StringBuilder sb = new StringBuilder();
        sb.append(dolgozo.getNev() + " fizetési jegyzéke:\n");
        for (int ho = 0; ho < 11; ho++)
            sb.append(String.format("%1$s. hónap: %2$s\n",ho+1, dolgozo.getFizetes(ho)));
                         
        return sb.toString();
    }
    
    public String mindenDolgozoFizetesJegyzek(){
        StringBuilder sb = new StringBuilder();
        for (IAdoalany ugyfel : ugyfelek) {
            if(ugyfel instanceof Dolgozo){
                sb.append(fizetesJegyzek((Dolgozo)ugyfel));
                sb.append("\n");
            }
        }
        return sb.toString();
    }
}
