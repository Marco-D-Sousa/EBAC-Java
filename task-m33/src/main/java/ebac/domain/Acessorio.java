package ebac.domain;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "tb_acessorio")
public class Acessorio {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "acessorio_sq")
	@SequenceGenerator(name = "acessorio_seq", sequenceName = "sq_acessorio", allocationSize = 1)
	private Long id;

	private String codigo;

	private List<Carro> carros;

	@ManyToOne
	@JoinColumn(name = "carro_id")
	private Carro carro;

	public Carro getCarro() {
		return carro;
	}

	public void setCarro(Carro carro) {
		this.carro = carro;
	}
}
