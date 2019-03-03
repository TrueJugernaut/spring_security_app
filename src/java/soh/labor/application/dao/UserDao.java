package soh.labor.application.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import soh.labor.application.models.User;

public interface UserDao extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
