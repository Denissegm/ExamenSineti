package examengrails
import grails.rest.*

@Resource(uri='/ships')
class Ship {
	
	String nombre
	Integer capacidad
	
	static mapping = {
		datasource 'ALL'
	 }

}
