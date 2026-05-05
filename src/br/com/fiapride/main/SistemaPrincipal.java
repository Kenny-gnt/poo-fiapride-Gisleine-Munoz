package br.com.fiapride.main;

import br.com.fiapride.model.Dispositivo;

public class SistemaPrincipal {

    public static void main(String[] args) {

        Dispositivo notebook = new Dispositivo("Notebook", "Dell", 8, 15.6);

        notebook.adicionarMemoria(8);

        System.out.println("Memória atual: " + notebook.getMemoria() + "GB\n");

        notebook.exibirInfo();

        Dispositivo celular = new Dispositivo("Celular", "Samsung", 128, 6.5);

        celular.exibirInfo();
    }
}