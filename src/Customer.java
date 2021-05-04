import java.time.*;
public class Customer implements IEntity {
    private int id;
    private String firstName;
    private String lastName;
    private String nationalIdentity;
    private LocalDate birthDay;
    public LocalDate getBirthDay() {
		return birthDay;
	}

	public void setBirthDay(int birthdayDay, int birthdayMonth, int birthdayYear) {
		this.birthDay = LocalDate.of(birthdayYear, birthdayMonth, birthdayDay);
	}

	public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getNationalIdentity() {
        return nationalIdentity;
    }

    public void setNationalIdentity(String nationalIdentity) {
        this.nationalIdentity = nationalIdentity;
    }

}
