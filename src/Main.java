import model.lengthConverter;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        System.out.println("Jaka jednostka wprowadzona?");
        System.out.println("Metr - 1");
        System.out.println("Kilometr - 2");
        System.out.println("Decymetr - 3");
        System.out.println("Centrymetr - 4");
        System.out.println("Cal - 5");
        System.out.println("Mikron - 6");
        System.out.println("Stopa - 7");
        System.out.println("Jard - 8");
        System.out.println("Sążeń - 9");
        System.out.println("Mila - 10");
        System.out.println("Mila Morska - 11");
        System.out.println("Kabel - 12");
        Scanner scanner = new Scanner(System.in);

        int startUnit = scanner.nextInt();
        double unitToMeter;
        String shortUnit;
        scanner.nextLine();


        switch (startUnit) {
            case 1:
                unitToMeter = 1;
                shortUnit = "m";
                break;
            case 2:
                unitToMeter = 1000;
                shortUnit = "km";
                break;
            case 3:
                unitToMeter = 0.1;
                shortUnit = "dm";
                break;

            case 4:
                unitToMeter = 0.01;
                shortUnit = "cm";
                break;

            case 5:
                unitToMeter = 0.0254;
                shortUnit = "in";
                break;

            case 6:
                unitToMeter = 0.000001;
                shortUnit = "µ";
                break;
            case 7:
                unitToMeter = 0.3048;
                shortUnit = "ft";
                break;
            case 8:
                unitToMeter = 0.9144;
                shortUnit = "yd";
                break;
            case 9:
                unitToMeter = 1.8288;
                shortUnit = "fm";
                break;
            case 10:
                unitToMeter = 1609.344;
                shortUnit = "mile";
                break;
            case 11:
                unitToMeter = 1852;
                shortUnit = "n mile";
                break;
            case 12:
                unitToMeter = 185.2;
                shortUnit = "kabel";
                break;
            default:
                unitToMeter = 1;
                shortUnit = "m";

        }

        System.out.println("Na jaką jednostkę przekształcić?");
        System.out.println("Metr - 1");
        System.out.println("Kilometr - 2");
        System.out.println("Decymetr - 3");
        System.out.println("Centrymetr - 4");
        System.out.println("Mikron - 5");
        System.out.println("Cal - 6");
        System.out.println("Stopa - 7");
        System.out.println("Jard - 8");
        System.out.println("Sążeń - 9");
        System.out.println("Mila - 10");
        System.out.println("Mila Morska - 11");
        System.out.println("Kabel - 12");

        int outUnit = scanner.nextInt();
        scanner.nextLine();
        double meterToOutpuUnit;
        String shortOutputUnit;

        switch (outUnit) {
            case 1:
                meterToOutpuUnit = 1;
                shortOutputUnit = "m";
                break;

            case 2:
                meterToOutpuUnit = 1 / 1000;
                shortOutputUnit = "km";
                break;
            case 3:
                meterToOutpuUnit = 1 / 0.1;
                shortOutputUnit = "dm";
                break;
            case 4:
                meterToOutpuUnit = 1 / 0.01;
                shortOutputUnit = "cm";
                break;
            case 5:
                meterToOutpuUnit = 1/0.0254;
                shortOutputUnit = "in";
                break;
            case 6:
                meterToOutpuUnit = 1 / 0.0254;
                shortOutputUnit = "µ";
                break;
            case 7:
                meterToOutpuUnit = 1 / 0.3048;
                shortOutputUnit = "ft";
                break;
            case 8:
                meterToOutpuUnit = 1 / 0.9144;
                shortOutputUnit = "yd";
                break;
            case 9:
                meterToOutpuUnit = 1 / 1.8288;
                shortOutputUnit = "fm";
                break;
            case 10:
                meterToOutpuUnit = 1 / 1609.344;
                shortOutputUnit = "mile";
                break;
            case 11:
                meterToOutpuUnit = 1 / 1852;
                shortOutputUnit = "n mile";
                break;
            case 12:
                meterToOutpuUnit = 1 / 185.2;
                shortOutputUnit = "kabel";
                break;
            default:
                meterToOutpuUnit = 1;
                shortOutputUnit = "m";

        }

        System.out.println("Podaj wejściową ilość");
        double inputAmount = scanner.nextInt();
        scanner.nextLine();
        calc(unitToMeter,meterToOutpuUnit,inputAmount,shortUnit,shortOutputUnit);


    }
        public static void calc(double unitToBasicUnit, double basicUnitToOutpuUnit, double inputAmount, String shortUnit, String shortOutputUnit){

        double wynik=(inputAmount*unitToBasicUnit)*basicUnitToOutpuUnit;


            System.out.println("Wprowadzono: "+inputAmount+shortUnit+", ");
            System.out.println("co daje "+wynik+shortOutputUnit);

        }




        /*
        double metr = 1;
        double kilometr = 1000; //metrów
        double decymetr = 0.1; //metrów
        double centymetr = 0.01;  //metrów
        double mikron = 0.000001;  //metrów
        double cal = 0.0254; //metrów
        double stopa = 0.3048; //metrów
        double jard = 0.9144; //metrów
        double sązen = 1.8288;  //metrów
        double mila = 1609.344;  //metrów
        double milaMorska = 1852;  //metrów
        double kabel = 185.2;  //metrów
   */

    }

