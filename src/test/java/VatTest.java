import org.junit.jupiter.api.Test;

public class VatTest {
    @Test
    public void shouldReturn14838() {
        System.out.printf("Podatek z kwoty 85527 to %.02f \n", Vat.vat(85527));
    }

    @Test
    public void shouldReturn15395() {
        System.out.printf("Podatek z kwoty 85529 to %.02f \n", Vat.vat(85529));
    }

    @Test
    public void shouldReturn29626() {
        System.out.printf("Podatek z kwoty 130000 to %.02f \n", Vat.vat(130000));
    }
}
