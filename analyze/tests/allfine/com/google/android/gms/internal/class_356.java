package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.class_823;
import com.google.android.gms.common.internal.safeparcel.class_824;
import com.google.android.gms.internal.class_268;
import com.google.android.gms.internal.class_361;

// $FF: renamed from: com.google.android.gms.internal.jk
public class class_356 implements Creator<class_268.class_1299> {
    // $FF: renamed from: a (com.google.android.gms.internal.ji$a, android.os.Parcel, int) void
    static void method_2371(class_268.class_1299 var0, Parcel var1, int var2) {
        int var3 = class_823.method_4298(var1);
        class_823.method_4325(var1, 1, var0.getVersionCode());
        class_823.method_4325(var1, 2, var0.method_3876());
        class_823.method_4316(var1, 3, var0.method_3879());
        class_823.method_4325(var1, 4, var0.method_3877());
        class_823.method_4316(var1, 5, var0.method_3880());
        class_823.method_4313(var1, 6, var0.method_3881(), false);
        class_823.method_4325(var1, 7, var0.method_3882());
        class_823.method_4313(var1, 8, var0.method_3884(), false);
        class_823.method_4309(var1, 9, var0.method_3886(), var2, false);
        class_823.method_4301(var1, var3);
    }

    // $FF: renamed from: I (android.os.Parcel) com.google.android.gms.internal.ji$a
    public class_268.class_1299 method_2372(Parcel var1) {
        class_361 var2 = null;
        int var3 = 0;
        int var4 = class_824.method_4331(var1);
        String var5 = null;
        String var6 = null;
        boolean var7 = false;
        int var8 = 0;
        boolean var9 = false;
        int var10 = 0;
        int var11 = 0;

        while(var1.dataPosition() < var4) {
            int var12 = class_824.method_4329(var1);
            switch(class_824.method_4340(var12)) {
                case 1:
                    var11 = class_824.method_4348(var1, var12);
                    break;
                case 2:
                    var10 = class_824.method_4348(var1, var12);
                    break;
                case 3:
                    var9 = class_824.method_4344(var1, var12);
                    break;
                case 4:
                    var8 = class_824.method_4348(var1, var12);
                    break;
                case 5:
                    var7 = class_824.method_4344(var1, var12);
                    break;
                case 6:
                    var6 = class_824.method_4356(var1, var12);
                    break;
                case 7:
                    var3 = class_824.method_4348(var1, var12);
                    break;
                case 8:
                    var5 = class_824.method_4356(var1, var12);
                    break;
                case 9:
                    var2 = (class_361)class_824.method_4336(var1, var12, class_361.CREATOR);
                    break;
                default:
                    class_824.method_4341(var1, var12);
            }
        }

        if(var1.dataPosition() != var4) {
            throw new class_824.class_1307("Overread allowed size end=" + var4, var1);
        } else {
            return new class_268.class_1299(var11, var10, var9, var8, var7, var6, var3, var5, var2);
        }
    }

    // $FF: renamed from: aI (int) com.google.android.gms.internal.ji$a[]
    public class_268.class_1299[] method_2373(int var1) {
        return new class_268.class_1299[var1];
    }

    // $FF: synthetic method
    public Object createFromParcel(Parcel var1) {
        return this.method_2372(var1);
    }

    // $FF: synthetic method
    public Object[] newArray(int var1) {
        return this.method_2373(var1);
    }
}