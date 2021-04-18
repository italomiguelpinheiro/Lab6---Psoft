package repository;

import model.*;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class PessoaRepository {
    private Map<String, Pessoa> pessoaRepositorio = new HashMap<>();

    public void create(Pessoa novaPessoa){
        Pessoa pessoaJaExistente = findByCpf(novaPessoa.getCpf());
        pessoaRepositorio.put(novaPessoa.getCpf(), novaPessoa);
    }


    public Pessoa findByCpf(String cpf) {
        return this.pessoaRepositorio.get(cpf);
    }


    public void update(Pessoa pessoaAtualizada){
        Pessoa pessoaJaExistente = findByCpf(pessoaAtualizada.getCpf());
        pessoaRepositorio.replace(pessoaAtualizada.getCpf(), pessoaAtualizada);
    }

    public Collection<Pessoa> getPessoas() {
        return pessoaRepositorio.values();
    }

}
