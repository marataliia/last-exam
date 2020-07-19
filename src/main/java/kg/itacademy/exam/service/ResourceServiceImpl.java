package kg.itacademy.exam.service;

import kg.itacademy.exam.entity.Resource;
import kg.itacademy.exam.repository.ResourceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResourceServiceImpl implements ResourceService {
    @Autowired
    private ResourceRepository resourceRepository;

    @Override
    public Resource create(Resource resource) {

        return resourceRepository.save(resource);
    }

    @Override
    public Integer counter() {
        Integer counter = 0;
        List<Resource> resources = getAll();
        for (int i=0; i<resources.size(); i++){
            counter++;
        }
        return counter;
    }

    @Override
    public List<Resource> getAll() {
        return resourceRepository.findAll();
    }
}
