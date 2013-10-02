package com.geekarist.mapar;

import static java.lang.Math.abs;
import static java.lang.Math.atan2;
import static java.lang.Math.cos;
import static java.lang.Math.sin;
import static java.lang.Math.toDegrees;
import static java.lang.Math.toRadians;

public class App {
	public static void main(String[] args) {
		// From 9 r. cx faubin
		double lat1 = toRadians(48.85845);
		double lon1 = toRadians(2.38548);
		// To 2 pl. la défense
		System.out.printf("To 2 defense: %f\n", bearing(lat1, lon1, toRadians(48.89388), toRadians(2.24014)));
		// To 2 rue a. honegger
		System.out.printf("To 2 honegger: %f\n", bearing(lat1, lon1, toRadians(48.72899), toRadians(2.57943)));
	}

	private static double bearing(double lat1, double lon1, double lat2,
			double lon2) {
		double dlon = lon1 - lon2;
		double bearing = atan2( //
				sin(dlon) * cos(lat2), //
				cos(lat1) * sin(lat2) - sin(lat1) * cos(lat2) * cos(dlon));
		return toDegrees(bearing);
	}
}
