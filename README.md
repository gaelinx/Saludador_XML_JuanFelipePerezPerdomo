# Saludador XML

Aplicación Android sencilla que captura el nombre del usuario y muestra un saludo personalizado. Proyecto educativo desarrollado con **XML layouts** y **Kotlin** para practicar los fundamentos del desarrollo Android clásico.

---

##  Descripción

**Saludador XML** es una aplicación de formulario básico que demuestra:
- Captura de texto con `EditText`
- Manejo de eventos con `Button`
- Actualización dinámica de la interfaz con `TextView`
- Validación de entrada en tiempo real
- Gestión del ciclo de vida de una Activity

### Características

-  Campo de texto para introducir el nombre (máximo 20 caracteres)
-  Contador de caracteres en tiempo real
-  Botón que se habilita/deshabilita según el contenido del campo
-  Cierre automático del teclado tras pulsar el botón
-  Reseteo automático de la interfaz al cambiar de app
-  Validación: muestra advertencia si el campo está vacío

---

## Cómo probarlo

### Requisitos previos

- **Android Studio** (versión Arctic Fox o superior)
- **JDK 11** o superior
- **Dispositivo Android** (físico o emulador) con API 21+ (Android 5.0 Lollipop)

### Pasos de instalación

1. **Clonar el repositorio**
   ```bash
   git clone https://github.com/tu-usuario/Saludador_XML.git
   cd Saludador_XML
   ```

2. **Abrir en Android Studio**
   - Abre Android Studio
   - Selecciona `File → Open`
   - Navega hasta la carpeta del proyecto y ábrela

3. **Sincronizar Gradle**
   - Espera a que Android Studio sincronice las dependencias automáticamente
   - Si no lo hace, haz clic en `File → Sync Project with Gradle Files`

4. **Ejecutar la aplicación**
   - Conecta un dispositivo Android o inicia un emulador
   - Haz clic en el botón **Run** (▶️) o presiona `Shift + F10`
   - Selecciona el dispositivo de destino

### Uso de la aplicación

1. **Escribe tu nombre** en el campo de texto
2. **Observa el contador** que muestra los caracteres utilizados (ej: "5 / 20")
3. **Pulsa el botón "Saludar"** (se habilita automáticamente cuando hay texto)
4. **Verás el saludo** personalizado: "👋 Hola, [tu nombre]"
5. **Cierra la app** y vuelve a abrirla: la interfaz se habrá reseteado

---

## 🏗️ Estructura del Proyecto

```
Saludador_XML/
├── app/
│   ├── src/
│   │   └── main/
│   │       ├── java/com/example/saludador_xml/
│   │       │   └── MainActivity.kt          # Lógica principal
│   │       └── res/
│   │           └── layout/
│   │               └── activity_main.xml    # Diseño de la interfaz
│   └── build.gradle
├── gradle/
├── .gitignore
├── build.gradle
├── settings.gradle
└── README.md
```

---

## 🛠️ Tecnologías utilizadas

- **Lenguaje**: Kotlin
- **UI**: XML Layouts (LinearLayout, EditText, Button, TextView)
- **Arquitectura**: Activity tradicional
- **APIs Android**:
  - `TextWatcher` - Detección de cambios en texto
  - `InputMethodManager` - Gestión del teclado virtual
  - Ciclo de vida de Activity (`onCreate`, `onStop`)

---

## 📚 Conceptos demostrados

Este proyecto cubre los siguientes conceptos fundamentales de Android:

1. **Diseño de interfaces con XML**
   - LinearLayout para organización vertical
   - Atributos de diseño (padding, margin, gravity)

2. **Vinculación de vistas con Kotlin**
   - Uso de `findViewById<T>()`
   - Referencias a elementos de la UI

3. **Manejo de eventos**
   - `setOnClickListener` para botones
   - `TextWatcher` para cambios de texto

4. **Validación de entrada**
   - Comprobación de campos vacíos
   - Habilitación/deshabilitación dinámica de controles

5. **Ciclo de vida de Activity**
   - Método `onStop()` para limpiar la UI
   - Gestión del estado de la aplicación

---

## 🎯 Retos implementados

Esta aplicación incluye **4 retos opcionales**:

- ✅ **Reto 1**: Deshabilitar botón cuando el campo está vacío
- ✅ **Reto 2**: Ocultar teclado automáticamente tras pulsar
- ✅ **Reto 3**: Mostrar contador de caracteres en tiempo real
- ✅ **Reto 4**: Resetear interfaz al cambiar de aplicación

---

## 📸 Captura de pantalla del proyecto ejecutandose

<img width="467" height="956" alt="image" src="https://github.com/user-attachments/assets/73345a9f-ef07-4ab4-8f50-185bbd9a4ca0" />

---

