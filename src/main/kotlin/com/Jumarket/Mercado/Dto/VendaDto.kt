package com.Jumarket.Mercado.Dto

import com.Jumarket.Mercado.Entity.FormaPagamento
import com.Jumarket.Mercado.Entity.Venda
import java.math.BigDecimal


data class VendaDto(
    val formaPagamento: FormaPagamento,
    val valorTotal: BigDecimal
    ){

fun toEntity() : Venda = Venda(
    formaPagamento = this.formaPagamento,
    valorTotal = this.valorTotal
)
}