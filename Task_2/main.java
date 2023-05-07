package Task_2;
import java.util.ArrayList;
//Заполнить список названиями планет Солнечной системы в произвольном порядке с повторениями. 
//Вывести название каждой планеты и количество его повторений в списке.
public class main {
    public static void main (String [] args) {
        ArrayList<String>  planets = new ArrayList<>();
        planets.add ("Меркурий");
        planets.add ("Земля");
        planets.add ("Марс");
        planets.add ("Венера");
        planets.add ("Сатурн");
        planets.add ("Юпитер");
        planets.add ("Плутон");
        planets.add ("Нептун");
        planets.add ("Меркурий");
        for (String planet : planets) {
            int count =0;
            for (String p : planets) {
                if (planet.equals(p)){
                    count++;
                    
                }

            }
            System.out.printf("%s-%d%n", planet , count);
        }
    }
        
    }  
