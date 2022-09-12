package com.correios.consultacep;

import com.correios.consultacep.wsdl.generated.*;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.event.annotation.BeforeTestClass;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class ConsultacepApplicationTests {

	@Test
	void contextLoads() {
	}

	@Autowired
	AtendeClienteService cepService;

	@Test
	public void givenCEP() throws SQLException_Exception, SigepClienteException {
		EnderecoERP endereco = cepService.getAtendeClientePort().consultaCEP("73015138");
		assertEquals("Brasília", endereco.getCidade());
	}
}
