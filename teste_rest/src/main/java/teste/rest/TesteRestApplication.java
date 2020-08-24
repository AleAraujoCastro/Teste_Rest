package teste.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * Classe resposável por fazer a ativação de todos os recursos necessários
 * @author Alexandre
 *
 */

@SpringBootApplication //Levanta o servidor e traz configurações
@EntityScan(basePackages = {"com.teste.rest.model"}) //Chama as classes do pacote model e cria as tabelas automaticamente
@ComponentScan(basePackages = {"teste_rest"}) //Varre todo o projeto e faz a injeção de dependências
@EnableJpaRepositories(basePackages = "com.teste.rest.repository") //Habilita as Persistências
@EnableTransactionManagement //Controla as transações para evitar erros.
@EnableWebMvc //Habilitando a estrura MVC
@RestController //Habilita o REST - Retornando em JSON
@EnableAutoConfiguration //Configuração Automática do Projeto
@EnableJpaAuditing
public class TesteRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(TesteRestApplication.class, args);
	}
	
	
}
