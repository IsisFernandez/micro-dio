package one.digitalinnovation.experts.shoppingcart.repository;

import one.digitalinnovation.experts.shoppingcart.model.Cart;
import org.springframework.data.repository.CrudRepository;
public class CartRepository extends CrudRepository<Cart, Integer> {

    Cart findByCustomerId(Integer customerId);
    
}
