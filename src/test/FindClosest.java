package test;

import java.util.*;

/**
 * You are on a plane and you can watch two movies during this flight.
 * You are given List<Integer> movieDurations which includes all the movie durations.
 * You are also given duration of the flight which is in d minutes.
 *  Now, you need to pick two movies and the total duration of two movies is less than or equal to (d - 30min).
 *  Find the pair of movies with the longest total duration and return their indexes.
 *  If multiple found, return the pair with longest movie.
 *  Example1:
 *  Input: movieDurations = [90, 85, 75, 60, 120, 150, 125], d = 250
 *  Output: [0, 6]
 *  Explaination: movieDuration[0] + movieDuration[6] = 90 + 125 = 215 is the maximum number within 220 (250 min - 30 min).
 */
public class FindClosest {

    public static void main(String[] args) {

        int [] movieDurations = {90, 85, 75, 60, 120, 150, 125};
        int flightDuration = 250;
        boolean isFound = false;

        TreeSet<Integer> set = new TreeSet<>();
        Map<Integer, List<Integer>> map = new HashMap<>();

        for(int i=0; i< movieDurations.length; i++){
            for (int j=1+1; j< movieDurations.length; j++) {
                int total = movieDurations[i] + movieDurations[j];
                if (total <= (flightDuration - 30)) {
                    set.add(total);
                    map.put(total, new ArrayList<>());

                }
            }
        }
        int closet = set.ceiling(flightDuration);
        map.get(closet);
    }
}
