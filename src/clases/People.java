package clases;

public class People {

    String name;
    String lastName;
    int age;
    String email;
    String phone;

    @Override
    public String toString() {
        return """
                Nombre: %s
                Apellido: %s
                Edad: %d
                Correo: %s
                Teléfono: %s
                """.formatted(name, lastName, age, email, phone);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
