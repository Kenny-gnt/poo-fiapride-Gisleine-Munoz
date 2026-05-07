package br.com.fiapride.main;

import br.com.fiapride.model.Celular;
import br.com.fiapride.model.Notebook;
import br.com.fiapride.model.UsoDispositivo;

public class SistemaPrincipal {

    public static void main(String[] args) {

        System.out.println("===== SISTEMA DE DISPOSITIVOS =====");

        Notebook notebook = new Notebook(
                "Notebook",
                "Dell G15",
                16,
                15.6,
                true,
                "Intel i7");

        Celular celular = new Celular(
                "Celular",
                "Samsung S24",
                256,
                6.5,
                true,
                4);

        UsoDispositivo usoNotebook = new UsoDispositivo(
                "Estudo Java",
                120,
                notebook);

        UsoDispositivo usoCelular = new UsoDispositivo(
                "Redes Sociais",
                90,
                celular);

        usoNotebook.exibirResumo();
        usoCelular.exibirResumo();
    }
}