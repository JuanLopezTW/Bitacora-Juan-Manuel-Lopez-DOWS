package edu.dosw.bitacora.DOSW_Bitacora_JuanLopez.Corte2.Semana1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class AnalisisRendimientoTest {

    private AnalisisRendimiento service;

    @BeforeEach
    void setUp() {
        List<Student> students = List.of(
                new Student("1", "Ana Torres", "NARANJA", List.of(
                        new Grade("DOSW", 4.8, LocalDate.now(), true),
                        new Grade("BD", 3.2, LocalDate.now(), false),
                        new Grade("REDES", 4.5, LocalDate.now(), true)
                )),
                new Student("2", "Carlos Ruiz", "NARANJA", List.of(
                        new Grade("DOSW", 4.6, LocalDate.now(), true),
                        new Grade("BD", 4.9, LocalDate.now(), true),
                        new Grade("REDES", 2.8, LocalDate.now(), false)
                )),
                new Student("3", "Laura Gomez", "AZUL", List.of(
                        new Grade("DOSW", 3.0, LocalDate.now(), false),
                        new Grade("BD", 3.8, LocalDate.now(), true),
                        new Grade("REDES", 3.6, LocalDate.now(), true)
                )),
                new Student("4", "Pedro Mesa", "AZUL", List.of(
                        new Grade("DOSW", 5.0, LocalDate.now(), true),
                        new Grade("BD", 4.7, LocalDate.now(), true),
                        new Grade("REDES", 4.9, LocalDate.now(), true)
                )),
                new Student("5", "Sofia Rios", "VERDE", List.of(
                        new Grade("DOSW", 2.5, LocalDate.now(), false),
                        new Grade("BD", 2.8, LocalDate.now(), false),
                        new Grade("REDES", 3.0, LocalDate.now(), false)
                )),
                new Student("6", "Miguel Vera", "VERDE", List.of(
                        new Grade("DOSW", 3.6, LocalDate.now(), true),
                        new Grade("BD", 3.5, LocalDate.now(), true),
                        new Grade("REDES", 3.7, LocalDate.now(), true)
                ))
        );
        service = new AnalisisRendimiento(students);
    }

    @Test
    void testGetStudentsByTeam() {
        List<Student> result = service.getStudentsByTeam("NARANJA");
        assertEquals(2, result.size());
        assertTrue(result.stream().allMatch(s -> s.team.equals("NARANJA")));
    }

    @Test
    void testGetAlphabeticStudentList() {
        List<String> result = service.getAlphabeticStudenList();
        assertEquals(6, result.size());
        assertEquals("Ana Torres", result.get(0));
        assertEquals("Sofia Rios", result.get(result.size() - 1));
    }

    @Test
    void testGetAverageGeneral() {
        double result = service.getAverageGeneral();
        assertTrue(result > 0);
        assertTrue(result <= 5.0);
    }

    @Test
    void testGetStudentAverageByCourse() {
        Student ana = new Student("1", "Ana Torres", "NARANJA", List.of(
                new Grade("DOSW", 4.8, LocalDate.now(), true),
                new Grade("BD", 3.2, LocalDate.now(), false),
                new Grade("REDES", 4.5, LocalDate.now(), true)
        ));
        Map<String, Double> result = service.getStudentAverageByCourse(ana);
        assertEquals(3, result.size());
        assertEquals(4.8, result.get("DOSW"), 0.01);
        assertEquals(3.2, result.get("BD"), 0.01);
    }

    @Test
    void testGetStudentMaxAverage() {
        Student result = service.getStudentMaxAverage();
        assertNotNull(result);
        assertEquals("Pedro Mesa", result.name);
    }

    @Test
    void testGetReprovedSubjects() {
        Map<String, Long> result = service.getReprovedSubjets();
        assertNotNull(result);
        assertTrue(result.containsKey("NARANJA"));
        assertTrue(result.containsKey("VERDE"));
    }

    @Test
    void testTop3Students() {
        List<Student> result = service.top3Students();
        assertEquals(3, result.size());
        assertTrue(
                result.get(0).grades.stream().filter(g -> g.passed).count() >=
                        result.get(1).grades.stream().filter(g -> g.passed).count()
        );
    }

    @Test
    void testGroupRiskStudent() {
        Map<String, List<Student>> result = service.groupRiskStudent();
        assertNotNull(result);
        assertTrue(result.containsKey("RIESGO"));
        assertTrue(result.containsKey("REGULAR"));
        assertTrue(result.containsKey("ALTO RENDIMIENTO"));
    }

    @Test
    void testMostReprovedAssigned() {
        String result = service.mostReprovedAssiged();
        assertNotNull(result);
        assertTrue(List.of("DOSW", "BD", "REDES").contains(result));
    }

    @Test
    void testPipalinea() {
        LinkedHashMap<String, Double> result = service.pipalinea();
        assertNotNull(result);
        assertFalse(result.isEmpty());

        List<Double> values = new ArrayList<>(result.values());
        assertTrue(values.stream().reduce((a, b) -> {assertTrue(a >= b); //verificar ue los promedios sean desendentes por duplas
            return b;
            }).isPresent()
                //present para que se verifique que almenos hay un eemento en la lista
        );
    }
}
