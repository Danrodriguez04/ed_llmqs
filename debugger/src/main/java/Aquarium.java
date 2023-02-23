import java.util.*;
public class Aquarium {

        private ArrayList<Fish> fish;

        public static void main (String[]args) {

            var aquarium = new Aquarium();
            for (int i = 0 ; i < 1000; i++){
                System.out.println(aquarium.getFish());
            }

        }

        private ArrayList<Fish> getFish() {
           //if (fish == null) initFish();
            initFish();
            return fish;
        }

        private void initFish() {
            fish = new ArrayList<>(Arrays.asList(
                    new Fish("Bubbles"),
                    new Fish("Calypso"),
                    new Fish("Dory")
            ));

            int max = 10;
            int min = 0;
            int range = max - min + 1 ;
            int rand = (int) (Math.random() * range) + min;

            for (int i=0; i<=rand; i++){
                fish.add(new Fish("nemo" + i));
            }

        }


        class Fish {
            private String name;

            Fish(String name) {
                this.name = name;
            }

            public String toString() {
                return name;
            }
        }

    }
