package org.cecil.basic.arrays

import spock.lang.Specification

class ArrayOperationsSpec extends Specification {
    def arrayOperations = new ArrayOperations()

    def setup() {

    }

    def "should return a sorted array"() {
        given:
        def input = [2, 4, 1] as int[]
        def expectedOutput = [1, 2, 4] as int[]

        when:
        def observedOutput = arrayOperations.sortArray(input)

        then:
        observedOutput == expectedOutput
    }

}
