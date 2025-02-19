package org.iesgrancapitan.refactor;

//Clase inicial para realizar las refactorizaciones paso a paso
import java.util.ArrayList;
import java.util.List;

public class EmployeeManager2 {
 // Lista sin genéricos
 public List<Object[]> empoloyeeList = new ArrayList<Object[]>();
 Employee data = new Employee();


// Método que agrega un empleado con múltiples parámetros
 public void addEmployee(String name, int age, String department) {
     empoloyeeList.add(new Object[]{name, age, department});
 }

 // Método que imprime los detalles de los empleados
 /**
  * 
  */
 public void displayEmployees() {
     for (Object obj : empoloyeeList) {
         Object[] employee = (Object[]) obj;
         System.out.println("Name: " + employee[0] + ", Age: " + employee[1] + ", Department: " + employee[2]);
     }
 }

 public static void main(String[] args) {
     EmployeeManager2 example = new EmployeeManager2();
     example.addEmployee("Alice", 30, "HR");
     example.addEmployee("Bob", 40, "IT");
     example.displayEmployees();
 }
}

//El siguiente código se usa para realizar los pasos del tutorial:
//1. Renombrar la clase RefactorExample a EmployeeManager.
//2. Renombrar la lista employees a employeeList.
//3. Renombrar el método printEmployees a displayEmployees.
//4. Introducir genéricos en la lista de empleados.
//5. Crear una nueva clase Employee para encapsular los datos de los empleados.
//6. Cambiar el método addEmployee para aceptar objetos Employee en lugar de parámetros separados.
//7. Extraer un método para formatear los detalles del empleado.
//8. Encapsular el campo employeeList con getter y setter.
//9. Mover la clase Employee a un archivo separado.
//10. Implementar Comparable<Employee> en la clase Employee para ordenar por nombre.
//11. Usar la funcionalidad Organize Imports de Eclipse para optimizar las importaciones.
//12. Analizar el código con Clean Up Code para detectar problemas adicionales.
