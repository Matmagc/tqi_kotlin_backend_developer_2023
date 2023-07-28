package com.Jumarket.Mercado.Controller

import com.Jumarket.Mercado.Dto.*
import com.Jumarket.Mercado.Entity.Carrinho
import com.Jumarket.Mercado.Entity.FormaPagamento
import com.Jumarket.Mercado.Entity.Produto
import com.Jumarket.Mercado.Servicos.Impl.CarrinhoServico
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import java.math.BigDecimal
import java.util.stream.Collectors

@RestController
@RequestMapping("/api/carrinho")

class CarrinhoResource(
    private val carrinhoServico: CarrinhoServico
) {
    @PostMapping
    fun addItem(
        @PathVariable id: Long,
        @PathVariable quantidade: Int
    ): ResponseEntity<List<Carrinhoview>> {
        val itemAdd = carrinhoServico.adicionarItemCarrinho(id, quantidade)
            .stream().map { carrinho: Carrinho -> Carrinhoview(carrinho) }
            .collect(Collectors.toList())
        return ResponseEntity.ok().body(itemAdd)
    }

    @DeleteMapping("/{id}")
    fun removerItemCarrinho(@PathVariable id: Long): ResponseEntity<List<Carrinhoview>> {
        val itens = carrinhoServico.removerItemCarrinho(id)
            .stream().map { carrinho: Carrinho -> Carrinhoview(carrinho) }
            .collect(Collectors.toList())
        return ResponseEntity.ok().body(itens)
    }

    @PostMapping("/finalizar")

    fun finalizarCompra(@RequestBody vendaDto: VendaDto): String {
        val compraFinalizada = this.carrinhoServico.carrinhoList()
        return "Compra finalizada com sucesso. "
    }

}