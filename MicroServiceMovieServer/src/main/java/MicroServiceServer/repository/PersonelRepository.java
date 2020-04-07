package MicroServiceServer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import MicroServiceServer.model.Personel;

public interface PersonelRepository extends JpaRepository<Personel, Integer>{

}
