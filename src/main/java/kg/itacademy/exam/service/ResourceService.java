package kg.itacademy.exam.service;

import kg.itacademy.exam.entity.Resource;

import java.util.List;

public interface ResourceService {
    Integer counter();
    Resource create(Resource resource);
    List<Resource> getAll();
}
