    public class Main {
    public static void main(String[] args) {
    Bicicleta bicicleta = new Bicicleta("monark","verde cana", 2);
    Caminhao caminhao = new Caminhao(2500, "Volvo", "branco", 6);
    Carro carro = new Carro(4,"BMW", "Preto");

    bicicleta.info();
    bicicleta.pedalar();
    bicicleta.velocidadeMax();
        System.out.println("-----------------");
    caminhao.info();
    caminhao.velocidadeMax();
    caminhao.cargaMax();
        System.out.println("-----------------");
    carro.info();
    carro.velocidadeMax();
    carro.vAceleraracao();
        }
    }