# Service Locator

## Intent  

Service Locator is used to locate and provide various services when needed. In applications where there are a number of services it maybe difficult to manage them.

## Motivation  

If there is a social app that uses so many features like Authentication, Downloads, Sharing and others etc, writing conventional code may lead to sophisticated access and creation of services. ServiceLocator acts as a provider and manager for these services which can help reduce complex flows and unwanted application behaviours.

## Applicability  

Application may (or may not) be using services without any standard way of managing them. Which may lead to issues like memory, exceptions, concurrency and others, since it takes care of creation and dispatching of services. This design pattern allows us to address the issues related to services in an app.

## Structure  
Image from [Tutorials Point](https://www.tutorialspoint.com/design_pattern/service_locator_pattern.htm) illustrating structure of this design pattern.
![alt text](https://www.tutorialspoint.com/design_pattern/images/servicelocator_pattern_uml_diagram.jpg)

## Participants  
  - **ServiceLocator** - Main class for getting services.
  - **Cache** - A class that holds instances of Services.
  - **InitContext** - A class responsible for lookup and returning services and creating them if not created yet.
  - **Service** - The service object responsible for completing any task.


## Consequences  

- Violates ISP. (Interface Segragation)
- Hidden Dependencies may cause application crashes.

## Credits
- [Tutorials Point](https://www.tutorialspoint.com/design_pattern/service_locator_pattern.htm)
- [iluwatar/java-design-patterns](https://github.com/iluwatar/java-design-patterns)
