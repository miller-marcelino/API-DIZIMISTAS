package com.api.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.demo.repository.RepositoryDizimistas;
import com.api.demo.repository.RepositoryIgrejas;

import jakarta.validation.Valid;

import com.api.demo.dto.DizimistasDto;
import com.api.demo.dto.IgrejasDto;
import com.api.demo.models.Dizimistas;
import com.api.demo.models.Igrejas;

/*@Rest Notação responsável por informar que esse é o arquivo de controle do projeto*/
@RestController

/* Notação responsável por mapear e nomear os aquivos */
@RequestMapping("/")

public class ControladorPrincipal {
    /*
     * @Autowired notação responsável por injetar depêndencias (Fazer o trabalho de
     * um construtor)
     */
    @Autowired
    RepositoryIgrejas repositoryIgrejas;
    @Autowired
    private RepositoryDizimistas repositoryDizimistas;

    /*
     * Trecho responsável por salvar as igrejas @PostMapping faz o mapeamento do
     * caminho
     */
    @CrossOrigin(origins = "*")
    @PostMapping("/cadastrar-igrejas")

    private ResponseEntity<?> cadastrarigrejas(@RequestBody @Valid IgrejasDto igrejasDto, BindingResult bindingResult) {
        try {
            Igrejas novaIgreja = new Igrejas();

            novaIgreja.setCelular(igrejasDto.getCelular());
            novaIgreja.setCapela(igrejasDto.getCapela());
            novaIgreja.setBairro(igrejasDto.getBairro());
            novaIgreja.setCep(igrejasDto.getCep());
            novaIgreja.setChave_pix(igrejasDto.getChave_pix());
            novaIgreja.setCidade(igrejasDto.getCidade());
            novaIgreja.setCnpj(igrejasDto.getCnpj());
            novaIgreja.setDdd(igrejasDto.getDdd());
            novaIgreja.setEmail(igrejasDto.getEmail());
            novaIgreja.setEstado(igrejasDto.getEstado());
            novaIgreja.setIgreja_assembleia(igrejasDto.getIgreja_assembleia());
            novaIgreja.setIgreja_batista(igrejasDto.getIgreja_batista());
            novaIgreja.setIgreja_catolica(igrejasDto.getIgreja_catolica());
            novaIgreja.setMatriz(igrejasDto.getMatriz());
            novaIgreja.setNome(igrejasDto.getNome());
            novaIgreja.setNome_responsavel(igrejasDto.getNome_responsavel());
            novaIgreja.setNumero(igrejasDto.getNumero());
            novaIgreja.setOutras_igrejas(igrejasDto.getOutras_igrejas());
            novaIgreja.setPonto_referencia(igrejasDto.getPonto_referencia());
            novaIgreja.setRua(igrejasDto.getRua());
            novaIgreja.setTelefone(igrejasDto.getTelefone());
            novaIgreja.setWhatsapp(igrejasDto.getWhatsapp());
            novaIgreja.setSenha(igrejasDto.getSenha());

            novaIgreja = repositoryIgrejas.save(novaIgreja);
            return new ResponseEntity<>("Igreja Cadastrada com sucesso", HttpStatus.CREATED);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("Erro ao cadastrar a igreja" + e.getMessage());
        }
    }

    /*
     * Trecho responsável por salvar os Dizimistas @PostMapping faz o mapeamento do
     * caminho
     */

    @PostMapping("/cadastrar-dizimistas")

