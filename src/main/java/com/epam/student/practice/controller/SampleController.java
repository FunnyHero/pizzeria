package com.epam.student.practice.controller;

import com.epam.student.practice.dao.Repository;
import com.epam.student.practice.dto.OrderDTO;
import com.epam.student.practice.model.Cart;
import com.epam.student.practice.model.Order;
import com.epam.student.practice.model.customer.Customer;
import com.epam.student.practice.model.goods.Goods;
import com.epam.student.practice.model.payment.Payment;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

import java.util.ArrayList;
import java.util.List;

@RestController
public class SampleController {

    Repository repository = new Repository();

    @GetMapping("/home")
    public String home(){
        return "home";
    }

    @GetMapping("/about")
    public String about(){
        return "about";
    }

    @GetMapping("/inst")
    public RedirectView inst(){
        return new RedirectView("https://www.instagram.com/");
    }

    @GetMapping("/location")
    public RedirectView location(){
        return new RedirectView("https://yandex.ru/maps/?um=constructor%3Ab0eaa97fc06386ffbd3a69b13a7b7a467494e52626da0eab5a71506d78c6053d&source=https://yandex.ru/maps/?um=constructor%3Ab0eaa97fc06386ffbd3a69b13a7b7a467494e52626da0eab5a71506d78c6053d&source=constructorLink");
    }

    @GetMapping("/cart")
    public String cart(){
        return "cart";
    }

    @GetMapping("/getGoodsInfo")
    public Goods getGoodsInfo(@RequestParam(value = "name") String name) {
        return repository.findByName(name);
    }

    @GetMapping("/getMenu")
    public ArrayList<Goods> getMenu() {
        return repository.findAllGoods();
    }

    @GetMapping("/createOrder")
    public String createOrder() {
        return "createOrder";
    }

    @PostMapping("/createOrder")
    public long createOrder(@RequestBody OrderDTO orderDTO, Customer customer, Payment payment) {
        List<Goods> goodsList = new ArrayList<>();

        for (String goodsName : orderDTO.getGoodsNameList()) {
            goodsList.add(repository.findByName(goodsName));
        }
        
        Order order = new Order(new Cart(goodsList), customer, payment);
        return 0;
    }
}

