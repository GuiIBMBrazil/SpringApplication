package com.example.Filmes.domain;

import java.util.ArrayList;
import java.util.List;

public class FilmeService {
    public List<Filmes> getFilmes(){
        List<Filmes> movies = new ArrayList<>();

        movies.add(new Filmes("Batman Begins","Christopher Nolan",2));
        movies.add(new Filmes("Lord Of The Rings","Peter Jackson",4));
        movies.add(new Filmes("Spider-Man(2002)","Sam Raimi",2));

        return movies;
    }
}
