public class Carro extends Veiculo {
    public Carro(int qPneus, String cor, String marca) {
        super(cor, qPneus, marca);
    }
    @Override
    public void velocidadeMax(){
        System.out.println("A velocidade maxima de um carro " +marca+ " é 220");
    }
    public void vAceleraracao(){
        System.out.println("Esse carro vai de 0 a 100 em 5,5 segundos");
    }
}
