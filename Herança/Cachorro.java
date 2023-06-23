package Herança;
public class Cachorro extends Animal {
    
    public void latir(){
         System.out.printf("%s latiu\n", getNome());
    }
    public void lamber(){
        System.out.printf("%s lambeu\n", getNome()); 
    }
    
}
