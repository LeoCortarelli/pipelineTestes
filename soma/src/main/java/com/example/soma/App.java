package com.example.soma;

public class App {
    public int soma(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        App app = new App();
        int resultado = app.soma(2, 3);
        System.out.println("A soma de 2 e 3 é: " + resultado);
    }
}

