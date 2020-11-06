package com.github.javaherisaber.mockfittoolbox.services

import com.intellij.openapi.project.Project
import com.github.javaherisaber.mockfittoolbox.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
