package xy.inc.teste;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import xy.inc.teste.model.ModelPontos;
import xy.inc.teste.repository.RepositoryPontos;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Teste{
	
	@Autowired
	private RepositoryPontos repository; 
	
	@Test
	public void testaPontos1() {
	List<ModelPontos> pontos = repository.findAllByNomeContainingIgnoreCase("enter");
	assertThat(pontos);
	}

} 