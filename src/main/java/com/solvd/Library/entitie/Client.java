package com.solvd.Library.entitie;

import java.util.Objects;

public class Client {

    int idClient;
    String firstName;
    String lastName;
    int documentation;

    public Client() {
    }

    public Client(int idClient, String firstName, String lastName, int documentation) {
        this.idClient = idClient;
        this.firstName = firstName;
        this.lastName = lastName;
        this.documentation = documentation;
    }

    public int getIdClient() {
        return idClient;
    }

    public void setIdClient(int idClient) {
        this.idClient = idClient;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getDocumentation() {
        return documentation;
    }

    public void setDocumentation(int documentation) {
        this.documentation = documentation;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return idClient == client.idClient && documentation == client.documentation && Objects.equals(firstName, client.firstName) && Objects.equals(lastName, client.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idClient, firstName, lastName, documentation);
    }

    @Override
    public String toString() {
        return "Client{" +
                "idClient=" + idClient +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", documentation=" + documentation +
                '}';
    }
}
