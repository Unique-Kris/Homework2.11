package pro.sky.skyproservice;

import java.util.List;

public interface OrderService {
    List<Integer> addItems(List<Integer> idList);

    List<Integer> getItems();
}