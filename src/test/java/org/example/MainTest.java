package org.example;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
class MainTest {

    @Test
    @DisplayName("3 + 3 == 6")
    void t1() {
        assertThat(new Polynomial("3 + 3").calc())
                .isEqualTo(6);
    }
    @Test
    @DisplayName("13 + 2 == 15")
    void t2() {
        assertThat(new Polynomial("13 + 2").calc())
                .isEqualTo(15);
    }
    @Test
    @DisplayName("3 * 3 + 3")
    void t3() {
        assertThat(new Polynomial("3 * 3 + 3").calc())
                .isEqualTo(12);
    }
    @Test
    void t4() {
        assertThat(new Polynomial("4 + 3 * 2 + 1").calc())
                .isEqualTo(11);
    }

    @Test
    @DisplayName("2 - 1")
    void t6() {
        assertThat(new Calc().run("2 - 1")).isEqualTo(1);
    }

    @Test
    @DisplayName("10 + 20 + 30 == 60")
    void t7() {
        assertThat(new Calc().run("10 + 20 + 30")).isEqualTo(60);
    }

    @Test
    @DisplayName("10 - 20 + 30 == 20")
    void t8() {
        assertThat(new Calc().run("10 - 20 + 30")).isEqualTo(20);
    }
    @Test
    @DisplayName("10 - 10 - 10 - 10 + 10 + 10 - 10 == -10")
    void t9() {
        assertThat(new Calc().run("10 - 10 - 10 - 10 + 10 + 10 - 10")).isEqualTo(-10);
    }

    @Test
    @DisplayName("10 * 10 * 10 == 1000")
    void t10() {
        assertThat(new Calc().run("10 * 10 * 10")).isEqualTo(1000);
    }

    @Test
    @DisplayName("10 + 2 * 3 == 16")
    void t11() {
        assertThat(new Calc().run("10 + 2 * 3")).isEqualTo(16);
    }

    @Test
    @DisplayName("10 * 20 + 10 + 5 * 2 == 220")
    void t12() {
        assertThat(new Calc().run("10 * 20 + 10 + 5 * 2")).isEqualTo(220);
    }
//    new Polynomial("3 * 3 + 3").calc()// == 12;
//    new Polynomial("(3 + 3) * 3").calc()// == 18;
}