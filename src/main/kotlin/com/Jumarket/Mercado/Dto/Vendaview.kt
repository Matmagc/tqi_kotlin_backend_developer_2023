package com.Jumarket.Mercado.Dto

import com.Jumarket.Mercado.Entity.FormaPagamento
import com.Jumarket.Mercado.Entity.Venda
import java.math.BigDecimal

data class Vendaview (
    val id : Long,
    val valorTotal : BigDecimal,
    val formaPagamento : FormaPagamento,
) {
    constructor(venda: Venda) : this(
        venda.id,
        venda.valorTotal,
        venda.formaPagamento,
    )
}