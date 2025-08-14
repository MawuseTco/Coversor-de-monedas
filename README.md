# Conversor de Monedas

Aplicación de consola en Java que utiliza la API de ExchangeRate-API y la biblioteca Gson para convertir monedas.

## Requisitos
- Java 8 o superior
- Gson (se incluye instrucción para descargar el .jar)

## Uso
1. Compila el proyecto:
   ```sh
   javac -cp gson-2.13.1.jar src/ConversorMonedas.java
   ```
2. Ejecuta la aplicación:
   ```sh
   java -cp .:gson-2.13.1.jar src/ConversorMonedas
   ```
3. Sigue las instrucciones en pantalla para convertir monedas.

## Dependencias
Descarga el archivo `gson-2.13.1.jar` desde:
https://repo1.maven.org/maven2/com/google/code/gson/gson/2.13.1/gson-2.13.1.jar

Colócalo en la carpeta raíz del proyecto.

---

API utilizada: https://www.exchangerate-api.com/
