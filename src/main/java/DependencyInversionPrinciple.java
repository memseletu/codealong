import java.util.List;

public class DependencyInversionPrinciple {
    //abstraction should not depend on details, details should depend on abstraction.
    //This principle seeks to "invert" the conventional notion that high level modules
    // in software should depend upon the lower level modules. The principle states that high level or low level modules should not depend upon each other, instead they should depend upon abstractions.
    //splts dependency by introducing abstraction and interfaces.

    public class CustomerService {

        private final CustomerRepository customerDao;

        public CustomerService(CustomerRepository customerDao) {
            this.customerDao = customerDao;
        }

    }

    public interface CustomerRepository {
        List<String> findNames();
    }

    //low levels
    public class MySqlImpl implements CustomerRepository {

        @Override
        public List<String> findNames() {
            return List.of("pedro", "luiz");
        }
    }


        public class PostgreSqlImpl implements CustomerRepository {

            @Override
            public List<String> findNames() {
                return List.of("pedro", "luiz");
            }
        }

}



