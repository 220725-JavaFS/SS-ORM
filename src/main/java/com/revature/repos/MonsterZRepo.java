package com.revature.repos;

import java.util.ArrayList;
import java.util.List;


import com.revature.models.MonsterZ;

public class MonsterZRepo {
	
private List<MonsterZ> monsters;
	
	public MonsterZRepo() {
		MonsterZ monster1 = new MonsterZ("Silver Surfer", "Holy", 1200, 3000, "Holy of Surfers.");
		MonsterZ monster2 = new MonsterZ("Dark Magician", "Dark", 2000, 2500,"Master of the Dark Arts.");
		MonsterZ monster3 = new MonsterZ("Blue Eyes White Dragon", "Lightning", 3000, 2000, "Dragon of the Heavens.");
		MonsterZ monster4 = new MonsterZ("Invisible Man", "Void", 1000, 700, "Accident turned Opportunity.");
		MonsterZ monster5 = new MonsterZ("Sabertooth", "Beast", 570, 1250, "Immortal animal.");
		monsters = new ArrayList<>();
		monsters.add(monster1);
		monsters.add(monster2);
		monsters.add(monster3);
		monsters.add(monster4);
		monsters.add(monster5);
	}
	
	public MonsterZ getMonsterByNameFromDB(String name) {
		for(MonsterZ m:monsters) {
			if(name.equals(m.getName())) {
				return m;
			}
		}
		return null;
	}

}
