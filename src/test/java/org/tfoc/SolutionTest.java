package org.tfoc;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;
import org.tfoc.helpers.DataFaker;
import org.tfoc.helpers.IntArrayConverter;

@Slf4j
class SolutionTest {

    @ParameterizedTest
    @CsvSource(value = {"1,2,4;1,3,4;1,1,2,3,4,4",
            "1,100,200,300;4,500,504,600;1,4,100,200,300,500,504,600",
            ";0;0",
            ";;"}, delimiterString = ";")
    @DisplayName("Should return the solution for two given arrays")
    void testSolution1(@ConvertWith(IntArrayConverter.class) int[] l1, @ConvertWith(IntArrayConverter.class) int[] l2, @ConvertWith(IntArrayConverter.class) int[] expected) {

        ListNode list1 = DataFaker.createListNodeFronArray(l1);
        ListNode list2 = DataFaker.createListNodeFronArray(l2);

        Solution solution = new Solution();
        ListNode result = solution.mergeTwoLists(list1, list2);
        Assertions.assertEquals(DataFaker.createListNodeFronArray(expected), result);
    }


}