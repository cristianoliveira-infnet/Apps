package br.edu.infnet.AppBanco.controleGastos.repository;

import br.edu.infnet.AppBanco.controleGastos.model.Receita;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReceitaRepository extends JpaRepository<Receita, Integer> {


}
