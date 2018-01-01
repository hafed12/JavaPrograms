package com.gab12;

import java.util.ArrayList;

/**
 * Created by SONY on 12/2/2017.
 */
public class Team<T extends Player> implements Comparable<Team<T>> {
    private String name;
    int played =0 ;
    int won = 0;
    int lost = 0;
    int tied =0 ;

    public Team(String name) {
        this.name = name;
    }

    private ArrayList<T> members = new ArrayList<>();

    public String getName() {
        return name;
    }

    public boolean addPlayer(T player){
        if (members.contains(player)){
            System.out.println(player.getName()+"is already a member of the team.");
            return false;
        }else  {
            members.add(player);
            System.out.println(player.getName()+" is added to the team");
            return true;
        }
    }
    public int numPlayers(){
        return this.members.size();
    }

    public int numberOfPlayers(){
        return this.members.size();
    }

    public void matchResult(Team<T> opponent, int ourScore, int thierScore){
        if(ourScore > thierScore){
            won++;
        }else if (ourScore < thierScore){
            lost++;
        }else {
            tied++;
        }
        played++;
        if (opponent != null){
            opponent.matchResult(null,thierScore,ourScore);
        }
    }

    public int ranking(){
        return (won*2)+tied;
    }


    @Override
    public int compareTo(Team<T> team) {
        if (this.ranking() > team.ranking()) {
            return -1;
        } else if (this.ranking() < team.ranking()) {
            return 1;
        } else {
            return 0;
        }
    }
}







