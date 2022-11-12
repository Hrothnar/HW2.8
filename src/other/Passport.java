package other;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Passport {
    private String firstName;
    private String lastName;
    private String middleName;
    private String birthDay;
    private String number;
    public static Set<Passport> passports = new HashSet<>();

//    {
//        this.firstName = "default";
//        this.lastName = "default";
//        this.birthDay = "default";
//        this.number = "default";
//    }

    public Passport(String firstName, String lastName, String middleName, String birthDay, String number) {
        setFirstName(firstName);
        setLastName(lastName);
        setMiddleName(middleName);
        setBirthDay(birthDay);
        setNumber(number);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        if (firstName != null && !firstName.isBlank())
            this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if (lastName != null && !lastName.isBlank())
            this.lastName = lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        if (birthDay != null && !birthDay.isBlank())
            this.birthDay = birthDay;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        if (number != null && !number.isBlank())
            this.number = number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Passport passport = (Passport) o;
        return Objects.equals(firstName, passport.firstName) && Objects.equals(lastName, passport.lastName) && Objects.equals(middleName, passport.middleName) && Objects.equals(birthDay, passport.birthDay) && Objects.equals(number, passport.number);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, middleName, birthDay, number);
    }

    @Override
    public String toString() {
        return "Passport{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", birthDay='" + birthDay + '\'' +
                ", number='" + number + '\'' +
                '}';
    }

    public void addPassport(Passport passport) {
        if (passports.isEmpty())
            passports.add(passport);
        else {
            boolean b = false;
            for (Passport one : passports) {
                if (one.getNumber().hashCode() == passport.getNumber().hashCode()) {
                    b = true;
                    break;
                }
            }
            if (b) {
                if (this.equals(passport))
                    System.out.println("Данные паспорта совпадают");
                else {
                    setFirstName(passport.firstName);
                    setLastName(passport.lastName);
                    setMiddleName(passport.middleName);
                    setBirthDay(passport.birthDay);
                    System.out.println("Данные были успешно обновлены");
                }
            } else {
                passports.add(passport);
            }
        }
    }

    public static <T> Passport getInfo(T number) {
        boolean b = false;
        for (Passport one : passports) {
            if (one.getNumber().hashCode() == number.toString().hashCode()) {
                return one;
            }
        }
        return null;
    }


}



