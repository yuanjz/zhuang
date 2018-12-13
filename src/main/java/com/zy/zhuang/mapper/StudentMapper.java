package com.zy.zhuang.mapper;

import com.zy.zhuang.dto.StudentDTO;
import org.springframework.stereotype.Service;

/**
 * @author: YuanJiZhuang
 * @Date: 2018/12/13 10:13
 * @Description:
 */
@Service
public interface StudentMapper {

    /**
     * 根据id查询
     *
     * @param id
     * @return
     */
    StudentDTO queryById(Long id);

    /**
     * 插入
     * @param studentDTO
     * @return
     */
    Integer addStudent(StudentDTO studentDTO);
}
