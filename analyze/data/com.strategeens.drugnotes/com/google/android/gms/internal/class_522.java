package com.google.android.gms.internal;

import android.util.Base64;
import com.google.android.gms.internal.class_71;

// $FF: renamed from: com.google.android.gms.internal.e
class class_522 implements class_71 {
   // $FF: renamed from: a (byte[], boolean) java.lang.String
   public String method_384(byte[] var1, boolean var2) {
      byte var3;
      if(var2) {
         var3 = 11;
      } else {
         var3 = 2;
      }

      return Base64.encodeToString(var1, var3);
   }

   // $FF: renamed from: a (java.lang.String, boolean) byte[]
   public byte[] method_385(String var1, boolean var2) throws IllegalArgumentException {
      byte var3;
      if(var2) {
         var3 = 11;
      } else {
         var3 = 2;
      }

      return Base64.decode(var1, var3);
   }
}