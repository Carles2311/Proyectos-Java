package org.example.demojdbc.repository;



import org.example.demojdbc.model.Persona;
import org.example.demojdbc.repository.PersonaRepository;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/personas")
public class PersonaController {

    private final PersonaRepository personaRepository;

    // Constructor de inyección de dependencias
    public PersonaController(PersonaRepository personaRepository) {
        this.personaRepository = personaRepository;
    }

    // Método para insertar una nueva persona
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void insertarPersona(@RequestBody Persona persona) {
        personaRepository.insertar(persona);
    }

    // Método para obtener todas las personas
    @GetMapping
    public List<Persona> obtenerTodasLasPersonas() {
        return personaRepository.buscarTodos();
    }

    // Método para obtener una persona por nombre
    @GetMapping("/{nombre}")
    public Persona obtenerPersonaPorNombre(@PathVariable String nombre) {
        return personaRepository.buscarUno(nombre);
    }

    // Método para borrar una persona por nombre
    @DeleteMapping("/{nombre}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void borrarPersona(@PathVariable String nombre) {
        Persona persona = personaRepository.buscarUno(nombre);
        if (persona != null) {
            personaRepository.borrar(persona);
        }
    }

    // Método para borrar todas las personas
    @DeleteMapping
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void borrarTodasLasPersonas() {
        personaRepository.borrarTodos();
    }
}
