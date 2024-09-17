public class Veiculo {
    public String marca;
    private int qPneus;
    private String cor;

    public Veiculo(String marca, int qPneus, String cor) {
        this.marca = marca;
        this.qPneus = qPneus;
        this.cor = cor;
    }
    public void velocidadeMax(){
        System.out.println("A velocidade maxima é: ");
    }
    public void info(){
        System.out.println("Marca: " + marca+"\nCor: " + cor);
    }
}
