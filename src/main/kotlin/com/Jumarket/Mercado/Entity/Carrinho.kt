package com.Jumarket.Mercado.Entity

import jakarta.persistence.*
import java.math.BigDecimal
import java.util.*

// Classe para representar o carrinho de compras
@Entity
@Table(name = "Carrinho")
data class Carrinho(
    @Column(nullable = false, unique = true) var creditCode: UUID = UUID.randomUUID(),
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) val id: Long? = null,
    @Embedded @ManyToOne val produto: Produto,
    @Column var quantidade: Int,
)