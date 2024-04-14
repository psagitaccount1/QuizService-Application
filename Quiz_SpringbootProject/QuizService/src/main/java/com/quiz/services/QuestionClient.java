package com.quiz.services;

import com.quiz.entities.Question;
import org.aspectj.weaver.patterns.TypePatternQuestions;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
//ye feign client hamare service ko call karega
//@FeignClient(url="http://localhost:8082",value="Question-Client")//this is the base url of that service which we have to call;value ek unique type ka name hai
@FeignClient(name="QUESTIONSERVICE")
public interface QuestionClient {
    @GetMapping("/question/quiz/{quizId}")//ye method hamare service ko call karega
    List<Question> getQuestionOfQuiz(@PathVariable Long quizId);
}
