package com.revature.services;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;


import com.revature.models.MonsterZ;

import com.revature.repos.MonsterZRepo;

public class MonsterServiceTestZ {
	
	private MonsterZRepo mockRepo = Mockito.mock(MonsterZRepo.class);
	private MonstersServiceZ monsterService = new MonstersServiceZ(mockRepo);
	private MonsterZ testMonster = new MonsterZ("Silver Surfer", "Holy", 1200, 3000, "Holy of Surfers.");
	
	@Test
	public void testFindByName() {
		Mockito.when(mockRepo.getMonsterByNameFromDB("Silver Surfer"))
			.thenReturn(new MonsterZ());
//		MonsterZ m = monsterService.getMonsterByName("Silver Surfer");
//		assertEquals(testMonster, m);
		
	}

}
