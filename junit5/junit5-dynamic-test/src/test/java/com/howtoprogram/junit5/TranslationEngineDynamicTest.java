package com.howtoprogram.junit5;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;
import org.junit.jupiter.api.function.Executable;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

@RunWith(JUnitPlatform.class)
class TranslationEngineDynamicTest {

    private TranslatorEngine translatorEngine;

    @BeforeEach
    void setUp() {
        translatorEngine = new TranslatorEngine();
    }

    void translateDynamicTestsRaw() {

        List<String> inPhrases = new ArrayList<>(Arrays.asList("Hello", "Yes", "No"));
        List<String> outPhrases = new ArrayList<>(Arrays.asList("Bonjour", "Oui", "Non"));
        Collection<DynamicTest> dynamicTests = new ArrayList<>();

        for (int i = 0; i < inPhrases.size(); i++) {

            String phr = inPhrases.get(i);
            String outPhr = outPhrases.get(i);

            // create an test execution
            Executable exec = () -> assertEquals(outPhr, translatorEngine.tranlate(phr));

            // create a test display name
            String testName = "Test tranlate " + phr;
            // create dynamic test
            DynamicTest dTest = DynamicTest.dynamicTest(testName, exec);

            // add the dynamic test to collection
            dynamicTests.add(dTest);
        }
    }

    @Disabled
        // @TestFactory
    Collection<DynamicTest> translateDynamicTests() {

        List<String> inPhrases =
            new ArrayList<>(Arrays.asList("Hello", "Yes", "No", "Goodbye", "Good night", "Thank you"));
        List<String> outPhrases =
            new ArrayList<>(Arrays.asList("Bonjour", "Oui", "Non", "Au revoir", "Bonne nuit", "Merci"));

        Collection<DynamicTest> dynamicTests = new ArrayList<>();

        for (int i = 0; i < inPhrases.size(); i++) {

            String phr = inPhrases.get(i);
            String outPhr = outPhrases.get(i);

            // create an test execution
            Executable exec = () -> assertEquals(outPhr, translatorEngine.tranlate(phr));

            // create a test display name
            String testName = "Test tranlate " + phr;
            // create dynamic test
            DynamicTest dTest = DynamicTest.dynamicTest(testName, exec);

            // add the dynamic test to collection
            dynamicTests.add(dTest);
        }
        return dynamicTests;
    }

    // @Disabled
    @TestFactory
    Stream<DynamicTest> translateDynamicTestsFromStream() {

        List<String> inPhrases =
            new ArrayList<>(Arrays.asList("Hello", "Yes", "No", "Goodbye", "Good night", "Thank you"));
        List<String> outPhrases =
            new ArrayList<>(Arrays.asList("Bonjour", "Oui", "Non", "Au revoir", "Bonne nuit", "Merci"));

        return inPhrases.stream().map(phrs -> DynamicTest.dynamicTest("Test translate " + phrs, () -> {
            int idx = inPhrases.indexOf(phrs);
            assertEquals(outPhrases.get(idx), translatorEngine.tranlate(phrs));
        }));
    }

    @Disabled
        // @TestFactory
    Iterator<DynamicTest> translateDynamicTestsFromIterator() {

        List<String> inPhrases =
            new ArrayList<>(Arrays.asList("Hello", "Yes", "No", "Goodbye", "Good night", "Thank you"));
        List<String> outPhrases =
            new ArrayList<>(Arrays.asList("Bonjour", "Oui", "Non", "Au revoir", "Bonne nuit", "Merci"));

        return inPhrases.stream().map(phrs -> DynamicTest.dynamicTest("Test translate " + phrs, () -> {
            int idx = inPhrases.indexOf(phrs);
            assertEquals(outPhrases.get(idx), translatorEngine.tranlate(phrs));
        })).iterator();
    }

    // @TestFactory
    Iterable<DynamicTest> translateDynamicTestsFromIterate() {

        List<String> inPhrases =
            new ArrayList<>(Arrays.asList("Hello", "Yes", "No", "Goodbye", "Good night", "Thank you"));
        List<String> outPhrases =
            new ArrayList<>(Arrays.asList("Bonjour", "Oui", "Non", "Au revoir", "Bonne nuit", "Merci"));

        return inPhrases.stream().map(phrs -> DynamicTest.dynamicTest("Test translate " + phrs, () -> {
            int idx = inPhrases.indexOf(phrs);
            assertEquals(outPhrases.get(idx), translatorEngine.tranlate(phrs));
        })).collect(Collectors.toList());
    }
}
