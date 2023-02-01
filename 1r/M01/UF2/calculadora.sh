#!/bin/bash
#Fitxer de calculadora de 2 números
echo "Introdueixi el valor 1"
read var1
echo "Introdueixi el valor 2"
read var2
#Suma
suma=$(echo -e "scale=2;$var1+$var2" |bc -l)
echo "$var1 + $var2 = $suma"
#Resta
resta=$(echo -e "scale=2;$var1-$var2" |bc -l)
echo "$var1 - $var2 = $resta"
#Multiplicació
multi=$(echo -e "scale=2;$var1*$var2" |bc -l)
echo "$var1 x $var2 = $multi"
#Divisió
divi=$(echo -e "scale=2;$var1/$var2" |bc -l)
echo "$var1 / $var2 = $divi"
