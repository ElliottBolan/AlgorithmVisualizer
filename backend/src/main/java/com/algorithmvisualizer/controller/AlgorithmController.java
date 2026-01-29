package com.algorithmvisualizer.controller;

import com.algorithmvisualizer.model.Algorithm;
import com.algorithmvisualizer.model.Category;
import com.algorithmvisualizer.service.AlgorithmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*")
public class AlgorithmController {

    @Autowired
    private AlgorithmService algorithmService;

    @GetMapping("/categories")
    public List<Category> getAllCategories() {
        return algorithmService.getAllCategories();
    }

    @GetMapping("/categories/{category}/algorithms")
    public List<Algorithm> getAlgorithmsByCategory(@PathVariable String category) {
        return algorithmService.getAlgorithmsByCategory(category);
    }

    @GetMapping("/algorithms/{id}")
    public Algorithm getAlgorithmById(@PathVariable String id) {
        return algorithmService.getAlgorithmById(id);
    }
}
