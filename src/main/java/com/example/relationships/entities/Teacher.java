package com.example.relationships.entities;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Teachers")
@Getter @Setter
public class Teacher {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        private String name;


        @ManyToMany(mappedBy = "teachers")
        private List<Student> students;
}
