package bcc.ifsuldeminas.ecommerce.controller.comercial;

import bcc.ifsuldeminas.ecommerce.model.entities.comercial.Produto;
import bcc.ifsuldeminas.ecommerce.model.repositories.comercial.ProdutoRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produto")
public class ProdutoController {
    private ProdutoRepository produtoRepository;

    public ProdutoController(ProdutoRepository produtoRepository){
        this.produtoRepository = produtoRepository;
    }

    @PostMapping
    public Produto create(@RequestBody Produto produto){
        produtoRepository.save(produto);
        return produto;
    }

    @GetMapping("/{id}")
    public Produto get(@PathVariable long id){
        Produto produto = produtoRepository.getById(id);
        return produto;
    }

    @GetMapping
    public List<Produto> list(){
        List<Produto> produtos = produtoRepository.findAll();
        return produtos;
    }

    @PutMapping("/{id}")
    public Produto update(@PathVariable long id, @RequestBody Produto produto){
        //Obtendo o produto pelo 'id' informado
        Produto produtoCadastrado = produtoRepository.getById(id);

        //Atualizando os dados do produto
        produtoCadastrado.setNome(produto.getNome());
        produtoCadastrado.setDescricao(produto.getDescricao());
        produtoCadastrado.setPreco(produto.getPreco());
        produtoCadastrado.setQtdeDisponivel(produto.getQtdeDisponivel());
        produtoCadastrado.setInformacoesAdicionais(produto.getInformacoesAdicionais());
        //Atualizar fotos -- 'produtoCadastrado.setFotos(produto.getFotos());'
        //Não se deve permitir a alteração do Vendedor -- 'produtoCadastrado.setVendedor(produto.getVendedor());'

        //Persistindo as alterações
        produtoRepository.save(produtoCadastrado);
        return produtoCadastrado;
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        produtoRepository.deleteById(id);
    }
}
