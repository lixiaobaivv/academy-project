package com.blibli.academy.project.admin.service;

import com.blibli.academy.TestApplication;
import com.blibli.academy.project.Business.dto.StudentDto;
import com.blibli.academy.project.Business.pojo.Student;
import com.blibli.academy.project.service.StudentService;
import com.blibli.academy.project.util.RandNumUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * @author lixiaobai
 * @program: project
 * @create: 2018-08-18 22:34
 */

@RunWith(SpringRunner.class)
@SpringBootTest(classes = TestApplication.class)
public class Task {
    @Resource
    private StudentService studentService;
    @Test
    public void instert() throws Exception {
        StudentDto studentDto = new StudentDto();
        for (int i = 0; i < 1; i++) {
            studentDto.setContent("正文" + RandNumUtil.getRandLength(20) + "正文正文正文正文正文正文正文正文");
            studentDto.setClassify(RandNumUtil.getRandRange(1, 2));
            studentDto.setCollect(Long.valueOf(RandNumUtil.getRandRange(20, 1000)));
            studentDto.setIntroduce("简介简介简介简介简介简介" + RandNumUtil.getRandLength(5));
            studentDto.setCovering("http://93.179.100.194:8080/cover_plan.jpg");
            studentDto.setGrade(RandNumUtil.getRandRange(1, 6));
            studentDto.setSubject(RandNumUtil.getRandRange(1, 6));
            studentDto.setTitle("这是标题" + RandNumUtil.getRandLength(5));

            studentDto.setStudy_type(RandNumUtil.getRandRange(1, 2));
            studentDto.setLove(Long.valueOf(RandNumUtil.getRandRange(30, 500)));
            studentDto.setStatus(RandNumUtil.getRandRange(1, 10) > 5);
            System.out.println("studyService.insert(study)" + studentService.insert(studentDto).toString());
            studentDto.setId(null);
        }
    }
}
