package com.frankmoley.lil.roomwebapp.data.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.UUID;

@Entity
@Table(name="EMPLOYEES")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class StaffMember {

    @Id
    @Column(name = "EMPLOYEE_ID")
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID employeeId;
    @Column(name = "FIRST_NAME")
    private String firstName;
    @Column(name = "LAST_NAME")
    private String lastName;
    @Column(name = "POSITION")
    @Enumerated(EnumType.STRING)
    private Position position;

    @Override
    public String toString() {
        return "StaffMember{" +
            "employeeId=" + employeeId +
            ", firstName='" + firstName + '\'' +
            ", lastName='" + lastName + '\'' +
            ", position=" + position +
            '}';
    }
}