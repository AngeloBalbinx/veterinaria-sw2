package pe.edu.cibertec.veterinariasw2;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import pe.edu.cibertec.veterinariasw2.entidades.Mascota;
import pe.edu.cibertec.veterinariasw2.repositorios.MascotaRepository;


@RestController
public class MascotaController {

    // veterinaria-don-tito.com

    MascotaRepository mascotaRepository; // si yo necesito para que funcione (tu dependes)
    MascotaController(MascotaRepository mascotaRepository){
        this.mascotaRepository = mascotaRepository;
            
        
    }


    @RequestMapping("obtenerMascotas")
    public List<Mascota> listarMascotas(){
        return mascotaRepository.findAll();
    }
}
