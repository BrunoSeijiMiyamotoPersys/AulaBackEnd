package com.cursoBackend.fiado.domain;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Objects;
import java.util.UUID;

@Entity
@Table(name = "Estabelecimentos")
public class Estabelecimento implements Serializable {

    private static final long serialVersionUid = 1L;

    @Id
    @GenericGenerator(name = "uuid", strategy = "uuid")
    private UUID id;

    public String nome;

    public String telefone;

    public String documento;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public Estabelecimento() {

    }

    public Estabelecimento(UUID id, String nome, String telefone, String documento) {
        this.id = id;
        this.nome = nome;
        this.telefone = telefone;
        this.documento = documento;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Estabelecimento that = (Estabelecimento) o;
        return id.equals(that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
