package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.class_704;
import com.google.android.gms.common.internal.safeparcel.class_705;
import com.google.android.gms.drive.DrivePreferences;
import com.google.android.gms.drive.internal.OnDrivePreferencesResponse;

// $FF: renamed from: com.google.android.gms.drive.internal.ap
public class class_1013 implements Creator<OnDrivePreferencesResponse> {
   // $FF: renamed from: a (com.google.android.gms.drive.internal.OnDrivePreferencesResponse, android.os.Parcel, int) void
   static void method_5588(OnDrivePreferencesResponse var0, Parcel var1, int var2) {
      int var3 = class_704.method_4025(var1);
      class_704.method_4050(var1, 1, var0.field_3221);
      class_704.method_4034(var1, 2, var0.field_3222, var2, false);
      class_704.method_4026(var1, var3);
   }

   // $FF: renamed from: au (android.os.Parcel) com.google.android.gms.drive.internal.OnDrivePreferencesResponse
   public OnDrivePreferencesResponse method_5589(Parcel var1) {
      int var2 = class_705.method_4059(var1);
      int var3 = 0;
      DrivePreferences var4 = null;

      while(var1.dataPosition() < var2) {
         int var5 = class_705.method_4058(var1);
         switch(class_705.method_4065(var5)) {
         case 1:
            var3 = class_705.method_4073(var1, var5);
            break;
         case 2:
            var4 = (DrivePreferences)class_705.method_4061(var1, var5, DrivePreferences.CREATOR);
            break;
         default:
            class_705.method_4066(var1, var5);
         }
      }

      if(var1.dataPosition() != var2) {
         throw new class_705.class_1425("Overread allowed size end=" + var2, var1);
      } else {
         return new OnDrivePreferencesResponse(var3, var4);
      }
   }

   // $FF: renamed from: bJ (int) com.google.android.gms.drive.internal.OnDrivePreferencesResponse[]
   public OnDrivePreferencesResponse[] method_5590(int var1) {
      return new OnDrivePreferencesResponse[var1];
   }

   // $FF: synthetic method
   public Object createFromParcel(Parcel var1) {
      return this.method_5589(var1);
   }

   // $FF: synthetic method
   public Object[] newArray(int var1) {
      return this.method_5590(var1);
   }
}