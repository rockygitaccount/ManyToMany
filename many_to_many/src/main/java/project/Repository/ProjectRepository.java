package project.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import project.Entity.Project;

public interface ProjectRepository extends JpaRepository<Project, Long> {
	 List<Project> findAllByProjectId(long projectId);

}
