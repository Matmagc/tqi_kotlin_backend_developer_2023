package com.Jumarket.Mercado.Servicos

import com.Jumarket.Mercado.Entity.Categoria

interface ICadastroCategoria {

    fun cadastrarCategoria (categoria: Categoria): Categoria

    fun deletarCategoria (categoria: String)
}