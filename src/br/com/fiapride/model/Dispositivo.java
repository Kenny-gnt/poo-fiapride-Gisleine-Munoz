package br.com.fiapride.model;

public abstract class Dispositivo {

    private String tipo;
    private String nome;
    private int memoria;
    private double tamanhoTela;

    public Dispositivo(
            String tipo,
            String nome,
            int memoria,
            double tamanhoTela) {

        setTipo(tipo);
        setNome(nome);
        setMemoria(memoria);
        setTamanhoTela(tamanhoTela);
    }

    public void adicionarMemoria(int valor) {

        if (valor > 0) {
            setMemoria(this.memoria + valor);
        }
    }

    public abstract String calcularDesempenho();

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
        }
    }

    private void setNome(String nome) {

        if (nome != null && !nome.isEmpty()) {
            this.nome = nome;
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
        }
    }
}