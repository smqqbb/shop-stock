package asignment.shopstock.service;

import asignment.shopstock.entity.Item;
import asignment.shopstock.entity.Model;
import asignment.shopstock.repository.ItemRepository;
import asignment.shopstock.repository.ModelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ModelService {
    @Autowired
    ModelRepository modelRepository;

    @Autowired
    ItemRepository itemRepository;

    public void saveOne(Model model, Long id) {
        Item item = itemRepository.findById(id).get();
        model.setItem(item);
        modelRepository.save(model);
    }

    public Long delete(Long id) {
        modelRepository.deleteById(id);
        return id;
    }
}
