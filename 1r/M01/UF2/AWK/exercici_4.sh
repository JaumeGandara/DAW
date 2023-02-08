#!/bin/bash
#Fes un script que ens calculi el factorial d'un nombre
#	- Ex: 5! = 5 x 4 x 3 x 2 x 1

echo "Introdueix un número"
read numero

factorial=1

for i in $(seq 1 $numero)
do
	factorial=$((factorial*i))
done

echo "$numero! = $factorial"
