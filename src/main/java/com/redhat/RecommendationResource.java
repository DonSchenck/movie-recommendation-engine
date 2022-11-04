package com.redhat;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/recommendations")
public class RecommendationResource {

    int SLEEP_MILLISECONDS = 0;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<MovieListing> recommendationList() {
        try {
            SLEEP_MILLISECONDS = Integer.parseInt(System.getenv("SLEEP_MILLISECONDS"));
            TimeUnit.MILLISECONDS.sleep(SLEEP_MILLISECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        List<MovieListing> ml = new ArrayList<>();

        // Populate movie listing array here from file

        MovieListing l = new MovieListing();
        l.setId(1);
        l.setImageURL("http://localhost/myimages/movie1.png");
        l.setName("The Big Lebowski");       
        ml.add(l);

        l = new MovieListing();
        l.setId(2);
        l.setImageURL("http://localhost/myimages/movie2.png");
        l.setName("The Music Man");
        ml.add(l);

        return ml;
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("{userid}")
    public List<MovieListing> recommendationListByUserId(@PathParam("userid") int id) {
        try {
            TimeUnit.MILLISECONDS.sleep(SLEEP_MILLISECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        List<MovieListing> ml = new ArrayList<>();

        // Populate movie listing array here from file

        MovieListing l = new MovieListing();
        l.setId(1);
        l.setImageURL("http://localhost/myimages/movie1.png");
        l.setName("The Big Lebowski");       
        ml.add(l);

        l = new MovieListing();
        l.setId(2);
        l.setImageURL("http://localhost/myimages/movie2.png");
        l.setName("The Music Man");
        ml.add(l);

        return ml;
    }
}