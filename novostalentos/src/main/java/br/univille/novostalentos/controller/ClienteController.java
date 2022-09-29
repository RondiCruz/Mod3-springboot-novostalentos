package br.univille.novostalentos.controller;

import java.util.ArrayList;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import br.univille.novostalentos.entity.Cliente;

@Controller  
@RequestMapping("/clientes")
public class ClienteController {

      @GetMapping
      public ModelAndView index(){
         
        ArrayList<Cliente> listaClientes = new ArrayList<>();

        var cliente1 = new Cliente();
        cliente1.setEndereco("Rua lalala 100");
        cliente1.setId(1);
        cliente1.setNome("Zezinho");
        cliente1.setSexo("Masculino");
        listaClientes.add(cliente1);

        var cliente2 = new Cliente();
        cliente2.setEndereco("Rua lelele 200");
        cliente2.setId(2);
        cliente2.setNome("Luiznho");
        cliente2.setSexo("Masculino");
        listaClientes.add(cliente2);

        var cliente3 = new Cliente();
        cliente3.setEndereco("Rua lululu 300");
        cliente3.setId(3);
        cliente3.setNome("Huguinho");
        cliente3.setSexo("Masculino");
        listaClientes.add(cliente3);
  
        return new ModelAndView("cliente/index","listaClientes",listaClientes);
      }
    
}
