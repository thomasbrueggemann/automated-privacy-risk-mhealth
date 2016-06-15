package com.google.android.gms.internal;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

// $FF: renamed from: com.google.android.gms.internal.co
public interface class_42 extends IInterface {
   // $FF: renamed from: N () void
   void method_203() throws RemoteException;

   void onCreate(Bundle var1) throws RemoteException;

   void onDestroy() throws RemoteException;

   void onPause() throws RemoteException;

   void onRestart() throws RemoteException;

   void onResume() throws RemoteException;

   void onSaveInstanceState(Bundle var1) throws RemoteException;

   void onStart() throws RemoteException;

   void onStop() throws RemoteException;

   public abstract static class class_1039 extends Binder implements class_42 {
      public class_1039() {
         this.attachInterface(this, "com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
      }

      // $FF: renamed from: m (android.os.IBinder) com.google.android.gms.internal.co
      public static class_42 method_2553(IBinder var0) {
         if(var0 == null) {
            return null;
         } else {
            IInterface var1 = var0.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
            return (class_42)(var1 != null && var1 instanceof class_42?(class_42)var1:new class_42.class_1040(var0));
         }
      }

      public IBinder asBinder() {
         return this;
      }

      public boolean onTransact(int var1, Parcel var2, Parcel var3, int var4) throws RemoteException {
         switch(var1) {
         case 1:
            var2.enforceInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
            int var7 = var2.readInt();
            Bundle var8 = null;
            if(var7 != 0) {
               var8 = (Bundle)Bundle.CREATOR.createFromParcel(var2);
            }

            this.onCreate(var8);
            var3.writeNoException();
            return true;
         case 2:
            var2.enforceInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
            this.onRestart();
            var3.writeNoException();
            return true;
         case 3:
            var2.enforceInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
            this.onStart();
            var3.writeNoException();
            return true;
         case 4:
            var2.enforceInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
            this.onResume();
            var3.writeNoException();
            return true;
         case 5:
            var2.enforceInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
            this.onPause();
            var3.writeNoException();
            return true;
         case 6:
            var2.enforceInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
            int var5 = var2.readInt();
            Bundle var6 = null;
            if(var5 != 0) {
               var6 = (Bundle)Bundle.CREATOR.createFromParcel(var2);
            }

            this.onSaveInstanceState(var6);
            var3.writeNoException();
            if(var6 != null) {
               var3.writeInt(1);
               var6.writeToParcel(var3, 1);
            } else {
               var3.writeInt(0);
            }

            return true;
         case 7:
            var2.enforceInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
            this.onStop();
            var3.writeNoException();
            return true;
         case 8:
            var2.enforceInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
            this.onDestroy();
            var3.writeNoException();
            return true;
         case 9:
            var2.enforceInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
            this.N();
            var3.writeNoException();
            return true;
         case 1598968902:
            var3.writeString("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
            return true;
         default:
            return super.onTransact(var1, var2, var3, var4);
         }
      }
   }

   private static class class_1040 implements class_42 {
      // $FF: renamed from: ko android.os.IBinder
      private IBinder field_3506;

      class_1040(IBinder var1) {
         this.field_3506 = var1;
      }

      // $FF: renamed from: N () void
      public void method_203() throws RemoteException {
         Parcel var1 = Parcel.obtain();
         Parcel var2 = Parcel.obtain();

         try {
            var1.writeInterfaceToken("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
            this.field_3506.transact(9, var1, var2, 0);
            var2.readException();
         } finally {
            var2.recycle();
            var1.recycle();
         }

      }

      public IBinder asBinder() {
         return this.field_3506;
      }

      public void onCreate(Bundle param1) throws RemoteException {
         // $FF: Couldn't be decompiled
      }

      public void onDestroy() throws RemoteException {
         Parcel var1 = Parcel.obtain();
         Parcel var2 = Parcel.obtain();

         try {
            var1.writeInterfaceToken("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
            this.field_3506.transact(8, var1, var2, 0);
            var2.readException();
         } finally {
            var2.recycle();
            var1.recycle();
         }

      }

      public void onPause() throws RemoteException {
         Parcel var1 = Parcel.obtain();
         Parcel var2 = Parcel.obtain();

         try {
            var1.writeInterfaceToken("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
            this.field_3506.transact(5, var1, var2, 0);
            var2.readException();
         } finally {
            var2.recycle();
            var1.recycle();
         }

      }

      public void onRestart() throws RemoteException {
         Parcel var1 = Parcel.obtain();
         Parcel var2 = Parcel.obtain();

         try {
            var1.writeInterfaceToken("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
            this.field_3506.transact(2, var1, var2, 0);
            var2.readException();
         } finally {
            var2.recycle();
            var1.recycle();
         }

      }

      public void onResume() throws RemoteException {
         Parcel var1 = Parcel.obtain();
         Parcel var2 = Parcel.obtain();

         try {
            var1.writeInterfaceToken("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
            this.field_3506.transact(4, var1, var2, 0);
            var2.readException();
         } finally {
            var2.recycle();
            var1.recycle();
         }

      }

      public void onSaveInstanceState(Bundle param1) throws RemoteException {
         // $FF: Couldn't be decompiled
      }

      public void onStart() throws RemoteException {
         Parcel var1 = Parcel.obtain();
         Parcel var2 = Parcel.obtain();

         try {
            var1.writeInterfaceToken("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
            this.field_3506.transact(3, var1, var2, 0);
            var2.readException();
         } finally {
            var2.recycle();
            var1.recycle();
         }

      }

      public void onStop() throws RemoteException {
         Parcel var1 = Parcel.obtain();
         Parcel var2 = Parcel.obtain();

         try {
            var1.writeInterfaceToken("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
            this.field_3506.transact(7, var1, var2, 0);
            var2.readException();
         } finally {
            var2.recycle();
            var1.recycle();
         }

      }
   }
}