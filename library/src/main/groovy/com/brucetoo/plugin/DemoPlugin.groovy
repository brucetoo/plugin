package com.brucetoo.plugin

import org.gradle.api.Plugin
import org.gradle.api.Project

class DemoPlugin implements Plugin<Project> {

    @Override
    void apply(Project project) {

        project.task('hello') {
            doLast {
                println "Hello World from the DemoPlugin"
            }
        }
    }
}
