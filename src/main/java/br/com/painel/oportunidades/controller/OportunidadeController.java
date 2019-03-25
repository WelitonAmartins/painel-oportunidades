package br.com.painel.oportunidades.controller;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.painel.oportunidades.entities.Oportunidade;

@RestController
@RequestMapping("/oportunidades")
public class OportunidadeController {
	
	@GetMapping
	public List<Oportunidade> listar() {
		
		Oportunidade op = new Oportunidade();
		op.setId(1l);
		op.setNomeEmpresa("Grupo Brasil");
		op.setDescricao("Desenvolvimento de ERP");
		op.setValor(new BigDecimal(490000));
		
		
		return  Arrays.asList(op);
	}
}
