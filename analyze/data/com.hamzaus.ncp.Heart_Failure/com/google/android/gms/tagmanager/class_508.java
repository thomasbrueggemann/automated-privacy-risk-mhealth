package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.class_445;
import com.google.android.gms.internal.class_52;
import com.google.android.gms.tagmanager.class_504;
import com.google.android.gms.tagmanager.dg;
import java.util.Map;

// $FF: renamed from: com.google.android.gms.tagmanager.be
class class_508 extends class_504 {
   // $FF: renamed from: ID java.lang.String
   private static final String field_2864;

   static {
      field_2864 = class_445.field_2444.toString();
   }

   public class_508() {
      super(field_2864);
   }

   // $FF: renamed from: a (com.google.android.gms.tagmanager.dg, com.google.android.gms.tagmanager.dg, java.util.Map) boolean
   protected boolean method_2908(dg var1, dg var2, Map<String, class_52.class_816> var3) {
      return var1.method_2998(var2) < 0;
   }
}