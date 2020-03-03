package br.com.construmoura.controller;

import br.com.construmoura.Repository.FuncionarioRepository;
import br.com.construmoura.model.Funcionario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import java.util.Collections;
import java.util.List;

@Controller
public class FuncionarioController {

    @Autowired
    private FuncionarioRepository repository;

    @Qualifier("getJavaMailSender")
    @Autowired
    private JavaMailSender javaMailSender;


    @RequestMapping("/")
    public String index( ) {

        return "index";
    }

    @RequestMapping(value = "listagem", method = RequestMethod.GET)
    public String listagem(Model model) {

        Iterable<Funcionario> funcionarios = repository.findAll();
        model.addAttribute("funcionarios", funcionarios);

        return "Listagem";
    }

    @RequestMapping(value = "ListagemADM", method = RequestMethod.GET)
    public String listagemADM(Model model) {

        Iterable<Funcionario> funcionarios = repository.findAll();
        model.addAttribute("funcionarios", funcionarios);

        return "ListagemADM";
    }

    @GetMapping(value = "ListagemADM{matricula}")
    public String buscarMatricula(Model model, @PathVariable("matricula") String matricula){

        List<Funcionario> funcionarios = repository.findFuncionarioByMatricula(matricula);
        model.addAttribute("funcionarios", funcionarios);

        return "ListagemADM";
    }

    @RequestMapping(value = "cadastrar", method = RequestMethod.POST)
    public String cadastrar(@RequestParam("nome") String nome, @RequestParam("matricula") String matricula, @RequestParam("rg") String rg, @RequestParam("data_emissao") String data_emissao,
                            @RequestParam("orgao_expeditor") String orgao_expeditor, @RequestParam("cpf") String cpf, @RequestParam("titulo_eleitor") String titulo_eleitor,
                            @RequestParam("pis") String pis, @RequestParam("endereco_funcionario") String endereco_funcionario, @RequestParam("pais") String pais,
                            @RequestParam("nacionalidade") String nacionalidade, @RequestParam("estado_civil") String estado_civil, @RequestParam("dependente") String dependente,
                            @RequestParam("nome_dependente") String nome_dependente, @RequestParam("cpf_dependente") String cpf_dependente, @RequestParam("parentesco")
                                    String parentesco, @RequestParam("funcao_funcionario") String funcao_funcionario, @RequestParam("cbo") String cbo, @RequestParam("hora_semanal")
                                    String hora_semanal, @RequestParam("hora_mensal") String hora_mensal, @RequestParam("contrato") String contrato, @RequestParam("salario")
                                    String salario, @RequestParam("banco") String banco, @RequestParam("agencia") String agencia, @RequestParam("conta") String conta,
                            @RequestParam("dias_trabalhador") String dias_trabalhador, @RequestParam("dias_termino") String dias_termino, @RequestParam("dias_prorrogados")
                                    String dias_prorrogados, @RequestParam("termino_prorrogacao") String termino_prorrogacao, @RequestParam("exame_data") String exame_data,
                            @RequestParam("exame_validade") String exame_validade, @RequestParam("data_nascimento") String data_nascimento, Model model) {


        Funcionario novoFuncionario = new Funcionario(nome, matricula, data_nascimento, rg, data_emissao, orgao_expeditor, cpf, titulo_eleitor,
                pis, endereco_funcionario, pais, nacionalidade, estado_civil, dependente, nome_dependente, cpf_dependente, parentesco, funcao_funcionario
                , cbo, hora_semanal, hora_mensal, contrato, salario, banco, agencia, conta, dias_trabalhador, dias_termino, dias_prorrogados, termino_prorrogacao, exame_data, exame_validade);

        repository.save(novoFuncionario);

        Iterable<Funcionario> funcionarios = repository.findAll();
        model.addAttribute("funcionarios", funcionarios);

        return "redirect:/Cadastro";
    }

    @RequestMapping(path = "/excluir/{id}")
    public String excluir(Model model, @PathVariable("id")Integer id){
        repository.deleteById(id);

        Iterable<Funcionario> funcionarios = repository.findAll();
        model.addAttribute("funcionarios", funcionarios);

        return "redirect:/ListagemADM";
    }


    @GetMapping(path = "/visualizar/{id}")
    public String visualizar(Model model,@PathVariable("id")Integer id){

        Iterable<Funcionario> funcionarios = repository.findAllById(Collections.singleton(id));
        model.addAttribute("funcionarios", funcionarios);


        return "Informacao";
    }

    @RequestMapping(value = "/editar/{id}", method = RequestMethod.GET)
    public String editar(Model model, @PathVariable("id")Integer id){

        Iterable<Funcionario> funcionarios = repository.findAllById(Collections.singleton(id));
        model.addAttribute("funcionarios", funcionarios);

        return "Editar";
    }

    @RequestMapping(value = "suporte", method = RequestMethod.POST)
    public String suporte(@RequestParam("matricula")String matricula, @RequestParam("problema")String problema){

        SimpleMailMessage msg = new SimpleMailMessage();
        msg.setTo("");
        msg.setSubject(matricula);
        msg.setText(problema);

        javaMailSender.send(msg);

        return "redirect:/Suporte";
    }


    @RequestMapping(value = "Cadastro", method = RequestMethod.GET)
    public String formCadastro(){

        return "Cadastro";
    }

    @RequestMapping(value = "Suporte", method = RequestMethod.GET)
    public String formSuporte(){

        return "Suporte";
    }


}

