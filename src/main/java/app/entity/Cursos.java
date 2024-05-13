
package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;
import cronapi.swagger.CronappSwagger;



import cronapp.framework.core.persistence.*;

/**
* Classe que representa a tabela CURSOS
* @generated
*/
@javax.persistence.Entity
@javax.persistence.Table(name = "\"CURSOS\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.Cursos")
@CronappTable(role=CronappTableRole.CLASS)
public class Cursos implements Serializable {
    /**
    * UID da classe, necessário na serialização
    * @generated
    */
    private static final long serialVersionUID = 1L;

    /**
    * @generated
    */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @CronappColumn(attributeType="INTEGER", label="Id")
    @Column(name = "id", nullable = false, insertable=true, updatable=true)
        private java.lang.Integer id;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="Nome")
    @Column(name = "nome", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String nome;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="Departamento")
    @Column(name = "departamento", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String departamento;


    /**
    * @generated
    */
    @CronappColumn(attributeType="INTEGER", label="Duracao")
    @Column(name = "duracao", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Integer duracao;


    /**
    * @generated
    */
    @CronappColumn(attributeType="INTEGER", label="Credito")
    @Column(name = "credito", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Integer credito;


    /**
    * Construtor
    * @generated
    */
    public Cursos(){
    }

    /**
    * Obtém id
    * return id
    * @generated
    */
    public java.lang.Integer getId() {
        return this.id;
    }

    /**
    * Define id
    * @param id id
    * @generated
    */
    public Cursos setId(java.lang.Integer id) {
        this.id = id;
        return this;
    }
    /**
    * Obtém nome
    * return nome
    * @generated
    */
    public java.lang.String getNome() {
        return this.nome;
    }

    /**
    * Define nome
    * @param nome nome
    * @generated
    */
    public Cursos setNome(java.lang.String nome) {
        this.nome = nome;
        return this;
    }
    /**
    * Obtém departamento
    * return departamento
    * @generated
    */
    public java.lang.String getDepartamento() {
        return this.departamento;
    }

    /**
    * Define departamento
    * @param departamento departamento
    * @generated
    */
    public Cursos setDepartamento(java.lang.String departamento) {
        this.departamento = departamento;
        return this;
    }
    /**
    * Obtém duracao
    * return duracao
    * @generated
    */
    public java.lang.Integer getDuracao() {
        return this.duracao;
    }

    /**
    * Define duracao
    * @param duracao duracao
    * @generated
    */
    public Cursos setDuracao(java.lang.Integer duracao) {
        this.duracao = duracao;
        return this;
    }
    /**
    * Obtém credito
    * return credito
    * @generated
    */
    public java.lang.Integer getCredito() {
        return this.credito;
    }

    /**
    * Define credito
    * @param credito credito
    * @generated
    */
    public Cursos setCredito(java.lang.Integer credito) {
        this.credito = credito;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
Cursos object = (Cursos)obj;
        if (id != null ? !id.equals(object.id) : object.id != null) return false;
        return true;
    }

    /**
    * @generated
    */
    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }

}