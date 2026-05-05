package br.com.fiapride.main;

import br.com.fiapride.model.Dispositivo;
import br.com.fiapride.model.UsoDispositivo;

public class SistemaPrincipal {

    public static void main(String[] args) {

        Dispositivo notebook = new Dispositivo("Notebook", "Dell", 8, 15.6);

        notebook.adicionarMemoria(8);

        UsoDispositivo uso = new UsoDispositivo("Estudo Java", 120, notebook);

        uso.exibirResumo();
    }
}