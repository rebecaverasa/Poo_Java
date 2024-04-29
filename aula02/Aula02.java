package aula02;

public class Aula02 {
    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.cor = "azul"; // faz referência a um atributo
        c1.carga = 60;
        c1.modelo = "bic";
        c1.ponta = 0.9f;
        c1.destampar(); // chamando um método
        //c1.status();
        c1.rabiscar();

        Caneta c2 = new Caneta();
        c2.cor = "preta";
        c2.modelo = "piloto";
        c2.tampar();
        c2.rabiscar();
    }
}

