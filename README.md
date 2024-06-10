# Segunda Entrega integracion plataformas

## Tabla de Contenidos
1. [Equipo](#equipo)
2. [Descripción](#descripción)
3. [Instalación](#instalación)
4. [Uso](#uso)
5. [Contribuir](#contribuir)
6. [Licencia](#licencia)

## Equipo
Conoce a nuestro increíble equipo de desarro de ferremas:
<table>
  <tr>
    <th></th>
    <th></th>
    <th></th>
    <th></th>
  </tr>
  <tr>
    <td>Matias Fontalba</td>
    <td><img src="https://avatars.githubusercontent.com/u/107446621?v=4"  alt="foto-mati" width="50" height="50" style="border-radius: 50%;"></td>
    <td>Desarrollador back</td>
     <td><a href="https://github.com/MatiasFontalba">GitHub</a></td>
</tr>
  <tr>
    <td>Francisco Arias</td>
    <td><img src="https://avatars.githubusercontent.com/u/107446720?v=4" alt="foto-pancho" width="50" height="50" style="border-radius: 50%;"></td>
    <td>Desarrollador front</td>
     <td><a href="https://github.com/FranciscoAriasZa">GitHub</a></td>
  </tr>
  <tr>
    <td>Willians Briones</td>
    <td><img src="https://avatars.githubusercontent.com/u/107446673?v=4" alt="foto-willy" width="50" height="50" style="border-radius: 50%;"></td>
    <td>Desarrollador back</td>
     <td><a href="https://github.com/williansbriones">GitHub</a></td>
  </tr>
</table>

## Descripción

Estamos desarrollando una solución tecnológica para la compañía **Ferremax**, que necesita un e-commerce para realizar ventas de sus productos. Nuestro objetivo es crear una plataforma robusta, eficiente y fácil de usar para mejorar la experiencia de compra de los clientes de Ferremax y optimizar sus procesos de venta.

Actualmente, estamos trabajando con tres repositorios diferentes donde se encuentra todo el código fuente del proyecto:

1. **Backend**: Contiene la lógica de negocio, la API y la integración con bases de datos y otros servicios.
2. **Frontend**: Incluye la interfaz de usuario y la experiencia de cliente.
3. **Infraestructura**: Se encarga de la configuración de servidores, despliegue y mantenimiento de la infraestructura del e-commerce.

Este repositorio servirá como un punto central para entregar avances, proporcionar documentación y coordinar el desarrollo entre los tres repositorios mencionados. Aquí podrás encontrar información actualizada sobre el progreso del proyecto, instrucciones de instalación y uso, así como guías para contribuir.

## Instalación

Para instalar el proyecto, sigue estos pasos:

1. Clona este repositorio en tu máquina local.
   - `git clone https://github.com/williansbriones/Segunda-Entrega_integracion-plataformas.git`
2. Accede al raiz del repositorio.

3. Comprueba que tengas instaldo docker y docker-compose en tu maquina.
   - `docker --version`
   - `docker-compose --version` 
4. Abre una terminal en la raiz del repositorio y ejecuta los siguientes comandos:
   - `cd integracion-plataformas`
   - `docker-compose up -d`

## Uso 
Para el uso de este proyecto, tienes que tener en cuenta las siguintes cosas:

- Existen actualmente 2 APIS las cuales se levantan en:
  - `http://localhost:8080` para el backend-spring-boot
  - `http://localhost:8081` para el frontend-dot-net
- En en la carpeta raiz de este proyecto puedes encontrar un directorio llamado `postman-request` el cual contiene las rutas de los endpoints de las APIS mas request con datos de prueba. 
- Para poder utilizar el API de dot-net lo primero que tienes que hacer es abrir el documento `ingresoUsurios.html` el cual se ubica en el proyecyo fornt-integracion
- finalmente para utilizar el proyecto en su totalidad, tienes  que abrir el documento `index.html` el cual se ubica en el proyecto front-integracion

## Contribuir
actuamente existen 3 repositorios con los proyectos de este e-commerce, los cuales son:
- [Backend-Spring-boot](https://github.com/williansbriones/Integraci-n-de-plataformas)
- [Backend-Dot-net](https://github.com/MatiasFontalba/FerreteriaApi)
- [Frontend](https://github.com/williansbriones/front-integracion)
  
Si deseas contribuir, por favor sigue los siguientes pasos:

1. Haz un fork del proyecto
2. Crea una nueva rama (git checkout -b feature/nueva-característica)
3. Realiza tus cambios y haz un commit (git commit -am 'Añadir nueva característica')
4. Haz un push a la rama (git push origin feature/nueva-característica)
5. Abre un Pull Request y describe los cambios propuestos
6. Espera a que tu Pull Request sea revisado y aceptado

¡Gracias por contribuir! Si tienes alguna duda, puedes contactar a los integrantes del equipo.

## Licencia
```text
MIT License

Copyright (c) [2024] [compañeros-integracion]

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
