package project.Controller.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.Entity.Project;
import project.Repository.ProjectRepository;

@Service
public class ProjectService {

    @Autowired
    private ProjectRepository projectRepository;

    public void saveProject(Project projectObj) {
        projectRepository.save(projectObj);
    }

    public List<Project> getProjectDetails(Long projectId) {
        if (null != projectId) {
            return projectRepository.findAllByProjectId(projectId);
        } else {
            return projectRepository.findAll();
        }
    }

    public void deleteProject(Long projectId) {
        projectRepository.deleteById(projectId);
    }
}


