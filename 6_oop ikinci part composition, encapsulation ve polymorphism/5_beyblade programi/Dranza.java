public class Dranza extends Beyblade {
    private String kutsalCanavar;

    public Dranza(String beybladeci, int donusHizi, int saldiriGucu,String kutsalCanavar) {
        super(beybladeci, donusHizi, saldiriGucu);
        this.kutsalCanavar = kutsalCanavar;
    }
    
    @Override
    public void bilgileriGoster(){
        super.bilgileriGoster();
        System.out.println("Kutsal Canavar: "+ getKutsalCanavar());
    }
    @Override
    public void kutsalCanavariOrtayaCikar(){
        System.out.println(getBeybladeci()+" "+ getKutsalCanavar()+ " ortaya cikiyor!");
        System.out.println(getKutsalCanavar()+"'in saldirisi: Alev Kilici");
    }

    public String getKutsalCanavar() {
        return kutsalCanavar;
    }

    public void setKutsalCanavar(String kutsalCanavar) {
        this.kutsalCanavar = kutsalCanavar;
    }
}
