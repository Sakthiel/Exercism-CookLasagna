public class Lasagna {
    // TODO: define the 'expectedMinutesInOven()' method
            public int expectedMinutesInOven(){
                return 40;
            }
    // TODO: define the 'remainingMinutesInOven()' method
          public int remainingMinutesInOven(int timePassed){
                int totalTime = 40;
                return totalTime - timePassed;
            }
    // TODO: define the 'preparationTimeInMinutes()' method
            public int preparationTimeInMinutes(int layers){
                int timePerLayer = 2;
                return layers * timePerLayer;
            }
    // TODO: define the 'totalTimeInMinutes()' method
             public int totalTimeInMinutes(int layers , int timeInOven){
                int timePerLayer = 2;
                 int totalTime = layers * timePerLayer + timeInOven ;
                 return totalTime;
            }
}
