package payroll;

public class Payroll {

    public static void main(String[] args) {
        Payroll info = new Payroll();
        info.funkcioTeszt();
    }
    
    public void funkcioTeszt(){
        IAdoalany[] alanyok = tesztAdatbázis();
        JelentesKeszito jelentes = new JelentesKeszito(alanyok);
        System.out.println("Éves kimutatás:\n" + jelentes.evesKimutatas());
        System.out.println("Dolgozo fizetések:\n" + jelentes.mindenDolgozoFizetesJegyzek());
    }
    
    private IAdoalany[] tesztAdatbázis(){
        Dolgozo bela = new Dolgozo("Kiss Béla");
        
        for (int i = 0; i < 12; i++)
            bela.setFizetes(i, 10000 + (int)Math.random() * 5000);
        
        VezetoDolgozo jeno = new VezetoDolgozo("Nagy Jenő", 10000);
        
        for (int i = 0; i < 12; i++)
            jeno.setFizetes(i, 20000);
        
        Vallalkozo miniABC = new Vallalkozo("MINI ABC");
        miniABC.vasarol(1000);
        miniABC.vasarol(2000);
        miniABC.elad(200);
        miniABC.elad(1800);
        
        return new IAdoalany[] {bela, jeno, miniABC};
    }
}
