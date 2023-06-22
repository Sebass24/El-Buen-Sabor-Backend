INSERT INTO `payment_method`(`description`) VALUES ('Efectivo'),('Mercado Pago');
INSERT INTO `delivery_method`(`description`) VALUES ('Envío a domicilio'),('Retiro en el local');
INSERT INTO `location`(`name`) VALUES ('Guaymallén'),('Las Heras'),('Godoy Cruz'),('Capital'),('Lavalle'),('Junin'),('La Paz'),('Maipú'),('Rivadavia'),('Santa Rosa'),('San Martín'),('Luján de Cuyo'),('San Carlos'),('Tunuyán'),('Tupungato'),('General Alvear'),('Malargüe'),('San Rafael');
INSERT INTO role(deleted, description,auth0_role_id) VALUES(0,'Administrador','rol_sjevS3KJhy8alRLU'),(0,'Cliente','rol_9v33EypxD9HIWrXj'),(0,'Cocinero','rol_LFBdEtdll9OFK8Y7'),(0,'Cajero','rol_mPCCuJyo7PU61U2q'),(0,'Delivery','rol_BlqAj8soB3uNjttW');
INSERT INTO order_status(deleted, description)  VALUES (0,'A confirmar'),(0,'En cocina'),(0,'En delivery'),(0,'Listo'),(0,'Entregado'),(0,'Cancelado');
INSERT INTO product_category(deleted, description) VALUES (0,'Pizza'),(0,'Hamburguesas'),(0,'Bebidas'),(0,'Combos'),(0,'Papas fritas');
INSERT INTO ingredient_category (NAME) VALUES ("Carnes y fiambres"), ("Vegetales"), ("Lácteos"), ("Panadería"), ("Huevos"), ("Salsas y adheresos"), ("Especias"), ("Líquidos"), ("Bebidas");
INSERT INTO ingredient_category (NAME, parent_category_id) VALUES ("Carnes", 1), ("Fiambres", 1), ("Quesos", 3), ("Harinas", 4), ("Salsas", 6), ("Adheresos", 6), ("Bebidas con alcohol", 9), ("Bebidas sin alcohol", 9);
INSERT INTO ingredient_category (NAME, parent_category_id) VALUES ("Gaseosas", 17);
INSERT INTO ingredient (NAME, category_id, measurement_unit, minimum_stock, current_stock, cost_price) VALUES
('Carne molida', 10, 'g', 3000, 5000, 2000/1000),
('Panceta',11 , 'g', 2500, 3000, 5000/1000),
('Pepperoni', 11, 'g', 2500, 3000, 5000/1000),
('Tomate', 2, 'g', 2000, 3000, 400/1000),
('Lechuga', 2, 'g', 2000, 3000, 400/1000),
('Cebolla', 2, 'g', 2000, 3000, 300/1000),
('Champiñones', 2, 'g', 2000, 3000, 700/1000),
('Jalapeño', 2, 'g', 2000, 3000, 700/1000),
('Cebolla roja', 2, 'g', 2000, 3000, 400/1000),
('Pimiento', 2, 'g', 2000, 3000, 600/1000),
('Papas', 2, 'g', 7000, 9000, 400/1000),
('Ajo', 2, 'g', 2000, 3000, 2000/1000),
('Aceitunas verdes', 2, 'g', 2000, 3000, 3500/1000),
('Leche', 3, 'ml', 10000, 11000, 450/1000),
('Manteca', 3, 'g', 5000, 6000, 1500/1000),
('Queso cheddar', 12, 'g', 6000, 8000, 4000/1000),
('Queso mozzarella', 12, 'g', 10000, 11000, 4000/1000),
('Queso parmesano', 12, 'g', 5000, 7000, 5000/1000),
('Harina', 13, 'g', 25000, 50000, 500/1000),
('Levadura', 4, 'g', 3000, 4000, 1400/1000),
('Ketchup', 15, 'g', 3000, 4000, 1200/1000),
('Mayonesa', 15, 'g', 3000, 4000, 1200/1000),
('Salsa picante', 14, 'g', 2000, 3000, 3000/1000),
('Salsa de tomate', 14, 'g', 8000, 9000, 800/1000),
('Sal', 7, 'g', 3000, 4000, 800/1000),
('Azúcar', 7, 'g', 2000, 3000, 500/1000),
('Pimienta', 7, 'g', 2000, 3000, 1500/1000),
('Ajo en polvo', 7, 'g', 2000, 3000, 900/1000),
('Orégano', 7, 'g', 3000, 4000, 1000/1000),
('Agua', 8, 'ml', 10000, 11000, 600/1000),
('Aceite de oliva', 8, 'ml', 6000, 8000, 3500/1000),
('Aceite vegetal', 8, 'ml', 20000, 25000, 1200/1000),
('Coca-cola 500ml', 17, 'u', 40, 50, 150),
('Coca-cola cero 500ml', 17, 'u', 40, 50, 150),
('Sprite 500ml', 17, 'u', 40, 50, 150),
('Fanta 500ml', 17, 'u', 40, 50, 150),
('Schweppes 500ml', 17, 'u', 40, 50, 150),
('Huevos', 5, 'u', 40, 50, 65);
INSERT INTO recipe (description) VALUES ("Precalentar una sartén a fuego medio-alto.
Salpimentar la carne y hacer una hamburguesa con ella.
Cocinar la hamburguesa durante 3-4 minutos por cada lado.
Añadir la panceta a la sartén y cocinar durante 2-3 minutos por cada lado.
Tostar ligeramente el pan para hamburguesa.
Montar la hamburguesa: colocar la hamburguesa sobre la base del pan, agregar el queso cheddar, la panceta, el tomate, la lechuga y la cebolla.
Agregar la ketchup y la mayonesa en la parte superior del pan y cubrir con la otra mitad del pan.
"),
("Precalentar una sartén a fuego medio-alto.
Salpimentar la carne y hacer una hamburguesa con ella.
Cocinar la hamburguesa durante 3-4 minutos por cada lado.
Añadir la panceta a la sartén y cocinar durante 2-3 minutos por cada lado.
Tostar ligeramente el pan para hamburguesa.
Cortar los champiñones en rodajas y saltear en la sartén hasta que estén dorados.
Montar la hamburguesa: colocar la hamburguesa sobre la base del pan, agregar el queso mozzarella, la panceta, el tomate, la lechuga, la cebolla y los champiñones.
Agregar la ketchup y la mayonesa en la parte superior del pan y cubrir con la otra mitad del pan."),
("En un tazón, mezcla la carne molida con el ajo en polvo, sal y pimienta. Forma una hamburguesa con la mezcla.
Cocina la hamburguesa a la parrilla o en una sartén con un poco de aceite hasta que esté dorada por ambos lados y bien cocida en el centro.
Agrega la rebanada de queso encima de la hamburguesa para que se derrita.
En un tazón pequeño, mezcla la salsa picante y la mayonesa para hacer una salsa picante.
Tuesta ligeramente el pan de hamburguesa.
Coloca la hamburguesa en el pan tostado, agrega el jalapeño fresco, cebolla, tomate y hoja de lechuga.
Agrega la salsa picante y mayonesa al gusto."),
("Lavar los champiñones y cortarlos en rebanadas finas.
En una sartén, calentar el aceite de oliva y agregar los champiñones y la cebolla picada. Cocinar por unos minutos hasta que estén dorados y suaves.
Mientras tanto, sazonar la carne molida con sal y pimienta y formar una hamburguesa.
Cocinar la hamburguesa en una sartén o en una parrilla durante 4-5 minutos de cada lado.
Cuando la hamburguesa esté casi lista, colocar la rebanada de queso cheddar encima para que se derrita.
Armar la hamburguesa colocando la hamburguesa con queso sobre la base del pan, y luego los champiñones salteados. Colocar la tapa del pan encima."),
("Cocinar la panceta en una sartén hasta que esté dorado y crujiente. Reservar.
Formar una hamburguesa con la carne molida y sazonar con sal y pimienta.
En la misma sartén donde se cocinó el panceta, añadir la mantequilla y cocinar la hamburguesa durante 4-5 minutos de cada lado.
Mientras tanto, freír un huevo en otra sartén con un poco de aceite. Reservar.
Armar la hamburguesa colocando la hoja de lechuga y la rodaja de tomate sobre la base del pan. Colocar la hamburguesa cocida encima, seguida por el panceta y el huevo frito. Colocar la tapa del pan encima y servir."),
("Precalentar el horno a 220°C.
Estirar la masa de pizza y colocarla en una bandeja para hornear.
Distribuir la salsa de tomate sobre la masa, dejando un borde de 1 cm sin cubrir.
Agregar el queso mozzarella rallado sobre la salsa de tomate.
Distribuir las rodajas de pepperoni y champiñones sobre el queso.
Espolvorear orégano seco sobre la pizza.
Hornear la pizza durante 12-15 minutos, o hasta que el queso esté dorado y la masa esté crujiente."),
("Estirar la masa de pizza y colocarla en una bandeja para hornear.
Distribuir la salsa de tomate sobre la masa, dejando un borde de 1 cm sin cubrir.
Agregar el queso mozzarella rallado sobre la salsa de tomate.
Distribuir la carne molida y las tiras de pimiento sobre el queso.
Hornear la pizza durante 12-15 minutos, o hasta que el queso esté dorado y la masa esté crujiente."),
("Precalentar el horno a 220°C.
Estirar la masa de pizza y colocarla en una bandeja para hornear.
Distribuir la salsa de tomate sobre la masa, dejando un borde de 1 cm sin cubrir.
Agregar el queso cheddar rallado sobre la salsa de tomate.
Distribuir los aros de cebolla y las tiras de panceta sobre el queso.
Hornear la pizza durante 12-15 minutos, o hasta que el queso esté dorado y la masa esté crujiente."),
("Precalentar el horno a 220°C.
En una sartén grande, calentar el aceite de oliva a fuego medio-alto. Agregar los champiñones y saltear durante unos 5 minutos, hasta que estén dorados. Retirar de la sartén y reservar.
Agregar las cebollas a la misma sartén y cocinar a fuego medio-bajo durante unos 15 minutos, hasta que estén caramelizadas. Agregar la cucharadita de azúcar a la sartén y mezclar bien.
Estirar la bola de masa de pizza sobre una bandeja para hornear. Extender la salsa de tomate sobre la masa.
Distribuir los champiñones salteados sobre la salsa de tomate. Luego, esparcir las cebollas caramelizadas sobre los champiñones.
Espolvorear los quesos rallados sobre la parte superior de la pizza.
Hornear durante unos 12-15 minutos, o hasta que la corteza esté dorada y crujiente."),
("Precalentar el horno a 220°C.
En una bandeja para hornear, estirar la bola de masa de pizza.
Extender la salsa de tomate sobre la masa.
Espolvorear el queso mozzarella rallado sobre la salsa de tomate.
Distribuir las rodajas de pepperoni y las aceitunas sobre el queso.
Espolvorear el queso parmesano rallado, el ajo en polvo, el orégano, la sal y la pimienta sobre la pizza.
Hornear durante unos 12-15 minutos, o hasta que la corteza esté dorada y crujiente."),
("Pelar y cortar las papas en tiras delgadas.
En una sartén profunda o una freidora, calentar el aceite a 180°C.
Freír las papas por unos 5-7 minutos o hasta que estén doradas.
Retirar las papas del aceite y colocarlas en un plato con papel absorbente para eliminar el exceso de aceite."),
("Pelar y cortar las papas en tiras delgadas.
En una sartén profunda o una freidora, calentar el aceite a 180°C.
Freír las papas por unos 5-7 minutos o hasta que estén doradas.
Retirar las papas del aceite y colocarlas en un plato con papel absorbente para eliminar el exceso de aceite."),
("Pelar y cortar las papas en tiras delgadas.
En una sartén profunda o una freidora, calentar el aceite a 180°C.
Freír las papas por unos 5-7 minutos o hasta que estén doradas.
Retirar las papas del aceite y colocarlas en un plato con papel absorbente para eliminar el exceso de aceite."),
("Pelar y cortar las papas en tiras delgadas.
En una sartén profunda o una freidora, calentar el aceite a 180°C.
Freír las papas por unos 5-7 minutos o hasta que estén doradas.
Retirar las papas del aceite y colocarlas en un plato con papel absorbente para eliminar el exceso de aceite.
Espolvorear las papas con el queso rallado y la panceta desmenuzada."),
("Pelar y cortar las papas en tiras delgadas.
En una sartén profunda o una freidora, calentar el aceite a 180°C.
Freír las papas por unos 5-7 minutos o hasta que estén doradas.
Retirar las papas del aceite y colocarlas en un plato con papel absorbente para eliminar el exceso de aceite.
Mezclar el ajo picado con el queso parmesano rallado.
Espolvorear las papas con la mezcla de ajo y queso."),
("Hamburguesa:
Precalentar una sartén a fuego medio-alto.
Salpimentar la carne y hacer una hamburguesa con ella.
Cocinar la hamburguesa durante 3-4 minutos por cada lado.
Añadir la panceta a la sartén y cocinar durante 2-3 minutos por cada lado.
Tostar ligeramente el pan para hamburguesa.
Montar la hamburguesa: colocar la hamburguesa sobre la base del pan, agregar el queso cheddar, la panceta, el tomate, la lechuga y la cebolla.
Agregar la ketchup y la mayonesa en la parte superior del pan y cubrir con la otra mitad del pan.

Papas:
Pelar y cortar las papas en tiras delgadas.
En una sartén profunda o una freidora, calentar el aceite a 180°C.
Freír las papas por unos 5-7 minutos o hasta que estén doradas.
Retirar las papas del aceite y colocarlas en un plato con papel absorbente para eliminar el exceso de aceite."),
("Hamburguesa:
Precalentar una sartén a fuego medio-alto.
Salpimentar la carne y hacer dos hamburguesas con ella.
Cocinar la hamburguesa durante 3-4 minutos por cada lado.
Añadir la panceta a la sartén y cocinar durante 2-3 minutos por cada lado.
Tostar ligeramente el pan para hamburguesa.
Montar las hamburguesas: colocar la hamburguesa sobre la base del pan, agregar el queso cheddar, la panceta, el tomate, la lechuga y la cebolla.
Agregar la ketchup y la mayonesa en la parte superior del pan y cubrir con la otra mitad del pan.

Papas:
Pelar y cortar las papas en tiras delgadas.
En una sartén profunda o una freidora, calentar el aceite a 180°C.
Freír las papas por unos 5-7 minutos o hasta que estén doradas.
Retirar las papas del aceite y colocarlas en un plato con papel absorbente para eliminar el exceso de aceite."),
("Pizza:
Precalentar el horno a 220°C.
Estirar la masa de pizza y colocarla en una bandeja para hornear.
Distribuir la salsa de tomate sobre la masa, dejando un borde de 1 cm sin cubrir.
Agregar el queso cheddar rallado sobre la salsa de tomate.
Distribuir los aros de cebolla y las tiras de panceta sobre el queso.
Hornear la pizza durante 12-15 minutos, o hasta que el queso esté dorado y la masa esté crujiente.

Papas:
Pelar y cortar las papas en tiras delgadas.
En una sartén profunda o una freidora, calentar el aceite a 180°C.
Freír las papas por unos 5-7 minutos o hasta que estén doradas.
Retirar las papas del aceite y colocarlas en un plato con papel absorbente para eliminar el exceso de aceite.");
INSERT INTO image (NAME, path) VALUES ("burger-bacon-egg", "burger-bacon-egg.jpg"),
("burger-classic", "burger-classic.jpg"),
("burger-mushroom-bacon", "burger-mushroom-bacon.jpg"),
("burger-mushrooms-cheese", "burger-mushrooms-cheese.jpg"),
("burger-spicy", "burger-spicy.jpg"),
("burger-with-fries", "burger-with-fries.jpg"),
("combo-pizza-fries", "combo-pizza-fries.jpg"),
("fries", "fries.jpg"),
("fries-bacon-cheese", "fries-bacon-cheese.jpg"),
("fries-parmesan-garlic", "fries-parmesan-garlic.jpg"),
("pizza-bacon-onion", "pizza-bacon-onion.jpg"),
("pizza-meat-peppers", "pizza-meat-peppers.jpg"),
("pizza-mushrooms-onion", "pizza-mushrooms-onion.jpg"),
("pizza-pepperoni-mushroom", "pizza-pepperoni-mushroom.jpg"),
("pizza-pepperoni-olives", "pizza-pepperoni-olives.jpg");
INSERT INTO image (NAME, path) VALUES
("coca-cola-500", "coca-cola-500.jpg"),
("coca-cola-zero-500", "coca-cola-zero-500.jpg"),
("fanta-500", "fanta-500.png"),
("sprite-500", "sprite-500.png"),
("schweppes-500", "schweppes-500.jpeg");
INSERT INTO product (NAME, description, short_description, cooking_time, product_category_id, recipe_id, image_id) VALUES
("Hamburguesa clásica", "Disfrute de una deliciosa hamburguesa clásica con ingredientes frescos y de calidad, incluyendo carne molida, panceta crujiente, queso cheddar fundido, tomate jugoso, lechuga crujiente y cebolla fresca, todo en un pan de hamburguesa suave y ligeramente tostado. Con la combinación perfecta de ketchup y mayonesa para darle un toque adicional de sabor.", "Hamburguesa de 100g de carne molida, panceta, queso cheddar, tomate, lechuga, cebolla, ketchup y mayonesa.", 15, 2, 1, 2),
("Hamburguesa con champiñones","¡Una deliciosa hamburguesa con champiñones! Nuestra hamburguesa está hecha con 100g de carne molida de alta calidad, acompañada de panceta crujiente, queso mozzarella derretido, champiñones dorados y una variedad de vegetales frescos como tomate, lechuga y cebolla. Todo esto servido en un pan para hamburguesa tostado y con un toque de ketchup y mayonesa para un sabor irresistible. ¡Una hamburguesa gourmet para satisfacer tus antojos!","Hamburguesa de 100g de carne molida, panceta, tomate, lechuga, cebolla, queso mozzarella, champiñones salteados, ketchup y mayonesa.", 15, 2, 2, 3),
("Hamburguesa picante","Si te gusta lo picante, no puedes perderte nuestra hamburguesa picante. Con una jugosa carne molida sazonada con ajo, sal y pimienta, acompañada de queso cheddar derretido, cebolla roja picada, tomate fresco y hojas de lechuga crujientes, todo coronado con jalapeños frescos para un toque picante, y una salsa de mayonesa y salsa picante que te dejará con ganas de más. Todo esto en un pan de hamburguesa tostado. ¡Prepárate para un sabor explosivo en cada bocado!","Hamburguesa de 100g de carne molida, queso cheddar, jalapeños frescos, cebolla roja, tomate, lechuga y salsa picante-mayonesa.", 15, 2, 3, 5),
("Hamburguesa de champiñones y queso cheddar","Prueba nuestra deliciosa hamburguesa de champiñones y queso cheddar, hecha con carne molida jugosa y tierna, salteada con champiñones frescos y cebolla caramelizada. Cubierta con una generosa rebanada de queso cheddar derretido, esta hamburguesa es un sueño hecho realidad para los amantes del queso. Todo esto se coloca en un pan de hamburguesa recién tostado para una experiencia de sabor inolvidable.","Hamburguesa de 100g de carne molida, queso cheddar y champiñones frescos y cebolla caramelizada.", 15, 2, 4, 4),
("Hamburguesa de panceta y huevo frito","Nuestra hamburguesa de panceta y huevo frito es una mezcla perfecta de sabores y texturas. Con una jugosa hamburguesa de carne molida, panceta crujiente, huevo frito y una refrescante ensalada de lechuga y tomate, esta hamburguesa es una experiencia culinaria única que seguramente complacerá a cualquier amante de las hamburguesas.","Hamburguesa de 100g de carne molida, panceta crujiente, huevo frito, lechuga y tomate.", 15, 2, 5, 1),
("Pizza de pepperoni y champiñones","¿Te apetece una deliciosa pizza casera con un toque de pepperoni y champiñones? Nuestra pizza de pepperoni y champiñones es la opción perfecta para saciar tu antojo de pizza. Preparada con una masa de pizza casera crujiente, salsa de tomate fresca, queso mozzarella rallado y cubierta con rodajas de pepperoni y champiñones, esta pizza es una explosión de sabores en cada bocado.","Salsa de tomate, queso mozzarella, pepperoni y champiñones.", 20, 1, 6, 14),
("Pizza de carne molida y pimientos","Deliciosa pizza artesanal con masa crujiente, salsa de tomate casera y una mezcla de queso mozzarella derretido, carne molida y pimientos dulces asados. Una combinación perfecta de sabores y texturas que te harán agua la boca.","Salsa de tomate, queso mozzarella, carne molida y pimientos.", 20, 1, 7, 12),
("Pizza de cebolla y panceta","Disfrute de nuestra deliciosa Pizza de cebolla y panceta, perfectamente horneada con masa crujiente y cubierta con una salsa de tomate suave, queso cheddar rallado, cebolla en aros dulce y panceta ahumada en tiras. Esta pizza es el equilibrio perfecto de sabores salados y dulces que satisfarán sus antojos de pizza.","Salsa de tomate, queso cheddar, cebolla en aros y panceta en tiras.", 20, 1, 8, 11),
("Pizza de champiñones y cebolla caramelizada","Nuestra deliciosa Pizza de Champiñones y Cebolla Caramelizada es una combinación perfecta de sabores dulces y salados. Con una base de masa de pizza crujiente, salsa de tomate y una mezcla de queso mozzarella y parmesano rallado, esta pizza está cubierta con champiñones salteados y cebolla caramelizada. ¡Una explosión de sabor en cada bocado!","Salsa de tomate, champiñones, cebolla caramelizada, queso mozzarella y parmesano rallado.", 20, 1, 9, 13),
("Pizza de pepperoni y aceitunas","¡Deléitate con nuestra exquisita pizza de pepperoni y aceitunas! Una combinación perfecta de sabores salados y picantes, con la base de masa crujiente, cubierta con salsa de tomate y quesos rallados. Las rodajas de pepperoni y las aceitunas verdes rebanadas añaden un sabor adicional, mientras que el ajo en polvo y el orégano seco agregan un toque final de sabor. ¡Es la pizza perfecta para compartir con amigos y familiares!","Salsa de tomate, queso mozzarella, pepperoni, aceitunas verdes y queso parmesano.", 20, 1, 10, 15),
("Papas fritas clásicas chicas","Deléitate con nuestra deliciosa porción chica de papas fritas clásicas. Preparadas con papas recién cortadas y freídas en aceite vegetal, nuestras papas son crujientes por fuera y suaves por dentro. Perfectas para acompañar cualquier comida o como snack, estas papas fritas son ideales para satisfacer tu antojo en cualquier momento del día.","150gr de papas frescas cortadas a mano, sin sal.", 10, 5, 11, 8),
("Papas fritas clásicas medianas","¿Tienes hambre pero no demasiado? Nuestra porción mediana de papas fritas clásicas es justo lo que necesitas. Con papas frescas cortadas en tiras delgadas y freídas en aceite vegetal a la perfección, nuestras papas fritas son una deliciosa opción para cualquier comida. Crujientes por fuera y suaves por dentro, nuestras papas son el acompañamiento ideal para cualquier hamburguesa o pizza.","300gr de apas frescas cortadas a mano, sin sal.", 10, 5, 12, 8),
("Papas fritas clásicas grandes","Si estás buscando una porción generosa de papas fritas clásicas, no busques más. Nuestras papas fritas grandes son la elección perfecta para ti. Preparadas con papas frescas cortadas en tiras delgadas y freídas a la perfección en aceite vegetal, nuestras papas fritas son el complemento perfecto para cualquier comida. Crujientes por fuera y suaves por dentro, estas papas son una opción deliciosa y satisfactoria para satisfacer tu apetito.","450gr de papas frescas cortadas a mano, sin sal.", 10, 5, 13, 8),
("Papas fritas con queso y panceta","Nuestras deliciosas papas fritas con queso y panceta son el acompañamiento perfecto para cualquier comida. Cada crujiente bocado está lleno de sabor a papas frescas, panceta ahumada y queso cheddar derretido. Este plato es el sueño hecho realidad para los amantes del queso y la panceta.","Papas frescas cortadas a mano, panceta y queso cheddar. ", 15, 5, 14, 9),
("Papas fritas con ajo y parmesano","Disfruta de nuestras deliciosas papas fritas con ajo y parmesano, perfectamente doradas y crujientes por fuera y suaves por dentro. El sabor intenso del ajo picado y el queso parmesano recién rallado se combinan a la perfección para darte una experiencia gastronómica única.","Papas frescas cortadas a mano, ajo picado y queso parmesano.", 15, 5, 15, 10),
("Hamburguesa para 1","¡Prueba nuestro combo clásico de hamburguesa y papas fritas! La hamburguesa clásica es una deliciosa mezcla de carne de jugosa, crujientes lechugas, rodajas de tomate y cebolla, y una suave salsa en un pan recién tostado. Acompañando a la hamburguesa, encontrarás unas papas fritas crujientes y doradas, con la cantidad perfecta de sal para realzar su sabor. Este combo es la opción ideal para un almuerzo rápido o para una cena satisfactoria. ¡Ven y disfruta de esta clásica combinación de sabor que estamos seguros te encantará!","1 hamburguesa clásica + 1 papas chicas", 20, 4, 16, 6),
("Hamburguesas para 2","¡Disfruta de una experiencia gastronómica doblemente deliciosa con nuestro combo de dos hamburguesas clásicas y dos porciones de papas fritas chicas! Saborea el sabor único y la jugosidad de nuestras hamburguesas preparadas con carne de primera calidad, lechuga fresca y tomate. Las papas fritas crujientes y doradas, hechas con papas frescas y sazonadas a la perfección, son el complemento perfecto para una comida deliciosa y satisfactoria. Comparte este combo con un amigo o disfrútalo tú solo, ¡de cualquier manera, no te arrepentirás!","2 hamburguesas clásica + 2 papas chicas", 25, 4, 17, 6),
("Pizza con papas","¡Disfruta de la perfecta combinación de sabores con nuestro combo de pizza y papas! Saborea nuestra deliciosa pizza de pepperoni y aceitunas con la combinación perfecta de queso derretido y salsa de tomate en una masa crujiente y delgada, todo ello acompañado por unas deliciosas papas fritas medianas crujientes por fuera y suaves por dentro. Ideal para una cena rápida y deliciosa en familia o con amigos. ¡No te lo pierdas!","1 pizza de pepperoni y aceitunas + 1 papas mediana", 25, 4, 18, 7);
INSERT INTO product (NAME, short_description, cooking_time, product_category_id, image_id) VALUES
("Coca-cola 500ml","Bebida sin alcohol sabor cola.",0,3,16),
("Coca-cola zero 500ml","Bebida dietética sin alcohol sabor cola.",0,3,17),
("Fanta 500ml","Bebida sin alcohol sabor naranja.",0,3,18),
("Sprite 500ml","Bebida sin alcohol sabor lima-limón.",0,3,19),
("Schweppes 500ml","Bebida sin alcohol sabor pomelo.",0,3,20);
INSERT INTO product_detail (product_id, ingredient_id, quantity, measurement_unit) VALUES
(1,19,120,'g'),
(1,25,3,'g'),
(1,20,1.5,'g'),
(1,30,60,'ml'),
(1,14,60,'g'),
(1,15,7.5,'g'),
(1,26,6.5,'g'),
(1,1,100,'g'),
(1,2,30,'g'),
(1,4,60,'g'),
(1,5,30,'g'),
(1,6,30,'g'),
(1,16,20,'g'),
(1,21,15,'g'),
(1,22,15,'g'),
(1,27,0.2,'g');
INSERT INTO product_detail (product_id, ingredient_id, quantity, measurement_unit) VALUES
(2,19,120,'g'),
(2,25,3,'g'),
(2,20,1.5,'g'),
(2,30,60,'ml'),
(2,14,60,'ml'),
(2,15,7.5,'g'),
(2,26,6.5,'g'),
(2,1,100,'g'),
(2,2,30,'g'),
(2,4,60,'g'),
(2,5,30,'g'),
(2,6,30,'g'),
(2,17,20,'g'),
(2,7,30,'g'),
(2,21,15,'g'),
(2,22,15,'g'),
(2,27,0.2,'g');
INSERT INTO product_detail (product_id, ingredient_id, quantity, measurement_unit) VALUES
(3,19,120,'g'),
(3,25,3,'g'),
(3,20,1.5,'g'),
(3,30,60,'ml'),
(3,14,60,'ml'),
(3,15,7.5,'g'),
(3,26,6.5,'g'),
(3,1,150,'g'),
(3,8,10,'g'),
(3,6,20,'g'),
(3,4,25,'g'),
(3,5,10,'g'),
(3,16,20,'g'),
(3,23,15,'g'),
(3,22,15,'g'),
(3,28,3,'g'),
(3,27,0.2,'g');
INSERT INTO product_detail (product_id, ingredient_id, quantity, measurement_unit) VALUES
(4,19,120,'g'),
(4,25,3,'g'),
(4,20,1.5,'g'),
(4,30,60,'ml'),
(4,14,60,'ml'),
(4,15,7.5,'g'),
(4,26,6.5,'g'),
(4,1,120,'g'),
(4,7,50,'g'),
(4,16,20,'g'),
(4,6,25,'g'),
(4,31,5,'ml'),
(4,27,0.2,'g');
INSERT INTO product_detail (product_id, ingredient_id, quantity, measurement_unit) VALUES
(5,19,120,'g'),
(5,25,3,'g'),
(5,20,1.5,'g'),
(5,30,60,'ml'),
(5,14,60,'ml'),
(5,15,7.5,'g'),
(5,26,6.5,'g'),
(5,1,120,'g'),
(5,38,1,'u'),
(5,2,15,'g'),
(5,5,10,'g'),
(5,4,20,'g'),
(5,15,5,'g'),
(5,27,0.2,'g');
INSERT INTO product_detail (product_id, ingredient_id, quantity, measurement_unit) VALUES
(6,19,250,'g'),
(6,10,150,'g'),
(6,25,5,'g'),
(6,20,5,'g'),
(6,31,15,'ml'),
(6,24,100,'g'),
(6,17,150,'g'),
(6,3,50,'g'),
(6,7,50,'g'),
(6,29,5,'g');
INSERT INTO product_detail (product_id, ingredient_id, quantity, measurement_unit) VALUES
(7,19,250,'g'),
(7,10,150,'g'),
(7,25,5,'g'),
(7,20,5,'g'),
(7,31,15,'ml'),
(7,24,100,'g'),
(7,17,150,'g'),
(7,1,100,'g'),
(7,10,70,'g');
INSERT INTO product_detail (product_id, ingredient_id, quantity, measurement_unit) VALUES
(8,19,250,'g'),
(8,10,150,'g'),
(8,25,5,'g'),
(8,20,5,'g'),
(8,31,15,'ml'),
(8,24,100,'g'),
(8,16,100,'g'),
(8,6,50,'g'),
(8,2,50,'g');
INSERT INTO product_detail (product_id, ingredient_id, quantity, measurement_unit) VALUES
(9,19,250,'g'),
(9,10,150,'g'),
(9,25,5,'g'),
(9,20,5,'g'),
(9,31,15,'ml'),
(9,24,100,'g'),
(9,7,70,'g'),
(9,9,150,'g'),
(9,17,100,'g'),
(9,18,25,'g'),
(9,31,30,'ml'),
(9,26,4,'g');
INSERT INTO product_detail (product_id, ingredient_id, quantity, measurement_unit) VALUES
(10,19,250,'g'),
(10,10,150,'g'),
(10,25,5,'g'),
(10,20,5,'g'),
(10,31,15,'ml'),
(10,24,100,'g'),
(10,17,100,'g'),
(10,18,25,'g'),
(10,13,35,'u'),
(10,3,30,'g'),
(10,28,0.5,'g'),
(10,29,0.5,'g');
INSERT INTO product_detail (product_id, ingredient_id, quantity, measurement_unit) VALUES
(11,11,150,'g'),
(11,32,100,'ml');
INSERT INTO product_detail (product_id, ingredient_id, quantity, measurement_unit) VALUES
(12,11,300,'g'),
(12,32,100,'ml');
INSERT INTO product_detail (product_id, ingredient_id, quantity, measurement_unit) VALUES
(13,11,450,'g'),
(13,32,100,'ml');
INSERT INTO product_detail (product_id, ingredient_id, quantity, measurement_unit) VALUES
(14,11,300,'g'),
(14,32,100,'ml'),
(14,2,30,'g'),
(14,16,35,'u');
INSERT INTO product_detail (product_id, ingredient_id, quantity, measurement_unit) VALUES
(15,11,300,'g'),
(15,32,100,'ml'),
(15,18,25,'g'),
(15,12,6,'g');
INSERT INTO product_detail (product_id, ingredient_id, quantity, measurement_unit) VALUES
(16,19,120,'g'),
(16,25,3,'g'),
(16,20,1.5,'g'),
(16,30,60,'ml'),
(16,14,60,'ml'),
(16,15,7.5,'g'),
(16,26,6.5,'g'),
(16,1,100,'g'),
(16,2,30,'g'),
(16,4,60,'g'),
(16,5,30,'g'),
(16,6,30,'g'),
(16,16,20,'g'),
(16,21,15,'g'),
(16,22,15,'g'),
(16,27,0.2,'g'),
(16,11,150,'g'),
(16,32,100,'g');
INSERT INTO product_detail (product_id, ingredient_id, quantity, measurement_unit) VALUES
(17,19,240,'g'),
(17,25,6,'g'),
(17,20,3,'g'),
(17,30,120,'g'),
(17,14,120,'ml'),
(17,15,15,'g'),
(17,26,13,'g'),
(17,1,200,'g'),
(17,2,60,'g'),
(17,4,120,'g'),
(17,5,60,'g'),
(17,6,60,'g'),
(17,16,40,'g'),
(17,21,30,'g'),
(17,22,30,'g'),
(17,27,0.4,'g'),
(17,11,300,'g'),
(17,32,200,'ml');
INSERT INTO product_detail (product_id, ingredient_id, quantity, measurement_unit) VALUES
(18,19,250,'g'),
(18,10,150,'g'),
(18,25,5,'g'),
(18,20,5,'g'),
(18,31,15,'ml'),
(18,24,100,'g'),
(18,17,100,'g'),
(18,18,25,'g'),
(18,13,35,'u'),
(18,3,30,'g'),
(18,28,0.5,'g'),
(18,29,0.5,'g'),
(18,11,300,'g'),
(18,32,100,'g');
INSERT INTO product_detail (product_id, ingredient_id, quantity, measurement_unit) VALUES
(19,33,1,'u'),
(20,34,1,'u'),
(21,36,1,'u'),
(22,35,1,'u'),
(23,37,1,'u');

UPDATE product p
JOIN(
SELECT
    pi.product_id,
    ROUND(SUM(i.cost_price * pi.quantity )*2.5 /10)*10 AS precio
FROM
    product_detail PI
    JOIN ingredient i ON pi.ingredient_id = i.id
GROUP BY
    pi.product_id
) t ON p.id = t.product_id
SET p.sell_price = t.precio;
