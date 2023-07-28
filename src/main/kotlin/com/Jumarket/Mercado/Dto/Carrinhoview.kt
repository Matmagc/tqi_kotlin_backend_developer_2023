package com.Jumarket.Mercado.Dto

import com.Jumarket.Mercado.Entity.Carrinho
import com.Jumarket.Mercado.Entity.Produto
import java.math.BigDecimal


data class Carrinhoview(
    val produto: Produto,
    val quantidade: Int,
    var valorTotal: BigDecimal = produto.preco.times(BigDecimal(quantidade))
) {
    constructor(carrinho : Carrinho) : this(
        carrinho.produto,
        carrinho.quantidade
    )}