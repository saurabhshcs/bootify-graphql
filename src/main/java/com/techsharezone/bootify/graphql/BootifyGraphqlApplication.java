package com.techsharezone.bootify.graphql;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BootifyGraphqlApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootifyGraphqlApplication.class, args);
	}
	@Autowired
	SuperCharacterRepo superCharacterRepo;

	@Bean
	public Query query(){return new Query(superCharacterRepo);}

	@Bean
	public Mutation mutation(){return new Mutation(superCharacterRepo);}


}
