package ma.gcdste.donsang.model.entities;

import jakarta.persistence.*;

@Entity
public class User {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    //@NotNull(message = "L'email est obligatoire !")
    private String email;
    //@NotNull(message = "Veuillez entrer votre nom svp")
    private String name;
    //@NotNull(message = "Le mot de passe est obligatoire !")
    private String password;
    //@NotNull(message = "Le groupe sanguin est obligatoire !")
    private String groupeSanguin;
    //@NotNull(message = "Votre age est obligatoire !")
    private Long age;

    //Ces deux variables sont détérminées une fois l'utilisateur renseigne ses informations sur les conditions temporaires après
    // appel aux dons

    @Transient
    private Boolean elligible;
    @Transient
    private Long indisponibilite;


    public User(Long id, String email, String nom, String name, String password, String type_sang, Long age) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.groupeSanguin = type_sang;
        this.age = age;
    }

    public User() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String prenom) {
        this.name = prenom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getGroupeSanguin() {
        return groupeSanguin;
    }

    public void setGroupeSanguin(String type_sang) {
        this.groupeSanguin = type_sang;
    }

    public Long getAge() {
        return age;
    }

    public void setAge(Long age) {
        this.age = age;
    }

    public Boolean getElligible() {
        return elligible;
    }

    public void setElligible(Boolean elligible) {
        this.elligible = elligible;
    }

    public Long getIndisponibilite() {
        return indisponibilite;
    }

    public void setIndisponibilite(Long indisponibilite) {
        this.indisponibilite = indisponibilite;
    }
}
