package com.underworld.dao;

import com.underworld.pojo.Department;
import com.underworld.pojo.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

//员工Dao
@Repository
public class EmployeeDao {

    //模拟数据中的数据
    private static Map<Integer, Employee> employeesMap = null;
    //员工有所属的部门
    @Autowired
    private DepartmentDao departmentDao;

    static{
        employeesMap = new HashMap<Integer, Employee>();//创建一个部门表
        employeesMap.put(1001,new Employee(1001,"AA","2724650486@qq.com",1,new Department(101,"教学部")));
        employeesMap.put(1002,new Employee(1002,"BB","272465048@qq.com",0,new Department(101,"市场部")));
        employeesMap.put(1003,new Employee(1003,"CC","27246504@qq.com",1,new Department(101,"教研部")));
        employeesMap.put(1004,new Employee(1004,"DD","2724650@qq.com",0,new Department(101,"运营部")));
        employeesMap.put(1005,new Employee(1005,"EE","272465@qq.com",1,new Department(101,"后勤部")));
    }
    //主键自增！
    private static Integer initId = 1006;
    //增加一个员工
    public void save(Employee employee){
        if(employee.getId() == null){
            employee.setId(initId++);
        }
        employee.setDepartment(departmentDao.getDepartmentById(employee.getDepartment().getId()));
        employeesMap.put(employee.getId(),employee);
    }

    //查询全部员工的信息
    public Collection<Employee> getAll(){
        return employeesMap.values();
    }

    //通过ID查询员工publi
    public Employee getEmployeeById(Integer id){
        return employeesMap.get(id);
    }

    //通过Id删除员工
    public void delete(Integer id){
        employeesMap.remove(id);
    }
}