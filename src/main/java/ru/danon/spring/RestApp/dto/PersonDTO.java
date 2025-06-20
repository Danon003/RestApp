package ru.danon.spring.RestApp.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

public class PersonDTO {

    @NotEmpty(message = "Имя не должно быть пустым!")
    @Size(min = 2, max = 100, message = "Имя должно быть больше 2, но не больше 100 символов")
    private String name;

    @Min(value = 0, message = "Возраст должен быть чем 0")
    private int age;

    @Email
    @NotEmpty(message = "email не должно быть пустым!")
    private String email;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
