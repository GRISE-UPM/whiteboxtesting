package es.upm.grise.profundizacion.whiteboxtesting;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Test_convertInt {

	@Test
	public void convertInt_len_lt_6() throws Exception {
		char[] arr = {'1', '2', '3'};
		Exercises aux1 = new Exercises();
		Exercises.convertInt aux2 = aux1.new convertInt();
		assertEquals(123, aux2.convert(arr));
	}
	
	@Test
	public void convertInt_len_gt_6() throws Exception {
		char[] arr = {'1', '2', '3', '4', '5','6', '7'};
		Exercises aux1 = new Exercises();
		Exercises.convertInt aux2 = aux1.new convertInt();
		assertThrows(Exception.class, () -> aux2.convert(arr));
	}
	
	@Test
	public void convertInt_lt_0() throws Exception {
		char[] arr = {'-', '1', '2', '3'};
		Exercises aux1 = new Exercises();
		Exercises.convertInt aux2 = aux1.new convertInt();
		assertEquals(-123, aux2.convert(arr));
	}
	
	@Test
	public void convertInt_gt_32767() throws Exception {
		char[] arr = {'9', '9', '9', '9', '9'};
		Exercises aux1 = new Exercises();
		Exercises.convertInt aux2 = aux1.new convertInt();
		assertThrows(Exception.class, () -> aux2.convert(arr));
	}
	
	@Test
	public void convertInt_lt_neg32768() throws Exception {
		char[] arr = {'-', '9', '9', '9', '9', '9'};
		Exercises aux1 = new Exercises();
		Exercises.convertInt aux2 = aux1.new convertInt();
		assertThrows(Exception.class, () -> aux2.convert(arr));
	}


}
