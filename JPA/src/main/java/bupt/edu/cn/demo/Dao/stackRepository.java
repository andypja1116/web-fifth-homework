package bupt.edu.cn.demo.Dao;
import bupt.edu.cn.demo.stack;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface stackRepository extends CrudRepository<stack,Integer> {
    @Override
    List<stack> findAll();
}
