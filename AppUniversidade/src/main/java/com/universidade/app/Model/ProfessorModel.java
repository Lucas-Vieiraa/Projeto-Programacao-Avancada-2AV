package com.universidade.app.Model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "professor")
public class ProfessorModel implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idProfessor;
	private String nomeProfessor;
	private String telefoneProfessor;
	private Double valorHoraAulaProfessor;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "professorModel", fetch = FetchType.LAZY)
	@JsonIgnore
	private List<TurmaModel> turmaModels;
}
