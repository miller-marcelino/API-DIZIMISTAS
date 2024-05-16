package com.api.demo.models;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

/*Notação Responsável por construir os Gets e Sets */
@Data
/*Notação Responsável por informar ao banco que essa Classe será uma Entidade */
@Entity
/*Notação informa que a Classe será uma tabela com o nome abaixo */
@Table (name = "Igrejas")
public class Igrejas {
/*Notação informa que o atributo id será a chave primária */     
    @Id
/*@GeneratedValue informa que o id será auto incremento pelo banco de dados */    
    @GeneratedValue (strategy = GenerationType.IDENTITY)
/*@Column responsável por criar uma coluna no banco de daddos com o nome abaixo, o nullable = false informa que essa coluna não pode ter valor nulo ou ser vazia */    
    @Column (name = "id", nullable = false)
    private Long idIgreja;

    @Column (name = "Nome", columnDefinition = "TEXT", nullable = false)
    private String nome;

    
    @Column (name = "Cnpj", columnDefinition = "TEXT", nullable = false)
    private String cnpj;
    
    @Column (name = "Senhas", columnDefinition = "TEXT", nullable = false)
    private String senha;

    @Column (name = "Matriz", columnDefinition = "BOOLEAN", nullable = false)
    private Boolean matriz;

    @Column (name = "Capela", columnDefinition = "BOOLEAN", nullable = false)
    private Boolean capela;

   @Column (name = "DDD", nullable = false)
    private int ddd;

    @Column (name = "Celular", nullable = false)
    private int celular;

    @Column (name = "Whatsapp", columnDefinition = "BOOLEAN", nullable = false)
    private Boolean whatsapp;

    @Column (name = "Telefone")
    private int telefone;

    @Column (name = "Email", columnDefinition = "TEXT", nullable = false)
    private String email;

    @Column (name = "Chave_Pix", columnDefinition = "TEXT", nullable = false)
    private String chave_pix;

    @Column (name = "Nome_Responsavel", columnDefinition = "TEXT", nullable = false )
    private String nome_responsavel;

    @Column (name = "Igreja_Catolica", columnDefinition = "BOOLEAN", nullable = false )
    private Boolean igreja_catolica;

    @Column (name = "Igreja_Batista", columnDefinition = "BOOLEAN", nullable = false )
    private Boolean igreja_batista;

    @Column (name = "Igreja_Assembleia", columnDefinition = "BOOLEAN", nullable = false )
    private Boolean igreja_assembleia;

    @Column (name = "Outras_Igreja", columnDefinition = "BOOLEAN", nullable = false )
    private Boolean outras_igrejas;

    @Column (name = "Estado", columnDefinition = "TEXT(2)", nullable = false )
    private String estado;

    @Column (name = "Cidade", columnDefinition = "TEXT", nullable = false )
    private String cidade;

    @Column (name = "Bairro", columnDefinition = "TEXT", nullable = false )
    private String bairro;

    @Column (name = "Rua", columnDefinition = "TEXT", nullable = false )
    private String rua;

    @Column (name = "Numero", columnDefinition = "TEXT", nullable = false )
    private String numero;

    @Column (name = "Ponto_Referencia", columnDefinition = "TEXT", nullable = false )
    private String ponto_referencia;

    @Column (name = "Cep", columnDefinition = "TEXT", nullable = false )
    private String cep;
    
}
