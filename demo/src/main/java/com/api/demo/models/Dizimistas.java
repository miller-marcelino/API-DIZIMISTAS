package com.api.demo.models;



import java.time.LocalDate;

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
@Table (name = "Dizimistas")

public class Dizimistas {
/*Notação informa que o atributo id será a chave primária */    
    @Id
/*@GeneratedValue informa que o id será auto incremento pelo banco de dados */    
    @GeneratedValue (strategy = GenerationType.IDENTITY)
/*@Column responsável por criar uma coluna no banco de daddos com o nome abaixo, o nullable = false informa que essa coluna não pode ter valor nulo ou ser vazia */    
    @Column (name = "id", nullable = false)
    private Long id;

    @Column (name = "Nome", columnDefinition = "TEXT", nullable = false)
    private String nome;

    @Column (name = "Cpf", columnDefinition = "TEXT", nullable = false)
    private String cpf;

//@JsonFormat usado para formatar a data padrão Brasileiro
    
    @Column (name = "Data_Nascimento", nullable = false)
    private LocalDate data_nascimento;

    @Column (name = "DDD", nullable = false)
    private int ddd;

    @Column (name = "Celular", nullable = false)
    private int celular;

    @Column (name = "Whatsapp", columnDefinition = "BOOLEAN", nullable = false)
    private Boolean whatsapp;

    @Column (name = "Pagamento_efetuado", columnDefinition = "BOOLEAN", nullable = false)
    private Boolean pagamento_efetuado;

    @Column (name = "Pagamento_Pendente", columnDefinition = "BOOLEAN", nullable = false)
    private Boolean pagamento_pendente;

    @Column (name = "Pertence_Capela", columnDefinition = "BOOLEAN", nullable = false)
    private Boolean pertence_capela;

    @Column (name = "Nome_Capela", columnDefinition = "TEXT")
    private String nome_capela;

    @Column (name = "Pertence_Matriz", columnDefinition = "BOOLEAN", nullable = false)
    private Boolean pertence_matriz;

    @Column (name = "Nome_Matriz", columnDefinition = "TEXT")
    private String nome_matriz;

    @Column (name = "Pagamento_Pix", columnDefinition = "BOOLEAN", nullable = false)
    private Boolean pagamento_pix;

    @Column (name = "Pagamento_Dinheiro", columnDefinition = "BOOLEAN", nullable = false)
    private Boolean pagamento_dinheiro;

    @Column (name = "Outra_Forma_Pagamento", columnDefinition = "BOOLEAN", nullable = false)
    private Boolean outras_formas_pagamento;

    
    @Column (name = "Data_Pagamento", nullable = false)
    private LocalDate data_pagamento;

    @Column (name = "Valor", nullable = false)
    private int valor;

    @Column (name = "Estado", columnDefinition = "TEXT", nullable = false)
    private String estado;

    @Column (name = "Cidade", columnDefinition = "TEXT", nullable = false)
    private String cidade;

    @Column (name = "Bairro", columnDefinition = "TEXT", nullable = false)
    private String bairro;

    @Column (name = "Rua", columnDefinition = "TEXT", nullable = false)
    private String rua;

    @Column (name = "Numero_Casa", columnDefinition = "TEXT", nullable = false)
    private String numero_casa;

    @Column (name = "Ponto_Referencia", columnDefinition = "TEXT", nullable = false)
    private String ponto_referencia;

    @Column (name = "Cep", columnDefinition = "TEXT", nullable = false)
    private String cep;
    
}
