package app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import app.model.Professor;

@Repository
public interface ProfessorRepository extends JpaRepository<Professor, Long> {

}
