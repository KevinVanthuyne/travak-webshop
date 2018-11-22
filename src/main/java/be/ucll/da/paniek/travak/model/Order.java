package be.ucll.da.paniek.travak.model;

import java.time.LocalDateTime;

public class Order {

    private Long id;
    private String mobileNr;
    private LocalDateTime timestamp;
    private String breadType;
    private Long sandwichId;

    public Order(Long id, String mobileNr, LocalDateTime timestamp, String breadType, Long sandwichId) {
        setId(id);
        setMobileNr(mobileNr);
        setTimestamp(timestamp);
        setBreadType(breadType);
        setSandwichId(sandwichId);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMobileNr() {
        return mobileNr;
    }

    public void setMobileNr(String mobileNr) {
        this.mobileNr = mobileNr;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    public String getBreadType() {
        return breadType;
    }

    public void setBreadType(String breadType) {
        this.breadType = breadType;
    }

    public Long getSandwichId() {
        return sandwichId;
    }

    public void setSandwichId(Long sandwichId) {
        this.sandwichId = sandwichId;
    }
}
