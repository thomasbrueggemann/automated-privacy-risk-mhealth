package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.class_704;
import com.google.android.gms.common.internal.safeparcel.class_705;
import com.google.android.gms.internal.class_752;
import com.google.android.gms.internal.nw;

// $FF: renamed from: com.google.android.gms.internal.nx
public class class_755 implements Creator<nw> {
   // $FF: renamed from: a (com.google.android.gms.internal.nw, android.os.Parcel, int) void
   static void method_4334(class_752 var0, Parcel var1, int var2) {
      int var3 = class_704.method_4025(var1);
      class_704.method_4050(var1, 1, var0.field_3414);
      class_704.method_4038(var1, 2, var0.method_4329(), false);
      class_704.method_4038(var1, 3, var0.getTag(), false);
      class_704.method_4038(var1, 4, var0.getSource(), false);
      class_704.method_4026(var1, var3);
   }

   // $FF: renamed from: cR (android.os.Parcel) com.google.android.gms.internal.nw
   public class_752 method_4335(Parcel var1) {
      String var2 = null;
      int var3 = class_705.method_4059(var1);
      int var4 = 0;
      String var5 = null;
      String var6 = null;

      while(var1.dataPosition() < var3) {
         int var7 = class_705.method_4058(var1);
         switch(class_705.method_4065(var7)) {
         case 1:
            var4 = class_705.method_4073(var1, var7);
            break;
         case 2:
            var6 = class_705.method_4081(var1, var7);
            break;
         case 3:
            var5 = class_705.method_4081(var1, var7);
            break;
         case 4:
            var2 = class_705.method_4081(var1, var7);
            break;
         default:
            class_705.method_4066(var1, var7);
         }
      }

      if(var1.dataPosition() != var3) {
         throw new class_705.class_1425("Overread allowed size end=" + var3, var1);
      } else {
         return new class_752(var4, var6, var5, var2);
      }
   }

   // $FF: synthetic method
   public Object createFromParcel(Parcel var1) {
      return this.method_4335(var1);
   }

   // $FF: renamed from: eN (int) com.google.android.gms.internal.nw[]
   public class_752[] method_4336(int var1) {
      return new class_752[var1];
   }

   // $FF: synthetic method
   public Object[] newArray(int var1) {
      return this.method_4336(var1);
   }
}