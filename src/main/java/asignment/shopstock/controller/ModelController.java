package asignment.shopstock.controller;

import asignment.shopstock.entity.Model;
import asignment.shopstock.service.ModelService;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
@Tag(name = "Model")
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
    public ResponseEntity addOne(@org.springframework.web.bind.annotation.RequestBody @RequestBody
                                             (content = @Content(schema = @Schema(implementation = Model.class)))
                                             Model model,
                                 @RequestParam Long id) {
        try {
            modelService.saveOne(model, id);
            return ResponseEntity.ok("Модель сохранена");
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Ошибка");
        }
    }

}
