public class Bicicleta extends Veiculo{
    public Bicicleta (String marca, String cor, int qPneus){
        super(marca, qPneus, cor);
    }
    public void info(){
        super.info();
    }
    public void pedalar(){
        System.out.println("Está pedalando");
    }
}
