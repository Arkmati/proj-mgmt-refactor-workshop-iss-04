package sg.edu.nus.iss.epat.refactor.workshop;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class RegularProjectTest {
	private final String MEMBER_NAME1 = "Anne";
	private final String MEMBER_NAME2 = "John";
	
	private RegularProject regularProject = null;

	@Before
	public void setUp() {
		regularProject = new RegularProject();
	}

	@Test
	public void testAddMember() {
		regularProject.addMember(MEMBER_NAME1);
		regularProject.addMember(MEMBER_NAME2);
		
		assertEquals(2, regularProject.getMembers().size());
		assertTrue(regularProject.getMembers().contains(MEMBER_NAME1));
		assertTrue(regularProject.getMembers().contains(MEMBER_NAME2));
	}

	@Test
	public void testRemoveMember1() {
		// One member added; one removed
		regularProject.addMember(MEMBER_NAME1);
		
		regularProject.removeMember(MEMBER_NAME1);
		
		assertEquals(0, regularProject.getMembers().size());
	}
	
	@Test
	public void testRemoveMember2() {
		// Two members added; one removed
		regularProject.addMember(MEMBER_NAME1);
		regularProject.addMember(MEMBER_NAME2);
		
		regularProject.removeMember(MEMBER_NAME1);
		
		assertEquals(1, regularProject.getMembers().size());
		assertFalse(regularProject.getMembers().contains(MEMBER_NAME1));
		assertTrue(regularProject.getMembers().contains(MEMBER_NAME2));
	}
}
