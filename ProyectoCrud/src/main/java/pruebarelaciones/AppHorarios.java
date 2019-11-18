package pruebarelaciones;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import ec.gob.model.HorarioOperativo;
import ec.gob.model.Operativo;
import ec.gob.repository.HorarioRepository;




public class AppHorarios {
	public static void main(String[] args) {
	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("root-context.xml");
	HorarioRepository repo = context.getBean("horarioRepository", HorarioRepository.class);
	List<HorarioOperativo> lista= repo.findAll();
System.out.println("lista de entidades" + lista.size());
	for(HorarioOperativo p:lista) {
		System.out.println(p);
	}
	context.close();
	}
}
