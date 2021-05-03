package entities;

import javax.persistence.*;

@Entity
public class Request {
    @Id
    @GeneratedValue(strategy =  GenerationType.AUTO)
    private Long id;
    private Long customer_phone;
    private String startPoint;
    private String endPoint;

    @ManyToOne
    @PrimaryKeyJoinColumn
    private User user;

    @OneToOne(mappedBy = "request")
    private RequestInWork inWork;

    public Request()
    {

    }

    public Request(Long id, Long customer_phone, String startPoint, String endPoint, User user) {
        this.id = id;
        this.customer_phone = customer_phone;
        this.startPoint = startPoint;
        this.endPoint = endPoint;
        this.user = user;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCustomer_phone() {
        return customer_phone;
    }

    public void setCustomer_phone(Long customer_phone) {
        this.customer_phone = customer_phone;
    }

    public String getStartPoint() {
        return startPoint;
    }

    public void setStartPoint(String startPoint) {
        this.startPoint = startPoint;
    }

    public String getEndPoint() {
        return endPoint;
    }

    public void setEndPoint(String endPoint) {
        this.endPoint = endPoint;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public RequestInWork getInWork() {
        return inWork;
    }

    public void setInWork(RequestInWork inWork) {
        this.inWork = inWork;
    }
}
