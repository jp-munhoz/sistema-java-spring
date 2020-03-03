package br.com.construmoura.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "funcionario")
public class Funcionario {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String nome;
    private String matricula;
    private String data_nascimento;
    private String rg;
    private String data_emissao;
    private String orgao_expeditor;
    private String cpf;
    private String titulo_eleitor;
    private String pis;
    private String endereco_funcionario;
    private String pais;
    private String nacionalidade;
    private String estado_civil;
    private String dependente;
    private String nome_dependente;
    private String cpf_dependente;
    private String parentesco;
    private String funcao_funcionario;
    private String cbo;
    private String hora_semanal;
    private String hora_mensal;
    private String contrato;
    private String salario;
    private String banco;
    private String agencia;
    private String conta;
    private String dias_trabalhador;
    private String dias_termino;
    private String dias_prorrogados;
    private String termino_prorrogacao;
    private String exame_data;
    private String exame_validade;
    private String Sexo;

    public Funcionario(){}

    public Funcionario(String nome,
                       String matricula,
                       String data_nascimento,
                       String rg,
                       String data_emissao,
                       String orgao_expeditor,
                       String cpf,
                       String titulo_eleitor,
                       String pis,
                       String endereco_funcionario,
                       String pais,
                       String nacionalidade,
                       String estado_civil,
                       String dependente,
                       String nome_dependente,
                       String cpf_dependente,
                       String parentesco,
                       String funcao_funcionario,
                       String cbo,
                       String hora_semanal,
                       String hora_mensal,
                       String contrato,
                       String salario,
                       String banco,
                       String agencia,
                       String conta,
                       String dias_trabalhador,
                       String dias_termino,
                       String dias_prorrogados,
                       String termino_prorrogacao,
                       String exame_data,
                       String exame_validade){

        this.id = id;
        this.nome = nome;
        this.matricula = matricula;
        this.data_nascimento = data_nascimento;
        this.rg = rg;
        this.data_emissao = data_emissao;
        this.orgao_expeditor = orgao_expeditor;
        this.cpf = cpf;
        this.titulo_eleitor = titulo_eleitor;
        this.pis = pis;
        this.endereco_funcionario = endereco_funcionario;
        this.pais = pais;
        this.nacionalidade = nacionalidade;
        this.estado_civil = estado_civil;
        this.dependente = dependente;
        this.nome_dependente = nome_dependente;
        this.cpf_dependente = cpf_dependente;
        this.parentesco = parentesco;
        this.funcao_funcionario = funcao_funcionario;
        this.cbo = cbo;
        this.hora_semanal = hora_semanal;
        this.hora_mensal = hora_mensal;
        this.contrato = contrato;
        this.salario = salario;
        this.banco = banco;
        this.agencia = agencia;
        this.conta = conta;
        this.dias_trabalhador = dias_trabalhador;
        this.dias_termino = dias_termino;
        this.dias_prorrogados = dias_prorrogados;
        this.termino_prorrogacao = termino_prorrogacao;
        this.exame_data = exame_data;
        this.exame_validade = exame_validade;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getData_nascimento() {
        return data_nascimento;
    }

    public void setData_nascimento(String data_nascimento) {
        this.data_nascimento = data_nascimento;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getData_emissao() {
        return data_emissao;
    }

    public void setData_emissao(String data_emissao) {
        this.data_emissao = data_emissao;
    }

    public String getOrgao_expeditor() {
        return orgao_expeditor;
    }

    public void setOrgao_expeditor(String orgao_expeditor) {
        this.orgao_expeditor = orgao_expeditor;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTitulo_eleitor() {
        return titulo_eleitor;
    }

    public void setTitulo_eleitor(String titulo_eleitor) {
        this.titulo_eleitor = titulo_eleitor;
    }

    public String getPis() {
        return pis;
    }

    public void setPis(String pis) {
        this.pis = pis;
    }

    public String getEndereco_funcionario() {
        return endereco_funcionario;
    }

    public void setEndereco_funcionario(String endereco_funcionario) {
        this.endereco_funcionario = endereco_funcionario;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public String getEstado_civil() {
        return estado_civil;
    }

    public void setEstado_civil(String estado_civil) {
        this.estado_civil = estado_civil;
    }

    public String getDependente() {
        return dependente;
    }

    public void setDependente(String dependente) {
        this.dependente = dependente;
    }

    public String getNome_dependente() {
        return nome_dependente;
    }

    public void setNome_dependente(String nome_dependente) {
        this.nome_dependente = nome_dependente;
    }

    public String getCpf_dependente() {
        return cpf_dependente;
    }

    public void setCpf_dependente(String cpf_dependente) {
        this.cpf_dependente = cpf_dependente;
    }

    public String getParentesco() {
        return parentesco;
    }

    public void setParentesco(String parentesco) {
        this.parentesco = parentesco;
    }

    public String getFuncao_funcionario() {
        return funcao_funcionario;
    }

    public void setFuncao_funcionario(String funcao_funcionario) {
        this.funcao_funcionario = funcao_funcionario;
    }

    public String getCbo() {
        return cbo;
    }

    public void setCbo(String cbo) {
        this.cbo = cbo;
    }

    public String getHora_semanal() {
        return hora_semanal;
    }

    public void setHora_semanal(String hora_semanal) {
        this.hora_semanal = hora_semanal;
    }

    public String getHora_mensal() {
        return hora_mensal;
    }

    public void setHora_mensal(String hora_mensal) {
        this.hora_mensal = hora_mensal;
    }

    public String getContrato() {
        return contrato;
    }

    public void setContrato(String contrato) {
        this.contrato = contrato;
    }

    public String getSalario() {
        return salario;
    }

    public void setSalario(String salario) {
        this.salario = salario;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getConta() {
        return conta;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }

    public String getDias_trabalhador() {
        return dias_trabalhador;
    }

    public void setDias_trabalhador(String dias_trabalhador) {
        this.dias_trabalhador = dias_trabalhador;
    }

    public String getDias_termino() {
        return dias_termino;
    }

    public void setDias_termino(String dias_termino) {
        this.dias_termino = dias_termino;
    }

    public String getDias_prorrogados() {
        return dias_prorrogados;
    }

    public void setDias_prorrogados(String dias_prorrogados) {
        this.dias_prorrogados = dias_prorrogados;
    }

    public String getTermino_prorrogacao() {
        return termino_prorrogacao;
    }

    public void setTermino_prorrogacao(String termino_prorrogacao) {
        this.termino_prorrogacao = termino_prorrogacao;
    }

    public String getExame_data() {
        return exame_data;
    }

    public void setExame_data(String exame_data) {
        this.exame_data = exame_data;
    }

    public String getExame_validade() {
        return exame_validade;
    }

    public void setExame_validade(String exame_validade) {
        this.exame_validade = exame_validade;
    }
}
