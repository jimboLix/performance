package chzu.performance.mapper;

import java.util.List;

import chzu.performance.entity.Resources;
import chzu.performance.entity.Role;


public interface RoleMapper {
	public List<Role> findAll();
	public List<Resources> findAllByPage();
}