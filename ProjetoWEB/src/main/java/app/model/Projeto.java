package app.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "projeto")
@Data
@NoArgsConstructor
public class Projeto {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(name = "nome")
	private String nome;

	@Column(name = "descricao")
	private String descricao;

	@OneToOne
	@JoinColumn(name = "id_professor", referencedColumnName = "id")
	private Professor professor;

	@OneToMany(mappedBy = "projeto")
	private Set<Aluno> alunos;

	public Projeto(String nome, String descricao) {
		this.nome = nome;
		this.descricao = descricao;

	}

	public Projeto() {

	}
}
