package com.hibernate.Mappings.Assosiation_mapping.onetomany;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.OrderColumn;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table
public class CricketTeam 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int team_id;
	private String teamName;
	private String state;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "cricket_player_table",joinColumns = @JoinColumn(referencedColumnName = "playerId"),inverseJoinColumns = @JoinColumn(referencedColumnName = "team_id"))
	@JoinColumn(referencedColumnName = "team_id")
	@OrderColumn(name = "rank")
	@Column(name = "player")
	private List<Player> players;
	
	@Override
	public String toString() {
		return "CricketTeam [team_id=" + team_id + ", teamName=" + teamName + ", state=" + state + ", players="
				+ players + ", lastUpdated=" + lastUpdated + "]";
	}

	public int getTeam_id() {
		return team_id;
	}

	public void setTeam_id(int team_id) {
		this.team_id = team_id;
	}

	public CricketTeam() {
		super();
	}

	public CricketTeam(String teamName, String state, Date lastUpdated) {
		super();
		this.teamName = teamName;
		this.state = state;
		this.lastUpdated = lastUpdated;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public List<Player> getPlayers() {
		return players;
	}

	public void setPlayers(List<Player> players) {
		this.players = players;
	}

	public Date getLastUpdated() {
		return lastUpdated;
	}

	public void setLastUpdated(Date lastUpdated) {
		this.lastUpdated = lastUpdated;
	}

	@Temporal(TemporalType.TIMESTAMP)
	private Date lastUpdated;
	
}
