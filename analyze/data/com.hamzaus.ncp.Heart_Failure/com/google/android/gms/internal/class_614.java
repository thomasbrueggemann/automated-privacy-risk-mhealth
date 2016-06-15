package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.class_599;
import com.google.android.gms.common.internal.safeparcel.class_600;
import com.google.android.gms.internal.class_288;
import java.util.HashSet;
import java.util.Set;

// $FF: renamed from: com.google.android.gms.internal.ld
public class class_614 implements Creator<class_288.class_955> {
   // $FF: renamed from: a (com.google.android.gms.internal.kt$h, android.os.Parcel, int) void
   static void method_3589(class_288.class_955 var0, Parcel var1, int var2) {
      int var3 = class_599.method_3354(var1);
      Set var4 = var0.method_1897();
      if(var4.contains(Integer.valueOf(1))) {
         class_599.method_3381(var1, 1, var0.getVersionCode());
      }

      if(var4.contains(Integer.valueOf(3))) {
         class_599.method_3381(var1, 3, var0.method_1895());
      }

      if(var4.contains(Integer.valueOf(4))) {
         class_599.method_3369(var1, 4, var0.getValue(), true);
      }

      if(var4.contains(Integer.valueOf(5))) {
         class_599.method_3369(var1, 5, var0.getLabel(), true);
      }

      if(var4.contains(Integer.valueOf(6))) {
         class_599.method_3381(var1, 6, var0.getType());
      }

      class_599.method_3357(var1, var3);
   }

   // $FF: renamed from: bP (android.os.Parcel) com.google.android.gms.internal.kt$h
   public class_288.class_955 method_3590(Parcel var1) {
      String var2 = null;
      int var3 = 0;
      int var4 = class_600.method_3385(var1);
      HashSet var5 = new HashSet();
      int var6 = 0;
      String var7 = null;
      int var8 = 0;

      while(var1.dataPosition() < var4) {
         int var9 = class_600.method_3383(var1);
         switch(class_600.method_3394(var9)) {
         case 1:
            var8 = class_600.method_3402(var1, var9);
            var5.add(Integer.valueOf(1));
            break;
         case 2:
         default:
            class_600.method_3395(var1, var9);
            break;
         case 3:
            var3 = class_600.method_3402(var1, var9);
            var5.add(Integer.valueOf(3));
            break;
         case 4:
            var2 = class_600.method_3410(var1, var9);
            var5.add(Integer.valueOf(4));
            break;
         case 5:
            var7 = class_600.method_3410(var1, var9);
            var5.add(Integer.valueOf(5));
            break;
         case 6:
            var6 = class_600.method_3402(var1, var9);
            var5.add(Integer.valueOf(6));
         }
      }

      if(var1.dataPosition() != var4) {
         throw new class_600.class_1103("Overread allowed size end=" + var4, var1);
      } else {
         return new class_288.class_955(var5, var8, var7, var6, var2, var3);
      }
   }

   // $FF: synthetic method
   public Object createFromParcel(Parcel var1) {
      return this.method_3590(var1);
   }

   // $FF: renamed from: dm (int) com.google.android.gms.internal.kt$h[]
   public class_288.class_955[] method_3591(int var1) {
      return new class_288.class_955[var1];
   }

   // $FF: synthetic method
   public Object[] newArray(int var1) {
      return this.method_3591(var1);
   }
}