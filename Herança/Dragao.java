package Herança;
public class Dragao extends Animal{
    

    public void voar(){
        System.out.printf("%s voou \n", getNome());

    }

    public void soltarFogo(){
        System.out.printf("%s soltou uma bola de fogo\n", getNome());
    }
     
}