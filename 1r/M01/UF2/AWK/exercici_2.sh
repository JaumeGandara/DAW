#!/bin/bash
#Fes un script que quan l'executem ens digui quin dia de la setmana és 
#(dilluns,dimarts,dimecres,dijous,divendres,dissabte,diumenge)

date=$(date |awk '{print $1}')

case $date in
	lun)
		dateCat=Dilluns;;
	mar)
		dateCat=Dimarts;;
	mie)
		dateCat=Dimecres;;
	jue)
		dateCat=Dijous;;
	vie)
		dateCat=Divendres;;
	sab)
		dateCat=Dissabte;;
	dom)
		dateCat=Diumenge;;
esac

echo "Avui és $dateCat"
