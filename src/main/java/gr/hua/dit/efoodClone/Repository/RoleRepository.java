package gr.hua.dit.efoodClone.Repository;


import gr.hua.dit.efoodClone.entity.ERole;
import gr.hua.dit.efoodClone.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(ERole name);
}
