package Cwiczenia;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Cwicz1 {
	public static void main(String[] args) {
		Date dd = new Date();
		SimpleDateFormat d = new SimpleDateFormat("YYYY-MM-DD");
		System.out.println(d.format(dd.getTime()));
	}

}
