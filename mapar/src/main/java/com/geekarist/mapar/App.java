package com.geekarist.mapar;

import static java.lang.Math.abs;
import static java.lang.Math.atan2;
import static java.lang.Math.cos;
import static java.lang.Math.sin;
import static java.lang.Math.toDegrees;
import static java.lang.Math.toRadians;

public class App {
	public static void main(String[] args) {
		System.out.printf("From 9 r. cx faubin to 2 defense: %f\n",
				bearing(48.85845, 2.38548, 48.89388, 2.24014));
		System.out.printf("From 9 r. cx faubin to 2 honegger: %f\n",
				bearing(48.85845, 2.38548, 48.72899, 2.57943));

		// From Osaka to Bagdad
		System.out.printf("From Osaka to Bagdad: %f\n",
				bearing(35, 45, 35, 135));
	}

	private static double bearing(double lat1, double lon1, double lat2,
			double lon2) {
		double lat2Rad = toRadians(lat2);
		double lat1Rad = toRadians(lat1);
		double lon2Rad = toRadians(lon2);
		double lon1Rad = toRadians(lon1);
		double dlonRad = lon2Rad - lon1Rad;
		double bearingRad = atan2( //
				sin(dlonRad) * cos(lat2Rad), //
				cos(lat1Rad) * sin(lat2Rad) - sin(lat1Rad) * cos(lat2Rad)
						* cos(dlonRad));
		return toDegrees(bearingRad);
	}
}
