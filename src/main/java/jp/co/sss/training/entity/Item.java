package jp.co.sss.training.entity;

import javax.persistence.*;

@Entity
@Table(name ="item")
public class Item {
    @Id
    private Integer id;
    @Column
    private String name;
    @Column
    private Integer price;
    @Column
    private Integer genre_id;

    public Integer getId() {
        return id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }
    public Integer getGenre_id() {
        return genre_id;
    }
    public void setGenre_id(Integer genre_id) {
        this.genre_id = genre_id;
    } 
}
