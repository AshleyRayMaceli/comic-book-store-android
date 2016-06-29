package com.epicodus.comicbookstore;

import android.support.test.rule.ActivityTestRule;

import org.junit.Rule;
import org.junit.Test;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.containsString;

public class MainActivityInstrumentationTest {
    @Rule
    public ActivityTestRule<MainActivity> activityTestRule =
            new ActivityTestRule<>(MainActivity.class);

    @Test
    public void navigateToAboutActivity() {
        onView(withId(R.id.aboutUsButton)).perform(click());
        onView(withId(R.id.aboutUsTitle)).check(matches(withText("About Us:")));
        onView(withId(R.id.textView2)).check(matches(withText("Address: 400 NW 4TH COUCH ST, PORTLAND OR \nPhone:(503) 241-0227")));
        onView(withId(R.id.textView3)).check(matches(withText(containsString("But also art books"))));
    }
}
