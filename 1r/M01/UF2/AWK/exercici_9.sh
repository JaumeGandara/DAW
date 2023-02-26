#!/bin/bash
# Fes un script que ens busqui un fitxer dins d'un directori. En cas que
# existeixi ens digui el propietari del mateix. El script ens demanarà un nou
# directori, en cas que el que fiquem no existeixi.

directori=a

until [ -d $directori && -z $directori ]; do
	echo -n "Fica el directori on vols busca: "
	read directori	
done

echo -n "Fica el fitxer que vols buscar a $directori: "
read fitxer

if [ -f $directori/$fitxer ]; then
	propietari=$(ls -l $directori/$fitxer | awk '{print $3}')
	echo "El fitxer $fitxer està a dins del directori $directori i el seu propietari és $propietari"
