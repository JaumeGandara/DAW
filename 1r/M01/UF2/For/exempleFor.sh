#!/bin/bash
#Exemple de bucle for

#Sense $() / `` escriu en literal
for i in 1 casa 65 gos 90 gat
do
	echo $i
done

echo "////////////////////////"

#Sense $() / `` escriu en literal
for i in ls
do
	echo $i
done

echo "////////////////////////"

#$() = ``// (preferible $())
#Amb $() / `` escriu en comanda
for i in $(ls)
do
	echo $i
done

echo "////////////////////////"

#bucle que suma la variable i de 1 al 10 i ho ensenya pantalla en cada cicle
for i in $(seq 1 10); do
	echo $i
done
