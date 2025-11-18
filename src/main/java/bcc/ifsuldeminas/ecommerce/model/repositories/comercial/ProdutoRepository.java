package bcc.ifsuldeminas.ecommerce.model.repositories.comercial;

import bcc.ifsuldeminas.ecommerce.model.entities.comercial.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}
