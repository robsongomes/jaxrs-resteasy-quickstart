package br.com.robsonaraujo.service.api;

import java.io.Serializable;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.com.robsonaraujo.model.entity.Hello;

/**
 * See {@link RestConfiguration}
 * @author nosbo
 *
 */
@Path("/hello")
public class HelloService implements Serializable {
	private static final long serialVersionUID = -1848201147900590329L;

	@GET
	@Path("/hi")
	@Produces(MediaType.APPLICATION_XML)
	public Hello hi() {
		return new Hello("hello from rest");
	}
}
