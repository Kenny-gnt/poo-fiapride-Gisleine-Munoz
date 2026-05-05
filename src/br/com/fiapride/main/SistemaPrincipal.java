package br.com.fiapride.main;

import br.com.fiapride.model.Dispositivo;

public class SistemaPrincipal {

    public static void main(String[] args) {

        Dispositivo notebook = new Dispositivo();
        notebook.tipo = "Notebook";
        notebook.nome = "Dell";
        notebook.memoria = 8;
        notebook.tamanhoTela = 15.6;

        notebook.adicionarMemoria(8);

        int memoriaAtual = notebook.obterMemoria();

        System.out.println("Memória atual: " + memoriaAtual + "GB\n");

        notebook.exibirInfo();

        Dispositivo celular = new Dispositivo();
        celular.tipo = "Celular";
        celular.nome = "Samsung";
        celular.memoria = 128;
        celular.tamanhoTela = 6.5;

        celular.exibirInfo();
    }
}