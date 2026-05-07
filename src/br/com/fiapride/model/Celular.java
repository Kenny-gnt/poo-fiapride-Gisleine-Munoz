package br.com.fiapride.model;

public class Celular extends Dispositivo
        implements Recarregavel {

    private boolean possui5G;
    private int quantidadeCameras;
    private int nivelBateria;

    public Celular(
            String tipo,
            String nome,
            int memoria,
            double tamanhoTela,
            boolean possui5G,
            int quantidadeCameras) {

        super(tipo, nome, memoria, tamanhoTela);

        this.possui5G = possui5G;

        this.quantidadeCameras =
                quantidadeCameras;

        this.nivelBateria = 0;
    }

    @Override
    public void recarregar(int percentual) {

        if (percentual < CARGA_MINIMA
                || percentual > CARGA_MAXIMA) {

            System.out.println(
                    "Percentual inválido!");
            return;
        }

        this.nivelBateria = percentual;

        System.out.println(
                "Celular carregado para "
                        + percentual + "%");
    }

    @Override
    public String calcularDesempenho() {

        double desempenho =
                getMemoria() * 1.5;

        return "Desempenho Celular: "
                + desempenho;
    }

    public boolean isPossui5G() {
        return possui5G;
    }

    public int getQuantidadeCameras() {
        return quantidadeCameras;
    }

    public int getNivelBateria() {
        return nivelBateria;
    }
}