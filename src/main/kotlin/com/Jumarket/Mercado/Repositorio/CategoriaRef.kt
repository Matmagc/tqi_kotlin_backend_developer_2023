package com.Jumarket.Mercado.Repositorio

import com.Jumarket.Mercado.Entity.Categoria
import org.springframework.data.jpa.repository.JpaRepository

interface CategoriaRef: JpaRepository<Categoria, String> {
}