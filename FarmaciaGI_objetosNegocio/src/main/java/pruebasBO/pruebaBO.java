package pruebasBO;

import java.util.ArrayList;
import java.util.List;
import org.itson.disenosoftware.farmaciagi_dtos.DireccionDTO;
import org.itson.disenosoftware.farmaciagi_dtos.ProveedorDTO;
import org.itson.diseñosoftware.farmaciagi_objetosNegocio.ProveedorBO;

public class pruebaBO {

    public static void main(String[] args) {
        ProveedorBO proveedorBO = new ProveedorBO();

        List<String> telefonos = new ArrayList<>();
        telefonos.add("644252264259");
        telefonos.add("644252264260");

        ProveedorDTO proveedorNuevoDTO = new ProveedorDTO(
                "TUFESA",
                new DireccionDTO(
                        "Blvd Casanova",
                        "Casa Blanca",
                        "451",
                        "85900",
                        "Cd.Obregon"
                ),
                telefonos,
                "JGLOIUJ09"
        );

//        ProveedorDTO proveedorNuevoDTO = new ProveedorDTO();
//        proveedorNuevoDTO.setRfc("JGLOIUJ090");
                
        proveedorBO.actualizarProveedor(proveedorNuevoDTO);
    }
}
