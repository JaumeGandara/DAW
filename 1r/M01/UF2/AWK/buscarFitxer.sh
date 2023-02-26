#!/bin/bash
#

echo -n "Quina comanda vol buscar?: "
read comanda

llistaPATH=$(echo $PATH |awk -F: '{for (i=1; i<=NF; i++) print $i}')

for path in $llistaPATH
do
	if [ -f $path/$comanda ]
	then
		echo "La comanda $comanda està al directori $path"
	fi
done
