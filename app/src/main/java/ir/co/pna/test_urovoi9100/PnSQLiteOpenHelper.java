package ir.co.pna.test_urovoi9100;

// @formatter:off

import android.annotation.TargetApi;
import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.DefaultDatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Build;
import android.util.Log;

public class PnSQLiteOpenHelper extends SQLiteOpenHelper {
    private static final String TAG = PnSQLiteOpenHelper.class.getSimpleName();

    public static final String DATABASE_FILE_NAME = "pnp.db";
    private static final int DATABASE_VERSION = 5;
    private static PnSQLiteOpenHelper sInstance;
    private final Context mContext;
    private final PnSQLiteOpenHelperCallbacks mOpenHelperCallbacks;

    public static final String SQL_CREATE_TABLE_STATUS = "CREATE TABLE IF NOT EXISTS "
            + StatusColumns.TABLE_NAME + " ( "
            + StatusColumns._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
            + StatusColumns.STATUS_ID + " TEXT DEFAULT '1', "
            + StatusColumns.REVERSAL + " TEXT DEFAULT '0', "
            + StatusColumns.REVERSAL_PRINT + " TEXT DEFAULT '0', "
            + StatusColumns.ADVICE + " TEXT DEFAULT '0', "
            + StatusColumns.TRANSACTION_PRINT + " TEXT DEFAULT '0', "
            + StatusColumns.REVERSAL_SOKHT + " TEXT DEFAULT '0', "
            + StatusColumns.REVERSAL_PRINT_SOKHT + " TEXT DEFAULT '0', "
            + StatusColumns.ADVICE_SOKHT + " TEXT DEFAULT '0', "
            + StatusColumns.TRANSACTION_PRINT_SOKHT + " TEXT DEFAULT '0', "
            + StatusColumns.EXTRA1 + " TEXT DEFAULT '0', "
            + StatusColumns.EXTRA2 + " TEXT DEFAULT '0', "
            + StatusColumns.EXTRA3 + " TEXT DEFAULT '0' "
            + " );";


    public static PnSQLiteOpenHelper getInstance(Context context) {
        // Use the application context, which will ensure that you
        // don't accidentally leak an Activity's context.
        // See this article for more information: http://bit.ly/6LRzfx
        if (sInstance == null) {
            sInstance = newInstance(context.getApplicationContext());
        }
        return sInstance;
    }

    private static PnSQLiteOpenHelper newInstance(Context context) {
        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.HONEYCOMB) {
            return newInstancePreHoneycomb(context);
        }
        return newInstancePostHoneycomb(context);
    }


    /*
     * Pre Honeycomb.
     */
    private static PnSQLiteOpenHelper newInstancePreHoneycomb(Context context) {
        return new PnSQLiteOpenHelper(context);
    }

    private PnSQLiteOpenHelper(Context context) {
        super(context, DATABASE_FILE_NAME, null, DATABASE_VERSION);
        mContext = context;
        mOpenHelperCallbacks = new PnSQLiteOpenHelperCallbacks();
    }


    /*
     * Post Honeycomb.
     */
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    private static PnSQLiteOpenHelper newInstancePostHoneycomb(Context context) {
        return new PnSQLiteOpenHelper(context, new DefaultDatabaseErrorHandler());
    }

    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    private PnSQLiteOpenHelper(Context context, DatabaseErrorHandler errorHandler) {
        super(context, DATABASE_FILE_NAME, null, DATABASE_VERSION, errorHandler);
        mContext = context;
        mOpenHelperCallbacks = new PnSQLiteOpenHelperCallbacks();
    }


    @Override
    public void onCreate(SQLiteDatabase db) {
        if (BuildConfig.DEBUG) Log.d(TAG, "onCreate");
        mOpenHelperCallbacks.onPreCreate(mContext, db);
        db.execSQL(SQL_CREATE_TABLE_STATUS);
        mOpenHelperCallbacks.onPostCreate(mContext, db);
    }

    @Override
    public void onOpen(SQLiteDatabase db) {
        super.onOpen(db);
        if (!db.isReadOnly()) {
            setForeignKeyConstraintsEnabled(db);
        }
        mOpenHelperCallbacks.onOpen(mContext, db);
    }

    private void setForeignKeyConstraintsEnabled(SQLiteDatabase db) {
        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.JELLY_BEAN) {
            setForeignKeyConstraintsEnabledPreJellyBean(db);
        } else {
            setForeignKeyConstraintsEnabledPostJellyBean(db);
        }
    }

    private void setForeignKeyConstraintsEnabledPreJellyBean(SQLiteDatabase db) {
        db.execSQL("PRAGMA foreign_keys=ON;");
    }

    @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
    private void setForeignKeyConstraintsEnabledPostJellyBean(SQLiteDatabase db) {
        db.setForeignKeyConstraintsEnabled(true);
    }



    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        mOpenHelperCallbacks.onUpgrade(mContext, db, oldVersion, newVersion);

        if(oldVersion == 3){
            db.execSQL(SQL_CREATE_TABLE_STATUS);
            oldVersion++;
        }

        if(oldVersion == 4){
            db.execSQL("ALTER TABLE "+StatusColumns.TABLE_NAME+" ADD COLUMN "+ StatusColumns.REVERSAL_SOKHT +" TEXT DEFAULT '0'");
            db.execSQL("ALTER TABLE "+StatusColumns.TABLE_NAME+" ADD COLUMN "+ StatusColumns.REVERSAL_PRINT_SOKHT +" TEXT DEFAULT '0'");
            db.execSQL("ALTER TABLE "+StatusColumns.TABLE_NAME+" ADD COLUMN "+ StatusColumns.ADVICE_SOKHT +" TEXT DEFAULT '0'");
            db.execSQL("ALTER TABLE "+StatusColumns.TABLE_NAME+" ADD COLUMN "+ StatusColumns.TRANSACTION_PRINT_SOKHT +" TEXT DEFAULT '0'");

            oldVersion++;
        }
    }
}
