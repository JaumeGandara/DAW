#!/bin/bash
#Joc d'encertar un número

numRandom=$RANDOM

#Control d'errors
esCorrecte=0

#Condició WHILE
while [ $esCorrecte -eq 0 ]; do

#Introducció del número escollit
	echo "Escriu un número random"
	read num

#Condició IF
	if [ $numRandom -eq $num ]; then
		echo "Correcte has encertat!!!"
		esCorrecte=1
	elif [ $num -gt $numRandom ]; then
		echo "$num és més gran que el número misterios"
		esCorrecte=0
	elif [ $num -lt $numRandom ]; then
		echo "$num és més petit que el número misterios"
		esCorrecte=0
	fi
done
