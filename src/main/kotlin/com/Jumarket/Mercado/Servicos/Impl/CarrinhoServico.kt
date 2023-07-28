package com.Jumarket.Mercado.Servicos.Impl

import com.Jumarket.Mercado.Dto.Carrinhoview
import com.Jumarket.Mercado.Entity.Carrinho
import com.Jumarket.Mercado.Entity.FormaPagamento
import com.Jumarket.Mercado.Entity.Produto
import com.Jumarket.Mercado.Repositorio.CarrinhoInterface
import com.Jumarket.Mercado.Servicos.ICarrinho
import org.springframework.stereotype.Service
import java.lang.Integer.sum
import java.math.BigDecimal

@Service

class CarrinhoServico(
    private val carrinhoInterface: CarrinhoInterface,
    private val cadastroProduto: CadastroProduto,
    private val carrinho: Carrinho
): ICarrinho {


    override fun adicionarItemCarrinho(id: Long, quantidade: Int): List<Carrinho> {
        val produto = this.cadastroProduto.acharId(id)

        val item = Carrinho(quantidade=quantidade, produto = produto)
            val quantidadeAtualizada = carrinho.quantidade + quantidade
            Carrinho(quantidade=quantidadeAtualizada, produto = produto)


        this.carrinhoInterface.save(item)
        return this.carrinhoList()
    }

    override fun removerItemCarrinho(id: Long): List<Carrinho> {
        val produto = this.cadastroProduto.acharId(id)

        this.carrinhoInterface.deleteById(id)
        return this.carrinhoList()

    }

    override fun finalizaCompra(carrinho : List<Carrinho>) : BigDecimal {
        return carrinho.sumOf { (it.produto.preco.times(BigDecimal(it.quantidade))) }
    }

    override fun carrinhoList(): List<Carrinho> {
        return this.carrinhoInterface.findAll()

    }

    override fun esvaziaCarrinho() {

        return this.carrinhoInterface.deleteAll()
    }


}