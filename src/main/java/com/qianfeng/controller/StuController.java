package com.qianfeng.controller;

import com.qianfeng.entity.Student;
import com.qianfeng.service.IStuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @Author xuliang
 * @Date 2019-9-26
 */
@Controller
@RequestMapping("/stu")
public class StuController {
    @Autowired
    private IStuService stuService;

    /**
     * 学生列表的控制方法
     * @return
     */
    @RequestMapping("/list")
    public String list(Model model){
        List<Student> studentList = stuService.list();
        model.addAttribute("studentList",studentList);
        return "stuList";
    }

    @RequestMapping("/delete/{id}")
    public String deleteById(@PathVariable("id") Integer id){

        stuService.removeById(id);
        return "redirect:/stu/list";
    }
}
