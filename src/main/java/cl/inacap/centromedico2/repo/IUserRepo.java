package cl.inacap.centromedico2.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cl.inacap.centromedico2.model.Users;

@Repository
public interface IUserRepo extends JpaRepository<Users, Long>  {
    public Optional<Users> findByUsername(String username);
}