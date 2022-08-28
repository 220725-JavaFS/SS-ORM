package com.revature.daos;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;

import com.revature.models.MonsterZ;

public interface MonsterDAOZ {
	
	public abstract MonsterZ getMonstersById(int id);

	List<MonsterZ> allMonsters();

	public abstract void newMonsters(MonsterZ monsters);

	public abstract MonsterZ eraseMonsters(int id);

	//public abstract void eraseMonstersByName(MonsterZ name);

	public abstract MonsterZ getMonstersUpdate(MonsterZ monsters, int id);

	
	//Object getMonstersById(Object object, int id) throws ServletException, IOException;

}
