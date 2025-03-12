package io.zipcoder;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.Assert;
import io.zipcoder.Account;
import io.zipcoder.PersonAcct;
import io.zipcoder.BusinessAcct;


public class AccountTest {
    /// TESTS NEEDED:
    /// constructors for personAcct and businessAcct
    /// setter

    @BeforeEach
    void setUp() {
        PersonAcct person1 = new PersonAcct("Mary", 5582, "Watson", "mjWatson@gmail.com", "555-555-5555");
        PersonAcct person2 = new PersonAcct("John", 1979, "Smith", "jsmith23@gmail.com");
        PersonAcct person3 = new PersonAcct("Lily", 4382, "Jameson");
        BusinessAcct business1 = new BusinessAcct("Totally Not A Front", 4379);
        BusinessAcct business2 = new BusinessAcct("Also Not A Front", 9385);
    }

}
