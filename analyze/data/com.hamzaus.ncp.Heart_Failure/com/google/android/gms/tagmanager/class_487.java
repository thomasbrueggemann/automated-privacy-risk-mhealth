package com.google.android.gms.tagmanager;

import android.os.Build.VERSION;
import com.google.android.gms.internal.class_445;
import com.google.android.gms.internal.class_52;
import com.google.android.gms.tagmanager.class_464;
import com.google.android.gms.tagmanager.class_537;
import java.util.Map;

// $FF: renamed from: com.google.android.gms.tagmanager.bz
class class_487 extends class_464 {
   // $FF: renamed from: ID java.lang.String
   private static final String field_2845;

   static {
      field_2845 = class_445.field_2398.toString();
   }

   public class_487() {
      super(field_2845, new String[0]);
   }

   // $FF: renamed from: lc () boolean
   public boolean method_2881() {
      return true;
   }

   // $FF: renamed from: w (java.util.Map) com.google.android.gms.internal.d$a
   public class_52.class_816 method_2882(Map<String, class_52.class_816> var1) {
      return class_537.method_3027(VERSION.RELEASE);
   }
}