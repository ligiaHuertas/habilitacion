package habilitacion.ciclo4;

import habilitacion.ciclo4.Repository.crudRepository.ProductCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Ciclo4Application implements CommandLineRunner{
    @Autowired
    private ProductCrudRepository productCrudRepository;


	public static void main(String[] args) {
		SpringApplication.run(Ciclo4Application.class, args);
	}
    @Override
    public void run(String... args) throws Exception {
    productCrudRepository.deleteAll();
    }
}
