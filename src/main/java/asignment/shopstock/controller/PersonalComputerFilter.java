package asignment.shopstock.controller;

import asignment.shopstock.entity.PersonalComputer;
import asignment.shopstock.repository.PersonalComputerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static asignment.shopstock.specifications.PersonalComputerSpecifications.*;

@RestController
public class PersonalComputerFilter {
    @Autowired
    PersonalComputerRepository personalComputerRepository;

    @GetMapping("/models/personalcomputer")
    public List<PersonalComputer> filter(@RequestParam(required = false) String processorType,
                                         @RequestParam(required = false) String modelType) {
        return personalComputerRepository.findAll(byProcessorType(processorType).and(
                                                    byModelType(modelType)));
    }
}
