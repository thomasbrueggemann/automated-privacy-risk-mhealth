package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.data.DataHolder;

// $FF: renamed from: com.google.android.gms.internal.jz
public interface class_20 extends IInterface {
   // $FF: renamed from: V (com.google.android.gms.common.data.DataHolder) void
   void method_72(DataHolder var1) throws RemoteException;

   // $FF: renamed from: W (com.google.android.gms.common.data.DataHolder) void
   void method_73(DataHolder var1) throws RemoteException;

   // $FF: renamed from: X (com.google.android.gms.common.data.DataHolder) void
   void method_74(DataHolder var1) throws RemoteException;

   public abstract static class class_1049 extends Binder implements class_20 {
      // $FF: renamed from: au (android.os.IBinder) com.google.android.gms.internal.jz
      public static class_20 method_4250(IBinder var0) {
         if(var0 == null) {
            return null;
         } else {
            IInterface var1 = var0.queryLocalInterface("com.google.android.gms.location.places.internal.IPlacesCallbacks");
            return (class_20)(var1 != null && var1 instanceof class_20?(class_20)var1:new class_20.class_1050(var0));
         }
      }

      public IBinder asBinder() {
         return this;
      }

      public boolean onTransact(int var1, Parcel var2, Parcel var3, int var4) throws RemoteException {
         switch(var1) {
         case 1:
            var2.enforceInterface("com.google.android.gms.location.places.internal.IPlacesCallbacks");
            int var9 = var2.readInt();
            DataHolder var10 = null;
            if(var9 != 0) {
               var10 = DataHolder.CREATOR.method_4283(var2);
            }

            this.V(var10);
            return true;
         case 2:
            var2.enforceInterface("com.google.android.gms.location.places.internal.IPlacesCallbacks");
            int var7 = var2.readInt();
            DataHolder var8 = null;
            if(var7 != 0) {
               var8 = DataHolder.CREATOR.method_4283(var2);
            }

            this.W(var8);
            return true;
         case 3:
            var2.enforceInterface("com.google.android.gms.location.places.internal.IPlacesCallbacks");
            int var5 = var2.readInt();
            DataHolder var6 = null;
            if(var5 != 0) {
               var6 = DataHolder.CREATOR.method_4283(var2);
            }

            this.X(var6);
            return true;
         case 1598968902:
            var3.writeString("com.google.android.gms.location.places.internal.IPlacesCallbacks");
            return true;
         default:
            return super.onTransact(var1, var2, var3, var4);
         }
      }
   }

   private static class class_1050 implements class_20 {
      // $FF: renamed from: ko android.os.IBinder
      private IBinder field_4085;

      class_1050(IBinder var1) {
         this.field_4085 = var1;
      }

      // $FF: renamed from: V (com.google.android.gms.common.data.DataHolder) void
      public void method_72(DataHolder param1) throws RemoteException {
         // $FF: Couldn't be decompiled
      }

      // $FF: renamed from: W (com.google.android.gms.common.data.DataHolder) void
      public void method_73(DataHolder param1) throws RemoteException {
         // $FF: Couldn't be decompiled
      }

      // $FF: renamed from: X (com.google.android.gms.common.data.DataHolder) void
      public void method_74(DataHolder param1) throws RemoteException {
         // $FF: Couldn't be decompiled
      }

      public IBinder asBinder() {
         return this.field_4085;
      }
   }
}