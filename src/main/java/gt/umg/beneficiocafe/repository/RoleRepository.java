package gt.umg.beneficiocafe.repository;

import gt.umg.beneficiocafe.models.ERole;
import gt.umg.beneficiocafe.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface RoleRepository extends JpaRepository<Role, UUID> {
    Optional<Role> findByName(ERole name);
}
