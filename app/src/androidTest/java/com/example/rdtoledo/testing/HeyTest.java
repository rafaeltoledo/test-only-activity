package com.example.rdtoledo.testing;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertNotNull;

@RunWith(AndroidJUnit4.class)
public class HeyTest {

    @Rule
    public ActivityTestRule<HeyActivity> activityRule = new ActivityTestRule<>(HeyActivity.class);

    @Test
    public void test() {
        assertNotNull(activityRule.getActivity());
    }
}
