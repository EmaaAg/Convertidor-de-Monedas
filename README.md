# Conversor de Monedas - Java Console Application

## Descripción

Esta aplicación es un sistema de consulta de tasas de conversión de monedas basado en consola, desarrollado en Java. Permite al usuario conocer las tasas de cambio entre varias monedas predefinidas, tales como Dólar Estadounidense (USD), Peso Argentino (ARS), Real Brasileño (BRL) y Peso Colombiano (COP). El sistema interactúa con un servicio externo de consulta de monedas para obtener las tasas actualizadas.

## Características

- Conversión entre USD y ARS (Dólar ↔ Peso Argentino).
- Conversión entre USD y BRL (Dólar ↔ Real Brasileño).
- Conversión entre USD y COP (Dólar ↔ Peso Colombiano).
- Sistema de menú interactivo que permite seleccionar la conversión deseada.
- Manejo de errores para entradas no válidas.
- Diseño modular que facilita la adición de nuevas monedas.

## Requisitos

- **Java 8 o superior**
- Conexión a Internet para consultar las tasas de conversión.
- Biblioteca externa de consulta de monedas (`ConsultaMoneda`), que debe estar configurada en el proyecto.

## Estructura del Proyecto

El proyecto está dividido en tres paquetes principales:

1. **`app`**: Contiene la clase `App`, que define el punto de entrada de la aplicación y gestiona la lógica del menú principal.
2. **`Modelo`**: Incluye la definición del objeto `Moneda`, que se utiliza para representar las tasas de conversión.
3. **`api`**: Contiene la clase `ConsultaMoneda`, que interactúa con un servicio externo para buscar las tasas de cambio.

