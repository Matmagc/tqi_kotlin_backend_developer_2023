package com.Jumarket.Mercado.Dto

import com.Jumarket.Mercado.Entity.Produto
import java.math.BigDecimal

data class ProdutoDto(
    val nome: String,
    val unidade: String,
    val preco: BigDecimal,
    val categoria: String,
) {

    fun toEntity(): Produto = Produto(
        nome= this.nome,
        unidade = this.unidade,
        preco = this.preco,
        categoria = this.categoria
    )


}