package jp.co.sss.training.entity;

import javax.persistence.*;

@Entity
@Table(name ="training_user")
public class TrainingUser {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_training_gen")
    @SequenceGenerator(name = "seq_training_gen", sequenceName = "seq_training")
    private Integer id;
    @Column
    private String user_id;

    public Integer getId(){
        return id;
    }

    public void setId(Integer id){
        this.id = id;
    }

    public String getUser_id(){
        return user_id;
    }

    public void setUser_id(String user_id){
        this.user_id = user_id;
    }
}
