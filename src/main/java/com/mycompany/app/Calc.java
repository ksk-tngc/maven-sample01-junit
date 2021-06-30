package com.mycompany.app;

/**
 * 計算をするクラスです.
 *
 * <p>数値を1つ保持し、それに対する計算処理を提供します.
 */
public class Calc {

	// --------------------------- フィールド --------------------------- //

	/** このインスタンスが保持する数値 */
	private int baseNum;

	// --------------------------- コンストラクタ --------------------------- //

	/**
	 * コンストラクタです.
	 *
	 * <p>このインスタンスが保持する数値を初期化します.
	 *
	 * @param baseNum このインスタンスが保持する数値
	 */
	public Calc(int baseNum) {
		this.baseNum = baseNum;
	}

	// --------------------------- メソッド --------------------------- //

	/**
	 * このインスタンスが保持する数値に引数の数値を加算します.
	 *
	 * @param num 加算する数値
	 * @return 加算後の、このインスタンスが保持する数値
	 */
	public int add(int num) {
		return this.baseNum += num;
	}

	/**
	 * このインスタンスが保持する数値から引数の数値を減算します.
	 *
	 * @param num 減算する数値
	 * @return 減算後の、このインスタンスが保持する数値
	 */
	public int minus(int num) {
		return this.baseNum -= num;
	}

	// --------------------------- Getter / Setter --------------------------- //

	public int getBaseNum() {
		return this.baseNum;
	}

	public void setBaseNum(int baseNum) {
		this.baseNum = baseNum;
	}

}
