package com.br.projeto.produtos;

import org.json.simple.JSONArray;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class VerificaRetornoNuloListaDeProdutos {

    @Test
    void verificaRetornoNulo() {
        Produtos produtos = new Produtos();

        JSONArray jsonArray = produtos.lerArquivoJsonProdutos();
        /*Verifica se não é nulo*/
        assertNotNull(jsonArray);
        /*Verifica se o jsonArray não está vazia*/
        assertFalse(jsonArray.isEmpty());
    }
}
