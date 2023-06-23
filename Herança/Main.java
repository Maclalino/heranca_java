package Herança;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        Cachorro cachorro= new Cachorro();
        Gato gato= new Gato();
        Dragao dragao= new Dragao();
        Pombo pombo= new Pombo(2);

        System.out.println("Bem vindo ao Programa de Animais!");
        System.out.println("Digite o nome do seu cachorro:");
        cachorro.setNome(scanner.nextLine());
        cachorro.latir();
        cachorro.comer();
        System.out.println("Digite o nome do seu gato:");
        gato.setNome(scanner.nextLine());
        gato.miar();
        gato.comer();
        System.out.println("Digite o nome do seu Dragão:");
        dragao.setNome(scanner.nextLine());
        dragao.soltarFogo();
        dragao.voar();
        dragao.beber();
        System.out.println("Digite o nome do seu Pombo:");
        pombo.setNome(scanner.nextLine());
        pombo.beber();
        pombo.fazerPru();
        pombo.enviarCarta();


scanner.close();
    }
    
}
