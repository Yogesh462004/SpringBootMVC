package com.nt.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.Data;

@Entity
@Data
public class Doctor {
    @Id
    @GeneratedValue(generator = "gen1")
    @SequenceGenerator(name="gen1", sequenceName="DOCTOR_SEQ", initialValue=1, allocationSize=1)
    private Integer did;

    @NotBlank(message = "{Doctor Name Required}")
    @Size(min = 5, message = "{Doctor name contains More than 5 chars}")
    private String dname;

    @NotNull(message = "{Doctor Salary Required}")
    @Min(value = 500, message = "{Minimum 500 }")
    @Max(value = 900, message = "{Maximum 90000}")
    private Integer dsal;

    private String country;
}
