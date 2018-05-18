package com.github.h2020_5gtango.vnv.lcm.model

import groovy.transform.EqualsAndHashCode

@EqualsAndHashCode
class TestPlan {
    String uuid
    List<NetworkServiceInstance> networkServiceInstances
    List<TestSuiteResult> testSuiteResults

    String status

}
