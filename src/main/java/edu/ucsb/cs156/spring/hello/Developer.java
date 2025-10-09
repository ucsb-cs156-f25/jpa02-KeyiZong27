package edu.ucsb.cs156.spring.hello;

/**
 * A class with static methods to provide information about the developer.
 */

public class Developer {

    // This class is not meant to be instantiated
    // so we make the constructor private

    private Developer() {}
    
    /**
     * Get the name of the developer
     */

    public static String getName() {
        // TODO: Change this to your name
        // You may use just the name that is used on <https://bit.ly/cs156-f25-teams>
        // i.e. your first name, or your first and initial of last name

        return "Keyi";
    }

    /**
     * Get the github id of the developer
     * @return github id of the developer
     */

    public static String getGithubId() {
        // TODO: Change this to your github id
        return "KeyiZong27";
    }

    /**
     * Get the developers team
     * @return developers team as a Java object
     */
    
    public static Team getTeam() {
        // TODO: Change this to your team name
        Team team = new Team("f25-14");
        team.addMember("PRATIMA REDDY");
        team.addMember("DANIEL JUNHYUK");
        team.addMember("LOGAN CHRISTOPHER");
        team.addMember("CATHERINE");
        team.addMember("FERNANDO");
        team.addMember("KEYI");
        return team;
    }
}
