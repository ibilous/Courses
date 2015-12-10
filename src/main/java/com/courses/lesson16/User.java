package com.courses.lesson16;

import java.util.List;

/**
 * Created by ibilous on 01.12.2015.
 */
public class User {

    private String name;
    private Integer id;
    List<String> friends;

    public User(String name, Integer id) {
        this.name = name;
        this.id = id;
    }

    public List<String> getFriends() {
        return friends;
    }

    public void setFriends(List<String> friends) {
        this.friends = friends;
    }


    public String getName() {
        return name;
    }

    public Integer getId() {
        return id;
    }


    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (name != null ? !name.equals(user.name) : user.name != null) return false;
        if (id != null ? !id.equals(user.id) : user.id != null) return false;
        return !(friends != null ? !friends.equals(user.friends) : user.friends != null);

    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (id != null ? id.hashCode() : 0);
        result = 31 * result + (friends != null ? friends.hashCode() : 0);
        return result;
    }
}
