package br.com.teamcreziosp.application.repository;

import br.com.teamcreziosp.application.model.Aula;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AulaRepository extends JpaRepository<Aula, Integer> {
}
