#!/bin/bash
#Veure quins processos hi han per cada ppid

llistaPPID=$(ps -ef --no-header | awk '{print $3}' | sort -gu)

for ppid in $llistaPPID 
do
	proces=$(ps -ef | awk '$3=="'$ppid'" {print $2}')
	echo "$ppid:"
	echo $proces
done
