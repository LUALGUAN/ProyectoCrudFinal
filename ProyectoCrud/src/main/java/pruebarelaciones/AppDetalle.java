package pruebarelaciones;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import ec.gob.model.Detalle;

import ec.gob.repository.DetalleRepository;



public class AppDetalle {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("root-context.xml");
		DetalleRepository repo = context.getBean("detalleRepository", DetalleRepository.class);
		List<Detalle> lista  =repo.findAll();
		for(Detalle p:lista) {
			System.out.println(p);
		}
		context.close();

	}

}
