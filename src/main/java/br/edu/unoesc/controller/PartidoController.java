package br.edu.unoesc.controller;

import javax.inject.Inject;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Result;
import br.edu.unoesc.dao.PartidoService;
import br.edu.unoesc.model.Partido;

@Controller
@Path("/partido")
public class PartidoController {
	@Inject
	private Result result;
	@Inject
	private PartidoService service;

	@Get("/lista")
	public void lista() {
		result.include("lista", service.listar(Partido.listarTodos, Partido.class));
	}

	@Get("/novo")
	public void novo() {

	}
	@Post("/novo")
	public void novo(Partido partido) {
		service.inserir(partido);
		result.redirectTo(this).lista();
	}
}
