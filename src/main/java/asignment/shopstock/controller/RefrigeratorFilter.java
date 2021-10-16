package asignment.shopstock.controller;


import asignment.shopstock.entity.Refrigerator;
import asignment.shopstock.repository.RefrigeratorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import static asignment.shopstock.specifications.RefrigeratorSpecifications.*;

import java.util.List;

@RestController
public class RefrigeratorFilter {
    @Autowired
    RefrigeratorRepository refrigeratorRepository;

    @GetMapping("/models/refrigerator")
    public List<Refrigerator> filter(@RequestParam(required = false) String compressorType,
                                     @RequestParam(required = false) Long fromNumberOfDoors,
                                     @RequestParam(required = false) Long toNumberOfDoors) {
        return refrigeratorRepository.findAll(byCompressorType(compressorType).and(
                                                byFromNumberOfDoors(fromNumberOfDoors).and(
                                                        byToNumberOfDoors(toNumberOfDoors))));
    }
}
