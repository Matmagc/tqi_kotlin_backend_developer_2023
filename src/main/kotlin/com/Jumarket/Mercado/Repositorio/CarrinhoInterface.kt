package com.Jumarket.Mercado.Repositorio

import com.Jumarket.Mercado.Entity.Carrinho
import org.springframework.data.jpa.repository.JpaRepository

interface CarrinhoInterface: JpaRepository<Carrinho, Long> {
}