package com.nt.model;

import lombok.Data;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import lombok.Data;

@Entity
@Data
public class Doctor {
  @Id
  @GeneratedValue(generator = "gen1")
  @SequenceGenerator(name="gen1" ,sequenceName="DOCTOR_SEQ",initialValue=1,allocationSize=1)
  private Integer did;
  private String dname;
  private Integer dsal;
  private String country;
}