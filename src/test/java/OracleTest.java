import org.junit.jupiter.api.Test;
import org.testcontainers.containers.OracleContainer;

public class OracleTest {

    @Test
    void startContainerWorks() {
        try (OracleContainer oc = new OracleContainer("gvenzl/oracle-xe")) {
            oc.start();
        }
    }

}
