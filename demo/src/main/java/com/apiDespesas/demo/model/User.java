package com.apiDespesas.demo.model;
import jakarta.persistence.*;
import java.util.List;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String nome;

    @Column(unique = true)
    private String email;

    private String senha;

   @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<Expensive> expenses;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public List<Expensive> getExpenses() {
        return expenses;
    }

    public void setExpenses(List<Expensive> expenses) {
        this.expenses = expenses;
    }
}
