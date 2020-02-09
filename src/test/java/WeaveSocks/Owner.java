package WeaveSocks;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

public class Owner {

        @JsonProperty("username")
        private String username;
        @JsonProperty("password")
        private String password;
        @JsonProperty("email")
        private String email;
        @JsonProperty("id")
        private String id;

        public Owner(){

        }

    public Owner(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Owner{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", id='" + id + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Owner owner = (Owner) o;
        return Objects.equals(username, owner.username) &&
                Objects.equals(password, owner.password) &&
                Objects.equals(email, owner.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(username, password, email);
    }
}
