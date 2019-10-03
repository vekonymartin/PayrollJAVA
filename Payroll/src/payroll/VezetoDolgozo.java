package payroll;

public class VezetoDolgozo extends Dolgozo{

    int evesVezetoiPotlek;
    
    public VezetoDolgozo(String nev, int evesVezetoiPotlek) {
        super(nev);
        this.evesVezetoiPotlek = evesVezetoiPotlek;
    }
    
    @Override
    public int getEvesBevetel(){ return super.getEvesBevetel() + evesVezetoiPotlek; }
}
