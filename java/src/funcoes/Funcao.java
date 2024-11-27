package funcoes;

import java.util.Scanner;

public class Funcao {

    public int[] pegarNotas(){
        Scanner tec = new Scanner(System.in);
        int[] notas = new int[4];
        String perg;

        for(int i = 0; i < notas.length ; i++){
            System.out.println("Digite Sua Nota: ");
            notas[i] = tec.nextInt();

            System.out.println("Deseja ver suas notas?");
            perg = tec.nextLine();

            if (perg.equals("sim")||(perg.equals("SIM"))) {
                for(int x = 0; i < notas.length; x++){
                    System.out.println(notas[x]);
                    tec.close();
                }
                }
    }
    return notas;
    }
}
