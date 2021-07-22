import org.junit.jupiter.api.Test;
import org.testcontainers.containers.OracleContainer;

public class OracleTest {

    @Test
    void startContainerWorks() {
        try (OracleContainer oc = new OracleContainer("oracleinanutshell/oracle-xe-11g:1.0.0")) {
            oc.start();
        }
    }

}
