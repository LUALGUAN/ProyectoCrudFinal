package pruebasjparepo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import ec.gob.repository.OficiosRepository;

public class AppDeleteAllInBatch {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("root-context.xml");
		OficiosRepository repo = context.getBean("oficiosRepository", OficiosRepository.class);
		repo.deleteAllInBatch();
		context.close();
	}

}
