package iuh.fit.zy_week05.backend.entities;

import com.neovisionaries.i18n.CountryCode;
import jakarta.persistence.*;
import lombok.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "address")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "street", length = 150)
    private String street;

    @Column(name = "city", length = 50)
    private String city;

    @Column(name = "country")
    private CountryCode country;

    @Column(name = "number", length = 20)
    private String number;

    @Column(name = "zipcode", length = 7)
    private String zipcode;

}