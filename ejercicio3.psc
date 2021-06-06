Algoritmo Factorial
	Escribir 'Ingrese un numero N a hallar el factorial: '
	Leer numfact
	Si numfact<0 Entonces
		Escribir 'Al numero no se le puede obtener factorial'
	SiNo
		Si numfact==0 Entonces
			Escribir 'El factorial del numero Es: 0'
		SiNo
			aux <- 1
			fact <- 1
			Mientras aux<=numfact Hacer
				fact <- fact*aux
				aux <- (aux+1)
			FinMientras
			Escribir 'El factorial del numero ',numfact,' Es ',fact
		FinSi
	FinSi
FinAlgoritmo
