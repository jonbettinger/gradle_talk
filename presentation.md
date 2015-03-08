# Introduction to <img src='images/gradle_logo.png' style='border:none'/>
## Jon Bettinger


---

# My history with build scripts - ant, gant, gradle

Notes: Some note goes here

---

# Polls
## Poll: Who is familiar with ant?
## Poll: Who is familiar with maven?
## Poll: Who is familiar with gradle?
## Poll: Who is familiar with groovy?

---

# Installing

---

# The wrapper

---

# The power of ant

---

# The problems of ant
* Not DRY
    * Tasks have few defaults
    * Task dependencies are always explicit
    * No default tasks
    * Which version of ant?
* Dependency management
* IDE integration lacking (classpath)
* XML as code !! 

---

# Projects and tasks
- Tasks dependencies

---

# DEMO: Simple tasks

---

- Using Ant tasks
- Dynamic tasks
- Marker tasks (like ant targets)

---

# The DRY of maven, aka convention over configuration

---

# Java plugin

---

# War plugin

---

# Dependency management
- ivy
- maven
- directory
---
Gradle lifecycle
--
## Initialization 
Gradle supports single and multi-project builds. During the initialization phase, Gradle determines which projects are going to take part in the build, and creates a Project instance for each of these projects.
--
## Configuration
During this phase the project objects are configured. The build scripts of all projects which are part of the build are executed. 
--
## Execution
Based on the task name arguments passed, Gradle determines the subset of the tasks. Gradle then executes each of the selected tasks.
---
Customizing
--
Settings file
--
Init scripts
---
Lifecycle listening
---
# Multi-project builds
Notes: My notes about multip project builds
---
# Custom Plugins
## Heading 2
### Heading 3
#### Heading 4?

---
# Conversion from ...
Ant
Maven
