package pe.edu.cibertec.veterinariasw2.controladores;


import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;
import pe.edu.cibertec.veterinariasw2.entidades.Mascota;
import pe.edu.cibertec.veterinariasw2.repositorios.MascotaRepository;


@RestController
@AllArgsConstructor
public class MascotaController {

    // veterinaria-don-tito.com

    MascotaRepository mascotaRepository; // si yo necesito para que funcione (tu dependes)
    /*MascotaController(MascotaRepository mascotaRepository){
        this.mascotaRepository = mascotaRepository;
    }*/


    @GetMapping("obtenerMascotas")
    public List<Mascota> listarMascotas(){
        return mascotaRepository.findAll();
    }

    @PostMapping("registrarMascota")
    public Long registrarMascota(Mascota mascota){
        Mascota mascotaGuardada = mascotaRepository.save(mascota);
        return mascotaGuardada.getId();
    }
}
