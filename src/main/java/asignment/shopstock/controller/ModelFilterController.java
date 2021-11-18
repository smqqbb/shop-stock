package asignment.shopstock.controller;

import asignment.shopstock.entity.Model;
import asignment.shopstock.repository.ModelRepository;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static asignment.shopstock.specifications.ModelSpecifications.*;

@Tag(name = "Filter")
@RestController
public class ModelFilterController {
    @Autowired
    ModelRepository modelRepository;

    @GetMapping("/models")
    public List<Model> filter(@RequestParam(required = false) String modelName,
                              @RequestParam(required = false) String type,
                              @RequestParam(required = false) String color,
                              @RequestParam(required = false) Long fromCost,
                              @RequestParam(required = false) Long toCost,
                              @RequestParam(required = false) String sortDSC,
                              @RequestParam(required = false) String sortASC) {
        Sort sort;
        if(sortDSC != null) {
            sort = Sort.by(Sort.Direction.DESC, sortDSC);
        } else if(sortASC != null) {
            sort = Sort.by(Sort.Direction.ASC, sortASC);
        } else {
            sort = Sort.unsorted();
        }

            return modelRepository.findAll(
                    byModelName(modelName).and(
                            byType(type).and(
                                    byColor(color).and(
                                            byFromCost(fromCost).and(
                                                    byToCost(toCost))))), sort);
    }

}
