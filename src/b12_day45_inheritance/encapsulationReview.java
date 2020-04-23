package b12_day45_inheritance;

import java.util.ArrayList;
import java.util.Arrays;

class credentials {
private String username;
private String password;

public credentials() {
    setUsername("admin");
    setPassword("gannaly");
}

public String getUsername () {
    return username;
}

public String getPassword() {
    return password;
}

public void setUsername(String username) {
    this.username = username;
}

public void setPassword(String password) {
    this.password = password;
}


public void setCredentials(String username, String password) {
    this.username = username;
    this.password = password;
}



}

public class encapsulationReview {
    public static void main(String[] args) {
        credentials obj = new credentials();
        System.out.println(obj.getUsername());
        System.out.println(obj.getPassword());
        obj.setUsername("bekir");
        System.out.println(obj.getUsername());

        credentials Melek = new credentials();
        Melek.setCredentials("gmelek", "bekir");
        System.out.println(Melek.getUsername() + " " + Melek.getPassword());
        System.out.println("===============================================================");
        credentials[] users = {obj, Melek}; // Arrays support both objects and primitives
        users[0].getPassword();
        users[1].getUsername();

        ArrayList<credentials> list = new ArrayList<>();
        list.addAll(Arrays.asList(users));
        list.get(0).getUsername();
        list.get(1).getPassword();

        for(credentials each: list) {
            each.getUsername();
        }
    }
}
