package org.example;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
class MainTest {

    @Test
    void t1() {
        assertThat(new Polynomial("3 + 3").calc())
                .isEqualTo(6);
    }
    @Test
    void t2() {
        assertThat(new Polynomial("13 + 2").calc())
                .isEqualTo(15);
    }
    @Test
    void t3() {
        assertThat(new Polynomial("3 * 3 + 3").calc())
                .isEqualTo(12);
    }
    @Test
    void t4() {
        assertThat(new Polynomial("4 + 3 * 2 + 1").calc())
                .isEqualTo(11);
    }
//    new Polynomial("3 * 3 + 3").calc()// == 12;
//    new Polynomial("(3 + 3) * 3").calc()// == 18;
}