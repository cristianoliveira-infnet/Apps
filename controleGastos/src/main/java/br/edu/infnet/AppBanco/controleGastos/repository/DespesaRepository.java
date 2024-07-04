package br.edu.infnet.AppBanco.controleGastos.repository;

import br.edu.infnet.AppBanco.controleGastos.model.Despesa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DespesaRepository extends JpaRepository<Despesa, Integer> {

}
