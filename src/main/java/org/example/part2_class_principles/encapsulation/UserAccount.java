package org.example.part2_class_principles.encapsulation;


/*
   Definitie: Incapsularea inseamna ascunderea detaliilor interne ale unui obiect si
   oferirea unur metode publice prin care utilizatorii pot interactiona cu datele
   clasei intr-un mod controlat

   Dependinta ajutatoare: Lombok - putem sa cream la nivel de anotatie, structuri de cod nealterate/standard,
   de forma getter/setters, constructori neparametrizati/parametrizati, metode suprascrise
   www.projectlombok.org
 */
public class UserAccount {

    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username)  {
        if(username != null && username.length() >= 5){
            this.username = username;
        } else{
            throw new IllegalArgumentException("Username trebuie sa aiba minim 5 caractere");
        }
    }

    public void setPassword(String password) {
        // parolaA123, 123ABC - parola ok
        // parola123, xyz - nu sunt parole ok
        if(password.matches(".*[A-Z].*") && password.length() >= 8){
            this.password = password;
        } else{
            throw new IllegalArgumentException("Parola este prea slaba!");
        }
        this.password = password;
    }

    @Override
    public String toString() {
        return "UserAccount{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
