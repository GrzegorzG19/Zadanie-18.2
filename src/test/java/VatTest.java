import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class VatTest {
    @Test
    public void shouldReturn14838() {
        System.out.printf("Podatek z kwoty 85527 to %.02f \n", Vat.vat(85527));

        Assertions.assertThat(Vat.vat(85526)).isEqualTo(14838.66);
    }

    @Test
    public void shouldReturn15395() {
        System.out.printf("Podatek z kwoty 85529 to %.02f \n", Vat.vat(85529));
        Assertions.assertThat(Vat.vat(85529)).isEqualTo(15395.36);
    }

    @Test
    public void shouldReturn29626() {
        System.out.printf("Podatek z kwoty 130000 to %.02f \n", Vat.vat(130000));
        Assertions.assertThat(Vat.vat(130000)).isEqualTo(29626.08);
    }
}
