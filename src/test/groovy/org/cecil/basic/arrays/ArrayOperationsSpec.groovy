package org.cecil.basic.arrays

import spock.lang.Specification

class ArrayOperationsSpec extends Specification {
    def arrayOperations = new ArrayOperations()

    def "should return a sorted array"() {
        given:
        final def input = [2, 4, 1] as Integer[]
        final def expectedOutput = [1, 2, 4] as Integer[]

        when:
        final def observedOutput = arrayOperations.sortArray(input)

        then:
        observedOutput == expectedOutput
    }

}
