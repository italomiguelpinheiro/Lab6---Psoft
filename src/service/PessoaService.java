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

    public void cadastrarPessoa(PessoaDto pessoaDto) {
        Situacao situacao = SituacaoFactory.factorySituacao(pessoaDto.getSituacao());

        Pessoa novaPessoa = new Pessoa(pessoaDto.getNomeCompleto(), pessoaDto.getCPF(),
                pessoaDto.getEndereço(), pessoaDto.getCartaoSus(), pessoaDto.getEmail(),
                pessoaDto.getTelefone(), pessoaDto.getProfissao(), pessoaDto.getCormobidades(), situacao);

        pessoaRepository.create(novaPessoa);
    }

    public void updatePessoa(PessoaDto pessoaDto)  {
        Situacao situacao = SituacaoFactory.factorySituacao(pessoaDto.getSituacao());

        Pessoa pessoaAtualizada = new Pessoa(pessoaDto.getNomeCompleto(), pessoaDto.getCPF(),
                pessoaDto.getEndereço(), pessoaDto.getCartaoSus(), pessoaDto.getEmail(),
                pessoaDto.getTelefone(), pessoaDto.getProfissao(), pessoaDto.getCormobidades(), situacao);

        pessoaRepository.update(pessoaAtualizada);
    }

    public Pessoa getPessoa(String cpf){
        Pessoa pessoa = pessoaRepository.findByCpf(cpf);

        return pessoa;
    }


    public String getSituacao(String cpf){
        Pessoa pessoa = pessoaRepository.findByCpf(cpf);

                    return pessoa.getSitucao();
        
    }

    public String alterarSituacao(String cpf) {
        Pessoa pessoa = pessoaRepository.findByCpf(cpf);
        
        pessoa.avancarSituacao();
        return pessoa.getSitucao();
    }


    
}
