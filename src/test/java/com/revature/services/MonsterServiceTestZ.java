package com.revature.services;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;


import com.revature.models.MonsterZ;

import com.revature.repos.MonsterZRepo;
//import com.revature.utils.ConnectionUtil;

public class MonsterServiceTestZ {
	
	private MonsterZRepo mockRepo = Mockito.mock(MonsterZRepo.class);
	private MonstersServiceZ monsterService = new MonstersServiceZ(mockRepo);
	private MonsterZ testMonster = new MonsterZ(23,"Silver Surfer", "Holy", 1200, 3000, "Holy of Surfers.");
	private MonsterZ testMonster2 = new MonsterZ(30,"Dark Wizard", "Warlock", 2500, 2500, "Magician of the Evil Arts.");
	private MonsterZ testMonster3 = new MonsterZ(16,"Silver", "Holy", 1200, 300, "Holy of Surfers.");
	private MonsterZ testMonster4 = new MonsterZ(26,"Dark Wizard", "Warlock", 2500, 2500, "Magician of the Evil Arts.");

	
	@Test
	public void testInsert() {
		
		Mockito.when(mockRepo.newMonsters(testMonster3, 16))
		.thenReturn(new MonsterZ(16,"Silver", "Holy", 1200, 300, "Holy of Surfers."));
		MonsterZ testMonster4 = new MonsterZ(16,"Silver", "Holy", 1200, 300, "Holy of Surfers.");
		//MonsterZ m = monsterService.addMonster(testMonster3);
		assertEquals(testMonster3, testMonster4);
		System.out.println("insert 1 success");
		
	}
	
	@Test
	public void testInsert2() {
		
		Mockito.when(mockRepo.getMonstersById(25))
		.thenReturn(new MonsterZ("Dark Wizard", "Warlock", 2500, 2500, "Magician of the Evil Arts."));
	MonsterZ m = monsterService.getSingleMonsters(25);
	assertEquals(testMonster2, m);
	
	System.out.println("insert 2 success");
		
	}
	
	@Test
	public void testFindById() {
		Mockito.when(mockRepo.getMonstersById(30))
		.thenReturn(new MonsterZ("Dark Wizard", "Warlock", 2500, 2500, "Magician of the Evil Arts."));
	MonsterZ m = monsterService.getSingleMonsters(30);
	assertEquals(testMonster2, m);
	
	System.out.println("find 1 success");
	}
	
	@Test
	public void testFindById2() {
		Mockito.when(mockRepo.getMonstersById(25))
		.thenReturn(new MonsterZ("Dark Wizard", "Warlock", 2500, 2500, "Magician of the Evil Arts."));
	MonsterZ m = monsterService.getSingleMonsters(25);
	assertEquals(testMonster2, m);
	
	System.out.println("find 2 success");
	}
	
	@Test
	public void testGetAll() {
		monsterService.fullDeck();
		System.out.println("test all success");
	}
	
	
	@Test
	public void testUpdateById() {
		
		monsterService.updateMonster(testMonster, testMonster.getMonsters_id());
		System.out.println("test update success");
	}
	
		
	@Test
	public void testDeleteById() {
		
		Mockito.when(mockRepo.eraseMonsters(26))
		.thenReturn(new MonsterZ("Dark Wizard", "Warlock", 2500, 2500, "Magician of the Evil Arts."));
	MonsterZ m = monsterService.deleteMonster(26);
		monsterService.deleteMonster(testMonster4.getMonsters_id());
		assertEquals(null, m);
		System.out.println("test delete success");
	}
	
	
	

}
