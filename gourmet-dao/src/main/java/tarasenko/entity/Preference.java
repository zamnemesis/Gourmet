package tarasenko.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author tarasenko
 * @since 22.07.2016
 */
@Entity
@Table
public class Preference extends BaseEntity{
    @Id
    @Column(name = "preference_id")
    private String id;

    @Column
    private String name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Preference{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
