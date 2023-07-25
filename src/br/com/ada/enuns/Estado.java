package br.com.ada.enuns;

public enum Estado {
    MG("Minas Gerais"),
    SP("São Paulo"),
    RJ("Rio de Janeiro");

    final private String nome;

    Estado(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}
