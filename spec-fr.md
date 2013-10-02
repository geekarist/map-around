SPEC
====

# Jeux de données 

- **Centre** : 9 rue de la Croix Faubin : (lat, lon) = (φ, λ) = (48,85845, 2,38548)
- 2 place de la Défense : 48,89388 2,24014 (38 mn)
- 156 bd. Haussmann : 48,87522 2,31108 (31 mn)
- 2 rue Arthur Honegger : 48,72899 2,57943 (85 mn)
- 99 bis rue de Reuilly : 48,84380 2,39103 (18 mn)

# Pour tracer une adresse

- Récupérer ses coordonnées géographiques
- Calculer l'azimut depuis le centre
	- [Algo](http://www.movable-type.co.uk/scripts/latlong.html)
	- Formule : θ = atan2(sin(Δλ).cos(φ2), cos(φ1).sin(φ2) − sin(φ1).cos(φ2).cos(Δλ))
	- Où λ = longitude, φ = latitude
	- 2 place de la Défense
		- lat2 = 48,89388, lon2 = 2,24014, dlon = 0,14534
		- lat1 = 48,85845, lon1 = 2,38548
		- `atan2(sin(dlon)*cos(lat2), cos(lat1)*sin(lat2) - sin(lat1)*cos(lat2)*cos(dlon))`
		- `atan2(sin(0,14534)*cos(48,89388), cos(48,85845)*sin(48,89388) - sin(48,85845)*cos(48,89388)*cos(0,14534))`
- Calculer le temps de trajet depuis le centre cf. [ratp.info](http://ratp.info)
- Tracer un cercle dont le rayon est proportionnel au temps de trajet
- Utiliser l'azimut pour tracer un point sur le cercle
