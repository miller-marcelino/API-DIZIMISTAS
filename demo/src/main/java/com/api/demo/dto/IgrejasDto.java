package com.api.demo.dto;

import org.hibernate.validator.constraints.br.CNPJ;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

/*Notação Responsável por construir os Gets e Sets */
@Data
public class IgrejasDto {

    @NotNull(message = "Informe o nome")
    @NotBlank(message = "O campo não pode estar fazio")
    @Size(min = 3, max = 50, message = "Campo com minimo de 3 caracteres e maximo com 50") 
    private String nome;
    
    @CNPJ /*Notação para validação de CNPJ*/
    @NotNull(message = "Informe o CNPJ")
    @NotBlank(message = "O campo não pode está fazio")
    @Size(min = 14, max = 14, message = "Campo suporta exatamente 14 caracteres") 
    private String cnpj;

    @NotNull (message = "Informe uma senha")
    @NotBlank (message = "O campo não pode está vazio")
    @Size (min = 8, max = 50, message = "O Campo suporta entre 8 e 50 caracteres")
    private String senha;

    private Boolean matriz;

    private Boolean capela;

    @Min(value = 1, message = "O valor deve ser no mínimo 1")
    @Max(value = 2, message = "O valor deve ser no máximo 2")
    private int ddd;

    @Min(value = 1, message = "O valor deve ser no mínimo 1")
    @Max(value = 9, message = "O valor deve ser no máximo 9")
    private int celular;

    private Boolean whatsapp;

    @Min(value = 8, message = "O valor deve ser no mínimo 8")
    @Max(value = 8, message = "O valor deve ser no máximo 8")
    private int telefone;

    @NotNull(message = "Informe o e-mail")
    @Email /*Notação para validação de e-mail*/
    @NotBlank(message = "O campo não pode estar fazio")
    @Size(min = 1, max = 50, message = "Campo com minimo de 1 caracteres e maximo com 50")
    private String email;

    @NotNull(message = "Informe a Chave pix")
    @NotBlank(message = "O campo não pode estar fazio")
    @Size(min = 1, max = 50, message = "Campo com minimo de 1 caracteres e maximo com 50")
    private String chave_pix;

    @NotNull(message = "Informe o Nome do Pároco")
    @NotBlank(message = "O campo não pode estar fazio")
    @Size(min = 1, max = 50, message = "Campo com minimo de 1 caracteres e maximo com 50")
    private String nome_responsavel;

    private Boolean igreja_catolica;

    private Boolean igreja_batista;

    private Boolean igreja_assembleia;

    private Boolean outras_igrejas;

    @NotNull(message = "Informe o estado")
    @NotBlank(message = "O campo não pode estar fazio")
    @Size(min = 2, max = 2, message = "Campo suporta exatamente 2 caracteres")
    private String estado;

    @NotNull(message = "Informe a cidade")
    @NotBlank(message = "O campo não pode estar fazio")
    @Size(min = 1, max = 50, message = "Campo com minimo de 1 caracteres e maximo com 50")
    private String cidade;

    @NotNull(message = "Informe o bairro")
    @NotBlank(message = "O campo não pode estar fazio")
    @Size(min = 1, max = 50, message = "Campo com minimo de 1 caracteres e maximo com 50")
    private String bairro;

    @NotNull(message = "Informe o nome da rua")
    @NotBlank(message = "O campo não pode estar fazio")
    @Size(min = 1, max = 50, message = "Campo com minimo de 1 caracteres e maximo com 50")
    private String rua;

    @NotNull(message = "Informe o número da casa")
    @NotBlank(message = "O campo não pode estar fazio")
    @Size(min = 1, max = 10, message = "Campo com minimo de 1 caracteres e maximo com 10")
    private String numero;

    @NotNull(message = "Informe o ponto de referencia")
    @NotBlank(message = "O campo não pode estar fazio")
    @Size(min = 1, max = 50, message = "Campo com minimo de 1 caracteres e maximo com 50")
    private String ponto_referencia;

    @NotNull(message = "Informe o cep")
    @NotBlank(message = "O campo não pode estar fazio")
    @Size(min = 1, max = 15, message = "Campo com minimo de 1 caracteres e maximo com 15")
    private String cep;
    
}
