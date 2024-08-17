package unam.diplomado.pixup.usuario.repository;

import unam.diplomado.pixup.usuario.domain.Colonia;

import java.util.List;
import java.util.Optional;

public interface ColoniaRepository {

    List<Colonia> findByCp(String cp);
    Optional<Colonia> findById(Integer id);

}
