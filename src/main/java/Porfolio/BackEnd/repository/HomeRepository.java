package Porfolio.BackEnd.repository;

import Porfolio.BackEnd.model.Home;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HomeRepository extends JpaRepository<Home,Long> {
}
