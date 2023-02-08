#!/bin/bash
#Fes un script que ens digui si un nombre és primer
# 	- Un nombre és primer si només es divisible per 1 i per si mateix.
# 	Per tal d'agilitzar el script,
#	- En cas que sigui divisible per algun d'aquests valors, ja no és un
#	nombre primer i pots sortir del bucle.

primer=1

for i in $(seq 2 $(($1-1)))
do
	if [ $(($1%$1)) -eq 0 ]; then
		primer=0
		break
	fi
done

if [ $primer -eq 1 ]; then
	echo "$1 és primer"
elif [ $primer -eq 0 ]; then
	echo "$1 no és primer"
fi
