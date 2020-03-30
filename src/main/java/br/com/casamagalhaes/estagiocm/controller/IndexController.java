package br.com.casamagalhaes.estagiocm.controller;

import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.Validator;
import br.com.caelum.vraptor.view.Results;

import javax.annotation.Resource;

@Resource
public class IndexController {

    private Result result;
    private Validator validator;

    public IndexController(Result result, Validator validator) {
        this.result = result;
        this.validator = validator;
    }

    @Get
    @Path("/")
    public void index() {
        result.include("variable", "Estagiário!");
    }

}
