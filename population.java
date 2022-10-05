import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

class Main {
    HashMap<Integer, ArrayList<Integer>> population = new HashMap<Integer, ArrayList<Integer>>();
    HashMap<Integer, Integer> result = new HashMap<>();
    public static void main(String[] args) {
        Main mainobj = new Main();
        mainobj.initiate();
    }
    void initiate()
    {
        int count = 0, maxcount = 0;
        loadPopulation();
        for(int i=1900;i<=2000;i++) {
            count =0;
            for (Map.Entry<Integer, ArrayList<Integer>> populationmap : population.entrySet()) {
                if(populationmap.getKey() >=1 && populationmap.getKey() <=10) {
                    if (i >= populationmap.getValue().get(0) && i <= populationmap.getValue().get(1))
                            count++;
                }
            }
            result.put(i,count);
        }

printResult();
    }
    void loadPopulation()
    {
        ArrayList<Integer> ar1 = new ArrayList();
        ar1.add(1901);
        ar1.add(1910);
        population.put(1,ar1);
        ArrayList<Integer> ar2 = new ArrayList<>();
        ar2.add(1910);
        ar2.add(1915);
        population.put(2,ar2);
        ArrayList<Integer> ar3 = new ArrayList<>();
        ar3.add(1910);
        ar3.add(1912);
        population.put(3,ar3);
        ArrayList<Integer> ar4 = new ArrayList<>();
        ar4.add(1910);
        ar4.add(1920);
        population.put(4,ar4);
        ArrayList<Integer> ar5 = new ArrayList<>();
        ar5.add(1920);
        ar5.add(1925);
        population.put(5,ar5);
        ArrayList<Integer> ar6 = new ArrayList<>();
        ar6.add(1910);
        ar6.add(1980);
        population.put(6,ar6);
        ArrayList<Integer> ar7 = new ArrayList<>();
        ar7.add(1910);
        ar7.add(1970);
        population.put(7,ar7);
        ArrayList<Integer> ar8 = new ArrayList<>();
        ar8.add(1905);
        ar8.add(1906);
        population.put(8,ar8);
        ArrayList<Integer> ar9 = new ArrayList<>();
        ar9.add(1912);
        ar9.add(1915);
        population.put(9,ar9);
        ArrayList<Integer> ar10 = new ArrayList<>();
        ar10.add(1989);
        ar10.add(2000);
        population.put(10,ar10);
    }
    void printResult() {
        int year;
        int count = 0, maxcount = 0;
        for (Map.Entry<Integer, Integer> mapresult : result.entrySet()) {
            count = mapresult.getValue();
            if (count > maxcount) {
                maxcount = count;
            }
            System.out.println(mapresult.getKey() + "-" + mapresult.getValue());
        }
        System.out.println("Maximum count = " + maxcount);

        for (Map.Entry<Integer, Integer> finalresult : result.entrySet()) {
            if(finalresult.getValue() == maxcount)
            {
                System.out.println(finalresult.getKey());
            }
        }
    }

    }
