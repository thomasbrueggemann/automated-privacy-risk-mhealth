package com.google.android.gms.drive.realtime.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.class_823;
import com.google.android.gms.common.internal.safeparcel.class_824;
import com.google.android.gms.drive.realtime.internal.BeginCompoundOperationRequest;

// $FF: renamed from: com.google.android.gms.drive.realtime.internal.a
public class class_818 implements Creator<BeginCompoundOperationRequest> {
    // $FF: renamed from: a (com.google.android.gms.drive.realtime.internal.BeginCompoundOperationRequest, android.os.Parcel, int) void
    static void method_4249(BeginCompoundOperationRequest var0, Parcel var1, int var2) {
        int var3 = class_823.method_4298(var1);
        class_823.method_4325(var1, 1, var0.field_5047);
        class_823.method_4316(var1, 2, var0.field_5048);
        class_823.method_4313(var1, 3, var0.mName, false);
        class_823.method_4316(var1, 4, var0.field_5049);
        class_823.method_4301(var1, var3);
    }

    // $FF: renamed from: aU (android.os.Parcel) com.google.android.gms.drive.realtime.internal.BeginCompoundOperationRequest
    public BeginCompoundOperationRequest method_4250(Parcel var1) {
        boolean var2 = false;
        int var3 = class_824.method_4331(var1);
        String var4 = null;
        boolean var5 = true;
        int var6 = 0;

        while(var1.dataPosition() < var3) {
            int var7 = class_824.method_4329(var1);
            switch(class_824.method_4340(var7)) {
                case 1:
                    var6 = class_824.method_4348(var1, var7);
                    break;
                case 2:
                    var2 = class_824.method_4344(var1, var7);
                    break;
                case 3:
                    var4 = class_824.method_4356(var1, var7);
                    break;
                case 4:
                    var5 = class_824.method_4344(var1, var7);
                    break;
                default:
                    class_824.method_4341(var1, var7);
            }
        }

        if(var1.dataPosition() != var3) {
            throw new class_824.class_1307("Overread allowed size end=" + var3, var1);
        } else {
            return new BeginCompoundOperationRequest(var6, var2, var4, var5);
        }
    }

    // $FF: renamed from: cg (int) com.google.android.gms.drive.realtime.internal.BeginCompoundOperationRequest[]
    public BeginCompoundOperationRequest[] method_4251(int var1) {
        return new BeginCompoundOperationRequest[var1];
    }

    // $FF: synthetic method
    public Object createFromParcel(Parcel var1) {
        return this.method_4250(var1);
    }

    // $FF: synthetic method
    public Object[] newArray(int var1) {
        return this.method_4251(var1);
    }
}