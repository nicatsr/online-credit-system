package az.onlinecredit.model;

import java.util.Arrays;

public enum Role {
    ADMIN(1) , CUSTOMER(2);
    private int value;

    Role(int value) {
        this.value = value;
    }
    public int getValue(){
        return value;
    }

    public static Role fromValue(int value) {
        Role type = null;

        type = Arrays.stream(values())
                .filter(role -> role.getValue() == value)
                .findFirst().orElseThrow(() -> new RuntimeException("Invalid role " + value));

        return type;
    }
}
