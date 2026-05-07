package br.com.fiapride.model;

public class Notebook extends Dispositivo {

    private boolean possuiTecladoNumerico;
    private String processador;

    public Notebook(
            String tipo,
            String nome,
            int memoria,
            double tamanhoTela,
            boolean possuiTecladoNumerico,
            String processador) {

        super(tipo, nome, memoria, tamanhoTela);

        this.possuiTecladoNumerico = possuiTecladoNumerico;
        this.processador = processador;
    }

    public boolean isPossuiTecladoNumerico() {
        return possuiTecladoNumerico;
    }

    public String getProcessador() {
        return processador;
    }
}