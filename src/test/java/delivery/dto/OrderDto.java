package delivery.dto;

import com.github.javafaker.Faker;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;


@Builder
@Getter
@Setter
public class OrderDto {
    private String status;
    private int courierId;
    private String customerName;
    private String customerPhone;
    private String comment;
    private long id;

    public static OrderDto createRandomOrder() {
        Faker faker = new Faker();
        // builder
        return OrderDto.builder()
                .status("OPEN")
                .courierId(faker.number().numberBetween(1,1000))
                .customerName(faker.name().fullName())
                .customerPhone(faker.phoneNumber().cellPhone())
                .comment(faker.lorem().sentence())
                .id(faker.number().numberBetween(1,1000))
                .build();
    }

}

