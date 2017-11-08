/**
 * Write a description of class calendario here.
 *
 * @author (David Rodriguez Diez)
 * @version (a version number or a date)
 */
public class CalendarioBasico
{
    // Declarando variables dia, mes y año
    private int dia;
    private int mes;
    private int ano;

    /**
     * Constructor de la clase CalendarioBasico
     */ 
    public CalendarioBasico()
    {
        dia = 1;
        mes = 1;
        ano = 1;
    }

    /**
     * Fijamos la fecha nueva
     */
    public void fijarFecha(int nuevoDia, int nuevoMes, int nuevoAno)
    {
        dia = nuevoDia;
        mes = nuevoMes;
        ano = nuevoAno;
    }

    /**
     *Metodo para obtener el facha
     */
    public String obtenerFecha()
    {
        String textoADevolver = "";
        String parte1 = dia + "";
        String parte2 = mes + "";
        String parte3 = ano + "";
        if (parte1.length() < 2) {
            parte1 = "0" + parte1;  
        }
        if (mes < 10) {
            parte2 = "0" + parte2;

            if (ano < 10) {
                parte3 = "0" + parte3;
            }
            textoADevolver = parte1 + "-" + parte2 + "-" + parte3;
        }
        return textoADevolver;
    }

    public void avanzarFecha()
    {
        dia = dia + 1;
        if (dia == 31){
            dia = 1;
            mes = mes + 1;
            if (mes == 13) {
                mes = 1;
                ano += 1;
            }
        }
    }
}