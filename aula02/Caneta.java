package aula02;

public class Caneta {
    String modelo; // Atributos (o que tem)
    String cor;
    float ponta;
    int carga;
    boolean tampada;

    void status() {
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cor " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
        System.out.println("Esta tampada? " + this.tampada);
    }

    void rabiscar() { // Método rabiscar (o que faz)
        if (tampada == true) {
            System.out.println("Tampada, nao rabisca.");
        } else {
            System.out.println("Destampada, rabisca");
        }
    }

    void tampar() { // Método tampar (o que faz)
        this.tampada = true; // this é uma referencia ao objeto que chamou esse método (no caso, c1)
    }

    void destampar() { // Método destampar (o que faz)
        this.tampada = false;
    }
}
