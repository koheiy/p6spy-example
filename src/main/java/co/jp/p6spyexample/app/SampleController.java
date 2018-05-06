package co.jp.p6spyexample.app;

import co.jp.p6spyexample.domain.dao.SampleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

    @Autowired
    private SampleRepository repository;

    @GetMapping("/{id}")
    public String index(@PathVariable("id") String id) {
        return repository.selectNameById(id);
    }
}
