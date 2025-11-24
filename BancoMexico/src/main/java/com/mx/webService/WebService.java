package com.mx.webService;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.mx.Entity.Creditos;
import com.mx.Service.Implementacion;

@Path("Api")
public class WebService {

	Implementacion imp = new Implementacion();

	// http://localhost:9001/BancoMexico/bancoMexico/Api/listar

	@Path("listar")
	@POST
	@Consumes({ MediaType.APPLICATION_JSON })
	@Produces({ MediaType.APPLICATION_JSON })
	public Response listar() {
		return Response.ok(imp.findAll()).build();
	}

	// http://localhost:9001/BancoMexico/bancoMexico/Api/buscar

	@Path("buscar")
	@POST
	@Consumes({ MediaType.APPLICATION_JSON })
	@Produces({ MediaType.APPLICATION_JSON })
	public Response buscar(Creditos credito) {
		return Response.ok(imp.findById(credito.getId())).build();
	}

	// http://localhost:9001/BancoMexico/bancoMexico/Api/busca/

	@Path("busca/{id}")
	@POST
	@Consumes({ MediaType.APPLICATION_JSON })
	@Produces({ MediaType.APPLICATION_JSON })
	public Response buscar(@PathParam("id") int id) {
		return Response.ok(imp.findById(id)).build();

	}

	// http://localhost:9001/BancoMexico/bancoMexico/Api/gurdar

	@Path("gurdar")
	@POST
	@Consumes({ MediaType.APPLICATION_JSON })
	@Produces({ MediaType.APPLICATION_JSON })
	public Response gurdar(Creditos credito) {
		return Response.ok(imp.save(credito)).build();

	}

	// http://localhost:9001/BancoMexico/bancoMexico/Api/editar

	@Path("editar")
	@POST
	@Consumes({ MediaType.APPLICATION_JSON })
	@Produces({ MediaType.APPLICATION_JSON })
	public Response editar(Creditos credito) {
		return Response.ok(imp.update(credito)).build();

	}

	// http://localhost:9001/BancoMexico/bancoMexico/Api/eliminar

	@Path("eliminar")
	@POST
	@Consumes({ MediaType.APPLICATION_JSON })
	@Produces({ MediaType.APPLICATION_JSON })
	public Response eliminar(Creditos credito) {
		return Response.ok(imp.deleteById(credito.getId())).build();

	}

	// http://localhost:9001/BancoMexico/bancoMexico/Api/elimina/1

	@Path("elimina/{id}")
	@POST
	@Consumes({ MediaType.APPLICATION_JSON })
	@Produces({ MediaType.APPLICATION_JSON })
	public Response eliminar(@PathParam("id") int id) {
		return Response.ok(imp.deleteById(id)).build();

	}
}
