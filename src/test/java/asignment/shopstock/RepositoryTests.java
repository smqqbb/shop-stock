package asignment.shopstock;

import asignment.shopstock.entity.Item;
import asignment.shopstock.entity.Smartphone;
import asignment.shopstock.repository.ItemRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class RepositoryTests {
    @Autowired
    ItemRepository itemRepository;

    @Test
    void addItem_thenGetBack(){
        /*
        Item item = new Item();
        item.setBrand("Apple");
        item.setItemName("Iphone 9");
        item.setCountry("USA");
        item.setInstallmentOption(true);
        item.setOrderOnline(true);

        Smartphone phone = new Smartphone();
        phone.set;
        item.addModel();

         */
    }


}
