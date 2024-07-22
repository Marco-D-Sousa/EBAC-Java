package ebac.domain;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_produto")
public class Produto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "nome", nullable = false)
	private String nome;

	@Column(name = "categoria", nullable = false)
	private String categoria;

	@Column(name = "valor", nullable = false)
	private Double valor;
}
