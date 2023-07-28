package com.Jumarket.Mercado.Controller

import com.Jumarket.Mercado.Entity.Produto
import com.Jumarket.Mercado.Dto.ProdutoDto
import com.Jumarket.Mercado.Dto.ProdutoupdateDto
import com.Jumarket.Mercado.Dto.Produtoview
import com.Jumarket.Mercado.Servicos.Impl.CadastroProduto
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PatchMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/produtos")

class ProdutoResource(
    private val cadastroProduto: CadastroProduto
) {


    @PostMapping
    fun saveProduto(@RequestBody produtoDto: ProdutoDto): String {
        val produtoSalvo = this.cadastroProduto.salvar( produtoDto.toEntity())
        return "Produto $(Produto.nome) salvo com sucesso. "
    }

    @GetMapping("/{Id}")
    fun acharId (@PathVariable id: Long ): Produtoview {
        val produto: Produto = this.cadastroProduto.acharId(id)
        return Produtoview(produto)

    }
    @DeleteMapping("/{Id}")
    fun deletarId (@PathVariable id: Long) =
        this.cadastroProduto.deletar(id)

    @PatchMapping
    fun updateProduto(@RequestParam(value= "produtoId") id: Long,
                      @RequestBody produtoupdateDto: ProdutoupdateDto): Produtoview{
        val produto:Produto = this.cadastroProduto.acharId(id)
        val produtoupdate:Produto = produtoupdateDto.toEntity(produto)
        val produtoupdated:Produto = this.cadastroProduto.salvar(produtoupdate)
        return Produtoview(produtoupdated)
    }
}
