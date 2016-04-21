package com.google.android.gms.internal;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.internal.class_378;
import com.google.android.gms.internal.class_48;
import com.google.android.gms.internal.class_486;
import com.google.android.gms.internal.ez;

// $FF: renamed from: com.google.android.gms.internal.dh
@ez
public final class class_488 {
    // $FF: renamed from: a (android.content.Context, com.google.android.gms.internal.dj, com.google.android.gms.internal.dq) boolean
    public static boolean method_2990(Context var0, class_486 var1, class_48 var2) {
        if(var1 == null) {
            class_378.method_2461("No intent data for launcher overlay.");
            return false;
        } else {
            Intent var3 = new Intent();
            if(TextUtils.isEmpty(var1.field_1957)) {
                class_378.method_2461("Open GMSG did not contain a URL.");
                return false;
            } else {
                if(!TextUtils.isEmpty(var1.mimeType)) {
                    var3.setDataAndType(Uri.parse(var1.field_1957), var1.mimeType);
                } else {
                    var3.setData(Uri.parse(var1.field_1957));
                }

                var3.setAction("android.intent.action.VIEW");
                if(!TextUtils.isEmpty(var1.packageName)) {
                    var3.setPackage(var1.packageName);
                }

                if(!TextUtils.isEmpty(var1.field_1958)) {
                    String[] var7 = var1.field_1958.split("/", 2);
                    if(var7.length < 2) {
                        class_378.method_2461("Could not parse component name from open GMSG: " + var1.field_1958);
                        return false;
                    }

                    var3.setClassName(var7[0], var7[1]);
                }

                try {
                    class_378.method_2460("Launching an intent: " + var3);
                    var0.startActivity(var3);
                    var2.method_185();
                    return true;
                } catch (ActivityNotFoundException var8) {
                    class_378.method_2461(var8.getMessage());
                    return false;
                }
            }
        }
    }
}