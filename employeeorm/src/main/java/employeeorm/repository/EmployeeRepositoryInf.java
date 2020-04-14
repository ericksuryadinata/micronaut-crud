package employeeorm.repository;

import java.util.List;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.NotBlank;
import employeeorm.model.Employee;

public interface EmployeeRepositoryInf {
    Long size();
    List<Employee> findAll(int page, int limit);
    Employee findById(@NotNull Long id);
    int update(@NotNull Long id,@NotBlank String name);
    // Materi save(@NotNull String kodeMateri, @NotNull String namaMateri);
    // Employee save(@NotNull Employee employee);
    // Employee update(@NotNull Employee employee);
    // void deleteById(@NotNull Long id);
}
