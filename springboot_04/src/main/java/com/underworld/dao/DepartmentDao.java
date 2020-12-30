package com.underworld.dao;

import com.underworld.pojo.Department;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

//部门表
@Repository
public class DepartmentDao {

    //模拟数据库中的数据
    private static Map<Integer,Department> deprecatedMap = null;

    static{
        deprecatedMap = new HashMap<>();//创建一个部门表
        deprecatedMap.put(101,new Department(101,"学习部"));
        deprecatedMap.put(101,new Department(101,"市场部"));
        deprecatedMap.put(101,new Department(101,"教研部"));
        deprecatedMap.put(101,new Department(101,"运营部"));
        deprecatedMap.put(101,new Department(101,"后勤部"));
    }

    //获取所有部门信息哦
    public Collection<Department> getDepartments(){
        return deprecatedMap.values();
    }

    //通过id得到部门
    public Department getDepartmentById(Integer id){
        return deprecatedMap.get(id);
    }
}
