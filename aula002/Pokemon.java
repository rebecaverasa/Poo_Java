package aula002;

public class Pokemon {
    //Fazer os atributos:

    String tipo;
    String raridade;
    int hp;
    int attack;
    boolean capturado;

    //Criar os métodos:
     void lancadorDeAgua() {
        if(tipo == "agua") {
            System.out.println("O pokemon usou Lancador de agua!");
        } else {
            System.out.println("Esse pokemon nao tem Lancador de Agua");
        }
    }

    void naPokedex(){
        if(capturado == true){
            System.out.println("Pkm ja esta na pokedex");
        } else {
            System.out.println("Pkm nao esta na pokedex");
        }
    }

    //Criar (com o this) e exibir o status:
    void status(){
        System.out.println("Tipo: " + this.tipo);
        System.out.println("HP: " + this.hp);
        System.out.println("Ataque: " + this.attack);
        lancadorDeAgua();
        System.out.println("Raridade: " + this.raridade);
        System.out.println("Foi capturado? " + this.capturado);
    }

}
