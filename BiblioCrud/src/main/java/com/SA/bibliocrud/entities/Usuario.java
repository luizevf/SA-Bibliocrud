package com.SA.bibliocrud.entities;

import java.lang.annotation.Inherited;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Usuarios")
public class Usuario(){

@Id
@GeneratedValue
@Column(name="UserId")
  private long UserId;
  private String Nome;
  private String Email;
  private String Password;

}