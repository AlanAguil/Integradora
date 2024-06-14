package mx.edu.utez.pruebagit.model;
import java.io.Serializable;

// Bean es una estructura de datos que modela un objeto de la vida real, es util en diversos escenarios
public class User implements Serializable {

    private String user_name, email, pass, cody;
    // siempre debe contener los metodos de constructores al menos el vacio y los get y set

    public User(){

    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getUser_name() {
        return user_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getCody() {
        return cody;
    }

    public void setCody(String cody) {
        this.cody = cody;
    }
}
