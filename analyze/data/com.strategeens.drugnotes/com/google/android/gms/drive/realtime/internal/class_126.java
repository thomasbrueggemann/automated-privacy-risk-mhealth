package com.google.android.gms.drive.realtime.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.drive.realtime.internal.ParcelableIndexReference;

// $FF: renamed from: com.google.android.gms.drive.realtime.internal.k
public interface class_126 extends IInterface {
   // $FF: renamed from: a (com.google.android.gms.drive.realtime.internal.ParcelableIndexReference) void
   void method_677(ParcelableIndexReference var1) throws RemoteException;

   // $FF: renamed from: n (com.google.android.gms.common.api.Status) void
   void method_678(Status var1) throws RemoteException;

   public abstract static class class_1061 extends Binder implements class_126 {
      // $FF: renamed from: aj (android.os.IBinder) com.google.android.gms.drive.realtime.internal.k
      public static class_126 method_1588(IBinder var0) {
         if(var0 == null) {
            return null;
         } else {
            IInterface var1 = var0.queryLocalInterface("com.google.android.gms.drive.realtime.internal.IIndexReferenceCallback");
            return (class_126)(var1 != null && var1 instanceof class_126?(class_126)var1:new class_126.class_1062(var0));
         }
      }

      public IBinder asBinder() {
         return this;
      }

      public boolean onTransact(int var1, Parcel var2, Parcel var3, int var4) throws RemoteException {
         switch(var1) {
         case 1:
            var2.enforceInterface("com.google.android.gms.drive.realtime.internal.IIndexReferenceCallback");
            int var7 = var2.readInt();
            ParcelableIndexReference var8 = null;
            if(var7 != 0) {
               var8 = (ParcelableIndexReference)ParcelableIndexReference.CREATOR.createFromParcel(var2);
            }

            this.a(var8);
            var3.writeNoException();
            return true;
         case 2:
            var2.enforceInterface("com.google.android.gms.drive.realtime.internal.IIndexReferenceCallback");
            int var5 = var2.readInt();
            Status var6 = null;
            if(var5 != 0) {
               var6 = Status.CREATOR.createFromParcel(var2);
            }

            this.n(var6);
            var3.writeNoException();
            return true;
         case 1598968902:
            var3.writeString("com.google.android.gms.drive.realtime.internal.IIndexReferenceCallback");
            return true;
         default:
            return super.onTransact(var1, var2, var3, var4);
         }
      }
   }

   private static class class_1062 implements class_126 {
      // $FF: renamed from: le android.os.IBinder
      private IBinder field_3603;

      class_1062(IBinder var1) {
         this.field_3603 = var1;
      }

      // $FF: renamed from: a (com.google.android.gms.drive.realtime.internal.ParcelableIndexReference) void
      public void method_677(ParcelableIndexReference param1) throws RemoteException {
         // $FF: Couldn't be decompiled
      }

      public IBinder asBinder() {
         return this.field_3603;
      }

      // $FF: renamed from: n (com.google.android.gms.common.api.Status) void
      public void method_678(Status param1) throws RemoteException {
         // $FF: Couldn't be decompiled
      }
   }
}