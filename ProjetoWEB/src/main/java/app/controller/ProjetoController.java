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

import app.model.Projeto;
import app.repository.ProjetoRepository;

@RestController
@RequestMapping(value = "/projetos")
public class ProjetoController {

	@Autowired
	private ProjetoRepository projetoRepository;

	@GetMapping
	public List<Projeto> getProjetos() {
		return projetoRepository.findAll();
	}

	@GetMapping("/{id}")
	public Optional<Projeto> getProjetoById(@PathVariable Long id) {
		return projetoRepository.findById(id);
	}

	@PostMapping
	public Projeto createProjeto(@RequestBody Projeto projeto) {
		return projetoRepository.save(projeto);

	}

	@PutMapping("/{id}")
	public Projeto updateProjeto(@PathVariable("id") String id, @RequestBody Projeto projeto) {
		return projetoRepository.save(projeto);
	}

	@DeleteMapping
	public void deleteAllProjeto() {
		projetoRepository.deleteAll();
	}

	@DeleteMapping("/{id}")
	public void deleteProjeto(@PathVariable Long id) {
		projetoRepository.delete(projetoRepository.findById(id).get());
	}

}
