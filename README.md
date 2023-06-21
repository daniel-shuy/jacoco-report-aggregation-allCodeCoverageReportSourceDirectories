Minimal reproducible example to reproduce the issue of
[jacoco-report-aggregation](https://docs.gradle.org/current/userguide/jacoco_report_aggregation_plugin.html) plugin no
longer working with [coveralls-jacoco](https://github.com/nbaztec/coveralls-jacoco-gradle-plugin) plugin since Gradle 8.

## Working Example:

Run:

```shell
gradlew wrapper --gradle-version 7.6
```

```shell
gradlew test testCodeCoverageReport coverallsJacoco
```

## Failing Example:

Run:

```shell
gradlew wrapper --gradle-version 8.0
```

```shell
gradlew test testCodeCoverageReport coverallsJacoco
```
