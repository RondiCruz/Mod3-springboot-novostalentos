package br.univille.novostalentos.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.univille.novostalentos.entity.Cliente;
import br.univille.novostalentos.service.ClienteService;

@RestController
@RequestMapping("/api/v1/clientes")
public class ClienteControllerAPI {
    @Autowired
    private ClienteService service;
   
    @GetMapping
    public ResponseEntity<List<Cliente>> getALL(){
        var listaClientes = service.getAll();
        return new ResponseEntity<>(listaClientes,HttpStatus.OK);    

    }
    @GetMapping("/{id}")
    public ResponseEntity<Cliente> getById(@PathVariable long id){
        var umCliente = service.findById(id);
        if(umCliente.getId() == 0){
            return ResponseEntity.notFound().build();
        }
        return new ResponseEntity<Cliente>(umCliente, HttpStatus.OK);

    }
    @GetMapping("/nome/{nome}")
    public ResponseEntity<List<Cliente>> findByNome(@PathVariable String nome){
        var listaClientes = service.findByNome(nome);
        return new ResponseEntity<List<Cliente>>(listaClientes, HttpStatus.OK);
       
    
  }

  @GetMapping("/")
  public ResponseEntity<List<Cliente>> findByNomeRequestParam(@RequestParam("nome") String nome){
    var listaClientes = service.findByNome(nome);
    return new ResponseEntity<List<Cliente>>(listaClientes, HttpStatus.OK);

  } 

}