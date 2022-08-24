package com.harsha.services;

import static org.mockito.Mockito.when;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.harsha.dao.CurdDao;

@ExtendWith(MockitoExtension.class)
class CurdServiceImplTest {
	@Mock
	CurdDao curdDao;
	@InjectMocks
	CurdServiceImpl curdService;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	final void testInsertData() {

		when(curdDao.insertData()).thenReturn(3);
		int result = curdService.insertData();
		Assertions.assertEquals(3, result);
	}

}
