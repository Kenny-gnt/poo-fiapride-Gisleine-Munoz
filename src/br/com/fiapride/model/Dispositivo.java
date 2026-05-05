package br.com.fiapride.model;

public class Dispositivo {

    public String tipo;
    public String nome;
    public int memoria;
    public double tamanhoTela;

    public void adicionarMemoria(int valor) {
        memoria = memoria + valor;
    }

    public int obterMemoria() {
        return memoria;
    }

    public void alterarNome(String novoNome) {
        if (novoNome != null && !novoNome.isEmpty()) {
            nome = novoNome;
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