package org.acme.rest.json;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.Collections;
import java.util.Set;

@Path("/v2")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class CountryResource {

    @GET
    @Path("/name/{name}")
    public Set<Country> get(@PathParam("name") String name) {
        Country country = new Country();
        country.name = "Czech Republic";
        country.alpha2Code = "CZ";
        country.capital = "Prague";
        country.currencies = Collections.emptyList();
        return Collections.singleton(country);
    }

}
