import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Animal []  animals ={
                new Shark("shark"),
                new Shark("delphin"),
                new Shark("kit"),


                new Eagle("crow"),
                new Eagle("eagle"),
                new Eagle("owl"),


                new Turtle("a snake"),
                new Turtle("habitat"),
                new Turtle("kemp")

        };
        int counterShark =0;
        int counterEagle =0;
        int counterTurtle =0;
        for (Animal animal1 : animals) {
            System.out.println(animal1);
            if (animal1 instanceof Shark){
                ((Shark)animal1).attack();
                counterShark++;
            }else if (animal1 instanceof Eagle){
                ((Eagle) animal1).fly();
                counterShark++;
            }else if (animal1 instanceof Turtle){
                ((Turtle) animal1).swim();
                counterShark++;
            }
        }
        Shark[] shark = new Shark[counterShark];
        Eagle[] eagles = new Eagle[counterEagle];
        Turtle[] turtles = new Turtle[counterTurtle];

        for (int i = 0; i < animals.length; i++) {
            for (int j = 0; j < shark.length; j++) {
                if (animals [i]  instanceof Shark)
                    shark [i]= (Shark) animals [i];


                for (int k = 0; k < eagles.length; k++) {
                    for (int l = 0; l < eagles.length; l++) {
                        if (animals [i] instanceof Eagle)
                            eagles [i]= (Eagle) animals [i];

                        for (int m = 0; m < turtles.length; m++) {
                            for (int n = 0; n < turtles.length; n++) {
                                if (animals [i] instanceof  Turtle)
                                    turtles [i]= (Turtle) animals [i];

                            }

                        }
                        System.out.println(Arrays.toString(shark));
                        System.out.println(Arrays.toString(eagles));
                        System.out.println(Arrays.toString(turtles));

                    }

                }

            }
        }

    }
}