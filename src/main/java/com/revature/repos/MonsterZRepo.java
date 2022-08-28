package com.revature.repos;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;


import com.revature.models.MonsterZ;

public class MonsterZRepo {
	
private List<MonsterZ> monsters;
	
	public MonsterZRepo() {
		MonsterZ monster1 = new MonsterZ(0,"Silver Surfer", "Holy", 1200, 3000, "Holy of Surfers.");
		MonsterZ monster2 = new MonsterZ(1,"Dark Magician", "Dark", 2000, 2500,"Master of the Dark Arts.");
		MonsterZ monster3 = new MonsterZ(2,"Blue Eyes White Dragon", "Lightning", 3000, 2000, "Dragon of the Heavens.");
		MonsterZ monster4 = new MonsterZ(3,"Invisible Man", "Void", 1000, 700, "Accident turned Opportunity.");
		MonsterZ monster5 = new MonsterZ(4,"Sabertooth", "Beast", 570, 1250, "Immortal animal.");
		MonsterZ monster6 = new MonsterZ(17,"Dark Wizard", "Warlock", 2500, 2500, "Magician of the Evil Arts.");
		monsters = new ArrayList<>();
		monsters.add(monster1);
		monsters.add(monster2);
		monsters.add(monster3);
		monsters.add(monster4);
		monsters.add(monster5);
		monsters.add(monster6);
		
		System.out.println(monsters);
	}
	
	public MonsterZ getMonsterByNameFromDB(String name) {
		for(MonsterZ m:monsters) {
			if(name.equals(m.getName())) {
				return m;
			}
		}
		return null;
	}

	public MonsterZ getMonstersById(int monsters_id) {
		for(MonsterZ m:monsters) {
			if(monsters_id==(m.getMonsters_id())) {
				return m;
			}
		}
		return null;
	}

	public MonsterZ eraseMonsters(int id) {
		for(MonsterZ m:monsters) {
			if(id==(m.getMonsters_id())) {
				return m;
			}
		}
		return null;
	}

	public MonsterZ newMonsters(MonsterZ monster, int id) {
		for(MonsterZ m:monsters) {
			if(id==(m.getMonsters_id())) {
				return m;
			}
		} 
		return null;
	}
	

}
