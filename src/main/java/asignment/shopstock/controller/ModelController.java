package asignment.shopstock.controller;

import asignment.shopstock.entity.Item;
import asignment.shopstock.entity.Model;
import asignment.shopstock.service.ItemService;
import asignment.shopstock.service.ModelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/models")
public class ModelController {
    @Autowired
    ModelService modelService;

    @DeleteMapping
    public ResponseEntity deleteOne(@RequestParam Long id) {
        try {
            return ResponseEntity.ok(modelService.delete(id));
        } catch (Exception e){
            return ResponseEntity.badRequest().body("Ошибка");
        }
    }

    @PostMapping
    public ResponseEntity addOne(@RequestBody Model model,
                                 @RequestParam Long id) {
        try {
            modelService.saveOne(model, id);
            return ResponseEntity.ok("Модель сохранена");
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Ошибка");
        }
    }

}
