package xy.inc.teste.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import xy.inc.teste.model.ModelPontos;

@Repository
public interface RepositoryPontos extends JpaRepository<ModelPontos, Long> {
	public List<ModelPontos> findAllByNomeContainingIgnoreCase (String nome);
}
