package com.courses.lesson13;

/**
 * Created by ibilous on 17.11.2015.
 */
public class User implements Comparable<User> {

    private int id;
    private String name;

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(User user) {
/*        int id = o.getId();
        if(this.id == id) return 0;
        if(this.id > id) return 1;*/

        name.compareTo(user.name);



        return -1;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
