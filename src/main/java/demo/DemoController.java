package demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

	@RequestMapping("/")
	public String home() {
		return "Hello Jonateeees!!";
	}

	
	@RequestMapping("/test")
	public List<Cobertura> test() {
		List<Cobertura> coberturas = new ArrayList<Cobertura>();
		Cobertura c = new Cobertura();
		c.setDescricao("Produto 1");
		coberturas.add(c);
		return coberturas;
	}
	
}
