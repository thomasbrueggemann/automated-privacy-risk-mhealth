package com.google.android.gms.games.internal.constants;

public final class TimeSpan {
    private TimeSpan() {
        throw new AssertionError("Uninstantiable");
    }

    // $FF: renamed from: dH (int) java.lang.String
    public static String method_5842(int var0) {
        switch(var0) {
            case 0:
                return "DAILY";
            case 1:
                return "WEEKLY";
            case 2:
                return "ALL_TIME";
            default:
                throw new IllegalArgumentException("Unknown time span " + var0);
        }
    }
}