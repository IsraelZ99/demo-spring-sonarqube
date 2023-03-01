# SONARQUBE EXAMPLE
1. In setting.xml add the lines:
```xml
  <pluginGroups>
    <pluginGroup>org.sonarsource.scanner.maven</pluginGroup>
  </pluginGroups>

  <profiles>
    <profile>
      <id>sonar</id>
      <properties>
        <sonar.host.url>
          http://ip-sonarqube:port
        </sonar.host.url>
      </properties>
    </profile>
  </profiles>
```
2. Run the command:
   mvn -Psonar sonar:sonar -Dsonar.login=token-generated-by-sonarqube