package modulos;

import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Conversor {

    public String convertir(double monto, Moneda monedaBase, Moneda monedaDestino) {
        //el siguiente string contiene la Key de la API (b8c188c1a9ed489f37df46b2), la cual  es temporal
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/b8c188c1a9ed489f37df46b2/pair/" + monedaBase + "/" + monedaDestino + "/" + monto);

        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(direccion)
                    .build();

            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            Gson gson = new Gson();
            String json = response.body();
            ApiRespuesta respuesta = gson.fromJson(json, ApiRespuesta.class);

            //obtengo los datos de API
            String timeNextUpdateUtc = respuesta.getTimeNextUpdateUtc().substring(0,17);
            double conversionRate = respuesta.getConversionRate();
            double conversionResult = respuesta.getConversionResult();
            String exchangeRate = respuesta.getTarget_code();

            //Doy formato a la moneda
            FormateaMoneda formateaMoneda = new FormateaMoneda();
            String formattedResult = formateaMoneda.formatearMoneda(conversionResult);

            // retorno solo el resultado de la conversión
            return  formattedResult;

        } catch (Exception e) {
            throw new RuntimeException("No fue posible encontrar las monedas a cambio");
        }
    }
}
