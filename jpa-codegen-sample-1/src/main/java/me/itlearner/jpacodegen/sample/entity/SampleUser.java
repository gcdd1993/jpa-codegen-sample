package me.itlearner.jpacodegen.sample.entity;

import lombok.Data;

import javax.persistence.*;

/**
 * TODO
 *
 * @author gaochen
 * @date 2019/9/5
 */
@Entity
@Table
@Data
public class SampleUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String username;

    private String password;
}
