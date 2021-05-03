package entities;
import javax.persistence.*;
import java.util.Set;

@Entity
public class TypeCar {
    @Id
    @GeneratedValue(strategy =  GenerationType.AUTO)
    private Integer idType;
    private String type;

    @OneToMany
    @PrimaryKeyJoinColumn
    Set<Car> cars;

    public TypeCar() {
    }

    public TypeCar(Integer idType, String type) {
        this.idType = idType;
        this.type = type;
    }

    public Integer getIdType() {
        return idType;
    }

    public void setIdType(Integer idType) {
        this.idType = idType;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
