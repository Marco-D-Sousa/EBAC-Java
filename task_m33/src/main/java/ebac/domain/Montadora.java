package ebac.domain;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "tb_montadora")
public class Montadora {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "montadora_sq")
	@SequenceGenerator(name = "montadora_seq", sequenceName = "sq_montadora", allocationSize = 1)
	private Long id;

	private String nome;

	@OneToMany(mappedBy = "montadora")
	private List<Carro> carros;
}
