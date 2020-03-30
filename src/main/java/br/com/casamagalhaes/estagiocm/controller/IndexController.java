package br.com.casamagalhaes.estagiocm.controller;

import br.com.caelum.vraptor.*;
import br.com.caelum.vraptor.view.HttpResult;
import br.com.caelum.vraptor.view.Results;
import br.com.casamagalhaes.estagiocm.model.Estagiario;
import br.com.casamagalhaes.estagiocm.service.EstagiarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

@Resource
public class IndexController {

    private Result result;
    private Validator validator;

    @Autowired
    private EstagiarioService estagiarioService;

    public IndexController(Result result, Validator validator) {
        this.result = result;
        this.validator = validator;
    }

    @Get
    @Path("/")
    public void index() {
        result.include("variable", "Estagiário!");
    }

    @Get
    @Path("/greeting")
    @Transactional
    public void greeting(Estagiario estagiario) {
        estagiarioService.darBoasVindas(estagiario);
        result.use(Results.json()).from(estagiario).serialize();
    }

}
