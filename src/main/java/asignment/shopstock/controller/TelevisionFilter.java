package asignment.shopstock.controller;

import asignment.shopstock.entity.Television;
import asignment.shopstock.repository.TelevisionRepository;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static asignment.shopstock.specifications.TelevisionSpecifications.*;

@Tag(name = "Filter")
@RestController
public class TelevisionFilter {
    @Autowired
    TelevisionRepository televisionRepository;

    @GetMapping("/models/television")
    public List<Television> filter(@RequestParam(required = false) String technology,
                                   @RequestParam(required = false) String modelType) {
        return televisionRepository.findAll(byTechnology(technology).and(
                                                byModelType(modelType)));
    }
}
