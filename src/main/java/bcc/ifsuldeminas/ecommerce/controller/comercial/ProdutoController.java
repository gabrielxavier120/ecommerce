package bcc.ifsuldeminas.ecommerce.controller.comercial;

import bcc.ifsuldeminas.ecommerce.model.entities.comercial.Produto;
import bcc.ifsuldeminas.ecommerce.model.repositories.comercial.ProdutoRepository;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produto")
public class ProdutoController {
    private ProdutoRepository produtoRepository;

    public ProdutoController(ProdutoRepository produtoRepository){
        this.produtoRepository = produtoRepository;
    }

    //operacao create
    @PostMapping
    public Produto create(@RequestBody @Valid Produto produto){
        produtoRepository.save(produto);
        return produto;
    }

    //operacoes read
    @GetMapping("/{id}")
    public ResponseEntity<Produto> get(@PathVariable long id){
        Produto produto = getById(id);
        if(produto == null){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<Produto>(produto, HttpStatus.OK);
    }

    @GetMapping
    public List<Produto> list(){
        List<Produto> produtos = produtoRepository.findAll();

        return produtos;
    }

    //operacao update
    @PutMapping("/{id}")
    public ResponseEntity<Produto> update(@PathVariable long id, @RequestBody @Valid Produto produto){
        Produto produtoAux = produtoRepository.getById(id);

        produtoAux.setNome(produto.getNome());
        produtoAux.setDescricao(produto.getDescricao());
        produtoAux.setPreco(produto.getPreco());
        produtoAux.setQtdeDisponivel(produto.getQtdeDisponivel());
        produtoAux.setInformacoesAdicionais(produto.getInformacoesAdicionais());
        //a implementar: atualizar fotos
        //nao se deve alterar vendedor
        produtoRepository.save(produtoAux);
        return produtoAux;
    }

    //operacao delete
    @DeleteMapping("/{id}")
    public void delete(@PathVariable long id){
        produtoRepository.deleteById(id);
    }
}
