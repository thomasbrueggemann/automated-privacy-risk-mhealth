package com.google.android.gms.tagmanager;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.os.Build.VERSION;
import android.text.TextUtils;
import com.google.android.gms.internal.class_20;
import com.google.android.gms.internal.class_346;
import com.google.android.gms.tagmanager.DataLayer;
import com.google.android.gms.tagmanager.class_612;
import com.google.android.gms.tagmanager.class_660;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

// $FF: renamed from: com.google.android.gms.tagmanager.v
class class_719 implements DataLayer.class_1404 {
    private static final String aoQ = String.format("CREATE TABLE IF NOT EXISTS %s ( \'%s\' INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, \'%s\' STRING NOT NULL, \'%s\' BLOB NOT NULL, \'%s\' INTEGER NOT NULL);", new Object[] {"datalayer", "ID", "key", "value", "expires"});
    private final Executor aoR;
    private class_719.class_1822 aoS;
    private int aoT;
    private final Context mContext;
    // $FF: renamed from: yD com.google.android.gms.internal.ju
    private class_20 field_3477;

    public class_719(Context var1) {
        this(var1, class_346.method_2326(), "google_tagmanager.db", 2000, Executors.newSingleThreadExecutor());
    }

    class_719(Context var1, class_20 var2, String var3, int var4, Executor var5) {
        this.mContext = var1;
        this.field_3477 = var2;
        this.aoT = var4;
        this.aoR = var5;
        this.aoS = new class_719.class_1822(this.mContext, var3);
    }

    // $FF: renamed from: al (java.lang.String) android.database.sqlite.SQLiteDatabase
    private SQLiteDatabase method_3931(String var1) {
        try {
            SQLiteDatabase var3 = this.aoS.getWritableDatabase();
            return var3;
        } catch (SQLiteException var4) {
            class_612.method_3459(var1);
            return null;
        }
    }

    // $FF: renamed from: b (java.util.List, long) void
    private void method_3933(List<class_719.class_1823> param1, long param2) {
        // $FF: Couldn't be decompiled
    }

    // $FF: renamed from: c (java.util.List, long) void
    private void method_3934(List<class_719.class_1823> var1, long var2) {
        SQLiteDatabase var4 = this.method_3931("Error opening database for writeEntryToDatabase.");
        if(var4 != null) {
            Iterator var5 = var1.iterator();

            while(var5.hasNext()) {
                class_719.class_1823 var6 = (class_719.class_1823)var5.next();
                ContentValues var7 = new ContentValues();
                var7.put("expires", Long.valueOf(var2));
                var7.put("key", var6.field_5313);
                var7.put("value", var6.aoZ);
                var4.insert("datalayer", (String)null, var7);
            }
        }

    }

    // $FF: renamed from: cy (java.lang.String) void
    private void method_3935(String var1) {
        SQLiteDatabase var2 = this.method_3931("Error opening database for clearKeysWithPrefix.");
        if(var2 != null) {
            try {
                String[] var5 = new String[] {var1, var1 + ".%"};
                int var6 = var2.delete("datalayer", "key = ? OR key LIKE ?", var5);
                class_612.method_3458("Cleared " + var6 + " items");
                return;
            } catch (SQLiteException var9) {
                class_612.method_3459("Error deleting entries with key prefix: " + var1 + " (" + var9 + ").");
            } finally {
                this.method_3946();
            }

        }
    }

    // $FF: renamed from: fg (int) void
    private void method_3936(int var1) {
        int var2 = var1 + (this.method_3945() - this.aoT);
        if(var2 > 0) {
            List var3 = this.method_3937(var2);
            class_612.method_3457("DataLayer store full, deleting " + var3.size() + " entries to make room.");
            this.method_3940((String[])var3.toArray(new String[0]));
        }

    }

    // $FF: renamed from: fh (int) java.util.List
    private List<String> method_3937(int param1) {
        // $FF: Couldn't be decompiled
    }

    // $FF: renamed from: h (java.util.List) java.util.List
    private List<DataLayer.class_1770> method_3938(List<class_719.class_1823> var1) {
        ArrayList var2 = new ArrayList();
        Iterator var3 = var1.iterator();

        while(var3.hasNext()) {
            class_719.class_1823 var4 = (class_719.class_1823)var3.next();
            var2.add(new DataLayer.class_1770(var4.field_5313, this.method_3941(var4.aoZ)));
        }

        return var2;
    }

    // $FF: renamed from: i (java.util.List) java.util.List
    private List<class_719.class_1823> method_3939(List<DataLayer.class_1770> var1) {
        ArrayList var2 = new ArrayList();
        Iterator var3 = var1.iterator();

        while(var3.hasNext()) {
            DataLayer.class_1770 var4 = (DataLayer.class_1770)var3.next();
            var2.add(new class_719.class_1823(var4.field_5131, this.method_3942(var4.field_5132)));
        }

        return var2;
    }

    // $FF: renamed from: i (java.lang.String[]) void
    private void method_3940(String[] var1) {
        if(var1 != null && var1.length != 0) {
            SQLiteDatabase var2 = this.method_3931("Error opening database for deleteEntries.");
            if(var2 != null) {
                Object[] var3 = new Object[] {"ID", TextUtils.join(",", Collections.nCopies(var1.length, "?"))};
                String var4 = String.format("%s in (%s)", var3);

                try {
                    var2.delete("datalayer", var4, var1);
                    return;
                } catch (SQLiteException var6) {
                    class_612.method_3459("Error deleting entries " + Arrays.toString(var1));
                    return;
                }
            }
        }

    }

