#!/bin/bash
#Fes un script que ens doni la hora escrita segons el següent format:
#"dotze hores i vint-i-tres minuts".

horaTotal=$(date |awk '{print $5}')
hora=$(echo $horaTotal |awk -F: '{print $1}')
minut=$(echo $horaTotal |awk -F: '{print $2}')

echo "$hora:$minut"

horaText=$(awk -F : '$1=="'$hora'" {print $2}' numeros.txt)
minutText=$(awk -F : '$1=="'$minut'" {print $2}' numeros.txt)

echo "Són les $horaText i $minutText"
