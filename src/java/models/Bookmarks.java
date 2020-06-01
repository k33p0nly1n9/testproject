/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author bayan
 */
public class Bookmarks {
     private int id;
    private int personId;
    private int executorId;


    public Bookmarks(){}

    public Bookmarks( int personId, int executorId) {
        this.executorId = executorId;
        this.personId = personId;
    }

    public Bookmarks(int id,  int personId, int executorId) {
        this.id= id;
        this.executorId = executorId;
        this.personId = personId;
    }

    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getExecutorId() {
        return executorId;
    }

    public void setExecutorId(int executorId) {
        this.executorId = executorId;
    }
}
