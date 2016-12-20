package com.satmiksub.Android.utility;

import android.content.Context;
import android.os.Debug;
import android.util.Log;

import java.text.DecimalFormat;

/**
 * Created by Bismita rath /satyam kumar naik /subham kumar naik 
 */
public class TestMemory {

        public static void memory(Context context) {

            int mb = 1024*1024;

            Log.e("tag", " =================================");

            Double allocated = new Double(Debug.getNativeHeapAllocatedSize())/new Double((1048576));
            Double available = new Double(Debug.getNativeHeapSize())/1048576.0;
            Double free = new Double(Debug.getNativeHeapFreeSize())/1048576.0;

            DecimalFormat df = new DecimalFormat();
            df.setMaximumFractionDigits(2);
            df.setMinimumFractionDigits(2);

            Log.e("tag", "heap native: allocated " + df.format(allocated) + "MB of " + df.format(available) + "MB (" + df.format(free) + "MB free)");
            Log.e("tag", "memory: allocated: " + df.format(new Double(Runtime.getRuntime().totalMemory()/1048576)) + "MB of " + df.format(new Double(Runtime.getRuntime().maxMemory()/1048576))+ "MB (" + df.format(new Double(Runtime.getRuntime().freeMemory()/1048576)) +"MB free)");


            //Getting the runtime reference from system
            Runtime runtime = Runtime.getRuntime();

            Log.e("Heap","##### Heap utilization statistics [MB] #####");

            //Print used memory
            Log.e("Memory", "Used Memory:"+ (runtime.totalMemory() - runtime.freeMemory()) / mb);

            //Print free memory
            Log.e("Free", "Free Memory:"+ runtime.freeMemory() / mb);

            //Print total available memory
            Log.e("Total", "Total Memory:" + runtime.totalMemory() / mb);

            //Print Maximum available memory
            Log.e("Max", "Max Memory:" + runtime.maxMemory() / mb);


        }
    }

