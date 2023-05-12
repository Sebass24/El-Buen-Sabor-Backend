package com.example.buensabor.Models.Enum;

public enum Location {
    Capital("Capital"),
    Guaymallen("Guaymallén"),
    LasHeras("Las Heras"),
    Lavalle("La Valle"),
    Junin("Junín"),
    LaPaz("La Paz"),
    Maipu("Maipú"),
    Rivadavia("Rivadavia"),
    SantaRosa("Santa Rosa"),
    SanMartín("San Martín"),
    GodoyCruz("Godoy Cruz"),
    LujánDeCuyo("Lujan de Cuyo"),
    SanCarlos("San Carlos"),
    Tunuyán("Tunuyán"),
    Tupungato("Tupungato"),
    GeneralAlvear("General Alvear"),
    Malargüe("Malargüe"),
    SanRafael("San Rafael")
    ;

    private final String name;

    Location(String name) {
        this.name = name;
    }

    public String getName(){
        return name;
    }
}
