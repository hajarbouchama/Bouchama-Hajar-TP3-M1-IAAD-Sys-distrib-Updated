package ma.bouchama.hospital2.security.repo;


import ma.bouchama.hospital2.security.entities.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppUserRepository extends JpaRepository<AppUser,String>
{
    AppUser findByUsername(String username);
}

