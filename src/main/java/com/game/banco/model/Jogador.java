/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.game.banco.model;

import java.io.Serializable;
import java.util.Objects;
import java.util.logging.Logger;
import javax.persistence.*;

/**
 *
 * @author Petz
 */
@Entity
@Table(name = "jogador")
public class Jogador implements Serializable {

    private static final Logger LOG = Logger.getLogger(Jogador.class.getName());

    @Id
    @Column(name = "idjogador")
    private Integer idjogador;

    @Column(name = "nome")
    private String nome;

    @Column(name = "senha")
    private String senha;

    @Column(name = "nick")
    private String nick;

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + Objects.hashCode(this.idjogador);
        hash = 31 * hash + Objects.hashCode(this.nome);
        hash = 31 * hash + Objects.hashCode(this.senha);
        hash = 31 * hash + Objects.hashCode(this.nick);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Jogador other = (Jogador) obj;
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.senha, other.senha)) {
            return false;
        }
        if (!Objects.equals(this.nick, other.nick)) {
            return false;
        }
        if (!Objects.equals(this.idjogador, other.idjogador)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Jogador{" + "idjogador=" + idjogador + ", nome=" + nome + ", senha=" + senha + ", nick=" + nick + '}';
    }

    public Jogador() {
        this.idjogador = null;
        this.nome = null;
        this.senha = null;
        this.nick = null;
    }

    public Jogador(Integer idjogador, String nome, String senha, String nick) {
        this.idjogador = idjogador;
        this.nome = nome;
        this.senha = senha;
        this.nick = nick;
    }

    public Integer getIdjogador() {
        return idjogador;
    }

    public void setIdjogador(Integer idjogador) {
        this.idjogador = idjogador;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

}
