package com.dio_class.devweek.Repo;

import com.dio_class.devweek.Entity.IncidenciaExame;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IncidenciaRepo extends JpaRepository<IncidenciaExame, Long> {
}
