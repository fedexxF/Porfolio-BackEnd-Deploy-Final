package Porfolio.BackEnd.repository;

import Porfolio.BackEnd.model.Educacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EduacacionRepository extends JpaRepository<Educacion,Long> {
}
