import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int[] notas = new int[4];
        Scanner teclado = new Scanner(System.in);
        String nome;
        String perg;

        System.out.println("ola seja bem vindo ao nota aluno".toUpperCase());
        System.out.println("Digte seu nome".toUpperCase()); 
        nome = teclado.next();

        System.out.println("\n");

        System.out.println("OLÁ "  + nome.toUpperCase() + " Deseja Digitar suas notas".toUpperCase());
        perg = teclado.next();


        if (perg.equals("sim")||(perg.equals("SIM"))) {
            for(int i = 0; i < notas.length ; i++){
                System.out.println("Digite Sua Nota: ");
                notas[i] = teclado.nextInt();
            }
            }else{
                System.out.println("ok ate mais".toUpperCase());
                teclado.close();
            }
    
                System.out.println("Deseja ver as notas?".toUpperCase());
                perg = teclado.next();
            

                if (perg.equals("sim")||(perg.equals("SIM"))) {
                    for(int i = 0; i < notas.length; i++){
                        System.out.println(notas[i]);
                        teclado.close();
            }
        }       
    }
}
