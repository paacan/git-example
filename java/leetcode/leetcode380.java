package leetcode;

import java.util.*;
//https://leetcode.com/problems/insert-delete-getrandom-o1/?envType=study-plan-v2&envId=top-interview-150

public class leetcode380 {
    class RandomizedSet {
        private Map<Integer,Integer> mapa;
        private List<Integer> values;
        private Random rand;

        public RandomizedSet() {
            rand = new Random();
            values = new ArrayList<>();
            mapa = new HashMap<>();

        }

        public boolean insert(int val) {
            if (mapa.containsKey(val)) {
                return false;
            }
            else {
                mapa.put(val , mapa.size());
                values.add(val);
                return true;
            }

        }

        public boolean remove(int val) {
            if (mapa.containsKey(val)) {

                int index = mapa.get(val);

                int lastElement = values.get(values.size() - 1);
                values.set(index, lastElement);
                mapa.put(lastElement, index);
                values.remove(values.size() - 1);
                mapa.remove(val);
                return true;
            }
            else {
                return false;
            }
        }

        public int getRandom() {
            return values.get(rand.nextInt(values.size()));
        }
    }
    }

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */
