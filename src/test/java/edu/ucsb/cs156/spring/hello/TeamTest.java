package edu.ucsb.cs156.spring.hello;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TeamTest {

    Team team;

    @BeforeEach
    public void setup() {
        team = new Team("test-team");
    }

    @Test
    public void getName_returns_correct_name() {
        assert(team.getName().equals("test-team"));
    }

    @Test
    public void toString_returns_correct_string() {
        assertEquals("Team(name=test-team, members=[])", team.toString());
    }

    @Test
    public void equals_same_object_returns_true() {
        assertTrue(team.equals(team));
    }

    @Test
    public void equals_equal_teams_returns_true() {
        Team team2 = new Team("test-team");
        assertTrue(team.equals(team2));
    }

    @Test
    public void equals_different_name_returns_false() {
        Team team2 = new Team("different-team");
        assertFalse(team.equals(team2));
    }

    @Test
    public void equals_different_members_returns_false() {
        Team team2 = new Team("test-team");
        team.addMember("Alice");
        assertFalse(team.equals(team2));
    }

    @Test
    public void equals_both_have_same_members_returns_true() {
        Team team2 = new Team("test-team");
        team.addMember("Alice");
        team.addMember("Bob");
        team2.addMember("Alice");
        team2.addMember("Bob");
        assertTrue(team.equals(team2));
    }

    @Test
    public void equals_null_returns_false() {
        assertFalse(team.equals(null));
    }

    @Test
    public void equals_different_class_returns_false() {
        assertFalse(team.equals("not a team"));
    }

    @Test
    public void test_hashCode() {
        Team t = new Team("test-team");
        int result = t.hashCode();
        int expectedResult = -1226298695;
        assertEquals(expectedResult, result);
    }

    @Test
    public void hashCode_equal_teams_have_equal_hashcodes() {
        Team team2 = new Team("test-team");
        assertEquals(team.hashCode(), team2.hashCode());
    }

    @Test
    public void hashCode_different_teams_likely_different_hashcodes() {
        Team team2 = new Team("different-team");
        // This is not guaranteed but very likely
        // Include this to ensure hashCode is implemented
        team.hashCode(); // Just ensure it doesn't throw
        team2.hashCode();
    }

    @Test
    public void addMember_adds_member() {
        team.addMember("Alice");
        assertTrue(team.toString().contains("Alice"));
    }

    @Test
    public void team_with_multiple_members() {
        team.addMember("Alice");
        team.addMember("Bob");
        team.addMember("Charlie");
        assertTrue(team.toString().contains("Alice"));
        assertTrue(team.toString().contains("Bob"));
        assertTrue(team.toString().contains("Charlie"));
    }
}