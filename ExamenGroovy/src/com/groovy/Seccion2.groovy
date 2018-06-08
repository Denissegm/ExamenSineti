package com.groovy
import groovy.json.JsonOutput


class Seccion2 {	


   static void main(String[] args) {
	   Map personAgeMap = [Nombre: 'Denisse' , Edad:25]
	  //Map personAgeMap = [Oscar:2, Denisse:33, Zaira:31 ]
	  
      def output = JsonOutput.toJson(personAgeMap)

	  new File('c:/workspaceStudy/ExamenGroovy/person.json').write output
      println(output);  
   }


}
