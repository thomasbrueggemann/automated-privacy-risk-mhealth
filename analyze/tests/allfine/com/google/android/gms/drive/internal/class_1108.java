package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.class_823;
import com.google.android.gms.common.internal.safeparcel.class_824;
import com.google.android.gms.drive.internal.OnLoadRealtimeResponse;

// $FF: renamed from: com.google.android.gms.drive.internal.aq
public class class_1108 implements Creator<OnLoadRealtimeResponse> {
    // $FF: renamed from: a (com.google.android.gms.drive.internal.OnLoadRealtimeResponse, android.os.Parcel, int) void
    static void method_5748(OnLoadRealtimeResponse var0, Parcel var1, int var2) {
        int var3 = class_823.method_4298(var1);
        class_823.method_4325(var1, 1, var0.field_4393);
        class_823.method_4316(var1, 2, var0.field_4394);
        class_823.method_4301(var1, var3);
    }

    // $FF: renamed from: as (android.os.Parcel) com.google.android.gms.drive.internal.OnLoadRealtimeResponse
    public OnLoadRealtimeResponse method_5749(Parcel var1) {
        boolean var2 = false;
        int var3 = class_824.method_4331(var1);
        int var4 = 0;

        while(var1.dataPosition() < var3) {
            int var5 = class_824.method_4329(var1);
            switch(class_824.method_4340(var5)) {
                case 1:
                    var4 = class_824.method_4348(var1, var5);
                    break;
                case 2:
                    var2 = class_824.method_4344(var1, var5);
                    break;
                default:
                    class_824.method_4341(var1, var5);
            }
        }

        if(var1.dataPosition() != var3) {
            throw new class_824.class_1307("Overread allowed size end=" + var3, var1);
        } else {
            return new OnLoadRealtimeResponse(var4, var2);
        }
    }

    // $FF: renamed from: bE (int) com.google.android.gms.drive.internal.OnLoadRealtimeResponse[]
    public OnLoadRealtimeResponse[] method_5750(int var1) {
        return new OnLoadRealtimeResponse[var1];
    }

    // $FF: synthetic method
    public Object createFromParcel(Parcel var1) {
        return this.method_5749(var1);
    }

    // $FF: synthetic method
    public Object[] newArray(int var1) {
        return this.method_5750(var1);
    }
}