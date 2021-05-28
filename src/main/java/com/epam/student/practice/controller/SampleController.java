package com.epam.student.practice.controller;

import com.epam.student.practice.dao.Repository;
import com.epam.student.practice.dto.DeliveryDTO;
import com.epam.student.practice.dto.MenuDTO;
import com.epam.student.practice.dto.OrderDTO;
import com.epam.student.practice.model.Cart;
import com.epam.student.practice.model.Order;
import com.epam.student.practice.model.customer.Customer;
import com.epam.student.practice.model.goods.Goods;
import com.epam.student.practice.model.payment.Payment;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.UUID;

@RestController
public class SampleController {

    @GetMapping("/getGoodsInfo")
    public Collection<Goods> getGoodsInfo(@RequestBody String name) {
        return Repository.getInstance().findGoodsByName(name);
    }

    @GetMapping
    public Goods getGoodsById(@RequestBody UUID id){
        return Repository.getInstance().findGoodsById(id);
    }

    @GetMapping("/getMenu")
    public Collection<MenuDTO> getMenu() {
        Collection<MenuDTO> menuDTO = null;

        for (Goods goods : Repository.getInstance().findAllGoods()) {
            menuDTO.add(new MenuDTO(goods.getId(), goods.getName(), goods.getCost()));
        }

        return menuDTO;
    }

    @PostMapping("/createOrder")
    public DeliveryDTO createOrder(@RequestBody Collection<OrderDTO> orderDTO) {
        Cart cart = new Cart();

        for (OrderDTO oDTO : orderDTO) {
            Goods goods = Repository.getInstance().findGoodsById(oDTO.getGoodsID());
            goods.setQuantity(oDTO.getQuantity());
            cart.addGoods(goods);
        }

        if (cart.isLessThanFivePizzas() && cart.isLessThanFourDrinks()) {
            return new DeliveryDTO(Repository.getInstance().createOrder(new Order(cart, null, null)));
        }

        return null;
    }

    @PostMapping("/place_your_order")
    public DeliveryDTO createOrder(@RequestBody DeliveryDTO deliveryDTO, Customer customer, Payment payment){
        Order order = Repository.getInstance().findOrderById(deliveryDTO.getOrderID());
        order.setCustomer(customer);
        order.setPayment(payment);
        return deliveryDTO;
    }
}

