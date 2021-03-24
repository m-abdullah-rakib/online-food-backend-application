package tacobe.security;
import org.springframework.security.crypto.password.PasswordEncoder;
import lombok.Data;
import tacobe.domain.User;

@Data
public class RegistrationForm {

  private String username;
  private String password;
  private String fullname;
  private String street;
  private String city;
  private String state;
  private String zip;
  private String phoneNumber;
  
  public User toUser(PasswordEncoder passwordEncoder) {
    return new User(
        username, passwordEncoder.encode(password), 
        fullname, street, city, state, zip, phoneNumber);
  }
  
}
