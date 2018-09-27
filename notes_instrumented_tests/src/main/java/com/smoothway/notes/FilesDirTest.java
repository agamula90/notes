package com.smoothway.notes;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class FilesDirTest {

    @Test
    public void checkText() {
        Context appContext = InstrumentationRegistry.getTargetContext();
        Assert.assertNotNull(appContext.getFilesDir());
    }
}
