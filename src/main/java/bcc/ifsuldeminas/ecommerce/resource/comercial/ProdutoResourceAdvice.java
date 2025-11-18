package bcc.ifsuldeminas.ecommerce.resource.comercial;

import bcc.ifsuldeminas.ecommerce.exceptions.comercial.ProdutoNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class ProdutoResourceAdvice {
    //Metodo que trata exceções 'ProdutoNotFoundException'
    @ResponseBody
    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ExceptionHandler(ProdutoNotFoundException.class)
    public String produtoNotFoundHandler(ProdutoNotFoundException pnfe){
        return pnfe.getMessage();
    }
}
