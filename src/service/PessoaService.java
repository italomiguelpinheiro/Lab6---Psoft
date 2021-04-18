package service;

import model.PessoaDto;
import model.Pessoa;
import repository.PessoaRepository;
import situacao.Situacao;
import situacao.SituacaoFactory;


public class PessoaService {
    private PessoaRepository pessoaRepository;

    public PessoaService() {
        this.pessoaRepository = new PessoaRepository();
    }

    public void cadastrarPessoa(PessoaDto pessoaDto) throws IllegalAccessException {
        Situacao situacao = SituacaoFactory.factorySituacao(pessoaDto.getSituacao());

        Pessoa novaPessoa = new Pessoa(pessoaDto.getNomeCompleto(), pessoaDto.getCPF(),
                pessoaDto.getEndereço(), pessoaDto.getCartaoSus(), pessoaDto.getEmail(),
                pessoaDto.getTelefone(), pessoaDto.getProfissao(), pessoaDto.getCormobidades(), situacao);

        pessoaRepository.create(novaPessoa);
    }

    public void updatePessoa(PessoaDto pessoaDto) throws IllegalAccessException {
        Situacao situacao = SituacaoFactory.factorySituacao(pessoaDto.getSituacao());

        Pessoa pessoaAtualizada = new Pessoa(pessoaDto.getNomeCompleto(), pessoaDto.getCPF(),
                pessoaDto.getEndereço(), pessoaDto.getCartaoSus(), pessoaDto.getEmail(),
                pessoaDto.getTelefone(), pessoaDto.getProfissao(), pessoaDto.getCormobidades(), situacao);

        pessoaRepository.update(pessoaAtualizada);
    }

    public Pessoa getPessoa(String cpf) throws IllegalAccessException {
        Pessoa pessoa = pessoaRepository.findByCpf(cpf);
        checkPessoa(pessoa);
        return pessoa;
    }


    public String getSituacao(String cpf) throws IllegalAccessException {
        Pessoa pessoa = pessoaRepository.findByCpf(cpf);

        if (pessoa != null) {
            return pessoa.getSitucao();
        }

        throw new IllegalAccessException("Pessoa não encontrada");
    }

    public String alterarSituacao(String cpf) throws IllegalAccessException {
        Pessoa pessoa = pessoaRepository.findByCpf(cpf);
        checkPessoa(pessoa);
        pessoa.avancarSituacao();
        return pessoa.getSitucao();
    }


    private void checkPessoa(Pessoa pessoa) throws IllegalAccessException {
        if (pessoa == null) {
            throw new IllegalAccessException("Pessoa não encontrada");
        }
    }
}
