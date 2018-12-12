package merge.domain;

package com.mycompany.app;

public class Person {
    private String name;
    private int id;
    private int friends;
    private int fatherId;
    private String email;

    public person(String name, int id, int friends, int fatherId, String email) {
        this.name = name;
        this.id = id;
        this.friends = friends;
        this.fatherId = fatherId;
        this.email = email;
    }

    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || obj.getClass() != this.getClass())
            return false;
        Person p = (Person) obj;
        return (p.name == this.name && p.id == this.id);
    }

    public int hashCode() {
        return this.id;
    }

}
