Algoritmo OrdenamientoIntercambio
	
    Definir n, i, temporal, limite Como Entero
    Definir intercambio Como Logico
    Definir tarjetas Como Entero
	
    Escribir "Cantidad de elementos:"
    Leer n
	
    Dimension tarjetas[n]
	
    Para i <- 0 Hasta n-1 Hacer
        Escribir "Ingresa el elemento ", i+1, ":"
        Leer tarjetas[i]
    FinPara
	
    limite <- n
    intercambio <- Verdadero
	
    Mientras intercambio Hacer
		
        intercambio <- Falso
		
        Para i <- 0 Hasta limite-2 Hacer
			
            Si tarjetas[i] > tarjetas[i+1] Entonces
				
                temporal <- tarjetas[i]
                tarjetas[i] <- tarjetas[i+1]
                tarjetas[i+1] <- temporal
				
                intercambio <- Verdadero
				
            FinSi
			
        FinPara
		
        limite <- limite - 1
		
    FinMientras
	
    Escribir "Orden:"
	
    Para i <- 0 Hasta n-1 Hacer
        Escribir Sin Saltar tarjetas[i], " "
    FinPara
	
FinAlgoritmo
