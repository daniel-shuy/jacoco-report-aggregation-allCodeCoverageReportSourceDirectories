plugins {
    id("jacoco-report-aggregation")
    id("com.github.nbaztec.coveralls-jacoco") version "1.2.15"
}

repositories {
    mavenCentral()
}

dependencies {
    jacocoAggregation(project("subproject"))
}

reporting {
    reports {
        val testCodeCoverageReport by creating(JacocoCoverageReport::class) {
            testType.set(TestSuiteType.UNIT_TEST)
        }
    }
}

coverallsJacoco {
    reportPath = "build/reports/jacoco/testCodeCoverageReport/testCodeCoverageReport.xml"
}
