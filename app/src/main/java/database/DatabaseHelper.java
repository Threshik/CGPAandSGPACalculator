package database;

import android.annotation.SuppressLint;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

import model.product;

public class DatabaseHelper extends SQLiteOpenHelper {

    @SuppressLint("SdCardPath")
    public static final String DBPath = "/data/data/com.example.cgpacalculator/CGPACalculator/cgpanew";
    private  Context myContext;
    private SQLiteDatabase database;
    public static final String  dbname  = "cgpa_cal.db";
    public DatabaseHelper(Context context) {
        super(context,dbname , null, 1);
        this.myContext = context;

    }

    @Override
    public void onCreate(SQLiteDatabase db) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
    public void openDatabase()
    {
        String dbpath = myContext.getDatabasePath(dbname).getPath();
        if(database != null && database.isOpen())
        {
            return;
        }
        database = SQLiteDatabase.openDatabase(dbpath,null,SQLiteDatabase.OPEN_READWRITE);

    }
    public  void closeDatabase()
    {
        if(database!=null)
        {
            database.close();
        }
    }
    public List<product> getListProduct() {
        product Product = null;
        List<product> productList = new ArrayList<>();
        openDatabase();
        Cursor cursor = database.rawQuery("SELECT * FROM calculator", null);
        cursor.moveToFirst();
        while (!cursor.isAfterLast()) {
            Product = new product( cursor.getString(0), cursor.getInt(1));
            productList.add(Product);
            cursor.moveToNext();
        }
        cursor.close();
        closeDatabase();
        return productList;
    }
}
