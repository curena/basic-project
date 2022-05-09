package org.cecil.basic.arrays

import spock.lang.Specification

class ArrayOperationsSpec extends Specification {
    def setup() {

    }

    def "should return a sorted array"() {
        given:
        def input = [2, 4, 1] as int[]
        def arrayOperations = new ArrayOperations(input)
        def expectedOutput = [1, 2, 4] as int[]

        when:
        arrayOperations.sortArray()

        then:
        arrayOperations.getArray() == expectedOutput
    }

}
