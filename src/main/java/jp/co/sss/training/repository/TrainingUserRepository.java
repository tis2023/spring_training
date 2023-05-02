package jp.co.sss.training.repository;

import jp.co.sss.training.entity.TrainingUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TrainingUserRepository extends JpaRepository<TrainingUser, Integer> {
}
