package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.internal.zzmn;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.wallet.LoyaltyWalletObject;
import com.google.android.gms.wallet.wobs.LabelValueRow;
import com.google.android.gms.wallet.wobs.LoyaltyPoints;
import com.google.android.gms.wallet.wobs.TextModuleData;
import com.google.android.gms.wallet.wobs.TimeInterval;
import com.google.android.gms.wallet.wobs.UriData;
import com.google.android.gms.wallet.wobs.WalletObjectMessage;
import java.util.ArrayList;

public class zzk implements Creator<LoyaltyWalletObject> {
   static void zza(LoyaltyWalletObject var0, Parcel var1, int var2) {
      int var3 = com.google.android.gms.common.internal.safeparcel.zzb.zzav(var1);
      com.google.android.gms.common.internal.safeparcel.zzb.zzc(var1, 1, var0.getVersionCode());
      com.google.android.gms.common.internal.safeparcel.zzb.zza(var1, 2, (String)var0.zzio, false);
      com.google.android.gms.common.internal.safeparcel.zzb.zza(var1, 3, (String)var0.zzboP, false);
      com.google.android.gms.common.internal.safeparcel.zzb.zza(var1, 4, (String)var0.zzboQ, false);
      com.google.android.gms.common.internal.safeparcel.zzb.zza(var1, 5, (String)var0.zzboR, false);
      com.google.android.gms.common.internal.safeparcel.zzb.zza(var1, 6, (String)var0.zzaQZ, false);
      com.google.android.gms.common.internal.safeparcel.zzb.zza(var1, 7, (String)var0.zzboS, false);
      com.google.android.gms.common.internal.safeparcel.zzb.zza(var1, 8, (String)var0.zzboT, false);
      com.google.android.gms.common.internal.safeparcel.zzb.zza(var1, 9, (String)var0.zzboU, false);
      com.google.android.gms.common.internal.safeparcel.zzb.zza(var1, 10, (String)var0.zzboV, false);
      com.google.android.gms.common.internal.safeparcel.zzb.zza(var1, 11, (String)var0.zzboW, false);
      com.google.android.gms.common.internal.safeparcel.zzb.zzc(var1, 12, var0.state);
      com.google.android.gms.common.internal.safeparcel.zzb.zzc(var1, 13, var0.zzboX, false);
      com.google.android.gms.common.internal.safeparcel.zzb.zza(var1, 14, (Parcelable)var0.zzboY, var2, false);
      com.google.android.gms.common.internal.safeparcel.zzb.zzc(var1, 15, var0.zzboZ, false);
      com.google.android.gms.common.internal.safeparcel.zzb.zza(var1, 17, (String)var0.zzbpb, false);
      com.google.android.gms.common.internal.safeparcel.zzb.zza(var1, 16, (String)var0.zzbpa, false);
      com.google.android.gms.common.internal.safeparcel.zzb.zza(var1, 19, var0.zzbpd);
      com.google.android.gms.common.internal.safeparcel.zzb.zzc(var1, 18, var0.zzbpc, false);
      com.google.android.gms.common.internal.safeparcel.zzb.zzc(var1, 21, var0.zzbpf, false);
      com.google.android.gms.common.internal.safeparcel.zzb.zzc(var1, 20, var0.zzbpe, false);
      com.google.android.gms.common.internal.safeparcel.zzb.zza(var1, 23, (Parcelable)var0.zzbph, var2, false);
      com.google.android.gms.common.internal.safeparcel.zzb.zzc(var1, 22, var0.zzbpg, false);
      com.google.android.gms.common.internal.safeparcel.zzb.zzI(var1, var3);
   }

   // $FF: synthetic method
   public Object createFromParcel(Parcel var1) {
      return this.zzhy(var1);
   }

   // $FF: synthetic method
   public Object[] newArray(int var1) {
      return this.zzkW(var1);
   }

