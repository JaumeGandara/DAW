#!/bin/bash
# 8. Fes un script que ens faci un llistat de tots els subdirectoris que hi ha 
# en un determinat directori entrat per línia de comandes. Si el directori no 
# existeix, surt del script amb un missatge d'error.
#
#	- Per saber si el paràmetre és un directori, podem fer servir la 
#	condició [ -d directori ] que serà certa si directori és un directori.

if [ $# -ne 1 ]; then
	echo "ERROR: No has cridat el script amb ./exercici_8.sh directori"
	exit
fi

if [ -d $1 ]; then
	echo "$1 és un directori"
	subdirectoris=$(ls -l $1 | grep ^d |awk '{print $9}')
	echo "Els subdirectoris de $1 són:"
	echo $subdirectoris
else
	echo "$1 no és un directori"
fi
