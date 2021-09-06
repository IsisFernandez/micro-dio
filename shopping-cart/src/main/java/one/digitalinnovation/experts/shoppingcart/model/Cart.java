package one.digitalinnovation.experts.shoppingcart.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@RedisHash("cart")
public class Cart {

    @Id
    private Integer id;
    private List<Item> items;
    
}
