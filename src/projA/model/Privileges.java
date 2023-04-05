package projA.model;

import java.util.List;
import projA.model.Role; 
import javax.persistence.Entity;
import javax.persistence.ManyToMany;

@Entity
public class Privileges extends ProjAModel {

    private String name;

    @ManyToMany(mappedBy = "privileges")
    private List<Role> roles;
}