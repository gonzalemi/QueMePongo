
# Ejercicio Que Me Pongo Iteración 5

Aclaración, en esta entrega solo realicé el siguiente pseudocódigo (el codigo restante en el repo corresponde a entregas anteriores)

- Decidí modelar el guardarropas como una clase y el criterio como un enum:

     ![Guardarropas](Guardarropas.png) 

- La sugerencia la modelo como un Command, utilizo clase abstracta para poder controlar el estado y definir template methods:

     ![Sugerencia_Abstract](Sugerencia_Abstract.png) 
 
- Un primer Concrete Comand para modelar la operación de agregar una prenda:
     ![Agregar_Prenda](Agregar_Prenda.png) 
  
- Un Segundo Concrete Comand para modelar la operación de quitar una prenda:
     ![Quitar_Prenda](Quitar_Prenda.png) 
 
