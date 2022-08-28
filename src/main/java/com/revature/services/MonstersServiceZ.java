package com.revature.services;

import java.util.List;

import com.revature.daos.MonsterDAOZ;
import com.revature.daos.MonstersDAOImplZ;
import com.revature.models.MonsterZ;
import com.revature.repos.MonsterZRepo;


public class MonstersServiceZ {
	
	private MonsterDAOZ monstersDAO = new MonstersDAOImplZ();
	
	private MonsterZRepo monsterRepo;

	public MonstersServiceZ(MonsterZRepo monsterRepo) {
		super();
		this.monsterRepo = monsterRepo;
	}
	

	public MonsterZ getSingleMonsters (int id){
		
		return monstersDAO.getMonstersById(id);
	}
	
	public List<MonsterZ> fullDeck(){
		return monstersDAO.allMonsters();
	}
	
	public void addMonster(MonsterZ monsters) {
		monstersDAO.newMonsters(monsters);
	}
	
	public MonsterZ deleteMonster(int id) {
		return monstersDAO.eraseMonsters(id);	
	}
	
	public void updateMonster (MonsterZ monsters, int id) {
		monstersDAO.getMonstersUpdate(monsters, id);
	}




}
