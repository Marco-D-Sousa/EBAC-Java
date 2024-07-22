package ebac.domain;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "tb_carro")
public class Carro {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "carro_sq")
	@SequenceGenerator(name = "carro_seq", sequenceName = "sq_carro", allocationSize = 1)
	private Long id;

	@Column(name = "modelo", length = 10, nullable = false)
	private String modelo;

	@Column(name = "valor", nullable = false)
	private Double valor;

	@ManyToOne
	@JoinColumn(name = "montadora_id")
	private Montadora montadora;

	@OneToMany(mappedBy = "carro")
	private List<Acessorio> acessorios;

	public Montadora getMontadora() {
		return montadora;
	}

	public void setMontadora(Montadora montadora) {
		this.montadora = montadora;
	}
}
