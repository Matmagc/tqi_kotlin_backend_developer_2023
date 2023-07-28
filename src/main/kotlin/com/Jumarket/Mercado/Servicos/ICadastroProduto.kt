package com.Jumarket.Mercado.Servicos

import com.Jumarket.Mercado.Entity.Produto

// Método para cadastrar um produto, procurar por id ou deletar

interface ICadastroProduto {

    fun salvar ( produto: Produto ): Produto

    fun acharId ( id: Long ): Produto

    fun deletar ( id: Long )
}