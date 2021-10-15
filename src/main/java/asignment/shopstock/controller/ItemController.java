package asignment.shopstock.controller;

import asignment.shopstock.entity.Item;
import asignment.shopstock.service.ItemService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/items")
public class ItemController {
    @Autowired
    ItemService itemService;

    @GetMapping
    public ResponseEntity getOne(@RequestParam Long id) {
        try {
            return ResponseEntity.ok(itemService.getOne(id));
        } catch (Exception e){
            return ResponseEntity.badRequest().body("Ошибка");
        }
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
