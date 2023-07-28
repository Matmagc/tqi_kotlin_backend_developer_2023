package com.Jumarket.Mercado.Entity

import jakarta.persistence.*
import java.math.BigDecimal

// Classe para representar um produto

@Entity
@Table(name = "Produtos")
data class  Produto(
    @Column(nullable = false) var nome: String,
    @Column(nullable = false) var unidade: String,
    @Column(nullable = false) var preco: BigDecimal,
    @Column(nullable = false) @Embedded var categoria: String,
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) val id: Long? = null )