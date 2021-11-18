package asignment.shopstock.service;

import asignment.shopstock.entity.Item;
import asignment.shopstock.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemService {
    @Autowired
    ItemRepository itemRepository;

    public Item getOne(Long id) {
        return itemRepository.findById(id).get();
    }

    public void saveOne(Item item) {
        itemRepository.save(item);
    }
}
