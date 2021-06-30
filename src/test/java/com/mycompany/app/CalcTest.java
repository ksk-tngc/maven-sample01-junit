package com.mycompany.app;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * {@link Calc}のテストクラスです.
 *
 * <p>何のテストかひと目で分かるよう、日本語のテストメソッド名を使用します.
 */
class CalcTest {

	// --------------------------- コンストラクタのテスト --------------------------- //

//	@Test
//	void testInstantiateCalc() {
//		fail();
//	}

	@Test
	public void クラスCalcが引数1つでnewできること() {
		Calc c = new Calc(100);
		assertEquals(100, c.getBaseNum());
	}

	// --------------------------- メソッドのテスト --------------------------- //

	@Test
	public void メソッドaddのテスト() {
		Calc c = new Calc(100);
		assertEquals(110, c.add(10));
	}

	@Test
	public void メソッドminusのテスト() {
		Calc c = new Calc(0);
		assertEquals(-10, c.minus(10));
	}

}
