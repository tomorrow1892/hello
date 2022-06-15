package kazuate;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * キーボードからの入力を練習するクラス． 例外処理(try-catch)をするバージョン．
 *
 */
// ↓KeyBoardInputという名前のクラスを宣言．大文字で始める．単語のつなぎ目は大文字に
public class KeyBoardInput {

	// KeyBoardInputクラスのmainメソッド．例外は外に投げない．
	public static void main(String[] args) {
		/*-------- 文字列変数の復習 -------- */
		/*
		 * Javaでは String型を使う (C言語ではcharの配列だった)．
		 * 変数名は小文字で始める．2語以上の単語で構成するとき時は，
		 * つなぎ目を大文字に．call_name等としない．
		 */
		String callName = "ジョーチ";
		System.out.println("こんにちは！私は" + callName + "と申します．");

		/*-------- 入力の準備 --------*/
		// キーボード（標準入力）の読み取り機（リーダー）
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String line; // 読み取り用の文字列バッファ

		/*-------- 文字列の入力の練習 --------*/
		String name;
		try {
			System.out.print("●あなたのお名前を入力してください：");
			line = br.readLine(); // 1行読み込む．エラーの例外処理が必要
			System.out.println("お名前は「" + line + "」さんですね．");
			name = line;
		} catch (IOException e) { // readLine()からの入出力例外を拾う．
			System.err.println("入出力例外：名前を「名無し」で進めます．");
			name = "名無し";
		}

		/*-------- 整数の入力の練習 --------*/
		int age = 0;
		try {
			System.out.print("●年齢を入力してください：");
			line = br.readLine(); // 1行読み込む
			age = Integer.parseInt(line);// 文字列を整数に変換する．
			System.out.println(name + "さんは，" + age + "歳なんですね．");
		} catch (NumberFormatException e) { // parseInt()からの例外を拾う．
			System.err.println("フォーマット例外：年齢を0歳で進めます．");
			age = 0;
		} catch (IOException e) { // readLine()からの例外を拾う．
			System.err.println("入出力例外：年齢を0歳で進めます．");
			age = 0;
		}

		/*-------- 小数の入力の練習 --------*/
		double height = 0;
		double weight = 0;
		try {
			System.out.print("●身長は何cmですか？：");
			line = br.readLine(); // 1行読み込む
			height = Double.parseDouble(line); // 文字列を浮動小数に変換する．
			System.out.print("●体重は何kgですか？：");
			line = br.readLine(); // 1行読み込む
			weight = Double.parseDouble(line); // 文字列を浮動小数に変換する．
		} catch (NumberFormatException e) {// 2つのparseDouble()からの例外をまとめて拾う．
			System.err.println("フォーマット例外：BMIが計算できません．終了します．");
			System.exit(1); // 強制終了

		} catch (IOException e) { // 2つのreadLine()からの例外をまとめて拾う．
			System.err.println("入出力例外：BMIが計算できません．終了します．");
			System.exit(1); // 強制終了
		}

		/*-------- 計算と出力の復習 --------*/
		height = height * 0.01; // 身長をmになおす
		double BMI = weight / (height * height); // Body-Mass Index
		System.out.print(name + "さん（" + age + "歳）のBMI値は，");
		System.out.printf("%.2fです．\n", BMI);

	}}


