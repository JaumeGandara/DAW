#!/bin/bash
#Taules de multiplicar

for i in $(seq 1 10); do
	echo "taula del $i" > taula$i.txt
	for j in $(seq 1 10); do
		echo "$i x $j = $(($i*$j))" >> taula$i.txt
	done
	cat taula$i.txt
done
