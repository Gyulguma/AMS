package com.ams.amsbackend.controller;

import com.ams.amsbackend.controller.dto.UserDto;
import com.ams.amsbackend.service.UserService;
import com.ams.amsbackend.util.BaseResponse;
import lombok.RequiredArgsConstructor;
import org.apache.catalina.User;
import org.springframework.web.bind.annotation.*;


@RequiredArgsConstructor
@RequestMapping("/users/")
@RestController
public class UserController {

    private UserService userService;
    private UserDto userDto;

    public UserController(UserService userService, UserDto userDto) {
        this.userService = userService;
        this.userDto = userDto;
    }

    @PostMapping("sing-up")
    public BaseResponse<?> singUp() {

    }

    @PostMapping("log-in")
    public BaseResponse<?> logIn() {

    }

    @PostMapping("grade-card")
    public BaseResponse<?> getGradeCardInfo() {
        //���� ����ǥ(���, �����, ����)
        // input = userId(Student), examNumber(���� ȸ��)
        // output = ��ü ���� �л� ��, ���(studentRank), ����(100), ����(studentScore), ȸ��(examNumber), �� ��ȣ�� ����(����(ExamAnswer.examAnswer, �л��� ���� ��(StudentAnswer.studentAnswer), �����)

    }

    @GetMapping("grade-graph")
    public BaseResponse<?> getGradeGraphInfo() {
        // ���� �����׷���
        // input = userId(Student)
        // output = ��� ȸ����(ȸ��, �ش� ȸ�� ����, �ش� ȸ�� ���(�� ���/��ü �л� ��))


    }

    @PostMapping("answers")
    public BaseResponse<?> () inputAnswers(@RequestBody UserDto.GetStudentAnswerInput){
        // �л� ���� �Է�
        // input = userId(Student), ȸ��(examNumber), ����(examSubject), �л��� �ۼ��� ����(studentAnswer),
        // output = ���� ���� ����

    }
}
