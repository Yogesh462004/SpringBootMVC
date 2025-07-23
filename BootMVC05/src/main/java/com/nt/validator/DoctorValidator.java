package com.nt.validator;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.nt.model.Doctor;

@Component
public class DoctorValidator implements Validator {

    @Override
    public boolean supports(Class<?> clazz) {
        return Doctor.class.isAssignableFrom(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        Doctor doctor = (Doctor) target;

        if (doctor.getDname() == null || doctor.getDname().isBlank()) {
            errors.rejectValue("dname", "doctor.dname.required");
        } else if (doctor.getDname().length() < 5) {
            errors.rejectValue("dname", "doctor.dname.length");
        }

        if (doctor.getDsal() == null) {
            errors.rejectValue("dsal", "doctor.dsal.required");
        } else if (doctor.getDsal() < 500 || doctor.getDsal() > 9000) {
            errors.rejectValue("dsal", "doctor.dsal.range");
        }
    }
}
