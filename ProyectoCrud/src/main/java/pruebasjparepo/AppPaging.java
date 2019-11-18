package pruebasjparepo;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

import ec.gob.model.Oficios;
import ec.gob.repository.OficiosRepository;
import javafx.print.PageRange;

public class AppPaging {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("root-context.xml");
		OficiosRepository repo = context.getBean("oficiosRepository", OficiosRepository.class);
		// obtener paginacion
		//Page<Oficios> page = repo.findAll(PageRequest.of(0, 5));
		
		//obtener todas entidades por pagina
		Page<Oficios> page = repo.findAll(PageRequest.of(0, 5,Sort.by("titulo")));
		
		for(Oficios n: page) {
			System.out.println(n);
			
		}
		context.close();
	}

}
