package br.edu.infnet.AppBanco.controleGastos.repository;

import br.edu.infnet.AppBanco.controleGastos.model.Despesa;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;
@Repository
public interface DespesaRepository extends CrudRepository<Despesa, Integer> {
    Collection<Despesa> findAll(Sort by);
}
