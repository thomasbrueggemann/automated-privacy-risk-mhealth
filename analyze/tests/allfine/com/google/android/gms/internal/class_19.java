package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.data.DataHolder;

// $FF: renamed from: com.google.android.gms.internal.ic
public interface class_19 extends IInterface {
    // $FF: renamed from: S (int) void
    void method_130(int var1) throws RemoteException;

    // $FF: renamed from: a (int, com.google.android.gms.common.data.DataHolder) void
    void method_131(int var1, DataHolder var2) throws RemoteException;

    // $FF: renamed from: a (com.google.android.gms.common.data.DataHolder) void
    void method_132(DataHolder var1) throws RemoteException;

    // $FF: renamed from: e (int, int) void
    void method_133(int var1, int var2) throws RemoteException;

    // $FF: renamed from: fp () void
    void method_134() throws RemoteException;

    public abstract static class class_1490 extends Binder implements class_19 {
        public class_1490() {
            this.attachInterface(this, "com.google.android.gms.appstate.internal.IAppStateCallbacks");
        }

        // $FF: renamed from: J (android.os.IBinder) com.google.android.gms.internal.ic
        public static class_19 method_2313(IBinder var0) {
            if(var0 == null) {
                return null;
            } else {
                IInterface var1 = var0.queryLocalInterface("com.google.android.gms.appstate.internal.IAppStateCallbacks");
                return (class_19)(var1 != null && var1 instanceof class_19?(class_19)var1:new class_19.class_1491(var0));
            }
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int var1, Parcel var2, Parcel var3, int var4) throws RemoteException {
            switch(var1) {
                case 5001:
                    var2.enforceInterface("com.google.android.gms.appstate.internal.IAppStateCallbacks");
                    int var7 = var2.readInt();
                    int var8 = var2.readInt();
                    DataHolder var9 = null;
                    if(var8 != 0) {
                        var9 = DataHolder.CREATOR.method_5521(var2);
                    }

                    this.a(var7, var9);
                    var3.writeNoException();
                    return true;
                case 5002:
                    var2.enforceInterface("com.google.android.gms.appstate.internal.IAppStateCallbacks");
                    int var5 = var2.readInt();
                    DataHolder var6 = null;
                    if(var5 != 0) {
                        var6 = DataHolder.CREATOR.method_5521(var2);
                    }

                    this.a(var6);
                    var3.writeNoException();
                    return true;
                case 5003:
                    var2.enforceInterface("com.google.android.gms.appstate.internal.IAppStateCallbacks");
                    this.e(var2.readInt(), var2.readInt());
                    var3.writeNoException();
                    return true;
                case 5004:
                    var2.enforceInterface("com.google.android.gms.appstate.internal.IAppStateCallbacks");
                    this.fp();
                    var3.writeNoException();
                    return true;
                case 5005:
                    var2.enforceInterface("com.google.android.gms.appstate.internal.IAppStateCallbacks");
                    this.S(var2.readInt());
                    var3.writeNoException();
                    return true;
                case 1598968902:
                    var3.writeString("com.google.android.gms.appstate.internal.IAppStateCallbacks");
                    return true;
                default:
                    return super.onTransact(var1, var2, var3, var4);
            }
        }
    }

    private static class class_1491 implements class_19 {
        // $FF: renamed from: lb android.os.IBinder
        private IBinder field_4736;

        class_1491(IBinder var1) {
            this.field_4736 = var1;
        }

        // $FF: renamed from: S (int) void
        public void method_130(int var1) throws RemoteException {
            Parcel var2 = Parcel.obtain();
            Parcel var3 = Parcel.obtain();

            try {
                var2.writeInterfaceToken("com.google.android.gms.appstate.internal.IAppStateCallbacks");
                var2.writeInt(var1);
                this.field_4736.transact(5005, var2, var3, 0);
                var3.readException();
            } finally {
                var3.recycle();
                var2.recycle();
            }

        }

        // $FF: renamed from: a (int, com.google.android.gms.common.data.DataHolder) void
        public void method_131(int param1, DataHolder param2) throws RemoteException {
            // $FF: Couldn't be decompiled
        }

        // $FF: renamed from: a (com.google.android.gms.common.data.DataHolder) void
        public void method_132(DataHolder param1) throws RemoteException {
            // $FF: Couldn't be decompiled
        }

        public IBinder asBinder() {
            return this.field_4736;
        }

        // $FF: renamed from: e (int, int) void
        public void method_133(int var1, int var2) throws RemoteException {
            Parcel var3 = Parcel.obtain();
            Parcel var4 = Parcel.obtain();

            try {
                var3.writeInterfaceToken("com.google.android.gms.appstate.internal.IAppStateCallbacks");
                var3.writeInt(var1);
                var3.writeInt(var2);
                this.field_4736.transact(5003, var3, var4, 0);
                var4.readException();
            } finally {
                var4.recycle();
                var3.recycle();
            }

        }

        // $FF: renamed from: fp () void
        public void method_134() throws RemoteException {
            Parcel var1 = Parcel.obtain();
            Parcel var2 = Parcel.obtain();

            try {
                var1.writeInterfaceToken("com.google.android.gms.appstate.internal.IAppStateCallbacks");
                this.field_4736.transact(5004, var1, var2, 0);
                var2.readException();
            } finally {
                var2.recycle();
                var1.recycle();
            }

        }
    }
}