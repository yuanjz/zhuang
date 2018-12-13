package com.zy.zhuang.controller;

import com.zy.zhuang.dto.StudentDTO;
import com.zy.zhuang.request.AddStudentRequest;
import com.zy.zhuang.request.IdRequest;
import com.zy.zhuang.service.StudentService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author: YuanJiZhuang
 * @Date: 2018/12/13 15:47
 * @Description:
 */
@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping(value = "/selectStudentById", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
    @ResponseBody
    public StudentDTO selectStudentById(@RequestBody IdRequest idRequest) {
        if (idRequest.getId() == null) {
            return null;
        }
        return studentService.selectStudentById(idRequest);
    }

    @RequestMapping(value = "/insertStudent", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
    @ResponseBody
    public Integer insertStudent(@RequestBody AddStudentRequest addStudentRequest) {
        if (addStudentRequest.getId() == null) {
            return null;
        }
        StudentDTO studentDTO = new StudentDTO();
        BeanUtils.copyProperties(addStudentRequest, studentDTO);
        return studentService.insertStudent(studentDTO);
    }
}
