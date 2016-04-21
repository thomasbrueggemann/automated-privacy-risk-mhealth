package com.google.android.gms.internal;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings.Secure;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import android.widget.FrameLayout.LayoutParams;
import com.google.android.gms.internal.class_242;
import com.google.android.gms.internal.class_378;
import com.google.android.gms.internal.ez;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Locale;

// $FF: renamed from: com.google.android.gms.internal.gr
@ez
public final class class_377 {
    // $FF: renamed from: wC android.os.Handler
    public static final Handler field_1386 = new Handler(Looper.getMainLooper());

    // $FF: renamed from: R (java.lang.String) java.lang.String
    public static String method_2448(String var0) {
        int var1 = 0;

        while(var1 < 2) {
            try {
                MessageDigest var3 = MessageDigest.getInstance("MD5");
                var3.update(var0.getBytes());
                Locale var4 = Locale.US;
                Object[] var5 = new Object[] {new BigInteger(1, var3.digest())};
                String var6 = String.format(var4, "%032X", var5);
                return var6;
            } catch (NoSuchAlgorithmException var7) {
                ++var1;
            }
        }

        return null;
    }

    // $FF: renamed from: a (android.content.Context, int) int
    public static int method_2449(Context var0, int var1) {
        return method_2450(var0.getResources().getDisplayMetrics(), var1);
    }

    // $FF: renamed from: a (android.util.DisplayMetrics, int) int
    public static int method_2450(DisplayMetrics var0, int var1) {
        return (int)TypedValue.applyDimension(1, (float)var1, var0);
    }

    // $FF: renamed from: a (android.view.ViewGroup, com.google.android.gms.internal.ay, java.lang.String) void
    public static void method_2451(ViewGroup var0, class_242 var1, String var2) {
        method_2452(var0, var1, var2, -16777216, -1);
    }

    // $FF: renamed from: a (android.view.ViewGroup, com.google.android.gms.internal.ay, java.lang.String, int, int) void
    private static void method_2452(ViewGroup var0, class_242 var1, String var2, int var3, int var4) {
        if(var0.getChildCount() == 0) {
            Context var5 = var0.getContext();
            TextView var6 = new TextView(var5);
            var6.setGravity(17);
            var6.setText(var2);
            var6.setTextColor(var3);
            var6.setBackgroundColor(var4);
            FrameLayout var7 = new FrameLayout(var5);
            var7.setBackgroundColor(var3);
            int var8 = method_2449(var5, 3);
            var7.addView(var6, new LayoutParams(var1.widthPixels - var8, var1.heightPixels - var8, 17));
            var0.addView(var7, var1.widthPixels, var1.heightPixels);
        }
    }

    // $FF: renamed from: a (android.view.ViewGroup, com.google.android.gms.internal.ay, java.lang.String, java.lang.String) void
    public static void method_2453(ViewGroup var0, class_242 var1, String var2, String var3) {
        class_378.method_2461(var3);
        method_2452(var0, var1, var2, -65536, -16777216);
    }

    // $FF: renamed from: dr () boolean
    public static boolean method_2454() {
        return Build.DEVICE.startsWith("generic");
    }

    // $FF: renamed from: ds () boolean
    public static boolean method_2455() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    // $FF: renamed from: v (android.content.Context) java.lang.String
    public static String method_2456(Context var0) {
        String var1 = Secure.getString(var0.getContentResolver(), "android_id");
        if(var1 == null || method_2454()) {
            var1 = "emulator";
        }

        return method_2448(var1);
    }
}