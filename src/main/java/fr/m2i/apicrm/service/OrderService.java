package fr.m2i.apicrm.service;

import fr.m2i.apicrm.dto.OrderMapper;
import fr.m2i.apicrm.exception.NotFoundException;
import fr.m2i.apicrm.model.Order;
import fr.m2i.apicrm.repository.OrderRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService implements IOrderService {

      private final OrderRepository repo;

      @Autowired
      public OrderService(OrderRepository repo) {
            this.repo = repo;
      }

      @Override
      public List<Order> findAll() {
            return repo.findAll();
      }

      @Override
      public Order findById(Long id) {
            return repo.findById(id).orElseThrow(() -> new NotFoundException("Order with id : " + id + " doesn't exist"));
      }

      @Override
      public Order save(Order order) {
            return repo.save(order);
      }

      @Override
      public Order update(Long id, Order order) {

            Order toUpdate = findById(id);
            toUpdate = OrderMapper.copy(toUpdate, order);

            return save(toUpdate);
      }

      @Override
      public void delete(Long id) {

            Order toDelete = findById(id);
            repo.delete(toDelete);

      }

}
