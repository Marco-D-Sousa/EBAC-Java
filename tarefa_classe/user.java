import java.time.LocalDate;
import java.time.Period;
import java.util.Date;

public class user {
    private String name;
    private String email;
    private LocalDate birthDay;

    public user() {
    }

    public user(String name, String email, LocalDate birthDay) {
        this.name = name;
        this.email = email;
        this.birthDay = birthDay;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(LocalDate birthDay) {
        this.birthDay = birthDay;
    }

    public String welcome(String name) {
        return String.format("Welcome %s", name);
    }

    public Integer calculateAge(Date birthDay) {
        LocalDate today = LocalDate.now();
        Period period = Period.between(getBirthDay(), today);
        return period.getYears();
    }
}
