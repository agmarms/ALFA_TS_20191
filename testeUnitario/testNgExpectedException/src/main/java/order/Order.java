package order;

import java.util.Date;

/**
 * Created by gilmario on 19/02/17.
 */
public class Order {
    int id;
    String createdBy;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }
}