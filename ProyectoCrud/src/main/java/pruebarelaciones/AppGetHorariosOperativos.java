package pruebarelaciones;

import java.util.List;
import java.util.Optional;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import ec.gob.model.HorarioOperativo;
import ec.gob.model.Operativo;
import ec.gob.repository.HorarioRepository;
import ec.gob.repository.OperativoRepository;

public class AppGetHorariosOperativos {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("root-context.xml");
		OperativoRepository repo = context.getBean("operativoRepository", OperativoRepository.class);
		Optional<Operativo> lista=repo.findById(1);
	
			System.out.println(lista.get().getHorarios().size());
		
		context.close();
	}
		
}
