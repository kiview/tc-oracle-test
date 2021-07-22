import org.junit.jupiter.api.Test;
import org.testcontainers.containers.OracleContainer;

public class OracleTest {

    @Test
    void startContainerWorks() {

        String oracleImage = "gvenzl/oracle-xe";
        String password = "foobar";

        try (
//                OracleContainer oc = new OracleContainer(oracleImage)
//                .withPassword(password)
//                .withEnv("ORACLE_PASSWORD", password)
                OracleContainer oc = new OracleContainer("oracleinanutshell/oracle-xe-11g")
                .withEnv("ORACLE_ALLOW_REMOTE", "true")
        ) {
            oc.start();
        }
    }

}
