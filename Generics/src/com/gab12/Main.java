package com.gab12;

public class Main {

    public static void main(String[] args) {

        FootballPlayer joe = new FootballPlayer("joe");
        BaseballPlayer pat = new BaseballPlayer("pat");
        SoccerPlayer beckham = new SoccerPlayer("beckham");

        Team<FootballPlayer> adelaideCrows = new Team("Adeliade Crows");
        adelaideCrows.addPlayer(joe);
        //adelaideCrows.addPlayer(pat);
        //adelaideCrows.addPlayer(beckham);

        System.out.println(adelaideCrows.numberOfPlayers());

        Team<BaseballPlayer> baseballTeam = new Team<>("Chicago cubs");
        baseballTeam.addPlayer(pat);

        Team<SoccerPlayer> brokenTeam= new Team<>("this won't work");
        brokenTeam.addPlayer(beckham);

    }
}
