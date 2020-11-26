package com.neusoft.redbag;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;

import javax.jws.soap.SOAPBinding;
import javax.persistence.criteria.CriteriaBuilder;
import java.util.Optional;

@RestController
@RequestMapping("/users")
public class UseController {
    @Autowired
    private UserRepository repository;

    @PostMapping()
    public User save(@RequestBody User user){
        return  repository.save(user);
    }

    @GetMapping("/{id}")
    public User getById(@PathVariable("id")String id){
        Optional<User> optional = repository.findById(id);
        return optional.orElseGet(User::new);
    }

    @DeleteMapping("/{id}")
        public void delete(@PathVariable("id")String id){
            repository.deleteById(id);
        }

    @PutMapping("/{id}")
    public User update(@PathVariable("id")String id,@RequestBody User user){
        user.setId(id);
        return repository.save(user);
    }


/**
 * 分页查询
 * @param pageNum 页的开始数，默认是从0开始
 *
 * @param pageSize 每页几个 默认每页10条数据
 * @return
 */
    @GetMapping("/list")
    public Page<User> pageQuery(@RequestParam(value = "pageNum",defaultValue = "1")Integer pageNum,
                                @RequestParam(value = "pageSize",defaultValue = "5")Integer pageSize){
        PageRequest pageRequest = PageRequest.of(pageNum -1,pageSize);
        return repository.findAll(pageRequest);
    }
    
}