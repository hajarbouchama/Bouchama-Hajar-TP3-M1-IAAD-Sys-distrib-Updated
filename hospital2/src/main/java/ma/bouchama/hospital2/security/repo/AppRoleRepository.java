package ma.bouchama.hospital2.security.repo;


import ma.bouchama.hospital2.security.entities.AppRole;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppRoleRepository extends JpaRepository<AppRole,String>
{

}
