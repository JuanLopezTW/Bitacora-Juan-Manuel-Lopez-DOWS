package edu.dosw.bitacora.DOSW_Bitacora_JuanLopez.Corte2.Semana1;

import java.util.*;
import java.util.stream.Collectors;

public class AnalisisRendimiento {
    private List<Student> students;

    AnalisisRendimiento(List<Student> students){
        this.students = students;
    }

    public List<Student> getStudentsByTeam(String team) {
        List<Student> studentsByTeam = students.stream()
                .filter(s -> s.team.equals("NARANJA"))
                .toList();
        return studentsByTeam;
    }

    public List<String> getAlphabeticStudenList(){
        List<String> AlphabeticStudens = students.stream()
                .map(s -> s.name)
                .sorted()
                .toList();

        return AlphabeticStudens;
    }

    public  double getAverageGeneral(){
        double courseAverage = students.stream()
                .flatMap(s -> s.grades.stream())
                .mapToDouble(s -> s.score)
                .average()
                .orElse(0.0); //si la lista llega a estar vacia devolvera 0 :D
        return courseAverage;
    }

    public Map<String,Double> getStudentAverageByCourse(Student student) {
        Map<String,Double> studentAverageByCourse = student.grades.stream()
                .collect(Collectors.groupingBy(s -> s.subject,Collectors.averagingDouble(s -> s.score)));
        return studentAverageByCourse;
    }

    public Student  getStudentMaxAverage(){
        Student studenMax = students.stream()
                .max(Comparator.comparingDouble(s -> s.grades.stream().mapToDouble(g -> g.score)
                        .average().orElse(0.0)))
                .orElseThrow(); //para que el java no moleste en caso de que la lista de estudiantes este vacia
        return studenMax;
    }

    public Map<String, Long>  getReprovedSubjets(){
        Map<String, Long> reprovedTeam = students.stream()
                .flatMap(s -> s.grades.stream()
                .filter(g -> !g.passed)
                .map(g -> s.team))
                .collect(Collectors.groupingBy(team -> team, Collectors.counting()));

                return reprovedTeam;
    }


    public List<Student> top3Students(){
        List<Student> top = students.stream()
                .sorted(Comparator.comparingLong((Student s) -> s.grades.stream()
                                .filter(g -> g.passed)
                                .count())
                        .reversed())
                .limit(3)
                .toList();
        return top;
    }

    public Map<String, List<Student>> groupRiskStudent(){
        Map<String, List<Student>> riskgroup = students.stream()
                .collect(Collectors.groupingBy(s ->{
                    double promedio = s.grades.stream().mapToDouble(g -> g.score).average().orElse(0.0);

                    if (promedio >= 4.5)
                        return "ALTO RENDIMIENTO";
                    else if (promedio >= 3.5)
                        return "REGULAR";
                    else
                        return "RIESGO";
                    }));
        return riskgroup;
    }

    public String mostReprovedAssiged(){
        String mostReproAssi =students.stream()
                                .flatMap(s -> s.grades.stream())
                                .filter(g -> !g.passed)
                                .collect(Collectors.groupingBy(g -> g.subject, Collectors.counting()))
                                .entrySet().stream()
                                .max(Map.Entry.comparingByValue())
                                .map(Map.Entry::getKey)
                                .orElseThrow();
        return mostReproAssi;
    }

    public LinkedHashMap pipalinea(){
        LinkedHashMap pipe = students.stream()
                .filter(s -> s.team.equals("NARANJA"))
                .flatMap(s -> s.grades.stream())
                .filter(g -> g.passed)
                .collect(Collectors.groupingBy(g -> g.subject, Collectors.averagingDouble(g -> g.score)))
                .entrySet().stream()
                .sorted(Map.Entry.<String, Double>comparingByValue().reversed())
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (e1, e2) -> e1,
                        LinkedHashMap::new
                ));
        return pipe;
    }
}
