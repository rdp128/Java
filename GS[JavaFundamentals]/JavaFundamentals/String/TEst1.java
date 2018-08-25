package String;

import java.text.DecimalFormat;
import java.util.Formatter;

//Future Interest rate : investAmount * (1 + (rate/12))^ years*12;

public class TEst1 {

	public static void main(String[] args) {

		TEst1 ts = new TEst1();

		DecimalFormat formatter = new DecimalFormat(".##");

		for (int i = 1; i <= 5; i++) {
			double ans = ts.futureInvestment(1000, 0.1, i);

			System.out.println(formatter.format(ans));
		}

	}

	public double futureInvestment(int investAmount, double interestRate,
			int year) {

		return investAmount * Math.pow(1 + (interestRate / 12), year * 12);

	}
}
