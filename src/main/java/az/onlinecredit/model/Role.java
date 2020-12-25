package az.onlinecredit.model;

public enum Role {
    ADMIN(1) , CUSTOMER(2);
    private int value;

    Role(int value) {
        this.value = value;
    }
    public int getValue(){
        return value;
    }
}
