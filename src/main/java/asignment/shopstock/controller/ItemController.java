package asignment.shopstock.controller;

import asignment.shopstock.entity.Item;
import asignment.shopstock.service.ItemService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Tag(name = "Item")
@RestController
@RequestMapping("/items")
public class ItemController {
    @Autowired
    ItemService itemService;

    @GetMapping
    public Item getOne(@RequestParam Long id) {
        return itemService.getOne(id);
    }

    @PostMapping
    public ResponseEntity addOne(@RequestBody Item item) {
        try {
            itemService.saveOne(item);
            return ResponseEntity.ok("Позиция сохранена");
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Ошибка");
        }
    }
}
