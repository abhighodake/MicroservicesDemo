//package com.microservicesspring.demo.department;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.function.Predicate;
//
//import org.springframework.stereotype.Service;
//
//@Service
//public class DepartmentService {
//
//    public static List<Department> list = new ArrayList<>(
//        List.of(
//            new Department(1L, "It", "Pune", "1234"),
//            new Department(2L, "CS", "Mumbai", "234"),
//            new Department(3L, "AIDS", "Baramati", "345")
//        )
//    );
//
//    public Department getDepartmentById(Long id) {
//        Predicate<Department> predicate = depa -> depa.getDepartmentId().equals(id);
//        return list.stream().filter(predicate).findFirst().orElse(null);
//    }
//
//    public boolean save(Department department) {
//        return list.add(department);
//    }
//}
