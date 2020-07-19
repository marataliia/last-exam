package kg.itacademy.exam.entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@MappedSuperclass
@Data
public class BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDateTime dateCreated;


    @PrePersist
    public void persistCreate(){
        this.dateCreated=LocalDateTime.now();
    }
}
