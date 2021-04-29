package edu.upc.eetac.dsa;
import edu.upc.eetac.dsa.models.Seguimiento;
import edu.upc.eetac.dsa.models.Usuario;
import edu.upc.eetac.dsa.models.Vacuna;

import java.util.*;

public interface Covid19Manager {

    public void aplicarVacuna(String idUsuario, String idVacuna);
    public List<Usuario> vacunasOrdenadas();   //---> DABA ERROR POR EL INTELLIJ
    public List<Vacuna> marcasVacunaOrdenadas();
    public void añadirSeguimiento(Usuario u, Seguimiento s);
    public List<Usuario> listadoSeguimientos();

}
