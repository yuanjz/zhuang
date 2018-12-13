package com.zy.zhuang.impl;

import com.zy.zhuang.dto.StudentDTO;
import com.zy.zhuang.mapper.StudentMapper;
import com.zy.zhuang.request.IdRequest;
import com.zy.zhuang.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author: YuanJiZhuang
 * @Date: 2018/12/13 15:43
 * @Description:
 */
@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentMapper studentMapper;

    @Override
    public StudentDTO selectStudentById(IdRequest idRequest) {
        return studentMapper.queryById(idRequest.getId());
    }

    @Override
    public Integer insertStudent(StudentDTO studentDTO) {
        return studentMapper.addStudent(studentDTO);
    }
}
