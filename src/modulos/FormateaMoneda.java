package modulos;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class FormateaMoneda {

    public String  formatearMoneda(double miMoneda){

        // Formateao  el resultado del tipo de cambio realizado
        Locale.Builder builder = new Locale.Builder();
        builder.setLanguage("es").setRegion("MX");
        Locale locale = builder.build();

        DecimalFormatSymbols symbols = new DecimalFormatSymbols(locale);
        symbols.setCurrencySymbol("$");
        DecimalFormat decFormat = new DecimalFormat("$ ###,##0.00", symbols);
        String monedaFormateada = decFormat.format(miMoneda);

        return monedaFormateada;
    }


}
