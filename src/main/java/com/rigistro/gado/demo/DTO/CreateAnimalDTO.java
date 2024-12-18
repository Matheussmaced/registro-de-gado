package com.rigistro.gado.demo.DTO;

import java.time.LocalDate;

public record CreateAnimalDTO(
                String name,
                String numeration,
                int age,
                String serie,
                String breed,
                String purity,
                String RGD,
                String sex,
                LocalDate lastBreeding,
                LocalDate birthDate,
                boolean registeredWithGovernment,
                boolean receiveNotifications,
                String imageUrl,
                String motherName,
                String fatherName) {

}
