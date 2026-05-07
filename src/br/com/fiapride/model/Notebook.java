package br.com.fiapride.model;

public class Notebook extends Dispositivo
        implements Recarregavel {

    private boolean possuiTecladoNumerico;
    private String processador;
    private int nivelBateria;

    public Notebook(
            String tipo,
            String nome,
            int memoria,
            double tamanhoTela,
            boolean possuiTecladoNumerico,
            String processador) {

        super(tipo, nome, memoria, tamanhoTela);

        this.possuiTecladoNumerico =
                possuiTecladoNumerico;

        this.processador = processador;

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
                "Notebook carregado para "
                        + percentual + "%");
    }

    @Override
    public String calcularDesempenho() {

        double desempenho =
                getMemoria() * 2;

        return "Desempenho Notebook: "
                + desempenho;
    }

    public boolean isPossuiTecladoNumerico() {
        return possuiTecladoNumerico;
    }

    public String getProcessador() {
        return processador;
    }

    public int getNivelBateria() {
        return nivelBateria;
    }
}