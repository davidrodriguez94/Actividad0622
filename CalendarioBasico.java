/**
 * Write a description of class calendario here.
 *
 * @author (David Rodriguez Diez)
 * @version (a version number or a date)
 */
public class CalendarioBasico
{
    // Declarando variables dia, mes y año
    private DisplayDosCaracteres nDia;
    private DisplayDosCaracteres nMes;
    private DisplayDosCaracteres nAno;

    /**
     * Constructor de la clase CalendarioBasico
     */ 
    public CalendarioBasico()
    {
        nDia = new DisplayDosCaracteres(31);
        nMes = new DisplayDosCaracteres(13);
        nAno = new DisplayDosCaracteres(100);
    }

    /**
     * Fijamos la fecha nueva
     */
    public void fijarFecha(int nuevoDia, int nuevoMes, int nuevoAno)
    {
        nDia.setValorAlmacenado(nuevoDia);
        nMes.setValorAlmacenado(nuevoMes);
        nAno.setValorAlmacenado(nuevoAno);
    }

    /**
     *Metodo para obtener el facha
     */
    public String obtenerFecha()
    {
        String devolverFecha;
        devolverFecha = nDia.getTextoDelDisplay() + "-" + nMes.getTextoDelDisplay() + "-" + nAno.getTextoDelDisplay();
        return devolverFecha;
    }

    public void avanzarFecha()
    {
        nDia.incrementaValorAlmacenado();
        if (nDia.getValorAlmacenado() == 1){
            nMes.incrementaValorAlmacenado();
            if(nMes.getValorAlmacenado() == 1){
                nAno.incrementaValorAlmacenado();
            }
        }
    }
}