   public LoyaltyWalletObject zzhy(Parcel var1) {
      int var2 = com.google.android.gms.common.internal.safeparcel.zza.zzau(var1);
      int var3 = 0;
      String var4 = null;
      String var5 = null;
      String var6 = null;
      String var7 = null;
      String var8 = null;
      String var9 = null;
      String var10 = null;
      String var11 = null;
      String var12 = null;
      String var13 = null;
      int var14 = 0;
      ArrayList var15 = zzmn.zzsa();
      TimeInterval var16 = null;
      ArrayList var17 = zzmn.zzsa();
      String var18 = null;
      String var19 = null;
      ArrayList var20 = zzmn.zzsa();
      boolean var21 = false;
      ArrayList var22 = zzmn.zzsa();
      ArrayList var23 = zzmn.zzsa();
      ArrayList var24 = zzmn.zzsa();
      LoyaltyPoints var25 = null;

      while(var1.dataPosition() < var2) {
         int var26 = com.google.android.gms.common.internal.safeparcel.zza.zzat(var1);
         switch(com.google.android.gms.common.internal.safeparcel.zza.zzca(var26)) {
         case 1:
            var3 = com.google.android.gms.common.internal.safeparcel.zza.zzg(var1, var26);
            break;
         case 2:
            var4 = com.google.android.gms.common.internal.safeparcel.zza.zzp(var1, var26);
            break;
         case 3:
            var5 = com.google.android.gms.common.internal.safeparcel.zza.zzp(var1, var26);
            break;
         case 4:
            var6 = com.google.android.gms.common.internal.safeparcel.zza.zzp(var1, var26);
            break;
         case 5:
            var7 = com.google.android.gms.common.internal.safeparcel.zza.zzp(var1, var26);
            break;
         case 6:
            var8 = com.google.android.gms.common.internal.safeparcel.zza.zzp(var1, var26);
            break;
         case 7:
            var9 = com.google.android.gms.common.internal.safeparcel.zza.zzp(var1, var26);
            break;
         case 8:
            var10 = com.google.android.gms.common.internal.safeparcel.zza.zzp(var1, var26);
            break;
         case 9:
            var11 = com.google.android.gms.common.internal.safeparcel.zza.zzp(var1, var26);
            break;
         case 10:
            var12 = com.google.android.gms.common.internal.safeparcel.zza.zzp(var1, var26);
            break;
         case 11:
            var13 = com.google.android.gms.common.internal.safeparcel.zza.zzp(var1, var26);
            break;
         case 12:
            var14 = com.google.android.gms.common.internal.safeparcel.zza.zzg(var1, var26);
            break;
         case 13:
            var15 = com.google.android.gms.common.internal.safeparcel.zza.zzc(var1, var26, WalletObjectMessage.CREATOR);
            break;
         case 14:
            var16 = (TimeInterval)com.google.android.gms.common.internal.safeparcel.zza.zza(var1, var26, TimeInterval.CREATOR);
            break;
         case 15:
            var17 = com.google.android.gms.common.internal.safeparcel.zza.zzc(var1, var26, LatLng.CREATOR);
            break;
         case 16:
            var18 = com.google.android.gms.common.internal.safeparcel.zza.zzp(var1, var26);
            break;
         case 17:
            var19 = com.google.android.gms.common.internal.safeparcel.zza.zzp(var1, var26);
            break;
         case 18:
            var20 = com.google.android.gms.common.internal.safeparcel.zza.zzc(var1, var26, LabelValueRow.CREATOR);
            break;
         case 19:
            var21 = com.google.android.gms.common.internal.safeparcel.zza.zzc(var1, var26);
            break;
         case 20:
            var22 = com.google.android.gms.common.internal.safeparcel.zza.zzc(var1, var26, UriData.CREATOR);
            break;
         case 21:
            var23 = com.google.android.gms.common.internal.safeparcel.zza.zzc(var1, var26, TextModuleData.CREATOR);
            break;
         case 22:
            var24 = com.google.android.gms.common.internal.safeparcel.zza.zzc(var1, var26, UriData.CREATOR);
            break;
         case 23:
            var25 = (LoyaltyPoints)com.google.android.gms.common.internal.safeparcel.zza.zza(var1, var26, LoyaltyPoints.CREATOR);
            break;
         default:
            com.google.android.gms.common.internal.safeparcel.zza.zzb(var1, var26);
         }
      }

      if(var1.dataPosition() != var2) {
         throw new com.google.android.gms.common.internal.safeparcel.zza.zza("Overread allowed size end=" + var2, var1);
      } else {
         return new LoyaltyWalletObject(var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14, var15, var16, var17, var18, var19, var20, var21, var22, var23, var24, var25);
      }
   }

   public LoyaltyWalletObject[] zzkW(int var1) {
      return new LoyaltyWalletObject[var1];
   }
}