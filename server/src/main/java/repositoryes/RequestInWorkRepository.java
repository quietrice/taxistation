package repositoryes;

import entities.Car;
import entities.RequestInWork;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RequestInWorkRepository extends JpaRepository<RequestInWork, Long>
{
}
