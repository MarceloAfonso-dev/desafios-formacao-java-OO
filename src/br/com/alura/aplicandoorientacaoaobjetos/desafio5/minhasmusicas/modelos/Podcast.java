package br.com.alura.aplicandoorientacaoaobjetos.desafio5.minhasmusicas.modelos;

public class Podcast extends Audio {
    private String host;
    private String descricao;

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public double getClassificacao() {
        if(getTotalCurtidas() > 500) {
            return 10;
        } else {
            return 8;
        }
    }
}
