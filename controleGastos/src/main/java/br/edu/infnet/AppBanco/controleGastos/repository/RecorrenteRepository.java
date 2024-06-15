package br.edu.infnet.AppBanco.controleGastos.repository;


import br.edu.infnet.AppBanco.controleGastos.model.Recorrente;
import org.springframework.stereotype.Repository;
@Repository
public interface RecorrenteRepository extends CrudRepository<Recorrente, Integer> {

}
