package br.edu.unoesc.controller;

import java.time.LocalDate;
import java.util.List;

import javax.inject.Inject;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Result;
import br.edu.unoesc.dao.PartidoService;
import br.edu.unoesc.dao.ProjetoService;
import br.edu.unoesc.dao.VereadorService;
import br.edu.unoesc.model.Partido;
import br.edu.unoesc.model.Projeto;
import br.edu.unoesc.model.Vereador;

@Controller
@Path("/vereador")
public class VereadorController {
	@Inject
	private Result result;
	@Inject
	private VereadorService service;
	@Inject
	private PartidoService partidoService;
	@Inject
	private ProjetoService projetoService;

	@Get("/lista")
	public void lista() {
		result.include("lista", service.listar(Vereador.listarTodos, Vereador.class));
	}

	@Get("/novo")
	public void novo() {
		result.include("partidos", partidoService.listar(Partido.listarTodos, Partido.class));
	}

	@Post("/novo")
	public void novo(Vereador vereador) {
		service.inserir(vereador);
		result.redirectTo(this).lista();
	}

	@Get("/visualizar/cadastroProjeto/{vereador.codigo}")
	public void cadastroProjeto(Vereador vereador) {

	}

	@Post("/visualizar/cadastroProjeto/{vereador.codigo}")
	public void cadastrarProjeto(Vereador vereador, Projeto projeto) {
		projeto.setVereador(vereador);
		vereador.getProjetos().add(projeto);
		service.adicionaProjetos(vereador);
		result.redirectTo(VereadorController.class).lista();
	}

	@Get("/visualizar/{vereador.codigo}")
	public void visualizar(Vereador vereador) {
		result.include("projetos", (projetoService.buscaProjetoPorVereador(vereador.getCodigo())));
		result.include("partidos", partidoService.listar(Partido.listarTodos, Partido.class));
		result.include(service.buscar(Vereador.class, vereador.getCodigo()));
	}
	@Post("/visualizar/atualizaprojeto")
	public void atualizaProjetos(List<Projeto> projetos ) {
		for (Projeto projeto : projetos) {
			projetoService.alterarProjetos(projeto);
		}
		result.redirectTo(this).lista();
	}

}
