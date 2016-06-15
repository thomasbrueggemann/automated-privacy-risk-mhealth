package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.class_599;
import com.google.android.gms.common.internal.safeparcel.class_600;
import com.google.android.gms.wallet.LineItem;

// $FF: renamed from: com.google.android.gms.wallet.i
public class class_721 implements Creator<LineItem> {
   // $FF: renamed from: a (com.google.android.gms.wallet.LineItem, android.os.Parcel, int) void
   static void method_4094(LineItem var0, Parcel var1, int var2) {
      int var3 = class_599.method_3354(var1);
      class_599.method_3381(var1, 1, var0.getVersionCode());
      class_599.method_3369(var1, 2, var0.description, false);
      class_599.method_3369(var1, 3, var0.ajb, false);
      class_599.method_3369(var1, 4, var0.ajc, false);
      class_599.method_3369(var1, 5, var0.aiH, false);
      class_599.method_3381(var1, 6, var0.ajd);
      class_599.method_3369(var1, 7, var0.aiI, false);
      class_599.method_3357(var1, var3);
   }

   // $FF: renamed from: bX (android.os.Parcel) com.google.android.gms.wallet.LineItem
   public LineItem method_4095(Parcel var1) {
      int var2 = 0;
      String var3 = null;
      int var4 = class_600.method_3385(var1);
      String var5 = null;
      String var6 = null;
      String var7 = null;
      String var8 = null;
      int var9 = 0;

      while(var1.dataPosition() < var4) {
         int var10 = class_600.method_3383(var1);
         switch(class_600.method_3394(var10)) {
         case 1:
            var9 = class_600.method_3402(var1, var10);
            break;
         case 2:
            var8 = class_600.method_3410(var1, var10);
            break;
         case 3:
            var7 = class_600.method_3410(var1, var10);
            break;
         case 4:
            var6 = class_600.method_3410(var1, var10);
            break;
         case 5:
            var5 = class_600.method_3410(var1, var10);
            break;
         case 6:
            var2 = class_600.method_3402(var1, var10);
            break;
         case 7:
            var3 = class_600.method_3410(var1, var10);
            break;
         default:
            class_600.method_3395(var1, var10);
         }
      }

      if(var1.dataPosition() != var4) {
         throw new class_600.class_1103("Overread allowed size end=" + var4, var1);
      } else {
         return new LineItem(var9, var8, var7, var6, var5, var2, var3);
      }
   }

   // $FF: synthetic method
   public Object createFromParcel(Parcel var1) {
      return this.method_4095(var1);
   }

   // $FF: renamed from: dD (int) com.google.android.gms.wallet.LineItem[]
   public LineItem[] method_4096(int var1) {
      return new LineItem[var1];
   }

   // $FF: synthetic method
   public Object[] newArray(int var1) {
      return this.method_4096(var1);
   }
}