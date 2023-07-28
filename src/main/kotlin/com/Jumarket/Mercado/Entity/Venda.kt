package com.Jumarket.Mercado.Entity

import jakarta.persistence.*
import java.math.BigDecimal

@Entity
@Table(name="venda")
data class Venda(
    @Id @Column (name = "id", nullable = false)
    @GeneratedValue (strategy = GenerationType.IDENTITY) val id: Long = 0,
    @Column(name = "valor_total", nullable = false) val valorTotal: BigDecimal = BigDecimal.ZERO,
    @Column(name = "forma_pagamento", nullable = false) @Embedded var formaPagamento: FormaPagamento
)