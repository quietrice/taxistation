package entities;

import javax.persistence.*;

@Entity
public class RequestInWork
{
    @Id
    @GeneratedValue(strategy =  GenerationType.AUTO)
    private Long id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn (name="request_id")
    private Request request;

    @ManyToOne
    @PrimaryKeyJoinColumn
    private Driver driver;

    public RequestInWork() {
    }

    public RequestInWork(Request request, Driver driver) {
        this.request = request;
        this.driver = driver;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Request getRequest() {
        return request;
    }

    public void setRequest(Request request) {
        this.request = request;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }
}
