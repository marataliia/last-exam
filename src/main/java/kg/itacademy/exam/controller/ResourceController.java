package kg.itacademy.exam.controller;

import kg.itacademy.exam.entity.Resource;
import kg.itacademy.exam.service.ResourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rs")
public class ResourceController {
    @Autowired
    private ResourceService resourceService;

    @PostMapping("/counter")
    public Resource create(@RequestBody Resource resource){
        if (resource==null) return null;
        return resourceService.create(resource);
    }

    @GetMapping("/counter")
    public Integer counter(){
        return resourceService.counter();
    }

    @GetMapping("/report")
    public List<Resource> getAll(){
        return resourceService.getAll();
    }


}
