package asignment.shopstock.controller;

import asignment.shopstock.entity.Smartphone;
import asignment.shopstock.repository.SmartphoneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static asignment.shopstock.specifications.SmartphoneSpecifications.*;


@RestController
public class SmartphoneFilter {
    @Autowired
    SmartphoneRepository smartphoneRepository;

    @GetMapping("/models/smartphone")
    public List<Smartphone> filter(@RequestParam(required = false) Long fromNumberOfCameras,
                                   @RequestParam(required = false) Long toNumberOfCameras,
                                   @RequestParam(required = false) Long fromStorage,
                                   @RequestParam(required = false) Long toStorage) {
        return smartphoneRepository.findAll(byFromStorageInGigs(fromStorage).and(
                                                byToStorageInGigs(toStorage).and(
                                                        byFromNumberOfCameras(fromNumberOfCameras).and(
                                                                byToNumberOfCameras(toNumberOfCameras)))));
    }
}
