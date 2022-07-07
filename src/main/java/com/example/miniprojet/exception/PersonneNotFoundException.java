package com.example.miniprojet.exception;

public class PersonneNotFoundException extends RuntimeException {

    public PersonneNotFoundException(Long id) {
        super("Vous ne pouvez pas trouver la personne avec l'identifiant : " + id);
    }
}
