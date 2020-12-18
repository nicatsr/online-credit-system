package az.onlinecredit.model.database;

public class Guarantor {
    private long id;

    private String fullName;

    private String finCode;

    private String phoneNumber;

    public Guarantor(long id, String fullName, String finCode, String phoneNumber) {
        this.id = id;
        this.fullName = fullName;
        this.finCode = finCode;
        this.phoneNumber = phoneNumber;
    }

    public Guarantor() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getFinCode() {
        return finCode;
    }

    public void setFinCode(String finCode) {
        this.finCode = finCode;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Guarantor{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", finCode='" + finCode + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
