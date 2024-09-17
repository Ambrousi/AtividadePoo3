public class Caminhao extends Veiculo {
    private float cargaMax;
    public Caminhao(float cargaMax, String cor, String marca, int qPneus) {
        super (cor, qPneus, marca);
        this.cargaMax = cargaMax;
    }
    @Override
    public void velocidadeMax(){
        System.out.println("A velocidade maxima do caminhão "+marca+ " é 120km/h");
    }
    public double cargaMax() {
        System.out.println("A carga maxima suportada pelo caminhão " + marca + " é " + cargaMax+"kg");
        return cargaMax;
    }
}
