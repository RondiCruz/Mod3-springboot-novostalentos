package br.univille.novostalentos.controller;

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
          Cliente cliente1 = new Cliente();
          cliente1.setEndereco("Rua lalala 100");
          cliente1.setId(1);
          cliente1.setNome("Zezinho");
          cliente1.setSexo("Masculino");

          
        return new ModelAndView("cliente/index");
      }
    
}
