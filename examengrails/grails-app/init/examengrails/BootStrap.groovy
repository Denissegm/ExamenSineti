package examengrails

import examengrails.Ship

class BootStrap {

    def init = { servletContext ->
		
		new Ship(nombre:"La Nina",capacidad: 100).save()
		new Ship(nombre:"La Pinta ",capacidad: 101).save()
		new Ship(nombre:"La Snt Maria",capacidad: 102).save()
		new Ship(nombre:"Titanic",capacidad: 500).save()
      
	}
    def destroy = {
    }
}
