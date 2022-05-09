package org.cecil.basic

import org.springframework.boot.test.context.SpringBootTest
import spock.lang.Specification

@SpringBootTest
class BaseTest extends Specification {
    def "should load context"() {
        expect:
        true
    }
}
