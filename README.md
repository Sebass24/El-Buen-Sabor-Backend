# El Buen Sabor ![](logo.png)  Comida Rápida

El Buen Sabor es un local de comida rápida ubicado en Mendoza cuya especialidad son las hamburguesas, aunque también vende pizas, papas y bebidas. El local vende a través de su página web y permite retiro en el local y delivery, su público objetivo son personas de entre 16 y 45 años de la provincia de Mendoza que estén dispuestos a desafiar sus paladares.

## Integrantes del grupo:
* [Franco Gonzalez](https://github.com/francoGonzalez2706)
* [Emilia Chiófalo](https://github.com/emichiofalo)
* [Sebastián Suliá](https://github.com/Sebass24)

## Boceto en Figma
* [Link a Bocetos en Figma](https://www.figma.com/file/BVRG4kdfS5maWcZeYLyuDa/Entrega-1?node-id=0%3A1&t=OCyDI9J0WTt8hb3l-1)

## Video Explicativo
* [Video](https://youtu.be/G8lAlDrBuuM)

## Presentación proyecto
* [Carpeta grupo FES](https://docs.google.com/document/d/1U7_fRz9dBm-KPtNSss79JvgTtu0m-JRcD5pxB9nMYXY/edit)



# Getting Started

### Swagger documentation --> http://localhost:8080/swagger-ui/index.html
### or http://{deploy url}/swagger-ui/index.html

Para levantar la api asegurarse de que el string de conección a la base de datos sea jdbc:mysql://containers-us-west-44.railway.app:5539/rest_generica, usuario root y contraseña 93qB579IRr2la1F1xWFS para usar la base de datos en la nube, o configurar una en local. Esto de debe configurar en src/main/application.properties

Además en la raíz del proyecto hay un archivo bbdd.sql con los datos iniciales en el caso de crear su propia base de datos. Para esto, solo crear la base de datos con nombre “rest_generica”, correr el backend (creará las tablas) y ejecutar las queries del archivo bbdd.sql.

## API Reference Documentation


###Endpoints

A continuación se enumeran todos los endpoints disponibles en la API.

#### GET /{resource}
Devuelve una lista de todos los elementos del recurso especificado.

###### Parámetros

- none

###### Respuesta

- 200 OK en caso de éxito.
- Lista de elementos en formato JSON.

#### GET /{resource}/{id}
Devuelve el elemento con el ID especificado del recurso especificado.

###### Parámetros
- id (obligatorio): ID del elemento a recuperar.

###### Respuesta

- 200 OK en caso de éxito.
- El elemento solicitado en formato JSON.


#### POST /{resource}
Crea un nuevo elemento en el recurso especificado.

###### Parámetros

- none
- en el body de la peticion debemos mandarle el objeto en formato JSON

###### Respuesta
- 201 Created en caso de éxito.
- El elemento recién creado en formato JSON.


#### PUT /{resource}
Actualiza el elemento con el ID especificado en el recurso especificado.

###### Parámetros
- none
- en el body de la peticion debemos mandarle el objeto a modificar en formato JSON


###### Respuesta

- 200 OK en caso de éxito.
- El elemento actualizado en formato JSON.

#### DELETE /{resource}/{id}
Elimina el elemento con el ID especificado del recurso especificado. Aclaramos que el elemento es eliminado de forma lógica.

###### Parámetros

- id (obligatorio): ID del elemento a eliminar.

##### Respuesta

- Mensaje de eliminación corecta.

