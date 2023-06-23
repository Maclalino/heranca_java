package Herança;

public class Pombo extends Animal{
    private int cartasEnviadas;
    public Pombo(int cartasEnviadas){
        this.cartasEnviadas=cartasEnviadas;
    }
    public int getCartasEnviadas() {
        return cartasEnviadas;
    }

    public void voar(){
        System.out.printf("%s voou \n", getNome());
    }
    public void fazerPru(){
        System.out.printf("%s Fez pruu \n", getNome());
    }
    public void enviarCarta(){
        System.out.printf("%s enviou uma carta \n", getNome());
        cartasEnviadas++;
        System.out.println("Total de cartas enviadas="+ cartasEnviadas);
    }
}
