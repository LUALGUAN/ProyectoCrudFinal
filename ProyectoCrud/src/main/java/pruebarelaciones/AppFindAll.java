package pruebarelaciones;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import ec.gob.model.Operativo;
import ec.gob.repository.OperativoRepository;

public class AppFindAll {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("root-context.xml");
		OperativoRepository repo = context.getBean("operativoRepository", OperativoRepository.class);
		List<Operativo> lista=repo.findAll();
		for(Operativo p:lista) {
			System.out.println(p);
		}
		context.close();
	}

}
