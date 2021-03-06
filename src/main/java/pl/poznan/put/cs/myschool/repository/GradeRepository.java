package pl.poznan.put.cs.myschool.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;
import pl.poznan.put.cs.myschool.model.Grade;

@RepositoryRestResource
@CrossOrigin(origins = "http://localhost:4200s")
public interface GradeRepository extends JpaRepository<Grade, Long> {
}