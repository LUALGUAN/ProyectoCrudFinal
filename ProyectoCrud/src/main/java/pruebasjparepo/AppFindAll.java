package pruebasjparepo;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import ec.gob.model.Oficios;
import ec.gob.repository.OficiosRepository;

public class AppFindAll {
	public static void main(String[] args) {
	
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("root-context.xml");
		OficiosRepository repo = context.getBean("oficiosRepository", OficiosRepository.class);
		List<Oficios> lista = repo.findAll();
		for(Oficios n:lista) {
			System.out.println(n);
		}
		
		context.close();

	}
}
