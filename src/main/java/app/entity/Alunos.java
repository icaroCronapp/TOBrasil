
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
* Classe que representa a tabela ALUNOS
* @generated
*/
@javax.persistence.Entity
@javax.persistence.Table(name = "\"ALUNOS\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.Alunos")
@CronappTable(role=CronappTableRole.CLASS)
public class Alunos implements Serializable {
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
    @CronappColumn(attributeType="INTEGER", label="Idade")
    @Column(name = "idade", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Integer idade;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="Genero")
    @Column(name = "genero", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String genero;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="Estadocivil")
    @Column(name = "estadocivil", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String estadocivil;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="Cidade")
    @Column(name = "cidade", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String cidade;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="Estado")
    @Column(name = "estado", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String estado;


    /**
    * @generated
    */
    @ManyToOne
    @JoinColumn(name="fk_cursos", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
        
        private Cursos cursos;


    /**
    * Construtor
    * @generated
    */
    public Alunos(){
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
    public Alunos setId(java.lang.Integer id) {
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
    public Alunos setNome(java.lang.String nome) {
        this.nome = nome;
        return this;
    }
    /**
    * Obtém idade
    * return idade
    * @generated
    */
    public java.lang.Integer getIdade() {
        return this.idade;
    }

    /**
    * Define idade
    * @param idade idade
    * @generated
    */
    public Alunos setIdade(java.lang.Integer idade) {
        this.idade = idade;
        return this;
    }
    /**
    * Obtém genero
    * return genero
    * @generated
    */
    public java.lang.String getGenero() {
        return this.genero;
    }

    /**
    * Define genero
    * @param genero genero
    * @generated
    */
    public Alunos setGenero(java.lang.String genero) {
        this.genero = genero;
        return this;
    }
    /**
    * Obtém estadocivil
    * return estadocivil
    * @generated
    */
    public java.lang.String getEstadocivil() {
        return this.estadocivil;
    }

    /**
    * Define estadocivil
    * @param estadocivil estadocivil
    * @generated
    */
    public Alunos setEstadocivil(java.lang.String estadocivil) {
        this.estadocivil = estadocivil;
        return this;
    }
    /**
    * Obtém cidade
    * return cidade
    * @generated
    */
    public java.lang.String getCidade() {
        return this.cidade;
    }

    /**
    * Define cidade
    * @param cidade cidade
    * @generated
    */
    public Alunos setCidade(java.lang.String cidade) {
        this.cidade = cidade;
        return this;
    }
    /**
    * Obtém estado
    * return estado
    * @generated
    */
    public java.lang.String getEstado() {
        return this.estado;
    }

    /**
    * Define estado
    * @param estado estado
    * @generated
    */
    public Alunos setEstado(java.lang.String estado) {
        this.estado = estado;
        return this;
    }
    /**
    * Obtém cursos
    * return cursos
    * @generated
    */
    public Cursos getCursos() {
        return this.cursos;
    }

    /**
    * Define cursos
    * @param cursos cursos
    * @generated
    */
    public Alunos setCursos(Cursos cursos) {
        this.cursos = cursos;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
Alunos object = (Alunos)obj;
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