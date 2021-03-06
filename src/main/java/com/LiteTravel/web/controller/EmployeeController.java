// 教程Controller案例，当前网站不需要
package com.LiteTravel.web.controller;

import com.LiteTravel.web.mapper.EmployeeMapper;
import com.LiteTravel.web.Model.Department;
import com.LiteTravel.web.Model.Employee;
import com.LiteTravel.web.mapper.DepartmentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
@Controller
public class EmployeeController {
    @Autowired
    EmployeeMapper employeeMapper;

    @Autowired
    DepartmentMapper departmentMapper;

    @GetMapping("/emps")
    public String list(ModelMap model){
        Collection<Employee> employees = employeeMapper.getEmployees();
        model.addAttribute("emps", employees);
        return "emp/list";
    }

    //
    @GetMapping("/emp")
    public String toAddPage(ModelMap model){
        model.addAttribute("depts", departmentMapper.getDepartments());
        return "emp/add";
    }

    @PostMapping("/emp")
    public String insertEmployee(Employee employee) {
        if (employee.getId() == null) {
            employeeMapper.InsertEmployee(employee);
            System.out.println("保存成功:" + employee);
        }
        return "redirect:/emps";
    }

    //
    @GetMapping("/emp/{id}")
    public String toEditPage(@PathVariable("id") Integer id, ModelMap model){
        Collection<Department> departments = departmentMapper.getDepartments();
        model.addAttribute("depts",departments);
        Employee employee = employeeMapper.getEmployeeById(id);
        model.addAttribute("emp",employee);
        return "emp/add";
    }

    //在springboot2.0后，需要配置spring.mvc.hiddenmethod.enabled = true(默认为false), put和delete请求才能生效
    @PutMapping("/emp")
    public String updateEmployee(Employee employee){
        employeeMapper.updateEmployee(employee);
        System.out.println("修改成功:" + employee);
        return "redirect:/emps";
    }


    //delete请求也失效了。
    @DeleteMapping("/emp/{id}")
    public String deleteEmployee(@PathVariable("id") Integer id) {
        employeeMapper.deleteEmployee(id);
        return "redirect:/emps";
    }
}
