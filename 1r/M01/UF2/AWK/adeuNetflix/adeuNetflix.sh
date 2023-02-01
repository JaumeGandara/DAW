#!/bin/bash


morosos=$(awk '$5=="no" {print $4}' usuaris.txt)


for dni in $morosos; do
	nom=$(cat usuaris.txt | grep $dni |awk '{print $1}')
	cognom1=$(cat usuaris.txt | grep $dni |awk '{print $2}')
	cognom2=$(cat usuaris.txt | grep $dni |awk '{print S3}')
	
	echo "A la atencio de $nom $cognom1 $cognom2." > $dni.txt
	echo "" >> $dni.txt
	echo "Sr. $nom, com a usuari de NETFLIX amb DNI $dni." >> $dni.txt
	echo "Procedim a donar-li de baixa de la plataforma" >> $dni.txt
	echo "fins que no aboni la quota corresponent." >> $dni.txt
	echo "" >> $dni.txt
	echo "Atentament l'EQUIP DE NETFLIX." >> $dni.txt
done
