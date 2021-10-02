package com.euro.model.service;


import com.euro.model.Match;

import java.util.List;

public interface MatchService<T> {

    void addMatch(Match match);

    void addMatch2(String hT, String gT);

    List<T> showAll();



}
