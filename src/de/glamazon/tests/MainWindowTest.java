package de.glamazon.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import de.glamazon.gui.MainWindowController;
import de.glamazon.gui.MainWindowModel;
import de.glamazon.gui.MainWindowView;

class MainWindowTest {
	
	private static MainWindowController ctrl;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		ctrl = new MainWindowController(new MainWindowModel(), new MainWindowView());
		assertNotNull(ctrl);		//hat die Initialisierung funktioniert?
		}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		ctrl = null; //AUfräumen, ctrl auf Null setzen, wird nach dem Test nicht mehr gebraucht
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testMainWindowVisibility() {
		boolean isVisible = ctrl.getView().isVisible();
		
		assertTrue(isVisible);
	}
	
	@Test
	void testUnknownActionCommand() {
		ctrl.getView().getB
	}

}
