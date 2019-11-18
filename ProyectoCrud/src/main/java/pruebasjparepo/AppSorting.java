package pruebasjparepo;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.data.domain.Sort;

import ec.gob.model.Oficios;
import ec.gob.repository.OficiosRepository;

public class AppSorting {
//muestra los registor orden de parametro
//por dos campos ordenar
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("root-context.xml");
		OficiosRepository repo = context.getBean("oficiosRepository", OficiosRepository.class);
		List<Oficios> lista=repo.findAll(Sort.by("fecha").descending().and(Sort.by("titulo").ascending()));
	for(Oficios n : lista) {
		System.out.println(n);
		
			
	}
	}

}
