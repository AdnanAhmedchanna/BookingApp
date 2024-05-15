import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
class UserInfo {
    @Id
    private int userId;
    private String username;
    private String password;
    private String role;

}
@Entity
public class Property {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String description;
    private String location;
    private Double price;
    @ManyToOne
    private User owner;

}
@Entity
public class Booking {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDate startDate;
    private LocalDate endDate;
    @ManyToOne
    private User user;
    @ManyToOne
    private Property property;

}
@Entity
public class Review {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String content;
    private Integer rating;
    @ManyToOne
    private User user;
    @ManyToOne
    private Property property;

}