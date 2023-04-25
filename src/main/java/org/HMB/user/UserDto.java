package org.HMB.user;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class UserDto {
    private String name;
    private String lastName;

    @Override
    public String toString() {
        return "UserDto{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
