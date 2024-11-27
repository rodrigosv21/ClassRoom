package main;

import java.util.Scanner;

public class Index {
    public static void main(String[] args) {
        Servico srv = new Servico(null, null);
        Scanner tec = new Scanner(System.in);
        String inicio;
        int servico;

        System.out.println("DESEJA ENTRAR?");
        inicio = tec.nextLine();

        if (inicio.equals("sim")) {
            srv.cadastrarNome();
        }else{
            tec.close();
        }

        System.out.println("seja bem vindo " + srv.getNome());

        System.out.println("qual serviço?");
        servico = tec.nextInt();

        switch (servico) {
            case 1:
                srv.guardarNotas();
                System.out.println("rever notas? digite (sim) para continuar e (não)/ para sair".toUpperCase());
                inicio = tec.next();

                if (inicio.equals("sim")) {
                    System.out.println(srv.notas);
                }
                break;
            case 2:
                srv.verNotas();
                break;
            default:
                System.out.println("valor indefinido ou não encontrado");
        }
        tec.close();

    }

}
