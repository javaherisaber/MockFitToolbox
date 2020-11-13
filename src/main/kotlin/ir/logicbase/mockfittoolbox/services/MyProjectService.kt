package ir.logicbase.mockfittoolbox.services

import com.intellij.openapi.project.Project
import ir.logicbase.mockfittoolbox.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
