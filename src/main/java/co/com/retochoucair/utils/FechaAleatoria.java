package co.com.retochoucair.utils;


import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

public class FechaAleatoria {

        public String generarFecha() {
            Calendar calendario = Calendar.getInstance();
            Date fechaActual = calendario.getTime();
            Calendar inicio = Calendar.getInstance();
            inicio.set(2000, 0, 1);
            long diferenciaEnMillis = fechaActual.getTime() - inicio.getTimeInMillis();
            long diasMaximos = diferenciaEnMillis / (1000 * 60 * 60 * 24);
            Random random = new Random();
            long diasAleatorios = random.nextInt((int) diasMaximos);
            inicio.add(Calendar.DATE, (int) diasAleatorios);
            Date fechaGenerada = inicio.getTime();
            SimpleDateFormat formato = new SimpleDateFormat("yyyy-dd-MM");
            return formato.format(fechaGenerada);
        }



}
