package com.Jumarket.Mercado.Repositorio

import com.Jumarket.Mercado.Entity.Produto
import org.springframework.data.jpa.repository.JpaRepository

interface InventarioProdutos: JpaRepository<Produto, Long> {
}