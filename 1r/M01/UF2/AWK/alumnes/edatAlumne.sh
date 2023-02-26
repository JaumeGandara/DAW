#!/bin/bash

edat() {
	anyAlumne=$(echo $1 | awk -F/ '{print $3}')
	any=$(date +%Y)

	mesAlumne=$(echo $1 | awk -F/ '{print $2}')
	mes=$(date +%m)

	diaAlumne=$(echo $1 | awk -F/ '{print $1}')
	dia=$(date +%d)

	if [ $mes -gt $mesAlumne ] || [ $mes -eq $mesAlumne ] && [ $dia -ge $diaAlumne ]
	then
		edatCalculada=$((any - anyAlumne))
	else
		edatCalculada=$((any - anyAlumne - 1))
	fi

	return $edatCalculada
}

while read line
do
	alumne=$(echo $line | awk '{print $2, $3, $4}')
	dataFitxer=$(echo $line | awk '{print $6}')
	edat $dataFitxer
	echo "$alumne te $? anys"
done < alumnes.txt
