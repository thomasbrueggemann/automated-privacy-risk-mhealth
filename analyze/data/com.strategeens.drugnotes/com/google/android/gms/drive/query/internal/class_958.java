package com.google.android.gms.drive.query.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.class_704;
import com.google.android.gms.common.internal.safeparcel.class_705;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;
import com.google.android.gms.drive.query.internal.InFilter;

// $FF: renamed from: com.google.android.gms.drive.query.internal.h
public class class_958 implements Creator<InFilter> {
   // $FF: renamed from: a (com.google.android.gms.drive.query.internal.InFilter, android.os.Parcel, int) void
   static void method_5271(InFilter var0, Parcel var1, int var2) {
      int var3 = class_704.method_4025(var1);
      class_704.method_4050(var1, 1000, var0.field_1701);
      class_704.method_4034(var1, 1, var0.field_1702, var2, false);
      class_704.method_4026(var1, var3);
   }

   // $FF: renamed from: aX (android.os.Parcel) com.google.android.gms.drive.query.internal.InFilter
   public InFilter method_5272(Parcel var1) {
      int var2 = class_705.method_4059(var1);
      int var3 = 0;
      MetadataBundle var4 = null;

      while(var1.dataPosition() < var2) {
         int var5 = class_705.method_4058(var1);
         switch(class_705.method_4065(var5)) {
         case 1:
            var4 = (MetadataBundle)class_705.method_4061(var1, var5, MetadataBundle.CREATOR);
            break;
         case 1000:
            var3 = class_705.method_4073(var1, var5);
            break;
         default:
            class_705.method_4066(var1, var5);
         }
      }

      if(var1.dataPosition() != var2) {
         throw new class_705.class_1425("Overread allowed size end=" + var2, var1);
      } else {
         return new InFilter(var3, var4);
      }
   }

   // $FF: renamed from: cm (int) com.google.android.gms.drive.query.internal.InFilter[]
   public InFilter[] method_5273(int var1) {
      return new InFilter[var1];
   }

   // $FF: synthetic method
   public Object createFromParcel(Parcel var1) {
      return this.method_5272(var1);
   }

   // $FF: synthetic method
   public Object[] newArray(int var1) {
      return this.method_5273(var1);
   }
}