package xy.inc.teste.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import xy.inc.teste.model.ModelPontos;
import xy.inc.teste.repository.RepositoryPontos;

@RestController
@RequestMapping("/ponto") 
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class ControllerPontos { 
	
	@Autowired
	private RepositoryPontos repository;
	
	@GetMapping
	public ResponseEntity<List<ModelPontos>> GetByAll(){
		return ResponseEntity.ok(repository.findAll());
	}
	
	@PostMapping
	public ResponseEntity<ModelPontos> post (@RequestBody ModelPontos nome){
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(nome));
	} 
	
	@PutMapping
	public ResponseEntity<ModelPontos> put (@RequestBody ModelPontos modelpontos){
		return ResponseEntity.status(HttpStatus.OK).body(repository.save(modelpontos));
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable long id) {
		repository.deleteById(id);
	}	
		 
}
