package repository;

import model.*;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class PessoaRepository {
    private Map<String, Pessoa> pessoaRepositorio = new HashMap<>();

    public void create(Pessoa novaPessoa) throws IllegalAccessException {
        Pessoa pessoaJaExistente = findByCpf(novaPessoa.getCpf());

        if (pessoaJaExistente != null) {
            throw new IllegalAccessException("Pessoa já cadastrada");
        }

        pessoaRepositorio.put(novaPessoa.getCpf(), novaPessoa);
    }


    public Pessoa findByCpf(String cpf) {
        return this.pessoaRepositorio.get(cpf);
    }


    public void update(Pessoa pessoaAtualizada) throws IllegalAccessException {
        Pessoa pessoaJaExistente = findByCpf(pessoaAtualizada.getCpf());

        if (pessoaJaExistente == null) {
            throw new IllegalAccessException("Pessoa não cadastrada");
        }

        pessoaRepositorio.replace(pessoaAtualizada.getCpf(), pessoaAtualizada);
    }

    public Collection<Pessoa> getPessoas() {
        return pessoaRepositorio.values();
    }

}
