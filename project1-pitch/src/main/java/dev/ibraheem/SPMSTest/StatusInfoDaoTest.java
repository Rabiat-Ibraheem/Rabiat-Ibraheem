package dev.ibraheem.SPMSTest;

public class StatusInfoDaoTest {

	@TestMethodOrder(OrderAnnotation.class)
	public class PetDAOTest {
		private static PetDAO petDao; // TODO instantiate
		private static Pet testPet = new Pet();
		private static Pet testNewPet = new Pet();
		
		@BeforeAll
		public static void setUp() {
			// this is the base test pet used for most tests
			testPet.setName("test");
			
			// this is the pet to test create and delete
			Random rand = new Random();
			testNewPet.setName("test_" + rand.nextLong());
			
			// TODO create pet in DB with name "test"
			// and set the pet's ID to the returned value
		}
		
		@AfterAll
		public static void cleanUp() {
			// TODO remove pets in DB with name containing "test"
		}
		
		@Test
		public void getByOwnerExists() {
			// TODO
		}
		
		@Test
		public void getByOwnerDoesNotExist() {
			// TODO
		}
		
		@Test
		@Order(1)
		public void createPetSuccessfully() {
			int id = petDao.create(testNewPet);
			
			assertNotEquals(0, id);
		}
		
		@Test
		public void getByIdExists() {
			int id = testPet.getId();
			
			Pet pet = petDao.getById(id);
			
			assertEquals(testPet, pet);
		}
		
		@Test
		public void getByIdDoesNotExist() {
			Pet pet = petDao.getById(0);
			assertNull(pet);
		}
		
		@Test
		public void getAll() {
			assertNotNull(petDao.getAll());
		}
		
		@Test
		public void updateUserExists() {
			assertDoesNotThrow(() -> {
				petDao.update(testPet);
			});
		}
		
		@Test
		public void updateUserDoesNotExist() {
			assertThrows(SQLException.class, () -> {
				petDao.update(new Pet());
			});
		}
		
		@Test
		@Order(2)
		public void deleteUserExists() {
			assertDoesNotThrow(() -> {
				petDao.delete(testNewPet);
			});
		}
		
		@Test
		public void deleteUserDoesNotExist() {
			assertThrows(SQLException.class, () -> {
				petDao.delete(new Pet());
			});
		}
	}
	package com.revature.data;

	import java.sql.SQLException;
	import java.util.Random;

	import static org.junit.jupiter.api.Assertions.*;
	import org.junit.jupiter.api.AfterAll;
	import org.junit.jupiter.api.BeforeAll;
	import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
	import org.junit.jupiter.api.Order;
	import org.junit.jupiter.api.Test;
	import org.junit.jupiter.api.TestMethodOrder;

	import com.revature.models.User;

	@TestMethodOrder(OrderAnnotation.class)
	public class UserDAOTest {
		private static UserDAO userDao; // TODO instantiate
		private static User testUser = new User();
		private static User testNewUser = new User();
		
		@BeforeAll
		public static void setUp() {
			// this is the base test user used for most tests
			testUser.setUsername("test");
			
			// this is the user to test create and delete
			Random rand = new Random();
			testNewUser.setUsername("test_" + rand.nextLong());
			
			// TODO create user in DB with username "test"
			// and set the user's ID to the returned value
		}
		
		@AfterAll
		public static void cleanUp() {
			// TODO remove users in DB with username containing "test"
		}
		
		@Test
		public void getByUsernameExists() {
			User user = userDao.getByUsername("test");
			assertEquals(testUser, user);
		}
		
		@Test
		public void getByUsernameDoesNotExist() {
			User user = userDao.getByUsername("qwertyuiop");
			assertNull(user);
		}
		
		@Test
		@Order(1)
		public void createUserSuccessfully() {
			int id = userDao.create(testNewUser);
			
			assertNotEquals(0, id);
		}
		
		@Test
		public void createUserDuplicateUsername() {
			int id = userDao.create(testUser);
			
			assertEquals(0, id);
		}
		
		@Test
		public void getByIdExists() {
			int id = testUser.getId();
			
			User user = userDao.getById(id);
			
			assertEquals(testUser, user);
		}
		
		@Test
		public void getByIdDoesNotExist() {
			User user = userDao.getById(0);
			assertNull(user);
		}
		
		@Test
		public void getAll() {
			assertNotNull(userDao.getAll());
		}
		
		@Test
		public void updateUserExists() {
			assertDoesNotThrow(() -> {
				userDao.update(testUser);
			});
		}
		
		@Test
		public void updateUserDoesNotExist() {
			assertThrows(SQLException.class, () -> {
				userDao.update(new User());
			});
		}
		
		@Test
		@Order(2)
		public void deleteUserExists() {
			assertDoesNotThrow(() -> {
				userDao.delete(testNewUser);
			});
		}
		
		@Test
		public void deleteUserDoesNotExist() {
			assertThrows(SQLException.class, () -> {
				userDao.delete(new User());
			});
		}

	
}
