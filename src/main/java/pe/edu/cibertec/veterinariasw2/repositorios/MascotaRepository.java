package pe.edu.cibertec.veterinariasw2.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import pe.edu.cibertec.veterinariasw2.entidades.Mascota;


public interface MascotaRepository extends JpaRepository<Mascota,Long> {
    
}
