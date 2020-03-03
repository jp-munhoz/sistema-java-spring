package br.com.construmoura.Repository;

import br.com.construmoura.model.Funcionario;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface FuncionarioRepository extends CrudRepository<Funcionario, Integer> {


    List<Funcionario> findFuncionarioByMatricula(String matricula);
}
