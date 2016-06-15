package com.google.android.gms.internal;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import com.google.android.gms.internal.class_447;
import com.google.android.gms.internal.class_604;
import com.google.android.gms.internal.class_65;
import com.google.android.gms.internal.class_66;
import com.google.android.gms.internal.class_67;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

// $FF: renamed from: com.google.android.gms.internal.i
public abstract class class_459 implements class_67 {
   // $FF: renamed from: jO android.view.MotionEvent
   protected MotionEvent field_2750;
   // $FF: renamed from: jP android.util.DisplayMetrics
   protected DisplayMetrics field_2751;
   // $FF: renamed from: jQ com.google.android.gms.internal.n
   protected class_65 field_2752;
   // $FF: renamed from: jR com.google.android.gms.internal.o
   private class_66 field_2753;

   protected class_459(Context var1, class_65 var2, class_66 var3) {
      this.field_2752 = var2;
      this.field_2753 = var3;

      try {
         this.field_2751 = var1.getResources().getDisplayMetrics();
      } catch (UnsupportedOperationException var5) {
         this.field_2751 = new DisplayMetrics();
         this.field_2751.density = 1.0F;
      }
   }

   // $FF: renamed from: a (android.content.Context, java.lang.String, boolean) java.lang.String
   private String method_2833(Context param1, String param2, boolean param3) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: t () void
   private void method_2834() {
      this.field_2753.reset();
   }

   // $FF: renamed from: u () byte[]
   private byte[] method_2835() throws IOException {
      return this.field_2753.method_342();
   }

   // $FF: renamed from: a (android.content.Context) java.lang.String
   public String method_343(Context var1) {
      return this.method_2833(var1, (String)null, false);
   }

   // $FF: renamed from: a (android.content.Context, java.lang.String) java.lang.String
   public String method_344(Context var1, String var2) {
      return this.method_2833(var1, var2, true);
   }

   // $FF: renamed from: a (byte[], java.lang.String) java.lang.String
   String method_2836(byte[] var1, String var2) throws NoSuchAlgorithmException, UnsupportedEncodingException, IOException {
      if(var1.length > 239) {
         this.method_2834();
         this.method_2837(20, 1L);
         var1 = this.method_2835();
      }

      byte[] var3;
      if(var1.length < 239) {
         byte[] var8 = new byte[239 - var1.length];
         (new SecureRandom()).nextBytes(var8);
         var3 = ByteBuffer.allocate(240).put((byte)var1.length).put(var1).put(var8).array();
      } else {
         var3 = ByteBuffer.allocate(240).put((byte)var1.length).put(var1).array();
      }

      MessageDigest var4 = MessageDigest.getInstance("MD5");
      var4.update(var3);
      byte[] var5 = var4.digest();
      byte[] var6 = ByteBuffer.allocate(256).put(var5).put(var3).array();
      byte[] var7 = new byte[256];
      (new class_447()).method_2747(var6, var7);
      if(var2 != null && var2.length() > 0) {
         this.method_2839(var2, var7);
      }

      return this.field_2752.method_338(var7, true);
   }

   // $FF: renamed from: a (int, int, int) void
   public void method_345(int var1, int var2, int var3) {
      if(this.field_2750 != null) {
         this.field_2750.recycle();
      }

      this.field_2750 = MotionEvent.obtain(0L, (long)var3, 1, (float)var1 * this.field_2751.density, (float)var2 * this.field_2751.density, 0.0F, 0.0F, 0, 0.0F, 0.0F, 0, 0);
   }

   // $FF: renamed from: a (int, long) void
   protected void method_2837(int var1, long var2) throws IOException {
      this.field_2753.method_340(var1, var2);
   }

   // $FF: renamed from: a (int, java.lang.String) void
   protected void method_2838(int var1, String var2) throws IOException {
      this.field_2753.method_341(var1, var2);
   }

   // $FF: renamed from: a (android.view.MotionEvent) void
   public void method_346(MotionEvent var1) {
      if(var1.getAction() == 1) {
         if(this.field_2750 != null) {
            this.field_2750.recycle();
         }

         this.field_2750 = MotionEvent.obtain(var1);
      }

   }

   // $FF: renamed from: a (java.lang.String, byte[]) void
   void method_2839(String var1, byte[] var2) throws UnsupportedEncodingException {
      if(var1.length() > 32) {
         var1 = var1.substring(0, 32);
      }

      (new class_604(var1.getBytes("UTF-8"))).method_3545(var2);
   }

   // $FF: renamed from: b (android.content.Context) void
   protected abstract void method_2840(Context var1);

   // $FF: renamed from: c (android.content.Context) void
   protected abstract void method_2841(Context var1);
}