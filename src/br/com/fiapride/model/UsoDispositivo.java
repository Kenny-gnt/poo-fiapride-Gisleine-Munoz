package br.com.fiapride.model;

public class UsoDispositivo {

    private String atividade;
    private int tempoUso;

    private Dispositivo dispositivoUtilizado;

    public UsoDispositivo(
            String atividade,
            int tempoUso,
            Dispositivo dispositivoUtilizado) {

        this.atividade = atividade;
        this.tempoUso = tempoUso;
        this.dispositivoUtilizado = dispositivoUtilizado;
    }

    public void exibirResumo() {

        System.out.println("\n===== RESUMO DE USO =====");

        System.out.println("Atividade: " + atividade);

        System.out.println("Tempo de uso: "
                + tempoUso + " minutos");

        System.out.println(
                "\n--- Dispositivo Utilizado ---");

        System.out.println("Nome: "
                + dispositivoUtilizado.getNome());

        System.out.println("Tipo: "
                + dispositivoUtilizado.getTipo());

        System.out.println("Memória: "
                + dispositivoUtilizado.getMemoria()
                + " GB");

        System.out.println(
                dispositivoUtilizado.calcularDesempenho());

        System.out.println("-----------------------------");
    }

    public Dispositivo getDispositivoUtilizado() {
        return dispositivoUtilizado;
    }

    public String getAtividade() {
        return atividade;
    }
}