package aula002;

public class Aula002 {
    public static void main(String[] args) {
        Pokemon pkm1 = new Pokemon();
        pkm1.tipo = "agua";
        pkm1.hp = 90;
        pkm1.attack = 30;
        pkm1.capturado = false;
        pkm1.raridade = "raro";
        pkm1.status();
        pkm1.naPokedex();
    }
}
