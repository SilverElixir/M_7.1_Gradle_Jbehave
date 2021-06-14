package com.jbehave.gradle.task1;

import org.jbehave.core.junit.JUnitStories;
import org.jbehave.core.steps.InjectableStepsFactory;
import org.jbehave.core.steps.InstanceStepsFactory;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.Arrays;
import java.util.List;

public class SimpleJBehave extends JUnitStories {

//    private static Embedder embedder = new Embedder();
//    private static List<String> storyPaths = Arrays.asList("*.story");
//
//    public static void main(String[] args) {
//        embedder.candidateSteps().add(new SearchSteps());
//        embedder.runStoriesAsPaths(storyPaths);
//    }

    public SimpleJBehave() {
        super();
    }

    @Override
    public InjectableStepsFactory stepsFactory() {
        return new InstanceStepsFactory(configuration(), new SearchSteps());
    }

    @Override
    protected List<String> storyPaths() {
        return Arrays.asList("resources/Search.story");
    }

}
