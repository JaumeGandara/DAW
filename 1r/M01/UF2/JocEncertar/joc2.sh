#!/bin/bash
#

#He pensat un número
numRandom=$((RANDOM%6))

#
for i in 4 3 2 1 0 
do
#Introducció del número escollit
	echo "Escriu un número"
	read numUsuari
#Condició IF
#Resultat si encerta
	if [ $numUsuari -eq $numRandom ]; then
		echo "Correcte has encertat!!!"
		exit

#Resultat si falla i és més petit que el número random 
	elif [ $numUsuari -gt $numRandom ]; then
		echo "$numUsuari és més gran que el número misterios"
		echo "Tens $i oportunitats"

#Resultat si falla i és més gran que el número random
	elif [ $numUsuari -lt $numRandom ]; then
		echo "$numUsuari és més petit que el número misterios"
		echo "tens $i oportunitats"
	fi
done
