package Main;

import static org.junit.jupiter.api.Assertions.*;

class AlunosTest {

    @org.junit.jupiter.api.Test
    void testmediafinal() {
        Alunos nome = new Alunos("nome");
        nota1(8);
        nota2(10);
        assertEquals(9,mediafinal());
    }

}