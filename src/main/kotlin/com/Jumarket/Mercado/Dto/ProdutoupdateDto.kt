package com.Jumarket.Mercado.Dto

import com.Jumarket.Mercado.Entity.Produto
import java.math.BigDecimal

data class ProdutoupdateDto (
    val nome: String,
    val unidade: String,
    val preco: BigDecimal,
    val categoria: String,
){
    fun toEntity(produto: Produto): Produto{
        produto.nome = this.nome
        produto.unidade= this.unidade
        produto.preco = this.preco
        produto.categoria = this.categoria
        return produto
    }
}
