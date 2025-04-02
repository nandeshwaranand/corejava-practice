package java17;

import java.util.random.RandomGenerator;

/**
 * Enhances the API for pseudo-random number generation.
 * Provides different types of random number generators.
 * More flexibility for simulations and cryptography.
 */
public class PseudoRandomGenerator {

    public String generateRandom(){
        RandomGenerator rng = RandomGenerator.of("L64X128MixRandom");
        return  String.valueOf(rng.nextInt(100));
    }
}
