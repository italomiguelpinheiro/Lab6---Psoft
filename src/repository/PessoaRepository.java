package repository;

import model.*;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class PessoaRepository {
    private Map<String, Pessoa> pessoaRepositorio = new HashMap<>();

    public void create(Pessoa novaPessoa){
        pessoaRepositorio.put(novaPessoa.getCpf(), novaPessoa);
    }

    public Pessoa findByCpf(String cpf) {
        return this.pessoaRepositorio.get(cpf);
    }

    public void update(Pessoa pessoaAtualizada){
        pessoaRepositorio.replace(pessoaAtualizada.getCpf(), pessoaAtualizada);
    }

    public Collection<Pessoa> getPessoas() {
        return pessoaRepositorio.values();
    }

}
