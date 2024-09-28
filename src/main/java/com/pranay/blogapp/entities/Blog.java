package com.pranay.blogapp.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Blog {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String AuthorName;
    private double AuthorPhone;
    private String AuthorCity;
    private String AuthorState;
    private String BlogName;
    private String BlogDescription;
}
