package com.example.catchyourstar.repository;

import com.example.catchyourstar.domain.scores;
import org.springframework.data.jpa.repository.JpaRepository;

public interface scoresRepository extends JpaRepository<scores, Long> {
}