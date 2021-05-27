package com.epam.student.practice.controller;

import com.epam.student.practice.dao.Repository;
import com.epam.student.practice.dto.DeliveryDTO;
import com.epam.student.practice.dto.OrderDTO;
import com.epam.student.practice.model.Cart;
import com.epam.student.practice.model.Order;
import com.epam.student.practice.model.goods.Goods;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.UUID;

@RestController
public class SampleController {

    @GetMapping("/getGoodsInfo")
    public Collection<Goods> getGoodsInfo(@RequestBody String name) {
        return Repository.getInstance().findByName(name);
    }

    @GetMapping("/getMenu")
    public Collection<Goods> getMenu() {
        return Repository.getInstance().findAllGoods();
    }

    @GetMapping
    public Goods getGoodsById(@RequestBody UUID id){
        return Repository.getInstance().findById(id);
    }

    @PostMapping("/createOrder")
    public DeliveryDTO createOrder(@RequestBody Collection<OrderDTO> orderDTO) {
        Cart cart = new Cart();

        for (OrderDTO oDTO : orderDTO) {
            Goods goods = Repository.getInstance().findById(oDTO.getGoodsID());
            goods.setQuantity(oDTO.getQuantity());
            cart.addGoods(goods);
        }

        return new DeliveryDTO(Repository.getInstance().createOrder(new Order(cart, null, null)));//TODO
    }
}

