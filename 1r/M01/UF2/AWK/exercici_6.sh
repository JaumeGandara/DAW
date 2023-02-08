#!/bin/bash
#Fes un script que ens mostri els 1000 primers nombres primers.
#Per fer aquest script aprofita l'anterior, i dissenya una funcio que ens digui#si un nombre és o no primer.
#El professor ha d'explicar com fer una funció en BASH SCRIPT

esPrimer(){
primer=1

for i in $(seq 2 $(($1-1)))
do
	if [ $(($1%$i)) -eq 0 ]; then
		primer=0
		break
	fi
done

return $primer
}

numero=1
recompte=0

while [ $recompte -le 1000 ]
do
	numero=$(($numero+1))
	esPrimer $numero
	if [ $? -eq 1 ]; then
		recompte=$(($recompte+1))
		echo -n "$numero, "
	fi

done
