# An Archetype for React Web Projects

Archetypes act as templates for new Maven projects, taking care of the most tedious and repetitive tasks for the user, who can just begin coding a pre-configured project.

In this case this Archetype creates a generic Maven-based library which includes various common and useful plugins and utilities, and also comes ready for a full development cycle using [Github Workflow](https://docs.github.com/en/actions/configuring-and-managing-workflows) for CI, [Github](https://github.com/) for SCM, and both [Github Packages](https://github.com/features/packages) and [OSS Sonatype](https://oss.sonatype.org/) as the code repositories.

## Features

- Creates the base for a [Spring MVC][spring-mvc] project.
- [Liquibase][liquibase] for database versioning.
- [Archetype parent POM][parent-pom] and [Bernardo MG's Base POM][base-pom] used as parent POMs.
- [Unit and integration test][tests] suites are run separatedly with the use of [JUnit][junit].
- [Maven site for the project][site], using the [Docs Maven Skin][docs-skin], for creating a small documentation site.
- [Javadocs][site-javadoc] included in the Maven site.
- [Several useful reports][site-reports] added to the Maven site.
- [Changes log][changes] added to the Maven site.
- [Ready to make use of Github Workflow][github-workflow] for testing and deployment.
- [Deployment][deployment] covers both artifacts and documentation site.
- [Deployment scripts][deployment-scripts] making a distinction between release and development versions.
- The artifact manifest is fully configured.
- A basic readme template.
- .gitignore and .gitattributes files prepared for common uses.
- [MIT License][license].

## Example Project

For a quick taste, there is an [example project][example-project] showing what can be created with the use of this Archetype.

## Commands for the New Project

From the first moment the a new project is created all the usual Maven commands can be used, some of these are:

|Command|Usage|
|---|---|
|mvn clean package|Creating the jar file|
|mvn clean install|Installing the project to the local repository|
|mvn clean unit|Running only unit tests|
|mvn clean verify|Running unit and integration tests|
|mvn clean verify site|Generating the Maven site and all the report|


[parent-pom]: https://github.com/Bernardo-MG/archetype-pom
[docs-skin]: https://github.com/Bernardo-MG/docs-maven-skin
[example-project]: https://github.com/Bernardo-MG/spring-web-service-maven-archetype-example

[liquibase]: http://www.liquibase.org/
[spring-mvc]: https://spring.io/
[junit]: http://junit.org

[license]: ./license.html

[deployment]: ./deployment.html
[deployment-scripts]: ./deployment.html#scripts
[changes]: ./changes.html
[site]: ./site.html
[site-javadoc]: ./site.html#javadocs
[site-reports]: ./site.html#reports
[tests]: ./tests.html
[github-workflow]: ./ghworkflow.html
