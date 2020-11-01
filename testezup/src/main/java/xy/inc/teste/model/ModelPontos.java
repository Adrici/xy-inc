package xy.inc.teste.model;

import javax.persistence.*;
import javax.validation.constraints.*;

@Entity
@Table(name = "pontos")  
public class ModelPontos {

	@Id	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotNull
	@Size(min = 3, max = 100)
	private String nome;
	
	@NotNull
	@Positive
	private int coordenadax;	
	
	@NotNull
	@Positive
	private int coordenaday;
	
	//Getters and Setters
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCoordenadax() {
		return coordenadax;
	}

	public void setCoordenadax(int coordenadax) {
		this.coordenadax = coordenadax;
	}

	public int getCoordenaday() {
		return coordenaday;
	}

	public void setCoordenaday(int coordenaday) {
		this.coordenaday = coordenaday;
	}
	
	
	
}
