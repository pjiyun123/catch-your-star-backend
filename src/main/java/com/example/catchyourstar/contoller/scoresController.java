package com.example.catchyourstar.contoller;


import com.example.catchyourstar.domain.scores;
import com.example.catchyourstar.service.scoresService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(value="/", method = {RequestMethod.POST, RequestMethod.POST})
@RequiredArgsConstructor
public class scoresController {
    private final scoresService scoresServ;

    // 누적 랭킹 목록 조회
    @GetMapping("/scores/list")
    public List<scores> list() {
        return scoresServ.getScoresList();
    }

    // 새 랭킹 저장
    @PostMapping("/scores")
    public scores add(@RequestBody scores score) {
        scores newScores = scoresServ.addScores(score);
        return newScores;
    }

}
