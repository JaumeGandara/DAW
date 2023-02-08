#!/bin/bash
#7. Fes un script que ens mostri per pantalla quin és el "UID" de cadascun dels# usuaris (només dels usuaris que no son del sistema) de la màquina ("login"
# "UID")

usuaris=$(awk -F: '$3>=1000 && $3<10000 {print $3}' /etc/passwd)

for usuari in $usuaris
do
	awk -F: '$3=="'$usuari'" {print $1, $3}' /etc/passwd
done
