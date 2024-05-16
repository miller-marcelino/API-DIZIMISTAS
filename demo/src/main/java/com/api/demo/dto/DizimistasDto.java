package com.api.demo.dto;



import java.time.LocalDate;

import org.hibernate.validator.constraints.br.CPF;


import jakarta.validation.constraints.FutureOrPresent;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.PastOrPresent;
import jakarta.validation.constraints.Size;
import lombok.Data;

/*Notação Responsável por construir os Gets e Sets */
@Data
public class DizimistasDto {
    @NotBlank(message = "O campo não pode estar fazio")
    @Size(min = 3, max = 50, message = "Campo com minimo de 3 caracteres e maximo com 50") 
    private String nome;
    
    @CPF
    @NotBlank(message = "O campo não pode estar fazio")
    @Size(min = 11, max = 11, message = "Campo suporta exatamente 11 Caracteres") 
    private String cpf;

    
    @PastOrPresent(message = "A data deve ser uma data passada")
    private LocalDate data_nascimento;

    
    @Min(value = 2, message = "O DDD deve coner apenas 2 dígitos")
    @Max(value = 2, message = "O DDD deve coner apenas 2 dígitos") 
    private int ddd;
    
    
    @Min(value = 9, message = "O número do celular deve conter 9 dígitos")
    @Max(value = 9, message = "O número do celular deve conter 9 dígitos")
    private int celular;

    
    private Boolean whatsapp;

    
    private Boolean pagamento_efetuado;

    
    private Boolean pagamento_pendente;

    
    private Boolean pertence_capela;

    @Size(min = 1, max = 50, message = "Campo suporta entre 1 e 50 caracteres")
    private String nome_capela;

    
    private Boolean pertence_matriz;

    @Size(min = 1, max = 50, message = "Campo suporta entre 1 e 50 caracteres")
    private String nome_matriz;

    
    private Boolean pagamento_pix;

    
    private Boolean pagamento_dinheiro;

    
    private Boolean outras_formas_pagamento;

    @FutureOrPresent(message = "A data deve ser passada")
    private LocalDate data_pagamento;

    
    @Min(value = 1, message = "Este campo suporte no mínimo 1 digito")
    @Max(value = 8, message = "Este campo suporte no máximo 8 digito")
    private int valor;

    @NotBlank(message = "O campo não pode estar fazio")
    @Size(min = 2, max = 2, message = "Campo suporta exatamente 2 caracteres")
    private String estado;

    @NotBlank(message = "O campo não pode estar fazio")
    @Size(min = 1, max = 50, message = "Campo suporta entre 1 e 50 caracteres")
    private String cidade;

    @NotBlank(message = "O campo não pode estar fazio")
    @Size(min = 1, max = 50, message = "Campo suporta entre 1 e 50 caracteres")
    private String bairro;

    @NotBlank(message = "O campo não pode estar fazio")
    @Size(min = 1, max = 50, message = "Campo suporta entre 1 e 50 caracteres")
    private String rua;

    @NotBlank(message = "O campo não pode estar fazio")
    @Size(min = 1, max = 6, message = "Campo suporta entre 1 e 6 caracteres")
    private String numero_casa;

    @NotBlank(message = "O campo não pode estar fazio")
    @Size(min = 1, max = 50, message = "Campo suporta entre 1 e 50 caracteres")
    private String ponto_referencia;

    @NotBlank(message = "O campo não pode estar fazio")
    @Size(min = 1, max = 15, message = "Campo suporta entre 1 e 15 caracteres")
    private String cep;
    
}
