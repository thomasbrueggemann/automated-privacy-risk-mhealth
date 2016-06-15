package com.google.android.gms.drive.realtime.internal.event;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.class_704;
import com.google.android.gms.common.internal.safeparcel.class_705;
import com.google.android.gms.drive.realtime.internal.event.ValuesAddedDetails;

// $FF: renamed from: com.google.android.gms.drive.realtime.internal.event.h
public class class_305 implements Creator<ValuesAddedDetails> {
   // $FF: renamed from: a (com.google.android.gms.drive.realtime.internal.event.ValuesAddedDetails, android.os.Parcel, int) void
   static void method_2172(ValuesAddedDetails var0, Parcel var1, int var2) {
      int var3 = class_704.method_4025(var1);
      class_704.method_4050(var1, 1, var0.field_3379);
      class_704.method_4050(var1, 2, var0.mIndex);
      class_704.method_4050(var1, 3, var0.field_3380);
      class_704.method_4050(var1, 4, var0.field_3381);
      class_704.method_4038(var1, 5, var0.field_3382, false);
      class_704.method_4050(var1, 6, var0.field_3383);
      class_704.method_4026(var1, var3);
   }

   // $FF: renamed from: bn (android.os.Parcel) com.google.android.gms.drive.realtime.internal.event.ValuesAddedDetails
   public ValuesAddedDetails method_2173(Parcel var1) {
      int var2 = 0;
      int var3 = class_705.method_4059(var1);
      String var4 = null;
      int var5 = 0;
      int var6 = 0;
      int var7 = 0;
      int var8 = 0;

      while(var1.dataPosition() < var3) {
         int var9 = class_705.method_4058(var1);
         switch(class_705.method_4065(var9)) {
         case 1:
            var8 = class_705.method_4073(var1, var9);
            break;
         case 2:
            var7 = class_705.method_4073(var1, var9);
            break;
         case 3:
            var6 = class_705.method_4073(var1, var9);
            break;
         case 4:
            var5 = class_705.method_4073(var1, var9);
            break;
         case 5:
            var4 = class_705.method_4081(var1, var9);
            break;
         case 6:
            var2 = class_705.method_4073(var1, var9);
            break;
         default:
            class_705.method_4066(var1, var9);
         }
      }

      if(var1.dataPosition() != var3) {
         throw new class_705.class_1425("Overread allowed size end=" + var3, var1);
      } else {
         return new ValuesAddedDetails(var8, var7, var6, var5, var4, var2);
      }
   }

   // $FF: renamed from: cD (int) com.google.android.gms.drive.realtime.internal.event.ValuesAddedDetails[]
   public ValuesAddedDetails[] method_2174(int var1) {
      return new ValuesAddedDetails[var1];
   }

   // $FF: synthetic method
   public Object createFromParcel(Parcel var1) {
      return this.method_2173(var1);
   }

   // $FF: synthetic method
   public Object[] newArray(int var1) {
      return this.method_2174(var1);
   }
}