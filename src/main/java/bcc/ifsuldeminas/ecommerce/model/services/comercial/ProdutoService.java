package bcc.ifsuldeminas.ecommerce.model.services.comercial;

import bcc.ifsuldeminas.ecommerce.exceptions.comercial.ProdutoNotFoundException;
import bcc.ifsuldeminas.ecommerce.model.entities.comercial.Produto;
import bcc.ifsuldeminas.ecommerce.model.repositories.comercial.ProdutoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProdutoService {
    private ProdutoRepository produtoRepository;

    public ProdutoService(ProdutoRepository produtoRepository){
        this.produtoRepository = produtoRepository;
    }

    public Produto create(Produto produto){
        return produtoRepository.save(produto);
    }

    public Produto get(Long id){
        Optional<Produto> opt = produtoRepository.findById(id);
        if(!opt.isPresent()){
            throw new ProdutoNotFoundException(id);
        }

        return opt.get();
    }

    public List<Produto> get(){
        return produtoRepository.findAll();
    }

    public Produto update(Long id, Produto produto){
        Produto produtoCadastrado = get(id);

        produtoCadastrado.setNome(produto.getNome());
        produtoCadastrado.setDescricao(produto.getDescricao());
        produtoCadastrado.setPreco(produto.getPreco());
        produtoCadastrado.setQtdeDisponivel(produto.getQtdeDisponivel());
        produtoCadastrado.setInformacoesAdicionais(produto.getInformacoesAdicionais());
        //a implementar: atualizar fotos
        //nao se deve alterar vendedor

        produtoRepository.save(produtoCadastrado);

        return produtoCadastrado;
    }

    public void delete(Long id){
        if(!produtoRepository.existsById(id)){
            throw new ProdutoNotFoundException(id);
        }

        produtoRepository.deleteById(id);
    }
}
