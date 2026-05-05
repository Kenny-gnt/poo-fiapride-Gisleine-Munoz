package br.com.fiapride.model;

public class Dispositivo {

    private String tipo;
    private String nome;
    private int memoria;
    private double tamanhoTela;

    public Dispositivo(String tipo, String nome, int memoria, double tamanhoTela) {
        this.setTipo(tipo);
        this.setNome(nome);
        this.setMemoria(memoria);
        this.setTamanhoTela(tamanhoTela);

        System.out.println("Dispositivo criado: " + this.nome + " (" + this.tipo + ")");
    }

    public void fazerUpgradeMemoria(int valor) {
        System.out.println("Upgrade de memória solicitado...");
        this.setMemoria(this.memoria + valor);
    }

    public int getMemoria() {
        return memoria;
    }

    public String getNome() {
        return nome;
    }

    public String getTipo() {
        return tipo;
    }

    public double getTamanhoTela() {
        return tamanhoTela;
    }

    private void setMemoria(int memoria) {
        if (memoria > 0) {
            this.memoria = memoria;
        } else {
            System.out.println("Memória inválida");
        }
    }

    private void setNome(String nome) {
        if (nome != null && !nome.isEmpty()) {
            this.nome = nome;
        } else {
            System.out.println("Nome inválido");
        }
    }

    private void setTipo(String tipo) {
        if (tipo != null && !tipo.isEmpty()) {
            this.tipo = tipo;
        }
    }

    private void setTamanhoTela(double tamanhoTela) {
        if (tamanhoTela > 0) {
            this.tamanhoTela = tamanhoTela;
        } else {
            System.out.println("Tamanho de tela inválido");
        }
    }

    public void exibirInfo() {
        System.out.println("Tipo: " + tipo);
        System.out.println("Nome: " + nome);
        System.out.println("Memória: " + memoria + " GB");
        System.out.println("Tela: " + tamanhoTela + "\"");
        System.out.println("-----------------------");
    }
}