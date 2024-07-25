package br.com.dio.desafio.dominio;

import java.util.LinkedHashSet;
import java.util.Set;

public class Professor {

    public String nome;
    private Set<Conteudo> conteudos = new LinkedHashSet<>();
    

    public void adicionarConteudo(Conteudo conteudo) {
        this.conteudos.add(conteudo);
    }

    public Set<Conteudo> getConteudos() {
        return conteudos;
    }

    public void setConteudos(Set<Conteudo> conteudos) {
        this.conteudos = conteudos;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
