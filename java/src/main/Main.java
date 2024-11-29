package main;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Metodos srv = new Metodos(null, null);
        Scanner tec = new Scanner(System.in);
        int servico;

        srv.inicio();

        System.out.println("qual serviço?".toUpperCase());
        servico = tec.nextInt();

        switch (servico) {
            case 1:
                srv.guardarNotas();
                break;
            case 2:
                break;
            default:
                System.out.println("valor indefinido ou não encontrado");
        }
        tec.close();
    }
}