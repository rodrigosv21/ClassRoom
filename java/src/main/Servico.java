package main;

import java.util.ArrayList;
import java.util.Scanner;

public class Servico {
    Scanner tec = new Scanner(System.in);

    private String nome;
    private Double nota;
    ArrayList<Double> notas = new ArrayList<Double>();

    public Servico(String nome, Double nota) {
        this.nome = nome;
        this.nota = nota;
    }

    public void cadastrarNome(){
        System.out.println("Digite seu nome: ".toUpperCase());
        nome = tec.nextLine();
    }

    public void guardarNotas(){
        for(int i = 0; i < 4; i++){
            System.out.println("Digite Sua Nota: ");
            nota = tec.nextDouble();

            notas.add(nota);
    }
}
    
    public void verNotas(){
        System.out.println(notas.size());
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
