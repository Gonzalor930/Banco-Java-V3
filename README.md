# Banco-Java-V3
Proyecto de consola en Java que simula las operaciones básicas de un banco. Permite crear cuentas (corriente, ahorro o común), consultar saldos, realizar depósitos y retiros con validación de PIN, listar cuentas por tipo y guardar datos en archivo. El código implementa principios de POO (herencia, clases abstractas, encapsulamiento)

Esta versión representa una evolución respecto al modelo anterior Banco-Java 2.0.

🧱 Mejoras respecto a la versión anterior
🔄 Arquitectura y organización
🧩 Separación en clases limpias y modulares, con una estructura clara y mantenible.

💡 Aplicación del principio de responsabilidad única (SRP).

🧠 Se comienza a incorporar el modelo MVC de forma progresiva.

💻 Interfaces y abstracciones
🔌 Se implementó una interfaz ICuenta, que define los métodos principales de cualquier cuenta bancaria.

📚 La clase CuentaAbstracta implementa esta interfaz y sirve como clase base común para:

CuentaBancaria (común)

CuentaAhorro

CuentaCorriente

🧪 Validaciones y robustez
✅ Confirmación de datos ingresados por consola, con opción a corregir antes de crear una cuenta.

🔐 Validación de PIN antes de realizar operaciones sensibles como retiro.

❗ Manejo de errores con try-catch, para evitar caídas por entradas incorrectas del usuario (por ejemplo, letras donde se espera un número).

🔁 Ciclos de reintento si se ingresan datos inválidos.

💸 Operaciones bancarias mejoradas
💰 CuentaCorriente ahora permite saldo negativo hasta un límite de -50000. Esto se logra sobrescribiendo (@Override) el método retirar.

📊 Se agregó soporte para listar cuentas por tipo (corriente, ahorro, común).

🔍 Se puede buscar una cuenta por ID y consultar detalles luego de validar el PIN.

🧾 Persistencia de datos
📁 Se guarda la información de las cuentas en un archivo .txt mediante escritura con FileWriter.

📂 Preparado para una futura lectura automática desde archivo en versiones posteriores.

🎛️ Menú interactivo
Menú de consola mejorado:

Carga de cuentas paso a paso con confirmación.

Opciones protegidas con validación de PIN.

Acceso a listado de todas las cuentas o por tipo.

Posibilidad de eliminar o consultar cuentas.

Modularización: el menú está encapsulado en una clase MenuBanco.
