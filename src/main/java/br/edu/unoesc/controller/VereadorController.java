package br.edu.unoesc.controller;

import javax.inject.Inject;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Result;
import br.edu.unoesc.dao.PartidoService;
import br.edu.unoesc.dao.VereadorService;
import br.edu.unoesc.model.Partido;
import br.edu.unoesc.model.Vereador;

@Controller
@Path("/vereador")
public class VereadorController {
	@Inject
	private Result result;
	@Inject
	private VereadorService service;
	@Inject
	private PartidoService Partidoservice;

	@Get("/lista")
	public void lista() {
		result.include("lista", service.listar(Vereador.listarTodos, Vereador.class));
	}

	@Get("/novo")
	public void novo() {
		result.include("partidos", Partidoservice.listar(Partido.listarTodos, Partido.class));
	}

	@Post("/novo")
	public void novo(Vereador vereador) {
		service.inserir(vereador);
		result.redirectTo(this).lista();
	}

}
