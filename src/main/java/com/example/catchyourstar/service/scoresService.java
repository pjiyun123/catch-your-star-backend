package com.example.catchyourstar.service;

import com.example.catchyourstar.domain.scores;
import com.example.catchyourstar.dto.scoresDto;
import com.example.catchyourstar.repository.scoresRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class scoresService {
    private final scoresRepository scoresRepo;

    // 랭킹 안에 든 점수들 조회
    public List<scores> getScoresList() {
        List<scores> scoresList = scoresRepo.findAll();
        return scoresList;
    }

    // 랭킹 등록
    public scores addScores(scores score) {
        scores newScore = score.builder()
                .first(score.getFirst())
                .second(score.getSecond())
                .third(score.getThird())
                .fourth(score.getFourth())
                .fifth(score.getFifth())
                .build();

        scoresRepo.save(newScore);
        return newScore;
    }

}
