package com.euro.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
@AllArgsConstructor
public class Match {

    public Match(){}

    // match fields
    @Getter
    @Setter
    private String hostTeam;

    @Getter
    @Setter
    private int hostGoal;

    @Getter
    @Setter
    private String guestTeam;

    @Getter
    @Setter
    private int guestGoal;

    @Getter
    @Setter
    private int match_id;

    @Getter
    @Setter
    private String status;

} // end of Match class
