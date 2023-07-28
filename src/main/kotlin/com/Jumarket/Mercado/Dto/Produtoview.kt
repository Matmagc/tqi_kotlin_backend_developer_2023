package com.Jumarket.Mercado.Dto

import com.Jumarket.Mercado.Entity.Produto
import java.math.BigDecimal

data class Produtoview (
    val nome: String,
    val unidade: String,
    val preco: BigDecimal,
    val categoria: String,
){
    constructor(produto: Produto): this (
        nome = produto.nome,
        unidade = produto.unidade,
        preco = produto.preco,
        categoria = produto.categoria

    )
}
