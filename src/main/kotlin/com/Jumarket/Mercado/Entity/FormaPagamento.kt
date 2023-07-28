package com.Jumarket.Mercado.Entity

import jakarta.persistence.Embeddable


@Embeddable
enum class FormaPagamento {
    Pix, Dinheiro, Cartao_Credito, Cartao_Debito
}