    private ResponseEntity<?> cadastrardizimistas(@RequestBody @Valid DizimistasDto dizimistasDto,
            BindingResult bindingResult) {
        try {
            Dizimistas novoDizimista = new Dizimistas();

            novoDizimista.setBairro(dizimistasDto.getBairro());
            novoDizimista.setCelular(dizimistasDto.getCelular());
            novoDizimista.setCep(dizimistasDto.getCep());
            novoDizimista.setCidade(dizimistasDto.getCidade());
            novoDizimista.setCpf(dizimistasDto.getCpf());
            novoDizimista.setData_nascimento(dizimistasDto.getData_nascimento());
            novoDizimista.setData_pagamento(dizimistasDto.getData_pagamento());
            novoDizimista.setDdd(dizimistasDto.getDdd());
            novoDizimista.setEstado(dizimistasDto.getEstado());
            novoDizimista.setNome(dizimistasDto.getNome());
            novoDizimista.setNome_capela(dizimistasDto.getNome_capela());
            novoDizimista.setNome_matriz(dizimistasDto.getNome_matriz());
            novoDizimista.setNumero_casa(dizimistasDto.getNumero_casa());
            novoDizimista.setOutras_formas_pagamento(dizimistasDto.getOutras_formas_pagamento());
            novoDizimista.setPagamento_dinheiro(dizimistasDto.getPagamento_dinheiro());
            novoDizimista.setPagamento_efetuado(dizimistasDto.getPagamento_efetuado());
            novoDizimista.setPagamento_pendente(dizimistasDto.getPagamento_pendente());
            novoDizimista.setPagamento_pix(dizimistasDto.getPagamento_pix());
            novoDizimista.setPertence_capela(dizimistasDto.getPertence_capela());
            novoDizimista.setPertence_matriz(dizimistasDto.getPertence_matriz());
            novoDizimista.setPonto_referencia(dizimistasDto.getPonto_referencia());
            novoDizimista.setRua(dizimistasDto.getRua());
            novoDizimista.setValor(dizimistasDto.getValor());
            novoDizimista.setWhatsapp(dizimistasDto.getWhatsapp());

            novoDizimista = repositoryDizimistas.save(novoDizimista);
            return new ResponseEntity<>(novoDizimista, HttpStatus.CREATED);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("Erro ao cadastrar a Dizimista" + e.getMessage());
        }
    }

    /*
     * Trecho responsável por listar os Igrejas cadastrados utilizando o método GET
     */

    @GetMapping(value = "listar-igrejas/{id}")
    public List<Igrejas> listarIgrejas() {
        return repositoryIgrejas.findAll();
    }

    /*
     * Trecho responsável por listar os Dizimistas cadastrados utilizando o método
     * GET
     */

    @GetMapping(value = "listar-dizimistas")
    public List<Dizimistas> listarDizimistas() {
        return repositoryDizimistas.findAll();
    }

    // Trecho responsavel por deletar uma igreja atraves do id

    @DeleteMapping("deletar-igrejas/{id}")
    public ResponseEntity<Long> deletarIgrejas(@PathVariable Long id) {
        boolean existeIgreja = repositoryIgrejas.existsById(id);
        if (existeIgreja) {
            repositoryIgrejas.deleteById(id);
            return new ResponseEntity<>(id, HttpStatus.OK);
        }
        return new ResponseEntity<>(id, HttpStatus.NO_CONTENT);
    }

    // Trecho responsavel por deletar um dizimista atraves do id

    @DeleteMapping("deletar-dizimista/{id}")
    public ResponseEntity<Long> deletarDizimista(@PathVariable Long id) {
        boolean existeDizimista = repositoryDizimistas.existsById(id);
        if (existeDizimista) {
            repositoryDizimistas.deleteById(id);
            return new ResponseEntity<>(id, HttpStatus.OK);
        }
        return new ResponseEntity<>(id, HttpStatus.NO_CONTENT);
    }

    // Trecho responsavel por atualizar uma igreja atraves do id
    @PutMapping("atualizar-igrejas/{id}")
    public ResponseEntity<Igrejas> atualizarIgrejas(@PathVariable Long id, @RequestBody IgrejasDto igrejasdto) {

        // Busca a igreja existente pelo ID usando o método findById
        Optional<Igrejas> existingIgrejas = repositoryIgrejas.findById(id);

        // Verifica se a igreja com o ID fornecido foi encontrada
        if (existingIgrejas.isPresent()) {

            // Atualiza as propriedades da igreja existente com os dados fornecidos
            Igrejas igrejaExistente = existingIgrejas.get();
            igrejaExistente.setBairro(igrejasdto.getBairro());
            igrejaExistente.setCapela(igrejasdto.getCapela());
            igrejaExistente.setCelular(igrejasdto.getCelular());
            igrejaExistente.setCep(igrejasdto.getCep());
            igrejaExistente.setChave_pix(igrejasdto.getChave_pix());
            igrejaExistente.setCidade(igrejasdto.getCidade());
            igrejaExistente.setCnpj(igrejasdto.getCnpj());
            igrejaExistente.setDdd(igrejasdto.getDdd());
            igrejaExistente.setEmail(igrejasdto.getEmail());
            igrejaExistente.setEstado(igrejasdto.getEstado());
            igrejaExistente.setIgreja_assembleia(igrejasdto.getIgreja_assembleia());
            igrejaExistente.setIgreja_batista(igrejasdto.getIgreja_batista());
            igrejaExistente.setIgreja_catolica(igrejasdto.getIgreja_catolica());
            igrejaExistente.setMatriz(igrejasdto.getMatriz());
            igrejaExistente.setNome(igrejasdto.getNome());
            igrejaExistente.setNome_responsavel(igrejasdto.getNome_responsavel());
            igrejaExistente.setNumero(igrejasdto.getNumero());
            igrejaExistente.setOutras_igrejas(igrejasdto.getOutras_igrejas());
            igrejaExistente.setPonto_referencia(igrejasdto.getPonto_referencia());
            igrejaExistente.setRua(igrejasdto.getRua());
            igrejaExistente.setSenha(igrejasdto.getSenha());
            igrejaExistente.setTelefone(igrejasdto.getTelefone());
            igrejaExistente.setWhatsapp(igrejasdto.getWhatsapp());

            // Salva as alterações no banco de dados
            Igrejas igrejaAtualizada = repositoryIgrejas.save(igrejaExistente);

            // Retorna uma resposta com a igreja atualizada e o status 200 (OK)
            return ResponseEntity.ok(igrejaAtualizada);
        } else {
            // Se a igreja com o ID fornecido não for encontrada,
            // retorna um status 404 (Not Found) indicando que a entidade não existe
            return ResponseEntity.notFound().build();
        }
    }

