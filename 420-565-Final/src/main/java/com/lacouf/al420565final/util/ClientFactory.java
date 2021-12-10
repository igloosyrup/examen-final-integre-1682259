package com.lacouf.al420565final.util;

import com.lacouf.al420565final.model.Client;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class ClientFactory {

    public static List<Client> getClients() {
        return Arrays.asList(
                Client.of("Francois",
                        "Lacoursiere",
                        "M",
                        LocalDate.of(1980, 4, 20), "Montreal", "QC")
                ,
                Client.of("Arnaud",
                        "Beauregard",
                        "M",
                        LocalDate.of(1992, 8, 10),
                        "Montreal",
                        "QC")
                ,
                Client.of("Josée",
                        "Lavigueur",
                        "F",
                        LocalDate.of(1999, 12, 24), "Toronto", "ON")
                ,
                Client.of("Eric",
                        "Dumas",
                        "M",
                        LocalDate.of(2005, 1, 14), "Sherbrooke", "QC")
                ,
                Client.of("Sylvie",
                        "Paquette",
                        "F",
                        LocalDate.of(2008, 2, 13), "Quebec", "QC")
        );
    }
}
