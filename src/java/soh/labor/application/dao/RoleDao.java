package soh.labor.application.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import soh.labor.application.models.Role;

public interface RoleDao extends JpaRepository<Role, Long> {
}
