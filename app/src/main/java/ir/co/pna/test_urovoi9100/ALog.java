package ir.co.pna.test_urovoi9100;

import android.util.Log;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;



/**
 * Created by Abbas on 8/9/2017.
 */
public class ALog {

    public static boolean mIsDebugMode = BuildConfig.DEBUG;
    public static boolean mIsLogEnabel = true;
    public static boolean mIsFileWrite = true;
    public static final String TAG = "A-Pna";

    public static void e(Object o,String log){
        if(mIsDebugMode && mIsLogEnabel){
            Log.e(TAG, "< "+o.getClass().getName()+" > " +log);
        }
    }

    public static void d(Object o,String log){
        if(mIsDebugMode && mIsLogEnabel){
            Log.d(TAG, "< "+o.getClass().getName()+" > " +log);
        }
    }

    public static void i(Object o,String log){
        if(mIsDebugMode && mIsLogEnabel){
            Log.i(TAG, "< "+o.getClass().getName()+" > " +log);
        }
    }

    public static void v(Object o,String log){
        if(mIsDebugMode && mIsLogEnabel){
            Log.v(TAG, "< "+o.getClass().getName()+" > " +log);
        }
    }

    public static void w(Object o,String log){
        if(mIsDebugMode && mIsLogEnabel){
            Log.w(TAG, "< "+o.getClass().getName()+" > " +log);
        }
    }

    public static void wtf(Object o,String log){
        if(mIsDebugMode && mIsLogEnabel){
            Log.wtf(TAG, "< "+o.getClass().getName()+" > " +log);
        }
    }

    public static void f(Object o, String log,String name){
        if(mIsFileWrite && mIsLogEnabel) {
            String parentAddress = AppConstant.LogLocalAddress;
            File parent = new File(parentAddress);
            if(!parent.exists()) {
                parent.mkdir();
            }
            Calendar c = Calendar.getInstance();
            c.setTimeInMillis(System.currentTimeMillis());
            //PersianDate pd = DateConverter.civilToPersian(Application.getContext(),c);

            Date date = new Date();
//            String fileName = new SimpleDateFormat("yyyy-MM-dd")
//                    .format(date);

            String fileName = "today";

            File file = new File(parent.getPath(),fileName+".txt");
            String timestamp = new SimpleDateFormat("HH:mm:ss.SSS")
                    .format(date);
            timestamp = fileName + " " + timestamp;
            if(file.exists()) {
                appendStringToFile("<"+BuildConfig.VERSION_NAME+">"+";"+"<"+timestamp+">"+";"+"<"+o.getClass().getName()+">"+";"+"<"+name+">"+";"+"<"+log+">" +"\n",file);
            }else {
                writeStringAsFile("<"+BuildConfig.VERSION_NAME+">"+";"+"<"+timestamp+">"+";"+"<"+o.getClass().getName()+">"+";"+"<"+name+">"+";"+"<"+log+">" +"\n",file);
            }
            ALog.e(TAG, "< "+o.getClass().getName()+" > " +log);

        }

    }
    public static void writeTransaction(Object o, String log){
            String parentAddress = AppConstant.LastTransactionLocalAddress;
            File parent = new File(parentAddress);
            if(!parent.exists()) {
                parent.mkdir();
            }
            Calendar c = Calendar.getInstance();
            c.setTimeInMillis(System.currentTimeMillis());
          //  PersianDate pd = DateConverter.civilToPersian(Application.getContext(),c);

            Date date = new Date();
//            String fileName = new SimpleDateFormat("yyyy-MM-dd")
//                    .format(date);

            String fileName = "today";

            File file = new File(parent.getPath(),fileName+".txt");
            String timestamp = new SimpleDateFormat("HH:mm:ss.SSS")
                    .format(date);
            timestamp = fileName + " " + timestamp;
            if(file.exists()) {
                appendStringToFile("<"+log+">" +"\n",file);
            }else {
                writeStringAsFile("<"+log+">" +"\n",file);
            }
            ALog.e(TAG, "< onClick > " +log);



    }
    public static final Object[] DATA_LOCK = new Object[0];

    public static boolean writeStringAsFile(final String fileContents, final File file) {
        boolean result = false;
        try {
            synchronized (DATA_LOCK) {
                if (file != null) {
                    file.createNewFile(); // ok if returns false, overwrite
                    Writer out = new BufferedWriter(new FileWriter(file), 1024);
                    out.write(fileContents);
                    out.close();
                    result = true;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }

    /**
     * Append String to end of File.
     *
     * @param appendContents
     * @param file
     * @return
     */
    public static boolean appendStringToFile(final String appendContents, final File file) {
        boolean result = false;
        try {
            synchronized (DATA_LOCK) {
                if (file != null && file.canWrite()) {
                    file.createNewFile(); // ok if returns false, overwrite
                    Writer out = new BufferedWriter(new FileWriter(file, true), 1024);
                    out.write(appendContents);
                    out.close();
                    result = true;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }
}
