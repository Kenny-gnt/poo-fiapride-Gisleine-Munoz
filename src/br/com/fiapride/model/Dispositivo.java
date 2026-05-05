package br.com.fiapride.model;

public class Dispositivo {

    private String tipo;
    private String nome;
    private int memoria;
    private double tamanhoTela;

    public Dispositivo(String tipo, String nome, int memoria, double tamanhoTela) {
        setTipo(tipo);
        setNome(nome);
        setMemoria(memoria);
        setTamanhoTela(tamanhoTela);
    }

    public void adicionarMemoria(int valor) {
        if (valor > 0) {
            memoria += valor;
        }
    }

    public int getMemoria() {
        return memoria;
    }

    private void setMemoria(int memoria) {
        if (memoria > 0) {
            this.memoria = memoria;
        }
    }

    public String getNome() {
        return nome;
    }

    private void setNome(String nome) {
        if (nome != null && !nome.isEmpty()) {
            this.nome = nome;
        }
    }

    public String getTipo() {
        return tipo;
    }

    private void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getTamanhoTela() {
        return tamanhoTela;
    }

    private void setTamanhoTela(double tamanhoTela) {
        if (tamanhoTela > 0) {
            this.tamanhoTela = tamanhoTela;
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