/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ferna
 */
public class Persianas {
 private int largo;
 private int ancho;
 private String color;
 private boolean Motor;
 
    public Persianas() {
    }

    public Persianas(int largo, int ancho, String color, boolean Motor) {
        this.largo = largo;
        this.ancho = ancho;
        this.color = color;
        this.Motor = Motor;
    }

    public int getAncho() {
        return ancho;
    }

    public int getLargo() {
        return largo;
    }
    
   public String getColor() {
        return color;
    }

    public boolean isMotor() {
        return Motor;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setMotor(boolean Motor) {
        this.Motor = Motor;
    }

    @Override
    public String toString() {
        return "\tPersiana"
                + "\nLargo: " + getLargo()
                + "\nAncho: " + getAncho()
                + "\nColor: " + getColor()
                +"\nTiene motor: "+isMotor()
                ; 
    }
    public int calcularPrecio(){
         int precio=0;
        if (getLargo()<=100 && getAncho() <=100) {
            precio = 0+105000;
        }else if (getLargo()<=130 && getAncho() <=100) {
            precio = 0+115600;
        }else if (getLargo()<=145 && getAncho() <=100) {
            precio = 0+122700;
        }else if (getLargo()<=160 && getAncho() <=100) {
            precio = 0+131200;
        }else if (getLargo()<=175 && getAncho() <=100) {
            precio = 0+142700;
        }else if (getLargo()<=190 && getAncho() <=100) {
            precio = 0+155400;
        }else if (getLargo()<=205 && getAncho() <=100) {
            precio = 0+166000;
        }else if (getLargo()<=220 && getAncho() <=100) {
            precio = 0+185300;
        }else if (getLargo()<=235 && getAncho() <=100) {
            precio = 0+192700;
        }else if (getLargo()<=250 && getAncho() <=100) {
            precio = 0+205200;
        }else if (getLargo()<=265 && getAncho() <=100) {
            precio = 0+215800;
        }else if (getLargo()<=280 && getAncho() <=100) {
            precio = 0+225000;
        }else if (getLargo()<=295 && getAncho() <=100) {
            precio = 0+235400;
        }else if (getLargo()<=310 && getAncho() <=100) {
            precio = 0+245600;
        }else if (getLargo()<=325 && getAncho() <=100) {
            precio = 0+255200 ;
        }else if(getLargo()<=340 && getAncho()<=100){
            precio = 0+ 262800;
        }
            
            /* empepzando segunda corrida*/
            
        else if(getLargo()<=100 && getAncho()<=110){
            precio = 0+ 110900;
        }else if (getLargo()<=130 && getAncho() <=110) {
            precio = 0+132800;
        }else if (getLargo()<=145 && getAncho() <=110) {
            precio = 0+140400;
        }else if (getLargo()<=160 && getAncho() <=110) {
            precio = 0+149500;
        }else if (getLargo()<=175 && getAncho() <=110) {
            precio = 0+161800;
        }else if (getLargo()<=190 && getAncho() <=110) {
            precio = 0+171000;
        }else if (getLargo()<=205 && getAncho() <=110) {
            precio = 0+180200;
        }else if (getLargo()<=220 && getAncho() <=110) {
            precio = 0+190200;
        }else if (getLargo()<=235 && getAncho() <=110) {
            precio = 0+215000;
        }else if (getLargo()<=250 && getAncho() <=110) {
            precio = 0+224200;
        }else if (getLargo()<=265 && getAncho() <=110) {
            precio = 0+233400;
        }else if (getLargo()<=280 && getAncho() <=110) {
            precio = 0+242600;
        }else if (getLargo()<=295 && getAncho() <=110) {
            precio = 0+251800;
        }else if (getLargo()<=310 && getAncho() <=110) {
            precio = 0+261000;
        }else if (getLargo()<=325 && getAncho() <=110) {
            precio = 0+270200 ;           
        }else if(getLargo()<=340 && getAncho()<=110){
            precio = 0+ 279400;
        }
          /*completando tercera fila*/
        else if(getLargo()<=100 && getAncho()<=120){
            precio = 0+ 116800;
        }else if (getLargo()<=130 && getAncho() <=120) {
            precio = 0+140200;
        }else if (getLargo()<=145 && getAncho() <=120) {
            precio = 0+148000;
        }else if (getLargo()<=160 && getAncho() <=120) {
            precio = 0+157800;
        }else if (getLargo()<=175 && getAncho() <=120) {
            precio = 0+170900;
        }else if (getLargo()<=190 && getAncho() <=120) {
            precio = 0+181400;
        }else if (getLargo()<=205 && getAncho() <=120) {
            precio = 0+190500;
        }else if (getLargo()<=220 && getAncho() <=120) {
            precio = 0+201400;
        }else if (getLargo()<=235 && getAncho() <=120) {
            precio = 0+227700;
        }else if (getLargo()<=250 && getAncho() <=120) {
            precio = 0+237200;
        }else if (getLargo()<=265 && getAncho() <=120) {
            precio = 0+247800;
        }else if (getLargo()<=280 && getAncho() <=120) {
            precio = 0+256800;
        }else if (getLargo()<=295 && getAncho() <=120) {
            precio = 0+266600;
        }else if (getLargo()<=310 && getAncho() <=120) {
            precio = 0+276600;
        }else if (getLargo()<=325 && getAncho() <=120) {
            precio = 0+286200 ;
       }else if (getLargo()<=340 && getAncho() <=120) {
            precio = 0+296000 ;
       }
             /*completando cuarta fila*/
        else if(getLargo()<=100 && getAncho()<=130){
            precio = 0+ 122600;
        }else if (getLargo()<=130 && getAncho() <=130) {
            precio = 0+147600;
        }else if (getLargo()<=145 && getAncho() <=130) {
            precio = 0+155800;
        }else if (getLargo()<=160 && getAncho() <=130) {
            precio = 0+166200;
        }else if (getLargo()<=175 && getAncho() <=130) {
            precio = 0+180700;
        }else if (getLargo()<=190 && getAncho() <=130) {
            precio = 0+190500;
        }else if (getLargo()<=205 && getAncho() <=130) {
            precio = 0+200800;
        }else if (getLargo()<=220 && getAncho() <=130) {
            precio = 0+211900;
        }else if (getLargo()<=235 && getAncho() <=130) {
            precio = 0+239300;
        }else if (getLargo()<=250 && getAncho() <=130) {
            precio = 0+250200;
        }else if (getLargo()<=265 && getAncho() <=130) {
            precio = 0+260600;
        }else if (getLargo()<=280 && getAncho() <=130) {
            precio = 0+271000;
        }else if (getLargo()<=295 && getAncho() <=130) {
            precio = 0+281400;
        }else if (getLargo()<=310 && getAncho() <=130) {
            precio = 0+291800;
        }else if (getLargo()<=325 && getAncho() <=130) {
            precio = 0+302200 ;
        }else if (getLargo()<=340 && getAncho() <=130) {
            precio = 0+312500 ;
        }
        /*completando quinta fila*/
        else if(getLargo()<=100 && getAncho()<=140){
            precio = 0+ 128400;
        }else if (getLargo()<=130 && getAncho() <=140) {
            precio = 0+154700;
        }else if (getLargo()<=145 && getAncho() <=140) {
            precio = 0+163500;
        }else if (getLargo()<=160 && getAncho() <=140) {
            precio = 0+174500;
        }else if (getLargo()<=175 && getAncho() <=140) {
            precio = 0+189100;
        }else if (getLargo()<=190 && getAncho() <=140) {
            precio = 0+200200;
        }else if (getLargo()<=205 && getAncho() <=140) {
            precio = 0+211200;
        }else if (getLargo()<=220 && getAncho() <=140) {
            precio = 0+213000;
        }else if (getLargo()<=235 && getAncho() <=140) {
            precio = 0+252200;
        }else if (getLargo()<=250 && getAncho() <=140) {
            precio = 0+263200;
        }else if (getLargo()<=265 && getAncho() <=140) {
            precio = 0+274200;
        }else if (getLargo()<=280 && getAncho() <=140) {
            precio = 0+285100;
        }else if (getLargo()<=295 && getAncho() <=140) {
            precio = 0+296100;
        }else if (getLargo()<=310 && getAncho() <=140) {
            precio = 0+307100;
        }else if (getLargo()<=325 && getAncho() <=140) {
            precio = 0+318100 ;
        }else if (getLargo()<=340 && getAncho() <=140) {
            precio = 0+328000 ;
        }
        /*completando sexta fila*/
        else if(getLargo()<=100 && getAncho()<=150){
            precio = 0+ 134200;
        }else if (getLargo()<=130 && getAncho() <=150) {
            precio = 0+162000;
        }else if (getLargo()<=145 && getAncho() <=150) {
            precio = 0+171200;
        }else if (getLargo()<=160 && getAncho() <=150) {
            precio = 0+182800;
        }else if (getLargo()<=175 && getAncho() <=150) {
            precio = 0+198200;
        }else if (getLargo()<=190 && getAncho() <=150) {
            precio = 0+210000;
        }else if (getLargo()<=205 && getAncho() <=150) {
            precio = 0+221400;
        }else if (getLargo()<=220 && getAncho() <=150) {
            precio = 0+233800;
        }else if (getLargo()<=235 && getAncho() <=150) {
            precio = 0+264600;
        }else if (getLargo()<=250 && getAncho() <=150) {
            precio = 0+276100;
        }else if (getLargo()<=265 && getAncho() <=150) {
            precio = 0+287700;
        }else if (getLargo()<=280 && getAncho() <=150) {
            precio = 0+300000;
        }else if (getLargo()<=295 && getAncho() <=150) {
            precio = 0+311000;
        }else if (getLargo()<=310 && getAncho() <=150) {
            precio = 0+322500;
        }else if (getLargo()<=325 && getAncho() <=150) {
            precio = 0+334100 ;
        }else if (getLargo()<=340 && getAncho() <=150) {
            precio = 0+345000 ;
        }
        /*completando septima fila*/
        else if(getLargo()<=100 && getAncho()<=160){
            precio = 0+ 140000;
        }else if (getLargo()<=130 && getAncho() <=160) {
            precio = 0+170000;
        }else if (getLargo()<=145 && getAncho() <=160) {
            precio = 0+180000;
        }else if (getLargo()<=160 && getAncho() <=160) {
            precio = 0+191000;
        }else if (getLargo()<=175 && getAncho() <=160) {
            precio = 0+207000;
        }else if (getLargo()<=190 && getAncho() <=160) {
            precio = 0+219600;
        }else if (getLargo()<=205 && getAncho() <=160) {
            precio = 0+231700;
        }else if (getLargo()<=220 && getAncho() <=160) {
            precio = 0+244600;
        }else if (getLargo()<=235 && getAncho() <=160) {
            precio = 0+277000;
        }else if (getLargo()<=250 && getAncho() <=160) {
            precio = 0+290000;
        }else if (getLargo()<=265 && getAncho() <=160) {
            precio = 0+301000;
        }else if (getLargo()<=280 && getAncho() <=160) {
            precio = 0+313000;
        }else if (getLargo()<=295 && getAncho() <=160) {
            precio = 0+325700;
        }else if (getLargo()<=310 && getAncho() <=160) {
            precio = 0+337900;
        }else if (getLargo()<=325 && getAncho() <=160) {
            precio = 0+350000 ;
        }else if (getLargo()<=340 && getAncho() <=160) {
            precio = 0+361000 ;
        }
        /*completando octava fila*/
        else if(getLargo()<=100 && getAncho()<=170){
            precio = 0+ 145800;
        }else if (getLargo()<=130 && getAncho() <=170) {
            precio = 0+176400;
        }else if (getLargo()<=145 && getAncho() <=170) {
            precio = 0+186400;
        }else if (getLargo()<=160 && getAncho() <=170) {
            precio = 0+198000;
        }else if (getLargo()<=175 && getAncho() <=170) {
            precio = 0+216000;
        }else if (getLargo()<=190 && getAncho() <=170) {
            precio = 0+228000;
        }else if (getLargo()<=205 && getAncho() <=170) {
            precio = 0+242000;
        }else if (getLargo()<=220 && getAncho() <=170) {
            precio = 0+255000;
        }else if (getLargo()<=235 && getAncho() <=170) {
            precio = 0+289000;
        }else if (getLargo()<=250 && getAncho() <=170) {
            precio = 0+302000;
        }else if (getLargo()<=265 && getAncho() <=170) {
            precio = 0+314900;
        }else if (getLargo()<=280 && getAncho() <=170) {
            precio = 0+327700;
        }else if (getLargo()<=295 && getAncho() <=170) {
            precio = 0+340500;
        }else if (getLargo()<=310 && getAncho() <=170) {
            precio = 0+253200;
        }else if (getLargo()<=325 && getAncho() <=170) {
            precio = 0+366000 ;
        }else if (getLargo()<=340 && getAncho() <=170) {
            precio = 0+378800 ;
        }
        /*completando novena fila*/
        else if(getLargo()<=100 && getAncho()<=180){
            precio = 0+ 151600;
        }else if (getLargo()<=130 && getAncho() <=180) {
            precio = 0+183700;
        }else if (getLargo()<=145 && getAncho() <=180) {
            precio = 0+194300;
        }else if (getLargo()<=160 && getAncho() <=180) {
            precio = 0+207700;
        }else if (getLargo()<=175 && getAncho() <=180) {
            precio = 0+225500;
        }else if (getLargo()<=190 && getAncho() <=180) {
            precio = 0+238900;
        }else if (getLargo()<=205 && getAncho() <=180) {
            precio = 0+252300;
        }else if (getLargo()<=220 && getAncho() <=180) {
            precio = 0+266400;
        }else if (getLargo()<=235 && getAncho() <=180) {
            precio = 0+301700;
        }else if (getLargo()<=250 && getAncho() <=180) {
            precio = 0+315100;
        }else if (getLargo()<=265 && getAncho() <=180) {
            precio = 0+328500;
        }else if (getLargo()<=280 && getAncho() <=180) {
            precio = 0+341900;
        }else if (getLargo()<=295 && getAncho() <=180) {
            precio = 0+355200;
        }else if (getLargo()<=310 && getAncho() <=180) {
            precio = 0+368600;
        }else if (getLargo()<=325 && getAncho() <=180) {
            precio = 0+382000;
        }else if (getLargo()<=340 && getAncho() <=180) {
            precio = 0+395400;
        }
        /*completando decima fila*/
        else if(getLargo()<=100 && getAncho()<=190){
            precio = 0+ 157400;
        }else if (getLargo()<=130 && getAncho() <=190) {
            precio = 0+190900;
        }else if (getLargo()<=145 && getAncho() <=190) {
            precio = 0+202000;
        }else if (getLargo()<=160 && getAncho() <=190) {
            precio = 0+216000;
        }else if (getLargo()<=175 && getAncho() <=190) {
            precio = 0+234600;
        }else if (getLargo()<=190 && getAncho() <=190) {
            precio = 0+248600;
        }else if (getLargo()<=205 && getAncho() <=190) {
            precio = 0+262600;
        }else if (getLargo()<=220 && getAncho() <=190) {
            precio = 0+277300;
        }else if (getLargo()<=235 && getAncho() <=190) {
            precio = 0+314000;
        }else if (getLargo()<=250 && getAncho() <=190) {
            precio = 0+328000;
        }else if (getLargo()<=265 && getAncho() <=190) {
            precio = 0+342000;
        }else if (getLargo()<=280 && getAncho() <=190) {
            precio = 0+356000;
        }else if (getLargo()<=295 && getAncho() <=190) {
            precio = 0+370000;
        }else if (getLargo()<=310 && getAncho() <=190) {
            precio = 0+383000;
        }else if (getLargo()<=325 && getAncho() <=190) {
            precio = 0+398000;
        }else if (getLargo()<=340 && getAncho() <=190) {
            precio = 0+412000;
        }
        /*completando onceava fila*/
        else if(getLargo()<=100 && getAncho()<=200){
            precio = 0+ 163200;
        }else if (getLargo()<=130 && getAncho() <=200) {
            precio = 0+198000;
        }else if (getLargo()<=145 && getAncho() <=200) {
            precio = 0+209000;
        }else if (getLargo()<=160 && getAncho() <=200) {
            precio = 0+224600;
        }else if (getLargo()<=175 && getAncho() <=200) {
            precio = 0+243700;
        }else if (getLargo()<=190 && getAncho() <=200) {
            precio = 0+258300;
        }else if (getLargo()<=205 && getAncho() <=200) {
            precio = 0+272900;
        }else if (getLargo()<=220 && getAncho() <=200) {
            precio = 0+288200;
        }else if (getLargo()<=235 && getAncho() <=200) {
            precio = 0+326500;
        }else if (getLargo()<=250 && getAncho() <=200) {
            precio = 0+341000;
        }else if (getLargo()<=265 && getAncho() <=200) {
            precio = 0+355600;
        }else if (getLargo()<=280 && getAncho() <=200) {
            precio = 0+370200;
        }else if (getLargo()<=295 && getAncho() <=200) {
            precio = 0+384800;
        }else if (getLargo()<=310 && getAncho() <=200) {
            precio = 0+398400;
        }else if (getLargo()<=325 && getAncho() <=200) {
            precio = 0+414000;
        }else if (getLargo()<=340 && getAncho() <=200) {
            precio = 0+428600;
        }
        /*completando doceava fila*/
        else if(getLargo()<=100 && getAncho()<=210){
            precio = 0+ 169000;
        }else if (getLargo()<=130 && getAncho() <=210) {
            precio = 0+2054000;
        }else if (getLargo()<=145 && getAncho() <=210) {
            precio = 0+217000;
        }else if (getLargo()<=160 && getAncho() <=210) {
            precio = 0+232600;
        }else if (getLargo()<=175 && getAncho() <=210) {
            precio = 0+252800;
        }else if (getLargo()<=190 && getAncho() <=210) {
            precio = 0+268000;
        }else if (getLargo()<=205 && getAncho() <=210) {
            precio = 0+283000;
        }else if (getLargo()<=220 && getAncho() <=210) {
            precio = 0+299000;
        }else if (getLargo()<=235 && getAncho() <=210) {
            precio = 0+338900;
        }else if (getLargo()<=250 && getAncho() <=210){
            precio = 0+354000;
        }else if (getLargo()<=265 && getAncho() <=210) {
            precio = 0+369700;
        }else if (getLargo()<=280 && getAncho() <=210) {
            precio = 0+384400;
        }else if (getLargo()<=295 && getAncho() <=210) {
            precio = 0+399600;
        }else if (getLargo()<=310 && getAncho() <=210) {
            precio = 0+416600;
        }else if (getLargo()<=325 && getAncho() <=210) {
            precio = 0+430000;
        }else if (getLargo()<=340 && getAncho() <=210) {
            precio = 0+445600;
        }
        /*completando treceava fila*/
        else if(getLargo()<=100 && getAncho()<=220){
            precio = 0+ 174800;
        }else if (getLargo()<=130 && getAncho() <=220) {
            precio = 0+212700;
        }else if (getLargo()<=145 && getAncho() <=220) {
            precio = 0+225000;
        }else if (getLargo()<=160 && getAncho() <=220) {
            precio = 0+240900;
        }else if (getLargo()<=175 && getAncho() <=220) {
            precio = 0+261900;
        }else if (getLargo()<=190 && getAncho() <=220) {
            precio = 0+277700;
        }else if (getLargo()<=205 && getAncho() <=220) {
            precio = 0+293500;
        }else if (getLargo()<=220 && getAncho() <=220) {
            precio = 0+310000;
        }else if (getLargo()<=235 && getAncho() <=220) {
            precio = 0+351200;
        }else if (getLargo()<=250 && getAncho() <=220){
            precio = 0+367000;
        }else if (getLargo()<=265 && getAncho() <=220) {
            precio = 0+382800;
        }else if (getLargo()<=280 && getAncho() <=220) {
            precio = 0+398600;
        }else if (getLargo()<=295 && getAncho() <=220) {
            precio = 0+414400;
        }else if (getLargo()<=310 && getAncho() <=220) {
            precio = 0+430100;
        }else if (getLargo()<=325 && getAncho() <=220) {
            precio = 0+445900;
        }else if (getLargo()<=340 && getAncho() <=220) {
            precio = 0+461700;
        }
        /*completando catorceava fila*/
        else if(getLargo()<=100 && getAncho()<=230){
            precio = 0+ 180600;
        }else if (getLargo()<=130 && getAncho() <=230) {
            precio = 0+219400;
        }else if (getLargo()<=145 && getAncho() <=230) {
            precio = 0+232700;
        }else if (getLargo()<=160 && getAncho() <=230) {
            precio = 0+249200;
        }else if (getLargo()<=175 && getAncho() <=230) {
            precio = 0+271000;
        }else if (getLargo()<=190 && getAncho() <=230) {
            precio = 0+286800;
        }else if (getLargo()<=205 && getAncho() <=230) {
            precio = 0+303800;
        }else if (getLargo()<=220 && getAncho() <=230) {
            precio = 0+320900;
        }else if (getLargo()<=235 && getAncho() <=230) {
            precio = 0+363600;
        }else if (getLargo()<=250 && getAncho() <=230){
            precio = 0+380000;
        }else if (getLargo()<=265 && getAncho() <=230) {
            precio = 0+396400;
        }else if (getLargo()<=280 && getAncho() <=230) {
            precio = 0+412800;
        }else if (getLargo()<=295 && getAncho() <=230) {
            precio = 0+430000;
        }else if (getLargo()<=310 && getAncho() <=230) {
            precio = 0+445500;
        }else if (getLargo()<=325 && getAncho() <=230) {
            precio = 0+461900;
        }else if (getLargo()<=340 && getAncho() <=230) {
            precio = 0+478200;
        }
        /* completando fila de precios ancho 240*/
        else if (getLargo()<=100 && getAncho() <=240) {
            precio = 0+186500;
        }else if (getLargo()<=130 && getAncho() <=240) {
            precio = 0+227200;
        }else if (getLargo()<=145 && getAncho() <=240) {
            precio = 0+240500;
        }else if (getLargo()<=160 && getAncho() <=240) {
            precio = 0+257500;
        }else if (getLargo()<=175 && getAncho() <=240) {
            precio = 0+280100;
        }else if (getLargo()<=190 && getAncho() <=240) {
            precio = 0+297100;
        }else if (getLargo()<=205 && getAncho() <=240) {
            precio = 0+314100;
        }else if (getLargo()<=220 && getAncho() <=240) {
            precio = 0+331800;
        }else if (getLargo()<=235 && getAncho() <=240) {
            precio = 0+376000;
        }else if (getLargo()<=250 && getAncho() <=240) {
            precio = 0+393000;
        }else if (getLargo()<=265 && getAncho() <=240) {
            precio = 0+409000;
        }else if (getLargo()<=280 && getAncho() <=240) {
            precio = 0+426000;
        }else if (getLargo()<=295 && getAncho() <=240) {
            precio = 0+443900;
        }else if (getLargo()<=310 && getAncho() <=240) {
            precio = 0+460900;
        }else if (getLargo()<=325 && getAncho() <=240) {
            precio = 0+477900 ;
        }else if(getLargo()<=340 && getAncho()<=240){
            precio = 0+ 494900;
        }   
            /* completando fila de precios segun 250 de ancho*/   
        
        else if(getLargo()<=100 && getAncho()<=250){
            precio = 0+ 192300;
        }else if (getLargo()<=130 && getAncho() <=250) {
            precio = 0+234500;
        }else if (getLargo()<=145 && getAncho() <=250) {
            precio = 0+248200;
        }else if (getLargo()<=160 && getAncho() <=250) {
            precio = 0+265800;
        }else if (getLargo()<=175 && getAncho() <=250) {
            precio = 0+289200;
        }else if (getLargo()<=190 && getAncho() <=250) {
            precio = 0+306800;
        }else if (getLargo()<=205 && getAncho() <=250) {
            precio = 0+324400;
        }else if (getLargo()<=220 && getAncho() <=250) {
            precio = 0+342700;
        }else if (getLargo()<=235 && getAncho() <=250) {
            precio = 0+388400;
        }else if (getLargo()<=250 && getAncho() <=250) {
            precio = 0+405900;
        }else if (getLargo()<=265 && getAncho() <=250) {
            precio = 0+422200;
        }else if (getLargo()<=280 && getAncho() <=250) {
            precio = 0+441100;
        }else if (getLargo()<=295 && getAncho() <=250) {
            precio = 0+458700;
        }else if (getLargo()<=310 && getAncho() <=250) {
            precio = 0+476300;
        }else if (getLargo()<=325 && getAncho() <=250) {
            precio = 0+493900 ;           
        }else if(getLargo()<=340 && getAncho()<=250){
            precio = 0+ 510800;
        }
          /*completando fila de precios segun 260 de ancho*/
        else if(getLargo()<=100 && getAncho()<=260){
            precio = 0+ 198100;
        }else if (getLargo()<=130 && getAncho() <=260) {
            precio = 0+241700;
        }else if (getLargo()<=145 && getAncho() <=260) {
            precio = 0+255900;
        }else if (getLargo()<=160 && getAncho() <=260) {
            precio = 0+274000;
        }else if (getLargo()<=175 && getAncho() <=260) {
            precio = 0+298300;
        }else if (getLargo()<=190 && getAncho() <=260) {
            precio = 0+316500;
        }else if (getLargo()<=205 && getAncho() <=260) {
            precio = 0+334700;
        }else if (getLargo()<=220 && getAncho() <=260) {
            precio = 0+353600;
        }else if (getLargo()<=235 && getAncho() <=260) {
            precio = 0+400700;
        }else if (getLargo()<=250 && getAncho() <=260) {
            precio = 0+418900;
        }else if (getLargo()<=265 && getAncho() <=260) {
            precio = 0+435300;
        }else if (getLargo()<=280 && getAncho() <=260) {
            precio = 0+455300;
        }else if (getLargo()<=295 && getAncho() <=260) {
            precio = 0+473500;
        }else if (getLargo()<=310 && getAncho() <=260) {
            precio = 0+481600;
        }else if (getLargo()<=325 && getAncho() <=260) {
            precio = 0+509800 ;
       }else if (getLargo()<=340 && getAncho() <=260) {
            precio = 0+527400 ;
       }
             /*completando fila de precios segun ancho 270*/
        else if(getLargo()<=100 && getAncho()<=270){
            precio = 0+ 203900;
        }else if (getLargo()<=130 && getAncho() <=270) {
            precio = 0+249000;
        }else if (getLargo()<=145 && getAncho() <=270) {
            precio = 0+263600;
        }else if (getLargo()<=160 && getAncho() <=270) {
            precio = 0+282400;
        }else if (getLargo()<=175 && getAncho() <=270) {
            precio = 0+307400;
        }else if (getLargo()<=190 && getAncho() <=270) {
            precio = 0+326200;
        }else if (getLargo()<=205 && getAncho() <=270) {
            precio = 0+345000;
        }else if (getLargo()<=220 && getAncho() <=270) {
            precio = 0+364500;
        }else if (getLargo()<=235 && getAncho() <=270) {
            precio = 0+413100;
        }else if (getLargo()<=250 && getAncho() <=270) {
            precio = 0+431000;
        }else if (getLargo()<=265 && getAncho() <=270) {
            precio = 0+448400;
        }else if (getLargo()<=280 && getAncho() <=270) {
            precio = 0+469500;
        }else if (getLargo()<=295 && getAncho() <=270) {
            precio = 0+488200;
        }else if (getLargo()<=310 && getAncho() <=270) {
            precio = 0+507000;
        }else if (getLargo()<=325 && getAncho() <=270) {
            precio = 0+525800 ;
        }else if (getLargo()<=340 && getAncho() <=270) {
            precio = 0+544000 ;
        }
        /*completando fila de precios segun 280 de ancho*/
        else if(getLargo()<=100 && getAncho()<=280){
            precio = 0+ 209700;
        }else if (getLargo()<=130 && getAncho() <=280) {
            precio = 0+256200;
        }else if (getLargo()<=145 && getAncho() <=280) {
            precio = 0+271300;
        }else if (getLargo()<=160 && getAncho() <=280) {
            precio = 0+290700;
        }else if (getLargo()<=175 && getAncho() <=280) {
            precio = 0+316500;
        }else if (getLargo()<=190 && getAncho() <=280) {
            precio = 0+335900;
        }else if (getLargo()<=205 && getAncho() <=280) {
            precio = 0+355300;
        }else if (getLargo()<=220 && getAncho() <=280) {
            precio = 0+395400;
        }else if (getLargo()<=235 && getAncho() <=280) {
            precio = 0+425500;
        }else if (getLargo()<=250 && getAncho() <=280) {
            precio = 0+444900;
        }else if (getLargo()<=265 && getAncho() <=280) {
            precio = 0+461600;
        }else if (getLargo()<=280 && getAncho() <=280) {
            precio = 0+483700;
        }else if (getLargo()<=295 && getAncho() <=280) {
            precio = 0+503000;
        }else if (getLargo()<=310 && getAncho() <=280) {
            precio = 0+522400;
        }else if (getLargo()<=325 && getAncho() <=280) {
            precio = 0+541800 ;
        }else if (getLargo()<=340 && getAncho() <=280) {
            precio = 0+560800 ;
        }
        /*completando fila de precios segun ancho 290*/
        else if(getLargo()<=100 && getAncho()<=290){
            precio = 0+ 215500;
        }else if (getLargo()<=130 && getAncho() <=290) {
            precio = 0+263500;
        }else if (getLargo()<=145 && getAncho() <=290) {
            precio = 0+279000;
        }else if (getLargo()<=160 && getAncho() <=290) {
            precio = 0+293000;
        }else if (getLargo()<=175 && getAncho() <=290) {
            precio = 0+325600;
        }else if (getLargo()<=190 && getAncho() <=290) {
            precio = 0+345800;
        }else if (getLargo()<=205 && getAncho() <=290) {
            precio = 0+365600;
        }else if (getLargo()<=220 && getAncho() <=290) {
            precio = 0+386300;
        }else if (getLargo()<=235 && getAncho() <=290) {
            precio = 0+437900;
        }else if (getLargo()<=250 && getAncho() <=290) {
            precio = 0+457800;
        }else if (getLargo()<=265 && getAncho() <=290) {
            precio = 0+474700;
        }else if (getLargo()<=280 && getAncho() <=290) {
            precio = 0+497900;
        }else if (getLargo()<=295 && getAncho() <=290) {
            precio = 0+517800;
        }else if (getLargo()<=310 && getAncho() <=290) {
            precio = 0+537800;
        }else if (getLargo()<=325 && getAncho() <=290) {
            precio = 0+557800 ;
        }else if (getLargo()<=340 && getAncho() <=290) {
            precio = 0+577200 ;
        }
        /*completando septima fila*/
        else if(getLargo()<=100 && getAncho()<=300){
            precio = 0+ 221300;
        }else if (getLargo()<=130 && getAncho() <=300) {
            precio = 0+270700;
        }else if (getLargo()<=145 && getAncho() <=300) {
            precio = 0+286700;
        }else if (getLargo()<=160 && getAncho() <=300) {
            precio = 0+307300;
        }else if (getLargo()<=175 && getAncho() <=300) {
            precio = 0+334700;
        }else if (getLargo()<=190 && getAncho() <=300) {
            precio = 0+355300;
        }else if (getLargo()<=205 && getAncho() <=300) {
            precio = 0+375900;
        }else if (getLargo()<=220 && getAncho() <=300) {
            precio = 0+397200;
        }else if (getLargo()<=235 && getAncho() <=300) {
            precio = 0+450300;
        }else if (getLargo()<=250 && getAncho() <=300) {
            precio = 0+470800;
        }else if (getLargo()<=265 && getAncho() <=300) {
            precio = 0+487900;
        }else if (getLargo()<=280 && getAncho() <=300) {
            precio = 0+512100;
        }else if (getLargo()<=295 && getAncho() <=300) {
            precio = 0+532800;
        }else if (getLargo()<=310 && getAncho() <=300) {
            precio = 0+553100;
        }else if (getLargo()<=325 && getAncho() <=300) {
            precio = 0+573700 ;
        }else if (getLargo()>=326 && getAncho() <=300) {
            precio = 0+593100 ;
        }
        /*completando fila de precios segun 310 de ancho*/
        else if(getLargo()<=100 && getAncho()<=310){
            precio = 0+ 227100;
        }else if (getLargo()<=130 && getAncho() <=310) {
            precio = 0+278000;
        }else if (getLargo()<=145 && getAncho() <=310) {
            precio = 0+294400;
        }else if (getLargo()<=160 && getAncho() <=310) {
            precio = 0+3150600;
        }else if (getLargo()<=175 && getAncho() <=310) {
            precio = 0+343800;
        }else if (getLargo()<=190 && getAncho() <=310) {
            precio = 0+365000;
        }else if (getLargo()<=205 && getAncho() <=310) {
            precio = 0+386200;
        }else if (getLargo()<=220 && getAncho() <=310) {
            precio = 0+408100;
        }else if (getLargo()<=235 && getAncho() <=310) {
            precio = 0+462700;
        }else if (getLargo()<=250 && getAncho() <=310) {
            precio = 0+483800;
        }else if (getLargo()<=265 && getAncho() <=310) {
            precio = 0+501000;
        }else if (getLargo()<=280 && getAncho() <=310) {
            precio = 0+526200;
        }else if (getLargo()<=295 && getAncho() <=310) {
            precio = 0+547400;
        }else if (getLargo()<=310 && getAncho() <=310) {
            precio = 0+568400;
        }else if (getLargo()<=325 && getAncho() <=310) {
            precio = 0+589700 ;
        }else if (getLargo()<=340 && getAncho() <=310) {
            precio = 0+610300 ;
        }
        /*completando fila de precios segun ancho 320*/
        else if(getLargo()<=100 && getAncho()<=320){
            precio = 0+ 232900;
        }else if (getLargo()<=130 && getAncho() <=320) {
            precio = 0+285300;
        }else if (getLargo()<=145 && getAncho() <=320) {
            precio = 0+302100;
        }else if (getLargo()<=160 && getAncho() <=320) {
            precio = 0+323900;
        }else if (getLargo()<=175 && getAncho() <=320) {
            precio = 0+352900;
        }else if (getLargo()<=190 && getAncho() <=320) {
            precio = 0+374700;
        }else if (getLargo()<=205 && getAncho() <=320) {
            precio = 0+399500;
        }else if (getLargo()<=220 && getAncho() <=320) {
            precio = 0+410000;
        }else if (getLargo()<=235 && getAncho() <=320) {
            precio = 0+475000;
        }else if (getLargo()<=250 && getAncho() <=320) {
            precio = 0+496800;
        }else if (getLargo()<=265 && getAncho() <=320) {
            precio = 0+514100;
        }else if (getLargo()<=280 && getAncho() <=320) {
            precio = 0+540400;
        }else if (getLargo()<=295 && getAncho() <=320) {
            precio = 0+562100;
        }else if (getLargo()<=310 && getAncho() <=320) {
            precio = 0+583900;
        }else if (getLargo()<=325 && getAncho() <=320) {
            precio = 0+605700;
        }else if (getLargo()<=340 && getAncho() <=320) {
            precio = 0+626900;
        }
        /*completando decima fila*/
        else if(getLargo()<=100 && getAncho()<=330){
            precio = 0+ 238700;
        }else if (getLargo()<=130 && getAncho() <=330) {
            precio = 0+292500;
        }else if (getLargo()<=145 && getAncho() <=330) {
            precio = 0+309800;
        }else if (getLargo()<=160 && getAncho() <=330) {
            precio = 0+332200;
        }else if (getLargo()<=175 && getAncho() <=330) {
            precio = 0+362000;
        }else if (getLargo()<=190 && getAncho() <=330) {
            precio = 0+384400;
        }else if (getLargo()<=205 && getAncho() <=330) {
            precio = 0+406800;
        }else if (getLargo()<=220 && getAncho() <=330) {
            precio = 0+429900;
        }else if (getLargo()<=235 && getAncho() <=330) {
            precio = 0+487400;
        }else if (getLargo()<=250 && getAncho() <=330) {
            precio = 0+509800;
        }else if (getLargo()<=265 && getAncho() <=330) {
            precio = 0+527200;
        }else if (getLargo()<=280 && getAncho() <=330) {
            precio = 0+554600;
        }else if (getLargo()<=295 && getAncho() <=330) {
            precio = 0+576900;
        }else if (getLargo()<=310 && getAncho() <=330) {
            precio = 0+608300;
        }else if (getLargo()<=325 && getAncho() <=330) {
            precio = 0+621700;
        }else if (getLargo()<=340 && getAncho() <=330) {
            precio = 0+643400;
        }
        /*completando fila de precios segun ancho 340*/
        else if(getLargo()<=100 && getAncho()<=340){
            precio = 0+ 244500;
        }else if (getLargo()<=130 && getAncho() <=340) {
            precio = 0+299800;
        }else if (getLargo()<=145 && getAncho() <=340) {
            precio = 0+317500;
        }else if (getLargo()<=160 && getAncho() <=340) {
            precio = 0+340500;
        }else if (getLargo()<=175 && getAncho() <=340) {
            precio = 0+371100;
        }else if (getLargo()<=190 && getAncho() <=340) {
            precio = 0+394100;
        }else if (getLargo()<=205 && getAncho() <=340) {
            precio = 0+417100;
        }else if (getLargo()<=220 && getAncho() <=340) {
            precio = 0+440800;
        }else if (getLargo()<=235 && getAncho() <=340) {
            precio = 0+499800;
        }else if (getLargo()<=250 && getAncho() <=340) {
            precio = 0+522700;
        }else if (getLargo()<=265 && getAncho() <=340) {
            precio = 0+540300;
        }else if (getLargo()<=280 && getAncho() <=340) {
            precio = 0+568800;
        }else if (getLargo()<=295 && getAncho() <=340) {
            precio = 0+591700;
        }else if (getLargo()<=310 && getAncho() <=340) {
            precio = 0+614700;
        }else if (getLargo()<=325 && getAncho() <=340) {
            precio = 0+637600;
        }else if (getLargo()<=340 && getAncho() <=340) {
            precio = 0+660000;
        }
        /*completando fila de precios segun 350 de ancho*/
        else if(getLargo()<=100 && getAncho()<=350){
            precio = 0+ 252500;
        }else if (getLargo()<=130 && getAncho() <=350) {
            precio = 0+307000;
        }else if (getLargo()<=145 && getAncho() <=350) {
            precio = 0+325200;
        }else if (getLargo()<=160 && getAncho() <=350) {
            precio = 0+370000;
        }else if (getLargo()<=175 && getAncho() <=350) {
            precio = 0+385200;
        }else if (getLargo()<=190 && getAncho() <=350) {
            precio = 0+405000;
        }else if (getLargo()<=205 && getAncho() <=350) {
            precio = 0+425000;
        }else if (getLargo()<=220 && getAncho() <=350) {
            precio = 0+453500;
        }else if (getLargo()<=235 && getAncho() <=350) {
            precio = 0+512000;
        }else if (getLargo()<=250 && getAncho() <=350){
            precio = 0+539700;
        }else if (getLargo()<=265 && getAncho() <=350) {
            precio = 0+553500;
        }else if (getLargo()<=280 && getAncho() <=350) {
            precio = 0+580000;
        }else if (getLargo()<=295 && getAncho() <=350) {
            precio = 0+600000;
        }else if (getLargo()<=310 && getAncho() <=350) {
            precio = 0+630000;
        }else if (getLargo()<=325 && getAncho() <=350) {
            precio = 0+653700;
        }else if (getLargo()<=340 && getAncho() <=350) {
            precio = 0+676600;
        }
        /*completando fila de precios segun ancho 360*/
        else if(getLargo()<=100 && getAncho()<=360){
            precio = 0+ 256200;
        }else if (getLargo()<=130 && getAncho() <=360) {
            precio = 0+314300;
        }else if (getLargo()<=145 && getAncho() <=360) {
            precio = 0+332900;
        }else if (getLargo()<=160 && getAncho() <=360) {
            precio = 0+357100;
        }else if (getLargo()<=175 && getAncho() <=360) {
            precio = 0+389300;
        }else if (getLargo()<=190 && getAncho() <=360) {
            precio = 0+413500;
        }else if (getLargo()<=205 && getAncho() <=360) {
            precio = 0+437700;
        }else if (getLargo()<=220 && getAncho() <=360) {
            precio = 0+462600;
        }else if (getLargo()<=235 && getAncho() <=360) {
            precio = 0+524600;
        }else if (getLargo()<=250 && getAncho() <=360){
            precio = 0+548700;
        }else if (getLargo()<=265 && getAncho() <=360) {
            precio = 0+566600;
        }else if (getLargo()<=280 && getAncho() <=360) {
            precio = 0+597200;
        }else if (getLargo()<=295 && getAncho() <=360) {
            precio = 0+621200;
        }else if (getLargo()<=310 && getAncho() <=360) {
            precio = 0+645400;
        }else if (getLargo()<=325 && getAncho() <=360) {
            precio = 0+669600;
        }else if (getLargo()<=340 && getAncho() <=360) {
            precio = 0+693000;
        }
        /*completando fila de precios segun ancho 370*/
        else if(getLargo()<=100 && getAncho()<=370){
            precio = 0+ 262000;
        }else if (getLargo()<=130 && getAncho() <=370) {
            precio = 0+321600;
        }else if (getLargo()<=145 && getAncho() <=370) {
            precio = 0+340600;
        }else if (getLargo()<=160 && getAncho() <=370) {
            precio = 0+365400;
        }else if (getLargo()<=175 && getAncho() <=370) {
            precio = 0+398400;
        }else if (getLargo()<=190 && getAncho() <=370) {
            precio = 0+423200;
        }else if (getLargo()<=205 && getAncho() <=370) {
            precio = 0+448000;
        }else if (getLargo()<=220 && getAncho() <=370) {
            precio = 0+473500;
        }else if (getLargo()<=235 && getAncho() <=370) {
            precio = 0+536900;
        }else if (getLargo()<=250 && getAncho() <=370){
            precio = 0+561700;
        }else if (getLargo()<=265 && getAncho() <=370) {
            precio = 0+579700;
        }else if (getLargo()<=280 && getAncho() <=370) {
            precio = 0+611400;
        }else if (getLargo()<=295 && getAncho() <=370) {
            precio = 0+636000;
        }else if (getLargo()<=310 && getAncho() <=370) {
            precio = 0+660600;
        }else if (getLargo()<=325 && getAncho() <=370) {
            precio = 0+685600;
        }else if (getLargo()<=340 && getAncho() <=370) {
            precio = 0+709700;
        }
        return precio;
    } 
    
    public int calcularPrecioPorColor(){
        int costo=0;
        if (getColor().equalsIgnoreCase("madera")) {
            costo =((calcularPrecio()*30)/100);
        }else{
        costo = 0;
        }
        return costo;
    }
    public int calcularValorTotalConMotor(){
        int valorMotor =120000;
        int costoTotal=0;
        if (Motor=true) {
          costoTotal=calcularPrecio()+calcularPrecioPorColor()+valorMotor;
        }else if (Motor=false) {
            costoTotal =calcularPrecio()+calcularPrecioPorColor();
        }
        return costoTotal;
    }
    
}
