package br.com.fiapride.main;

import br.com.fiapride.model.Dispositivo;

public class SistemaPrincipal {

    public static void main(String[] args) {

        Dispositivo notebook = new Dispositivo();
        notebook.tipo = "Notebook";
        notebook.nome = "Dell Inspiron";
        notebook.memoria = 16;
        notebook.tamanhoTela = 15.6;

        Dispositivo celular = new Dispositivo();
        celular.tipo = "Celular";
        celular.nome = "Samsung Galaxy";
        celular.memoria = 128;
        celular.tamanhoTela = 6.5;

        System.out.println("=== DISPOSITIVOS CADASTRADOS ===\n");

        System.out.println("Tipo: " + notebook.tipo);
        System.out.println("Nome: " + notebook.nome);
        System.out.println("Memória: " + notebook.memoria + " GB");
        System.out.println("Tela: " + notebook.tamanhoTela + "\"\n");

        System.out.println("Tipo: " + celular.tipo);
        System.out.println("Nome: " + celular.nome);
        System.out.println("Memória: " + celular.memoria + " GB");
        System.out.println("Tela: " + celular.tamanhoTela + "\"");
    }
}