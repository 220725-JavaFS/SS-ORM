//package com.revature.daos;
//
//import java.io.IOException;
//import java.util.List;
//
//import javax.servlet.ServletException;
//
//import com.fasterxml.jackson.core.JsonProcessingException;
//import com.fasterxml.jackson.databind.JsonMappingException;
//import com.revature.models.Monsters;
//
//public interface MonstersDAO {
//
//	public abstract Monsters getMonstersById(int id);
//
//	List<Monsters> allMonsters();
//
//	public abstract void newMonsters(Monsters Monsters);
//
//	public abstract Monsters eraseMonsters(int id);
//
//	public abstract void eraseMonstersByName(Monsters name);
//
//	public abstract Monsters getMonstersUpdate(Monsters monsters, int id);
//
//	
//	Object getMonstersById(Object object, int id) throws ServletException, IOException;
//	
//}
