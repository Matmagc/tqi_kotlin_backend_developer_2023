package com.Jumarket.Mercado.Servicos.Impl

import com.Jumarket.Mercado.Entity.Categoria
import com.Jumarket.Mercado.Repositorio.CategoriaRef
import com.Jumarket.Mercado.Servicos.ICadastroCategoria
import org.springframework.stereotype.Service

@Service
class CadastroCategoria(
    private val categoriaRef: CategoriaRef
): ICadastroCategoria {
    override fun cadastrarCategoria(categoria: Categoria): Categoria =
        this.categoriaRef.save(categoria)

    override fun deletarCategoria(categoria: String) =
        this.categoriaRef.deleteById(categoria)


}
