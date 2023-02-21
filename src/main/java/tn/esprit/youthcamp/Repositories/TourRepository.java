package tn.esprit.youthcamp.Repositories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.youthcamp.Entities.Tour;

@Repository
public interface TourRepository extends JpaRepository <Tour,Integer>{
}
