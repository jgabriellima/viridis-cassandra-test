package com.jgabriellima.viridis.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import com.jgabriellima.viridis.repository.MedidorRepository;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Application {

    public static void main(String[] args) throws ParseException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new ClassPathResource("resources/spring-config.xml").getPath());

        MedidorRepository mr = context.getBean(MedidorRepository.class);
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        String start =   "01/07/2015";  
        String end =   "15/07/2015";  
        /* Implementação das funções MAX, MIN, SUM, AVE */
        
        /*
        MAX
        Params: { medidor (String)}  
        */
        System.out.println(mr.maxByMedidor("MEDIDOR_1"));
        
        /*
        MAX
        Params: { medidor (String), data início (Date), data fim (Date)}  
        */
        System.out.println(mr.maxByMedidor("MEDIDOR_1",new Date(format.parse(start).getTime()),new Date(format.parse(end).getTime())).one().getInt("result"));
        
         /*
        MIN
        Params: { medidor (String)}  
        */
        System.out.println(mr.minByMedidor("MEDIDOR_1"));
        
        /*
        MIN
        Params: { medidor (String), data início (Date), data fim (Date)}  
        */
        System.out.println(mr.minByMedidor("MEDIDOR_1",new Date(format.parse(start).getTime()),new Date(format.parse(end).getTime())).one().getInt("result"));
        
        
        /*SUM
        Params: { medidor (String)}  
        */
        System.out.println(mr.sumByMedidor("MEDIDOR_1"));
        
        /*SUM
        Params: { medidor (String), data início (Date), data fim (Date)}  
        */
        System.out.println(mr.sumByMedidor("MEDIDOR_1",new Date(format.parse(start).getTime()),new Date(format.parse(end).getTime())).one().getInt("result"));
        
        /*AVG
        Params: { medidor (String)}  
        */
        System.out.println(mr.avgByMedidor("MEDIDOR_1"));
        
        /*AVG
        Params: { medidor (String), data início (Date), data fim (Date)}  
        */
        System.out.println(mr.avgByMedidor("MEDIDOR_1",new Date(format.parse(start).getTime()),new Date(format.parse(end).getTime())).one().getInt("result"));

        
        context.close();

    }
}
