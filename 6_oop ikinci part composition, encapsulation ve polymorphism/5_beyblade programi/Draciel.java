public class Draciel extends Beyblade{
    private String kutsalCanavar;

    public Draciel(String beybladeci, int donusHizi, int saldiriGucu, String kutsalCanavar) {
        super(beybladeci, donusHizi, saldiriGucu);
        this.kutsalCanavar = kutsalCanavar;
    }

    @Override
    public void bilgileriGoster() {
        super.bilgileriGoster();
        System.out.println("Kutsal Canavari: "+kutsalCanavar);
    }

    @Override
    public void kutsalCanavariOrtayaCikar() {
        System.out.println(getBeybladeci()+" "+ getKutsalCanavar()+ " ortaya cikiyor!");
        System.out.println(getKutsalCanavar()+"'in savunmasi: Kale Savunmasi");
    }

    public String getKutsalCanavar() {
        return kutsalCanavar;
    }

    public void setKutsalCanavar(String kutsalCanavar) {
        this.kutsalCanavar = kutsalCanavar;
    }
    
}
