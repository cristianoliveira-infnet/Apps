package br.edu.infnet.AppBanco.controleGastos.repository;

import br.edu.infnet.AppBanco.controleGastos.model.Lancamento;
import org.springframework.data.repository.CrudRepository;

public interface LancamentoRepository extends CrudRepository<Lancamento, Integer> {
}
