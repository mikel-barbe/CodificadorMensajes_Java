# 🧩 Codificador de Mensajes en Java

Este proyecto implementa un sistema de codificación y decodificación de mensajes en Java.
Permite leer un texto desde un archivo, aplicar un algoritmo de codificación personalizado y guardar tanto el mensaje codificado como el decodificado en archivos separados.
Además, el usuario puede elegir y codificar cualquier archivo de texto que desee, no solo el que viene incluido en los recursos del proyecto.

## ⚙️ Funcionamiento
1. Entrada del mensaje:
El programa lee el contenido de resources/archivo.txt.

2. Codificación:
La clase Codificador procesa el mensaje aplicando un algoritmo de transformación (por ejemplo, sustitución o desplazamiento de caracteres).

3. Salida codificada:
El resultado se guarda en output/mensaje_codificado.txt.

4. Decodificación:
La clase Descodificador toma el mensaje codificado y lo transforma nuevamente a su versión original.

5. Salida final:
El mensaje restaurado se guarda en output/mensaje_descodificado.txt.

## 📜 Licencia

Este proyecto se distribuye bajo la licencia MIT.
Puedes usarlo, modificarlo y distribuirlo libremente citando la fuente.
