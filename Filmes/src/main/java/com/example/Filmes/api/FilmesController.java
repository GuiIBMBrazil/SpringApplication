package com.example.Filmes.api;

import com.example.Filmes.domain.FilmeService;
import com.example.Filmes.domain.Filmes;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/movies")
public class FilmesController {
    private FilmeService service = new FilmeService();

    @GetMapping
    public List<Filmes> get(){
        return service.getFilmes();
    }
}
