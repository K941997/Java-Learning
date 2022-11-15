package NumberFormat1;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Locale;

/*
 * Number Format:
 * 1. Locale VN
 * 2. NumberFormat (by Locale)
 * 3. Pattern
 * 4. DecimalFormatPattern (by Pattern)
 * 5. DecimalFormatLocale (by Locale)
 * 6. DecimalFormatSymbols (in DecimalFormatLocale)
 * */

public class Main {
	public static void main(String[] args) {
		long l = 123456789;
		double k = 1234567.890123;
		
		//Locale VN:
		Locale locale = new Locale("vi", "VN");
		
		//NumberFormat:
		NumberFormat nFLocale = NumberFormat.getInstance(locale);
		//1. Set ky tu sau dau phay:
		nFLocale.setMaximumFractionDigits(4);
		nFLocale.setMinimumFractionDigits(0);
		//2. Set ky tu phan ngan:
		nFLocale.setMaximumIntegerDigits(2);
		//3. Lam` tron`:
		nFLocale.setRoundingMode(RoundingMode.HALF_UP);
		System.out.println(nFLocale.format(l));
		System.out.println(nFLocale.format(k));
		
		//DecimalFormatPattern:
		String pattern = "###,###.##";
		DecimalFormat dFPattern = new DecimalFormat(pattern);
		System.out.println(dFPattern.format(l));
		System.out.println(dFPattern.format(k));
		
		//DecimalFormatLocale:
		DecimalFormat dFLocale = (DecimalFormat) DecimalFormat.getInstance(locale);
		//1. Set ky tu sau dau phay:
		dFLocale.setMaximumFractionDigits(4);
		dFLocale.setMinimumIntegerDigits(0);
		//2. Chuyen dinh dang dau' phay sang gach ngang:
		//a. DecimalFormatSymbols:
		DecimalFormatSymbols dFSymbols = new DecimalFormatSymbols();
		dFSymbols.setGroupingSeparator('-');
		dFSymbols.setDecimalSeparator(',');
		dFLocale.setDecimalFormatSymbols(dFSymbols);
		//b. Group size so':
		dFLocale.setGroupingSize(4);
		System.out.println(dFLocale.format(l));
		System.out.println(dFLocale.format(k));
	}
}
