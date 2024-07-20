# Ejercicio SOLID

## Integrantes: 
- Cristian Quesada Cossio
- Daniel Santiago Melo Suarez
- Elkin Eduardo Lesmes Vallejo
- Fredy Alberto Gomez Ramirez
- Yesid Giovanny Sanabria Orjuela

## Análisis principios solid
- **Single responsability**
    - La clase EmployeeManager tiene múltiples responsabilidades (administrar empleados, calcular salarios y generar reportes).
    
- **Open / Close**
    - La clase ReportGenerator tiene la definición específica para la generación de múltiples tipos de reportes, lo cual hace que esté abierta a modificaciones cuando exista un nuevo tipo de reporte. 
    
- **Liskov substitution**
    - La clase PartTimeEmployee sobreescribe la funcionalidad del método getName de Employee inyectando una excepción, ya que este no tiene una implementación de dicho método. 
    
- **Interface segregation**
    - La clase EmployeeOperations define métodos que no necesariamente aplican para las operaciones con empleador. EmployeeOperations y saveToFile son operaciones que pueden definirse en otro tipo de objeto.
    
- **Dependency inversion**
    - La clase ReportGenerator es una dependencia que no está abstraída. Si se definieran múltiples generadores de reportes para múltiples formatos, se tendría que generar la instancia del objeto explícito en lugar de depender de su abstracción. 
