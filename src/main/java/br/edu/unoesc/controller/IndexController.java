package br.edu.unoesc.controller;

import javax.inject.Inject;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Result;

@Controller
@Path("/")
public class IndexController {
	@Inject
	private Result result;
	
	@Get("/")
	public void index() {
		//index
	}
}
