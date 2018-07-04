package com.udacity.gradle.builditbigger;

import android.support.test.runner.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

import static junit.framework.Assert.assertNotNull;
import static junit.framework.Assert.assertTrue;
@RunWith(AndroidJUnit4.class)

/**
 * Created by sandrapog on 03.07.2018.
 */
public class EndpointsAsyncTaskTest {
    @Test
    public void doInBackground() throws Exception {
        MainActivity mainActivity = new MainActivity();

        EndpointsAsyncTask endpointsAsyncTask = new EndpointsAsyncTask();
        endpointsAsyncTask.execute(mainActivity);

        String result = null;
        try {
            result = endpointsAsyncTask.get();

        } catch (Exception e) {
            e.printStackTrace();
        }


        assertNotNull(result);
    }



}