    // $FF: renamed from: j (byte[]) java.lang.Object
    private Object method_3941(byte[] param1) {
        // $FF: Couldn't be decompiled
    }

    // $FF: renamed from: m (java.lang.Object) byte[]
    private byte[] method_3942(Object param1) {
        // $FF: Couldn't be decompiled
    }

    // $FF: renamed from: oi () java.util.List
    private List<DataLayer.class_1770> method_3943() {
        List var2;
        try {
            this.method_3948(this.field_3477.currentTimeMillis());
            var2 = this.method_3938(this.method_3944());
        } finally {
            this.method_3946();
        }

        return var2;
    }

    // $FF: renamed from: oj () java.util.List
    private List<class_719.class_1823> method_3944() {
        SQLiteDatabase var1 = this.method_3931("Error opening database for loadSerialized.");
        ArrayList var2 = new ArrayList();
        if(var1 == null) {
            return var2;
        } else {
            Cursor var3 = var1.query("datalayer", new String[] {"key", "value"}, (String)null, (String[])null, (String)null, (String)null, "ID", (String)null);

            while(true) {
                boolean var6 = false;

                try {
                    var6 = true;
                    if(!var3.moveToNext()) {
                        var6 = false;
                        break;
                    }

                    var2.add(new class_719.class_1823(var3.getString(0), var3.getBlob(1)));
                    var6 = false;
                } finally {
                    if(var6) {
                        var3.close();
                    }
                }
            }

            var3.close();
            return var2;
        }
    }

    // $FF: renamed from: ok () int
    private int method_3945() {
        // $FF: Couldn't be decompiled
    }

    // $FF: renamed from: ol () void
    private void method_3946() {
        try {
            this.aoS.close();
        } catch (SQLiteException var2) {
            ;
        }
    }

    // $FF: renamed from: x (long) void
    private void method_3948(long var1) {
        SQLiteDatabase var3 = this.method_3931("Error opening database for deleteOlderThan.");
        if(var3 != null) {
            try {
                String[] var5 = new String[] {Long.toString(var1)};
                int var6 = var3.delete("datalayer", "expires <= ?", var5);
                class_612.method_3458("Deleted " + var6 + " expired items");
            } catch (SQLiteException var7) {
                class_612.method_3459("Error deleting old entries.");
            }
        }
    }

    // $FF: renamed from: a (com.google.android.gms.tagmanager.DataLayer$c$a) void
    public void method_952(final DataLayer.class_1405 var1) {
        this.aoR.execute(new Runnable() {
            public void run() {
                var1.method_341(class_719.this.method_3943());
            }
        });
    }

    // $FF: renamed from: a (java.util.List, long) void
    public void method_953(List<DataLayer.class_1770> var1, final long var2) {
        final List var4 = this.method_3939(var1);
        this.aoR.execute(new Runnable() {
            public void run() {
                class_719.this.method_3933(var4, var2);
            }
        });
    }

    // $FF: renamed from: cx (java.lang.String) void
    public void method_954(final String var1) {
        this.aoR.execute(new Runnable() {
            public void run() {
                class_719.this.method_3935(var1);
            }
        });
    }

    class class_1822 extends SQLiteOpenHelper {
        class_1822(Context var2, String var3) {
            super(var2, var3, (CursorFactory)null, 1);
        }

        // $FF: renamed from: a (android.database.sqlite.SQLiteDatabase) void
        private void method_5955(SQLiteDatabase param1) {
            // $FF: Couldn't be decompiled
        }

        // $FF: renamed from: a (java.lang.String, android.database.sqlite.SQLiteDatabase) boolean
        private boolean method_5956(String param1, SQLiteDatabase param2) {
            // $FF: Couldn't be decompiled
        }

        public SQLiteDatabase getWritableDatabase() {
            SQLiteDatabase var3;
            label16: {
                SQLiteDatabase var4;
                try {
                    var4 = super.getWritableDatabase();
                } catch (SQLiteException var5) {
                    class_719.this.mContext.getDatabasePath("google_tagmanager.db").delete();
                    var3 = null;
                    break label16;
                }

                var3 = var4;
            }

            if(var3 == null) {
                var3 = super.getWritableDatabase();
            }

            return var3;
        }

        public void onCreate(SQLiteDatabase var1) {
            class_660.method_3682(var1.getPath());
        }

        public void onOpen(SQLiteDatabase var1) {
            if(VERSION.SDK_INT < 15) {
                Cursor var2 = var1.rawQuery("PRAGMA journal_mode=memory", (String[])null);

                try {
                    var2.moveToFirst();
                } finally {
                    var2.close();
                }
            }

            if(!this.method_5956("datalayer", var1)) {
                var1.execSQL(class_719.aoQ);
            } else {
                this.method_5955(var1);
            }
        }

        public void onUpgrade(SQLiteDatabase var1, int var2, int var3) {
        }
    }

    private static class class_1823 {
        // $FF: renamed from: JO java.lang.String
        final String field_5313;
        final byte[] aoZ;

        class_1823(String var1, byte[] var2) {
            this.field_5313 = var1;
            this.aoZ = var2;
        }

        public String toString() {
            return "KeyAndSerialized: key = " + this.field_5313 + " serialized hash = " + Arrays.hashCode(this.aoZ);
        }
    }
}