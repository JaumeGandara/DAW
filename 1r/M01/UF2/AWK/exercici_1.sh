#!/bin/bash
#Fes un script que ens indiqui si la tecla que hem polsat és una lletra, un 
#número o un altre caràcter.

echo "Tecleja una tecla"
read option

case "$option" in
	[0-9])
		echo "$option és un número"
	;;
	[a-zA-Z])
		echo "$option és una lletra"
	;;
	*)
		echo "$option no és ni un número ni una lletra"
	;;
esac
