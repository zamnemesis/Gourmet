package tarasenko.dao.entity;

import javax.persistence.Entity;

/**
 * @author tarasenko
 * @since 31.05.2016
 */
@Entity
public class Product {

    private Long id;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
