package com.zy.zhuang.service;

import com.zy.zhuang.dto.StudentDTO;
import com.zy.zhuang.request.IdRequest;

/**
 * @author: YuanJiZhuang
 * @Date: 2018/12/13 15:41
 * @Description:
 */
public interface StudentService {

    StudentDTO selectStudentById(IdRequest idRequest);

    Integer insertStudent(StudentDTO studentDTO);
}
