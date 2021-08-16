package hrworker.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import hrworker.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long>{

}
