package com.Jumarket.Mercado.Servicos


import com.Jumarket.Mercado.Entity.Carrinho
import java.math.BigDecimal

interface ICarrinho {

    fun adicionarItemCarrinho(id: Long, quantidade : Int) : List<Carrinho>
    fun removerItemCarrinho(id: Long) : List<Carrinho>
    fun finalizaCompra(carrinho : List<Carrinho>) : BigDecimal
    fun carrinhoList() : List<Carrinho>
    fun esvaziaCarrinho()
}
