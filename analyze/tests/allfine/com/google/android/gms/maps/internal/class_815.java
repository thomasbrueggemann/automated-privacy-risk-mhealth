package com.google.android.gms.maps.internal;

import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.gms.maps.internal.t;

// $FF: renamed from: com.google.android.gms.maps.internal.t
public final class class_815 {
    // $FF: renamed from: a (android.os.Bundle, java.lang.String, android.os.Parcelable) void
    public static void method_4240(Bundle var0, String var1, Parcelable var2) {
        var0.setClassLoader(t.class.getClassLoader());
        Bundle var3 = var0.getBundle("map_state");
        if(var3 == null) {
            var3 = new Bundle();
        }

        var3.setClassLoader(t.class.getClassLoader());
        var3.putParcelable(var1, var2);
        var0.putBundle("map_state", var3);
    }
}