package com.google.android.gms.fitness.data;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.class_823;
import com.google.android.gms.common.internal.safeparcel.class_824;
import com.google.android.gms.fitness.data.a;
import com.google.android.gms.fitness.data.class_1141;

// $FF: renamed from: com.google.android.gms.fitness.data.b
public class class_1139 implements Creator<a> {
    // $FF: renamed from: a (com.google.android.gms.fitness.data.a, android.os.Parcel, int) void
    static void method_5906(class_1141 var0, Parcel var1, int var2) {
        int var3 = class_823.method_4298(var1);
        class_823.method_4313(var1, 1, var0.getPackageName(), false);
        class_823.method_4325(var1, 1000, var0.getVersionCode());
        class_823.method_4313(var1, 2, var0.getVersion(), false);
        class_823.method_4313(var1, 3, var0.method_5914(), false);
        class_823.method_4301(var1, var3);
    }

    // $FF: renamed from: bi (android.os.Parcel) com.google.android.gms.fitness.data.a
    public class_1141 method_5907(Parcel var1) {
        String var2 = null;
        int var3 = class_824.method_4331(var1);
        int var4 = 0;
        String var5 = null;
        String var6 = null;

        while(var1.dataPosition() < var3) {
            int var7 = class_824.method_4329(var1);
            switch(class_824.method_4340(var7)) {
                case 1:
                    var6 = class_824.method_4356(var1, var7);
                    break;
                case 2:
                    var5 = class_824.method_4356(var1, var7);
                    break;
                case 3:
                    var2 = class_824.method_4356(var1, var7);
                    break;
                case 1000:
                    var4 = class_824.method_4348(var1, var7);
                    break;
                default:
                    class_824.method_4341(var1, var7);
            }
        }

        if(var1.dataPosition() != var3) {
            throw new class_824.class_1307("Overread allowed size end=" + var3, var1);
        } else {
            return new class_1141(var4, var6, var5, var2);
        }
    }

    // $FF: synthetic method
    public Object createFromParcel(Parcel var1) {
        return this.method_5907(var1);
    }

    // $FF: renamed from: cw (int) com.google.android.gms.fitness.data.a[]
    public class_1141[] method_5908(int var1) {
        return new class_1141[var1];
    }

    // $FF: synthetic method
    public Object[] newArray(int var1) {
        return this.method_5908(var1);
    }
}