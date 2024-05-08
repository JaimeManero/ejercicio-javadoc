package com.ejemplo.clases;
/**
 * Clase que representa a un alumno.
 */
public class Alumno {
    private String identificador;
    private String nombre;
    private String curso;
    /**
     * Constructor de la clase Alumno.
     * @param identificador el identificador del alumno.
     * @param nombre el nombre del alumno.
     * @param curso el curso en el que está el alumno.
     */
    // Constructor
    public Alumno(String identificador, String nombre, String curso) {
        this.identificador = identificador;
        this.nombre = nombre;
        this.curso = curso;
    }
    /**
     * Método para matricular al alumno en un nuevo curso.
     * @param curso el nuevo curso en el que se matricula el alumno.
     */
    public void matricular(String curso){
        this.curso = curso + " 1";
    }
    /**
     * Método para que el alumno pase al siguiente curso o se titule.
     */

    public void pasarDeCurso(){
        String[] curso = this.curso.split(" ");
        int numeroCurso = Integer.parseInt(curso[1]);
        if(numeroCurso == 1)
        {
            this.curso = curso[0] + " " + (numeroCurso + 1);
        }
        else{
            this.curso = "Titulado en " + curso[0];
        }

    }
    /**
     * Obtiene el identificador del alumno.
     * @return el identificador del alumno.
     */
    // Getters y Setters
    public String getIdentificador() {
        return identificador;
    }
    /**
     * Establece el identificador del alumno.
     * @param identificador el nuevo identificador del alumno.
     */
    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }
    /**
     * Obtiene el nombre del alumno.
     * @return el nombre del alumno.
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * Establece el nombre del alumno.
     * @param nombre el nuevo nombre del alumno.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * Obtiene el curso del alumno.
     * @return el curso del alumno.
     */
    public String getCurso() {
        return curso;
    }
    /**
     * Establece el curso del alumno.
     * @param curso el nuevo curso del alumno.
     */
    public void setCurso(String curso) {
        this.curso = curso;
    }
}
