package br.com.fiapride.model;

public class Celular extends Dispositivo {

    private boolean possui5G;
    private int quantidadeCameras;

    public Celular(
            String tipo,
            String nome,
            int memoria,
            double tamanhoTela,
            boolean possui5G,
            int quantidadeCameras) {

        super(tipo, nome, memoria, tamanhoTela);

        this.possui5G = possui5G;
        this.quantidadeCameras = quantidadeCameras;
    }

    public boolean isPossui5G() {
        return possui5G;
    }

    public int getQuantidadeCameras() {
        return quantidadeCameras;
    }
}