/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet.service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.core.Request;
import streaming.entity.Film;
import streaming.entity.Genre;

/**
 *
 * @author admin
 */
public class FilmServiceMockImpl {

    public List<Film> listerTous() {
        List<Film> films = new ArrayList<>();
        Film f = new Film(1L, "Kung Fu Panda", 2008L, "dessin anime", null, null);
        Film f1 = new Film(2L, "Django", 2012L, "film Quantin Tarantino", null, null);
        films.add(f);
        films.add(f1);

        return films;

    }

    public Film findById(Long id) {
        if (id == 1) {
            return new Film(1L, "Kung Fu Panda", 2008L, "dessin anime", null, null);
        }

        if (id == 2) {
            return new Film(2L, "Django", 2012L, "film Quantin Tarantino", null, null);
        }

        return new Film();
    }
    
}
