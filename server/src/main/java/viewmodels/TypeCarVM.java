package viewmodels;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.NotNull;

public class TypeCarVM {
    Long idType;
    @JsonProperty(value = "login", required = true)
    @NotNull(message="login is required")
    String type;


    public TypeCarVM(Long id, String type){
        this.idType = id;
        this.type = type;
    }

    public Long getIdType() {
        return idType;
    }

    public void setIdType(Long idType) {
        this.idType = idType;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
