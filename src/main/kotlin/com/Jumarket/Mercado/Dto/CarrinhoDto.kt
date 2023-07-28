package com.Jumarket.Mercado.Dto

import com.Jumarket.Mercado.Entity.Carrinho
import com.Jumarket.Mercado.Entity.Produto
import java.math.BigDecimal

data class CarrinhoDto(
    val produto: Produto,
    val quantidade: Int,

    ){


  fun toEntity(): Carrinho = Carrinho(
      produto = this.produto,
      quantidade = this.quantidade,
      )
}


