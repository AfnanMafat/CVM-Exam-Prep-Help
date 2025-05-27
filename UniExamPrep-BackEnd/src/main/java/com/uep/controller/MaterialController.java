package com.uep.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.uep.model.Material;
import com.uep.service.MaterialService;

@RestController
@CrossOrigin(origins = "http://localhost:5173")
public class MaterialController {

    @Value("${app.upload.dir}") 
    private String uploadDir;

    private final MaterialService materialService;

    public MaterialController(MaterialService materialService) {
        this.materialService = materialService;
    }

    @PostMapping(value = "/UploadMaterial", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public ResponseEntity<Material> uploadMaterial(
        @RequestParam("title") String title,
        @RequestParam("description") String description,
        @RequestParam("subjectId") Integer subjectId,
        @RequestParam("uploadedById") Integer uploadedById,
        @RequestPart("file") MultipartFile file
    ) throws IOException {
        Material saved = materialService.saveWithFile(
            title, description, subjectId, uploadedById, file, uploadDir
        );
        return ResponseEntity.ok(saved);
    }
    
    @GetMapping("/GetMaterialsBySubject/{subjectId}")
    public ResponseEntity<List<Material>> getMaterialsBySubject(
        @PathVariable int subjectId
    ) {
        List<Material> materials = materialService.findBySubject(subjectId);
        return ResponseEntity.ok(materials);
    }
}
