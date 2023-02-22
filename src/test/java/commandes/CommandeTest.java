package commandes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CommandeTest {
    @Test
    void testCommandeFrancaise() {
        CommandeFrancaise cf = new CommandeFrancaise(1, 50, 5);
        double ttc = cf.getMontantTTC();
        assertEquals(65, ttc);
    }

    @Test
    void testCommandeInternationale() {
        CommandeInternationale ci = new CommandeInternationale(2, 100, "Espagne");
        double ttc = ci.getMontantTTC();
        assertEquals(116, ttc, 0.00000001);
    }
}