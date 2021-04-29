package edu.upc.eetac.dsa;

import edu.upc.eetac.dsa.models.Usuario;
import edu.upc.eetac.dsa.models.Vacuna;
import org.apache.log4j.Logger;

import edu.upc.eetac.dsa.models.*;

import java.util.*;

public class Covid19ManagerImpl implements Covid19Manager {

    private static Covid19Manager instance;

    private HashMap<String, Usuario> mapUsuarios;
    private List<Usuario> listaVacunaciones;
    private List<Vacuna> listaVacunas;
    private Integer numVacunacionesTotal;
    private List<Seguimiento> listaSeguimientos;

    private static Logger logger = Logger.getLogger(Covid19ManagerImpl.class);

    private Covid19ManagerImpl(){
        this.mapUsuarios = new HashMap<>();
        this.listaVacunaciones = new LinkedList<>();
        this.numVacunacionesTotal = 0;
        this.listaSeguimientos = new LinkedList<>();
    }
    //Singleton implementation for the instance of the InterficieManager
    public static Covid19Manager getInstance(){
        if(instance == null) {
            instance = new Covid19ManagerImpl();
        }
        return instance;
    }

    @Override
    public void aplicarVacuna(String idUsuario, String idVacuna) {

        if (idUsuario == null || idVacuna == null) {
            logger.error("Hay campos vacios");
        }
        else {
            Usuario usuarioVacunado = new Usuario(idUsuario, idVacuna);
            usuarioVacunado.addFecha();
            Vacuna tipoVacuna = new Vacuna(idVacuna);
            tipoVacuna.addVacuna();
            logger.info("Vacuna aplicada correctamente");
        }
    }

   @Override
    public List<Usuario> vacunasOrdenadas() {

        List<Usuario> vacunasOrden = listaVacunaciones;
        if (!vacunasOrden.isEmpty()){
            Collections.sort(vacunasOrden, new Comparator<Usuario>() {
                @Override
                public int compare(Usuario o1, Usuario o2) {
                    return o2.getVacuna().compareTo(o1.getVacuna());
                }

            });
            Collections.sort(vacunasOrden, new Comparator<Usuario>() {
                @Override
                public int compare(Usuario o1, Usuario o2) {
                    return Integer.compare(o2.getOrdenFecha(),o1.getOrdenFecha());
                }
            });
        }
        return vacunasOrden;
   }


    @Override
    public List<Vacuna> marcasVacunaOrdenadas() {

        List<Vacuna> vacunaList = listaVacunas;

        Collections.sort(vacunaList, new Comparator<Vacuna>() {
            @Override
            public int compare(Vacuna o1, Vacuna o2) {
                return Integer.compare(o1.getNumVacunasAplicadas(),o2.getNumVacunasAplicadas());
            }
        });

        return vacunaList;
    }

    @Override
    public void añadirSeguimiento(Usuario u,Seguimiento s) {

        Usuario añadeSeguimiento = u.setListaSeguimiento(s);


    }

    @Override
    public List<Usuario> listadoSeguimientos() {


        return null;
    }

    public void clearInstances(){
        listaVacunaciones.clear();
        numVacunacionesTotal = 0;
        listaSeguimientos.clear();
        mapUsuarios.clear();

    }
}
