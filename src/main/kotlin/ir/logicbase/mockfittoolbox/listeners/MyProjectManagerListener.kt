package ir.logicbase.mockfittoolbox.listeners

import com.intellij.openapi.components.service
import com.intellij.openapi.project.Project
import com.intellij.openapi.project.ProjectManagerListener
import ir.logicbase.mockfittoolbox.services.MyProjectService

internal class MyProjectManagerListener : ProjectManagerListener {

    override fun projectOpened(project: Project) {
        project.service<MyProjectService>()
    }
}
