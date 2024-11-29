package main;

import java.util.ArrayList;
import java.util.Scanner;

public class Metodos extends Thread{
    Scanner tec = new Scanner(System.in);

    private String nome;
    private Double nota;

    ArrayList<Double> notas = new ArrayList<>();


    public Metodos(String nome, Double nota) {
        this.nome = nome;
        this.nota = nota;
    }

    public void inicio(){
        System.out.println("Digite seu nome: ".toUpperCase());
        nome = tec.nextLine();

        System.out.println("OLÁ"+" "+nome.toUpperCase()+"\n");

        System.out.println("nossos serviços ".toUpperCase());
        System.out.println(" Digite \"1\" Cadastrar Notas".toUpperCase()+"\n");
    }

    public void guardarNotas(){
        int i = 0;

        System.out.println(("Digite Suas notas \n" +
                "\"caso desista teclue (q)").toUpperCase());

        while (i < 4) {
            String entrada = tec.nextLine();
            if (entrada.equals("q")) {
                break;
            }
            try {
                double numero = Double.parseDouble(entrada);
                notas.add(numero);
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Digite um número válido.");

            }

            i++;

            System.out.println("Lista de números:");
            for (double numero : notas) {
                System.out.println(numero);
            }
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getNota() {
        return nota;
    }

    public void setNota(Double nota) {
        this.nota = nota;
    }

}
