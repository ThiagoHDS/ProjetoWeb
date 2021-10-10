package app.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import app.model.Professor;
import app.repository.ProfessorRepository;

@RestController
@RequestMapping(value = "/professores")
public class ProfessorController {

	@Autowired
	private ProfessorRepository professorRepository;

	@GetMapping
	public List<Professor> getProfessores() {
		return professorRepository.findAll();
	}

	@GetMapping("/{id}")
	public Optional<Professor> getProfessorById(@PathVariable Long id) {
		return professorRepository.findById(id);
	}

	@PostMapping
	public Professor createProfessor(@RequestBody Professor professor) {
		return professorRepository.save(professor);

	}

	@PutMapping("/{id}")
	public Professor updateProfessor(@PathVariable("id") String id, @RequestBody Professor professor) {
		return professorRepository.save(professor);
	}

	@DeleteMapping
	public void deleteAllProfessor() {
		professorRepository.deleteAll();
	}

	@DeleteMapping("/{id}")
	public void deleteProfessor(@PathVariable Long id) {
		professorRepository.delete(professorRepository.findById(id).get());
	}

}
