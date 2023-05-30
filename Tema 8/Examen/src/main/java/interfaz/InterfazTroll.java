package interfaz;

import java.io.File;

import exceptions.NoEsImagenException;

public interface InterfazTroll {
    public void recorridoTroll(File rutaInicial);
    public void trastocarImagen(File rutaInicial) throws NoEsImagenException;
}