    // Trecho responsavel por atualizar uma igreja atraves do id
    @PutMapping("atualizar-dizimistas/{id}")
    public ResponseEntity<Dizimistas> atualizarDizimistas(@PathVariable Long id,
            @RequestBody DizimistasDto dizimistasdDto) {

        // Busca o Dizimista existente pelo ID usando o método findById
        Optional<Dizimistas> existingDizimistas = repositoryDizimistas.findById(id);

        // Verifica se o dizimista com o ID fornecido foi encontrada
        if (existingDizimistas.isPresent()) {

            // Atualiza as propriedades do Dizimista existente com os dados fornecidos
            Dizimistas atualDizimistas = existingDizimistas.get();
            atualDizimistas.setBairro(dizimistasdDto.getBairro());
            atualDizimistas.setCelular(dizimistasdDto.getCelular());
            atualDizimistas.setCep(dizimistasdDto.getCep());
            atualDizimistas.setCidade(dizimistasdDto.getCidade());
            atualDizimistas.setCpf(dizimistasdDto.getCpf());
            atualDizimistas.setData_nascimento(dizimistasdDto.getData_nascimento());
            atualDizimistas.setData_pagamento(dizimistasdDto.getData_pagamento());
            atualDizimistas.setDdd(dizimistasdDto.getDdd());
            atualDizimistas.setEstado(dizimistasdDto.getEstado());
            atualDizimistas.setNome(dizimistasdDto.getNome());
            atualDizimistas.setNome_capela(dizimistasdDto.getNome_capela());
            atualDizimistas.setNome_matriz(dizimistasdDto.getNome_matriz());
            atualDizimistas.setNumero_casa(dizimistasdDto.getNumero_casa());
            atualDizimistas.setOutras_formas_pagamento(dizimistasdDto.getOutras_formas_pagamento());
            atualDizimistas.setPagamento_dinheiro(dizimistasdDto.getPagamento_dinheiro());
            atualDizimistas.setPagamento_efetuado(dizimistasdDto.getPagamento_efetuado());
            atualDizimistas.setPagamento_pendente(dizimistasdDto.getPagamento_pendente());
            atualDizimistas.setPagamento_pix(dizimistasdDto.getPagamento_pix());
            atualDizimistas.setPertence_capela(dizimistasdDto.getPertence_capela());
            atualDizimistas.setPertence_matriz(dizimistasdDto.getPertence_matriz());
            atualDizimistas.setPonto_referencia(dizimistasdDto.getPonto_referencia());
            atualDizimistas.setRua(dizimistasdDto.getRua());
            atualDizimistas.setValor(dizimistasdDto.getValor());
            atualDizimistas.setWhatsapp(dizimistasdDto.getWhatsapp());

            // Salva as alterações no banco de dados
            Dizimistas dizimistasatualizados = repositoryDizimistas.save(atualDizimistas);

            // Retorna uma resposta com o dizimista atualizado e o status 200 (OK)
            return ResponseEntity.ok(dizimistasatualizados);
        } else {

            // Se o dizimista com o ID fornecido não for encontrada,
            // retorna um status 404 (Not Found) indicando que a entidade não existe
            return ResponseEntity.notFound().build();
        }
    }

}
